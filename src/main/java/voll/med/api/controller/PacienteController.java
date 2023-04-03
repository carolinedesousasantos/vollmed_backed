package voll.med.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import voll.med.api.paciente.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
       repository.save(new Paciente(dados));
        System.out.println(dados);
    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizarPaciente dados) {
        Paciente paciente = repository.getReferenceById(dados.id());
        paciente.atualizarCadastro(dados);

    }
    @GetMapping
    public Page<DadosListagemPacientes> listar (Pageable paginacao) {
        return  repository.findAll(paginacao).map(DadosListagemPacientes::new);
    }
}
