package stepdefinitions;

import cucumber.api.java.pt.Então;
import funcionalidades.FacilitadorFuncionalidade;

public class VerificarAcessoFuncionalidadeContaStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public VerificarAcessoFuncionalidadeContaStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Então ("^A funcionalidade conta está ativa$")
    public void aFuncionalidadeContaEstáAtiva() throws Throwable {
        facilitadorFacilit.acessarFuncionalidadeConta ();

    }
}
