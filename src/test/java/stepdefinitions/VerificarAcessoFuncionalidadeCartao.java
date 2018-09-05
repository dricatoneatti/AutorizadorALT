package stepdefinitions;

import cucumber.api.java.pt.Então;
import funcionalidades.FacilitadorFuncionalidade;
import org.junit.Assert;

public class VerificarAcessoFuncionalidadeCartao {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public VerificarAcessoFuncionalidadeCartao(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Então ("^A funcionalidade cartão está ativa$")
    public void aFuncionalidadeCartãoEstáAtiva(String cartao) throws Throwable {
        facilitadorFacilit.acessarFuncionalidadeCartao ();
    }

}
