package voll.med.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voll.med.api.consulta.DadosListagemConsultas;

import java.awt.print.Pageable;

@RestController
@RequestMapping("consultas")
public class Consultas {

 @GetMapping

    public <Page> DadosListagemConsultas listar (Pageable paginacao) {
     return null;
 }
}
