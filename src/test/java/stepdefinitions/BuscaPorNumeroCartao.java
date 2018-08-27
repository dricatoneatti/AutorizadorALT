package stepdefinitions;

import Bases.FacilitadorFuncoes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;


public class BuscaPorNumeroCartao {

    FacilitadorFuncoes facilit = new FacilitadorFuncoes ();

    @Dado("^Que o Tsprime seja inicializado com o usuário \"([^\"]*)\" e a senha \"([^\"]*)\"$")
    public void queOTsprimeSejaInicializadoComOUsuárioEASenha(String usuario, String senha) throws Throwable {
        facilit.efetuarLogin(usuario,senha);
        facilit.alterarIdioma();
    }

    @Quando("^Iniciar a procura de um cliente pelo número do cartão$")
    public void iniciarAProcuraDeUmClientePeloNúmeroDoCartão() throws Throwable {
        facilit.opcaoatendimentoCliente();
        facilit.buscaPorCartao();
        facilit.buscaPorNumeroCartao();
    }

    @Então("^A consulta por catão foi realizada com sucesso e os dados do cliente foram apresentados$")
    public void aConsultaPorCatãoFoiRealizadaComSucessoEOsDadosDoClienteForamApresentados() throws Throwable {
        System.out.println ("O cartão foi consultado com sucesso");
        facilit.fecharTsPrime ();
    }
}