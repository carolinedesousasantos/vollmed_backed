package voll.med.api.consulta;

import jakarta.validation.constraints.NotBlank;
import voll.med.api.medico.Medico;
import voll.med.api.paciente.Paciente;

import java.time.LocalDateTime;

public record DadosConsulta(
        @NotBlank
        Paciente idPaciente,
        @NotBlank
        Medico idMedico,
        @NotBlank
        LocalDateTime data
) {
}
