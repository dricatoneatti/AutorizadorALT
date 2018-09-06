package stepdefinitions;

import cucumber.api.java.pt.Então;
import funcionalidades.FacilitadorFuncionalidade;

public class VerificarAcessoFuncionalidadeProdutoStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public VerificarAcessoFuncionalidadeProdutoStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Então ("^A funcionalidade produto está ativa$")
    public void aFuncionalidadeProdutoEstáAtiva() throws Throwable {
    facilitadorFacilit.acessarFuncionalidadeProduto ();

    }
}
