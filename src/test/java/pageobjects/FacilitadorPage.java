package pageobjects;

import configuration.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class FacilitadorPage extends BaseTest {
    public FacilitadorPage(WebDriver driver){
        PageFactory.initElements (driver, this);
    }

    //Page factory
    @FindBy(xpath = "//li[2][text()='Atendimento ao Cliente']")
    private WebElement menuAtendimentoCliente;

    @FindBy(xpath = "//div[@id='ctlSearch_update']//input[@name='ctlSearch$txtfind']")
    private  WebElement campoNumeroCliente;

    @FindBy(xpath = "//a[@id='ctlSearch_btnFind']")
    private WebElement botaoPesquisa;

    @FindBy (xpath = "//div[@class='col-one']//span[@id='MainPageAccUC_AccCreditLimit']")
    private WebElement saldoLimiteCartao;

    @FindBy (xpath = "//div[@id=\"MainPageCustUC_CustomerPanel\"]")
    private WebElement painelCliente;

    @FindBy (xpath = "//div[@class='col-one']//span[@id='MainPageAccUC_AccBalance']")
    private WebElement campoSaldoCredito;

    @FindBy (xpath = "//div[@class='search-box']//option[contains(text(),'Conta')]")
    private WebElement selecionarOpcaoConta;

    @FindBy(xpath = "//div[@class=\"action-group\"]//img[@title=\"Extratos\"]")
    private WebElement acessarExtratos;

    @FindBy(xpath = "//table[@class=\"grid\"]//a[@id='ctl00_col_gvSelectionList_ctl02_grvLinkButton']")
    private WebElement acessarFaturaAtual;

    @FindBy(xpath = "//input[@name=\"ctl00$col$btnview\"]")
    private WebElement acessarBtnVisualizar;

    public WebElement getMenuAtendimentoCliente() {
        return menuAtendimentoCliente;
    }

    public WebElement getCampoNumeroCliente() {
        return campoNumeroCliente;
    }

    public WebElement getBotaoPesquisa() {
        return botaoPesquisa;
    }

    public WebElement getSaldoLimiteCartao() {
        return saldoLimiteCartao;
    }

    public WebElement getPainelCliente() {
        return painelCliente;
    }

    public WebElement getSelecionarOpcaoConta() {
        return selecionarOpcaoConta;
    }

    public WebElement getAcessarExtratos() {
        return acessarExtratos;
    }

    public WebElement getAcessarFaturaAtual() {
        return acessarFaturaAtual;
    }

    public WebElement getAcessarBtnVisualizar() {
        return acessarBtnVisualizar;
    }

    //Localizar o xpath da opção Conta e CPF no TSPrime

}
