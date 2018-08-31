package stepdefinitions;

import cucumber.api.java.pt.Dado;
import funcionalidades.FacilitadorFuncionalidade;
import funcionalidades.LoginFuncionalidade;

public class LoginStep {
    private LoginFuncionalidade loginFacilit;

    public LoginStep(){
        this.loginFacilit = new LoginFuncionalidade ();
    }
    @Dado("^Que o Tsprime seja inicializado com o usuário \"([^\"]*)\" e a senha \"([^\"]*)\"$")
    public void queOTsprimeSejaInicializadoComOUsuárioEASenha(String usuario, String senha) throws Throwable {
        loginFacilit.logarTsPrime (usuario, senha);
        loginFacilit.alterarIdioma ();
    }
}
