package voll.med.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.endereco.Endereco;

@Table(name="pacientes")
@Entity(name="Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;

    private Integer ativo;

    public Paciente(DadosCadastroPaciente dadosPaciente) {
        this.nome = dadosPaciente.nome();
        this.email = dadosPaciente.email();
        this.telefone = dadosPaciente.telefone();
        this.cpf = dadosPaciente.cpf();
        this.endereco = new Endereco(dadosPaciente.endereco());
        this.ativo = 1;
    }

    public void atualizarCadastro(DadosAtualizarPaciente dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.email() != null) {
            this.email = dados.email();
        }

        if(dados.cpf() != null) {
            this.cpf = dados.cpf();
        }

        if(dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if(dados.ativo() != null) {
            this.ativo =  dados.ativo();
        }
        this.endereco.atualizarEndereco(dados.endereco());
    }
}
