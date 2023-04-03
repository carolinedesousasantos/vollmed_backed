package voll.med.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.medico.DadosCadastroMedico;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }

    public void atualizarEndereco(DadosEndereco endereco) {
        if(this.logradouro != null){
            this.logradouro = endereco.logradouro();
        }
        if(this.bairro != null){
            this.bairro = endereco.bairro();
        }
        if(this.cep != null){
            this.cep = endereco.cep();
        }
        if(this.numero != null){
            this.numero = endereco.numero();
        }
        if(this.complemento != null){
            this.complemento =  endereco.complemento();
        }
        if(this.cidade != null){
            this.cidade = endereco.cidade();
        }
        if(this.uf != null){
            this.uf = endereco.uf();
        }

    }
}
