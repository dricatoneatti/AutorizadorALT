package stepdefinitions;

import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;

public class RealizarConsultaPorCartao {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public RealizarConsultaPorCartao(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Quando("^Iniciar a procura de um cliente pelo número do cartão \"([^\"]*)\"$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDoCartão(String cartao) throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarCartao (cartao);
    }

}
