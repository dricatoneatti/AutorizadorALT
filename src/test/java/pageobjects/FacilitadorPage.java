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

    @FindBy (xpath = "//div[@class='col-one']//span[@id='MainPageAccUC_AccBalance']")
    private WebElement saldoCreditoCartao;

    @FindBy (xpath = "//div[@id=\"MainPageCustUC_CustomerPanel\"]")
    private WebElement painelCliente;

    @FindBy (xpath = "//div[@class='col-one']//span[@id='MainPageAccUC_AccBalance']")
    private WebElement campoSaldoCredito;

    public WebElement getMenuAtendimentoCliente() {
        return menuAtendimentoCliente;
    }

    public WebElement getCampoNumeroCliente() {
        return campoNumeroCliente;
    }

    public WebElement getBotaoPesquisa() {
        return botaoPesquisa;
    }

    public WebElement getSaldoCreditoCartao() {
        return saldoCreditoCartao;
    }

    public WebElement getPainelCliente() {
        return painelCliente;
    }

    //Localizar o xpath da opção Conta e CPF no TSPrime

}
