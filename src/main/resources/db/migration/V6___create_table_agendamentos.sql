CREATE TABLE agendamentos (
  id bigint NOT NULL AUTO_INCREMENT,
  idPaciente bigint NOT NULL,
  idMedico bigint NOT NULL,
   PRIMARY KEY(id),
  FOREIGN KEY(idPaciente) REFERENCES pacientes(id),
  FOREIGN KEY(idMedico) REFERENCES medicos(id)
  )ENGINE=INNODB;