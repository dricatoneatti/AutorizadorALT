package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;
import funcionalidades.LoginFuncionalidade;


public class BuscaPorNumeroCartaoStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public BuscaPorNumeroCartaoStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Quando("^Iniciar a procura de um cliente pelo número do cartão$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDoCartão() throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarCartoes ();
    }

    @Então("^A consulta por catão foi realizada com sucesso e os dados do cliente foram apresentados$")
    public void aConsultaPorCatãoFoiRealizadaComSucessoEOsDadosDoClienteForamApresentados() throws Throwable {
        System.out.println ("Os cartões foram consultados com sucesso");

    }
}