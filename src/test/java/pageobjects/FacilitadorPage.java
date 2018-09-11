package pageobjects;

import configuration.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.nio.file.WatchEvent;

public class FacilitadorPage extends BaseTest {
    public FacilitadorPage(WebDriver driver){
        PageFactory.initElements (driver, this);
    }

    //Page factory
    @FindBy(xpath = "//li[2][text()='Atendimento ao Cliente']")
    private WebElement menuAtendimentoCliente;

    @FindBy(xpath = "//li[2][text()='Terminais']")
    private WebElement menuTerminais;

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

    @FindBy(xpath = "//div[@id='MainPageCardxUC_CardPanel']//a[@id='MainPageCardxUC_lblCardHeader']")
    private  WebElement acessarGridCartao;

    @FindBy(xpath = "//div[@class=\"prime-menu\"]//ul[@id=\"ctl00_PrimeMenuCtrl_ActionMenu\"]")
    private WebElement acessarBtnAgir;

    @FindBy(xpath = "//ul[@role=\"menu\"]//li[@id=\"ui-id-8\"]")
    private WebElement acessaOpcaoAltPerfis;

    @FindBy(xpath ="//div[@id=\"MainPageCardxUC_CardPanel\"]//span[@id=\"MainPageCardxUC_CardNumber\"]")
    private WebElement acessarFuncionalidadeCartao;

    @FindBy(xpath = "//div[@id=\"MainPageCardxUC_CardPanel\"]//span[@id=\"MainPageCardxUC_lblProduct\"]")
    private WebElement acessarFuncionalidadeProduto;

    @FindBy(xpath = "//div[@id=\"MainPageCardxUC_CardPanel\"]//span[@id=\"MainPageCardxUC_CardProduct\"]")
    private WebElement acessarDadoCampoProduto;

    @FindBy(xpath = "//div[@id=\"MainPageAccUC_FinDetailsPanel\"]//span[@id=\"MainPageAccUC_lblNumber\"]")
    private WebElement acessarFuncionalidadeConta;

    @FindBy(xpath = "//div[@id=\"MainPageAccUC_FinDetailsPanel\"]//span[@id=\"MainPageAccUC_AccNumber\"]")
    private WebElement acessarDadoCampoConta;

    @FindBy (xpath = "//div[@id=\"MainPageAddressesUC_PersonPanel\"]//span[@id='MainPageAddressesUC_lbladdressdetails']")
    private WebElement acessarFuncionalidadeEndereco;

    @FindBy (xpath = "//div[@id=\"MainPageAddressesUC_PersonPanel\"]//span[@id='MainPageAddressesUC_Add1']")
    private WebElement acessarDadoCampoEndereco;

    @FindBy(xpath = "//*[@id=\"body_ONLINEACSMAIN_btnSearchTer\"]")
    private WebElement btnLocalizarTerminal;

    @FindBy(xpath = "//div[@id=\"dvTerminals\"]//table[@class=\"grid\"]//tr[@class=\"grid-odd\"]//td[4]//input[@type=\"text\"]")
    private WebElement campoValorTerminal;

    @FindBy(xpath = "//div[@class=\"button-footer\"]//input[@name=\"ctl00$body$ONLINEACSSEARCH$terminalSearchFields$btnSearch\"]")
    private WebElement btnPesquisarTerminal;

    public WebElement getAcessarFuncionalidadeCartao() {
        return acessarFuncionalidadeCartao;
    }

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

    public WebElement getAcessarGridCartao() {
        return acessarGridCartao;
    }

    public WebElement getAcessarBtnAgir() {
        return acessarBtnAgir;
    }

    public WebElement getAcessaOpcaoAltPerfis() {
        return acessaOpcaoAltPerfis;
    }

    public WebElement getAcessarFuncionalidadeProduto() {
        return acessarFuncionalidadeProduto;
    }

    public WebElement getAcessarDadoCampoProduto() {
        return acessarDadoCampoProduto;
    }

    public WebElement getAcessarDadoCampoConta() {
        return acessarDadoCampoConta;
    }

    public WebElement getAcessarFuncionalidadeConta() {
        return acessarFuncionalidadeConta;
    }

    public WebElement getAcessarFuncionalidadeEndereco() {
        return acessarFuncionalidadeEndereco;
    }

    public WebElement getAcessarDadoCampoEndereco() {
        return acessarDadoCampoEndereco;
    }

    public WebElement getMenuTerminais() {
        return menuTerminais;
    }

    public WebElement getBtnLocalizarTerminal() {
        return btnLocalizarTerminal;
    }

    public WebElement  getCampoValorTerminal() {
        return campoValorTerminal;
    }

    public WebElement getBtnPesquisarTerminal() {
        return btnPesquisarTerminal;
    }
}
