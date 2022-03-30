package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(){
        validacoes = new ArrayList<ValidacaoReajuste>();
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {

        validacoes.forEach( v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
