package voll.med.api.consulta;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.medico.Medico;
import voll.med.api.paciente.Paciente;

import java.time.LocalDateTime;

@Table(name="agendamentos")
@Entity(name="Consultas")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Paciente idPaciente;

    @ManyToOne
    Medico idMedico;

    LocalDateTime dataEHorario;

    public Consulta(DadosConsulta dados) {
        this.idPaciente = dados.idPaciente();
        this.idMedico = dados.idMedico();
        this.dataEHorario = dados.data();
    }
}