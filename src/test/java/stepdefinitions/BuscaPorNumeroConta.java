package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;
import funcionalidades.LoginFuncionalidade;


public class BuscaPorNumeroConta {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public BuscaPorNumeroConta(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Quando ("^Iniciar a procura de um cliente pelo número da conta$")
    public void iniciar_a_procura_de_um_cliente_pelo_número_da_conta() throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarContas ();
    }

    @Então ("^A consulta pelo número da conta, foi realizada com sucesso e os dados do cliente foram apresentados$")
    public void a_consulta_pelo_número_da_conta_foi_realizada_com_sucesso_e_os_dados_do_cliente_foram_apresentados() throws Throwable {
        System.out.println ("Os cartões foram consultados com sucesso");
    }
}
