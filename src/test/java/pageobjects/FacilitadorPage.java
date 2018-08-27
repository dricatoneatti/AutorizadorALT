package pageobjects;

import configuration.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacilitadorPage extends BaseTest {

    //Page factory
    @FindBy(xpath = "//li[2][text()='Atendimento ao Cliente']")
    private WebElement menuAtendimentoCliente;

    @FindBy(xpath = "//div[@id='ctlSearch_update']//input[@name='ctlSearch$txtfind']")
    private  WebElement campoNumeroCliente;

    @FindBy(xpath = "//a[@id='ctlSearch_btnFind']")
    private WebElement botaoPesquisa;

    @FindBy (xpath = "//div[@class='col-one']//span[@id='MainPageAccUC_AccBalance']")
    private WebElement saldoCreditoCartao;



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

    //Localizar o xpath da opção Conta e CPF no TSPrime

}
