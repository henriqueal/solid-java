package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
    
    public void promoverFuncionario(Funcionario funcionario, Boolean metaBatida) {

        if(funcionario.getCargo().equals(Cargo.GERENTE)) {
            throws new ValidacaoException("Gerentes não podem ser promovidos!!");
        }

        if(metaBatida) {
            Cargo novoCargo = funcionario.getCargo().getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throws new ValidacaoException("Funcionário não bateu a meta!!"); 
        }
    }
}
