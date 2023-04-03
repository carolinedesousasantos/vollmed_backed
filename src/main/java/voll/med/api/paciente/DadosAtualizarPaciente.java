package voll.med.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import voll.med.api.endereco.DadosEndereco;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,
        @NotBlank
        String nome,

        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf,

        @NotNull
        Integer ativo,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
