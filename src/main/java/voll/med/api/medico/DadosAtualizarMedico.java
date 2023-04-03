package voll.med.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import voll.med.api.endereco.DadosEndereco;

public record DadosAtualizarMedico(
    @NotNull
    Long id,
    @NotBlank
    String nome,

    @NotBlank
    String telefone,
    @NotNull
    @Valid

    @NotNull
    Integer ativo,

    DadosEndereco endereco )  {

}
