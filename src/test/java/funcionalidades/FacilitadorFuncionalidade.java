package funcionalidades;

import configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void opcaoTerminaisMenu() {
        driver.switchTo ().frame ("contentFrame");
        page.getMenuTerminais ().click ();
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

    public void buscarContas() throws Exception {
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

    public void buscarCartao(String cartao) {
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
        page.getCampoNumeroCliente ().clear ();
        page.getCampoNumeroCliente ().sendKeys (cartao);
        page.getBotaoPesquisa ().click ();

    }

    public void buscarConta(String conta) {
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
        page.getSelecionarOpcaoConta ().click ();
        page.getCampoNumeroCliente ().sendKeys (conta);
        page.getBotaoPesquisa ().click ();
    }

    public void visualizarFatura() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        page.getAcessarExtratos ().click ();
        page.getAcessarFaturaAtual ().click ();
        page.getAcessarBtnVisualizar ().click ();
        driver.switchTo ().defaultContent ();
    }

    public void acessarGridCartoes() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        page.getAcessarGridCartao ().click ();
        page.getAcessarBtnAgir ().click ();

        wait.until (ExpectedConditions.visibilityOfElementLocated (By.xpath ("//ul[@role=\"menu\"]//li[@id=\"ui-id-8\"]")));
        page.getAcessaOpcaoAltPerfis ().click ();
        driver.switchTo ().defaultContent ();
    }

    public void acessarFuncionalidadeCartao() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        if (page.getAcessarFuncionalidadeCartao ().isDisplayed ()) {
            System.out.println ("O perfil possui a funcionalidade para o cartão");
        }

    }

    public void acessarFuncionalidadeProduto() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        if (page.getAcessarFuncionalidadeProduto ().isDisplayed ()) {
            String dado = page.getAcessarDadoCampoProduto ().getText ();
            System.out.println ("O perfil possui a funcionalidade para o produto do cartão pesquisado: " + dado);

        }


    }

    public void acessarFuncionalidadeConta() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        if (page.getAcessarFuncionalidadeConta ().isDisplayed ()) {
            String dado = page.getAcessarDadoCampoConta ().getText ();
            System.out.println ("O perfil possui a funcionalidade para a conta do cliente pesquisado: " + dado);

        }
    }

    public void consultarCadastroEnderecos() {
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
        if (page.getAcessarFuncionalidadeEndereco ().isDisplayed ()) {
            String dado = page.getAcessarDadoCampoEndereco ().getText ();
            System.out.println ("O endereço cadastrado do cliente é: " + dado);

        }
    }

    public void validarAberturaDeTerminais(){
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame");
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        page.getBtnLocalizarTerminal ().click ();
    }

    public void inserirValorTerminal(String valor){
        page.getCampoValorTerminal ().click ();
        page.getCampoValorTerminal ().sendKeys (valor);
        page.getBtnPesquisarTerminal ().click ();
    }
}