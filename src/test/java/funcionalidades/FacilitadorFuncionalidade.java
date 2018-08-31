package funcionalidades;

import configuration.BaseTest;
import pageobjects.FacilitadorPage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FacilitadorFuncionalidade extends BaseTest {

    private FacilitadorPage page;

    //construtor padrão
    public FacilitadorFuncionalidade() {
        page = new FacilitadorPage (driver);
    }

    public void atendimentoAoCliente() {
        driver.switchTo ().frame ("contentFrame");
        page.getMenuAtendimentoCliente ().click ();
        driver.switchTo ().defaultContent ();
    }

    public void buscarCartoes() throws Exception {
        ArrayList<String> listaCartao = LerExcel.leituraCartao (0);

        for (int i = 1; i < listaCartao.size (); i++) {
            driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
            page.getCampoNumeroCliente ().clear ();
            page.getCampoNumeroCliente ().sendKeys (listaCartao.get (i));
            page.getBotaoPesquisa ().click ();


            driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
            driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
            String saldo = page.getSaldoLimiteCartao ().getText ();
            System.out.println ("Saldo do limite de crédito do cartão " + listaCartao.get (i) + ": " + saldo);
            driver.switchTo ().defaultContent ();

            if (listaCartao == null) {
                System.out.println ("Todos os cartões já foram consultados pelo seu número");
            }
        }
    }

    public void buscarContas() throws Exception{
        ArrayList<String> listaConta = LerExcel.leituraCartao (1);

        for (int i = 1; i < listaConta.size (); i++) {
            driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
            page.getSelecionarOpcaoConta ().click ();
            page.getCampoNumeroCliente ().clear ();
            page.getCampoNumeroCliente ().sendKeys (listaConta.get (i));
            page.getBotaoPesquisa ().click ();

            driver.manage ().timeouts ().implicitlyWait (15, TimeUnit.SECONDS);
            driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
            String saldo = page.getSaldoLimiteCartao ().getText ();
            System.out.println ("Saldo do crédito da conta pesquisada " + listaConta.get (i) + ": " + saldo);
            driver.switchTo ().defaultContent ();

            if (listaConta == null) {
                System.out.println ("Todos as contas já foram consultadas pelo seu número");
            }
        }
    }

    public void buscarCartao(String cartao){
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
        page.getCampoNumeroCliente ().clear ();
        page.getCampoNumeroCliente ().sendKeys(cartao);
        page.getBotaoPesquisa ().click ();


    }

    public void visualizarFatura(){
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        page.getAcessarExtratos ().click ();
        page.getAcessarFaturaAtual ().click ();
        page.getAcessarBtnVisualizar ().click ();
        driver.switchTo ().defaultContent ();
    }




}
