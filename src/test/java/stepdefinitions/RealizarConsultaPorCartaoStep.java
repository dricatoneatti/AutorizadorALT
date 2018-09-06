package stepdefinitions;

import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;

public class RealizarConsultaPorCartaoStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public RealizarConsultaPorCartaoStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Quando("^Iniciar a procura de um cliente pelo número do cartão \"([^\"]*)\"$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDoCartão(String cartao) throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarCartao (cartao);
    }

}
