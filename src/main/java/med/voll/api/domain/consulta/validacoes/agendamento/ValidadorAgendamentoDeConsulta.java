package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    // não é necessário o public em interface pois subentende que é tudo public por ser interface
    void validar (DadosAgendamentoConsulta dados);
}
