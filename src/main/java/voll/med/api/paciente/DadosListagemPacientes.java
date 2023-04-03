package voll.med.api.paciente;

public record DadosListagemPacientes (Long id, String nome, String email, String cpf, Integer ativo){
    public DadosListagemPacientes(Paciente paciente) {
        this(paciente.getId(),paciente.getNome(), paciente.getEmail(),  paciente.getCpf(), paciente.getAtivo());
    }
}
