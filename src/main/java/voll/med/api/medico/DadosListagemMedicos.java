package voll.med.api.medico;

public record DadosListagemMedicos (Long id, String nome, String email, String crm, Especialidade especialidade, Integer ativo){
    public DadosListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade(), medico.getAtivo());
    }
}
