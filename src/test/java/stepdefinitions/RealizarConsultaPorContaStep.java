package stepdefinitions;

import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;

public class RealizarConsultaPorContaStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public RealizarConsultaPorContaStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }
    @Quando ("^Iniciar a procura de um cliente pelo número da conta \"([^\"]*)\"$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDaConta(String conta) throws Throwable {
      facilitadorFacilit.atendimentoAoCliente ();
      facilitadorFacilit.buscarConta (conta);
    }
}
