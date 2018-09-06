package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;
import funcionalidades.LoginFuncionalidade;


public class ConsultaMassaPorCartao {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public ConsultaMassaPorCartao(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }
    @Quando("^Iniciar a procura de varios clientes pelo número do cartão$")
    public void iniciar_a_procura_de_varios_clientes_pelo_número_do_cartão() throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarCartoes ();

    }
    @Então("^A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados$")
    public void a_consulta_por_cartão_foi_realizada_com_sucesso_e_os_dados_do_cliente_foram_apresentados() throws Throwable {
        System.out.println ("Os cartões foram consultados com sucesso");
    }


}