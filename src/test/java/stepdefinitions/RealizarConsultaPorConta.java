package stepdefinitions;

import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;

public class RealizarConsultaPorConta {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public RealizarConsultaPorConta(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }
    @Quando ("^Iniciar a procura de um cliente pelo número da conta \"([^\"]*)\"$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDaConta(String conta) throws Throwable {
      facilitadorFacilit.atendimentoAoCliente ();
      facilitadorFacilit.buscarConta (conta);
    }
}
