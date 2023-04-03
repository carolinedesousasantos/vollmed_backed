package voll.med.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.endereco.Endereco;

@Table(name="medicos")
@Entity(name="Medico")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    private Integer ativo;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
        this.ativo = 1;
    }

    public void atualizarCadastro(DadosAtualizarMedico dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.telefone() != null     ){
            this.telefone = dados.telefone();
        }

        if(dados.ativo() != null) {
            this.ativo =  dados.ativo();
        }
        this.endereco.atualizarEndereco(dados.endereco());
    }

}
