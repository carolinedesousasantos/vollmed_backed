package voll.med.api.consulta;

import voll.med.api.medico.Medico;
import voll.med.api.paciente.Paciente;

import java.time.LocalDateTime;

public record DadosListagemConsultas (Long id, Long idPaciente, Long idMedico, LocalDateTime dataEHorario) {
    public DadosListagemConsultas (Consulta consulta) {
        this(consulta.getId(), consulta.getIdPaciente().getId(), consulta.getIdMedico().getId(), consulta.getDataEHorario());
    }
}
