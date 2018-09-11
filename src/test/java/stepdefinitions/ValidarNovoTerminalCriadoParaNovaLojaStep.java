package stepdefinitions;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;

public class ValidarNovoTerminalCriadoParaNovaLojaStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public ValidarNovoTerminalCriadoParaNovaLojaStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Quando("^Informado o número do estabelecimento no campo “Valor” \"([^\"]*)\"$")
    public void informadoONúmeroDoEstabelecimentoNoCampoValor(String valor) throws Throwable {
        facilitadorFacilit.opcaoTerminaisMenu ();
        facilitadorFacilit.validarAberturaDeTerminais ();
        facilitadorFacilit.inserirValorTerminal (valor);
    }


    @Então ("^Será exibido as informações do terminal na tabela de resultado da pesquisa$")
    public void seráExibidoAsInformaçõesDoTerminalNaTabelaDeResultadoDaPesquisa() throws Throwable {

    }

}
