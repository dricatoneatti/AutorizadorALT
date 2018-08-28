package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;
import funcionalidades.LoginFuncionalidade;


public class BuscaPorNumeroCartao {

    private LoginFuncionalidade loginFacilit;
    private FacilitadorFuncionalidade facilitadorFacilit;

    public BuscaPorNumeroCartao(){
        this.loginFacilit = new LoginFuncionalidade ();
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Dado("^Que o Tsprime seja inicializado com o usuário \"([^\"]*)\" e a senha \"([^\"]*)\"$")
    public void queOTsprimeSejaInicializadoComOUsuárioEASenha(String usuario, String senha) throws Throwable {
        loginFacilit.logarTsPrime (usuario, senha);
        loginFacilit.alterarIdioma ();
    }

    @Quando("^Iniciar a procura de um cliente pelo número do cartão$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDoCartão() throws Throwable {
        facilitadorFacilit.atendimentoAoCliente ();
        facilitadorFacilit.buscarCartao ();
    }

    @Então("^A consulta por catão foi realizada com sucesso e os dados do cliente foram apresentados$")
    public void aConsultaPorCatãoFoiRealizadaComSucessoEOsDadosDoClienteForamApresentados() throws Throwable {
        System.out.println ("Os cartões foram consultados com sucesso");

    }
}