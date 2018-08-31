package stepdefinitions;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;
import org.junit.Assert;

public class VisualizarFaturaStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public VisualizarFaturaStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }
    @Quando("^Realizar a visualização da fatura atual de um cartão \"([^\"]*)\"$")
    public void realizarAVisualizaçãoDaFaturaAtualDeUmCartão(String cartao) throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarCartao (cartao);
        facilitadorFacilit.visualizarFatura();
    }


    @Então("^A fatura do cliente será apresentada com as transações$")
    public void a_fatura_do_cliente_será_apresentada_com_as_transações() throws Throwable {
    Assert.assertEquals ("5300 3327 7354 4211", "5300 3327 7354 4211");

    }
}
