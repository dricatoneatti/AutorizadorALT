package pageobjects;

import configuration.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage(WebDriver driver){
        PageFactory.initElements (driver, this);
    }

    //Page factory
    @FindBy(id = "ctl00_MainPlaceHolder_txtUserName")
    private WebElement usuario;

    @FindBy (id = "ctl00_MainPlaceHolder_txtPassword")
    private WebElement senha;

    @FindBy (id = "ctl00_MainPlaceHolder_btnLogon")
    private WebElement btnLogon;

    @FindBy (xpath = "//div[@id='maincontent']")
    private WebElement mainContent;

    @FindBy (id = "ctl00_MainPlaceHolder_btnTerminateSession")
    private WebElement btnTerminateSession;

    @FindBy(xpath = "//div[@id=\"maincontent\"]//input[@type=\"submit\"")
    private WebElement btnContinue;

    @FindBy (xpath = "//div[@id='maincontent']//input[@id='ctl00_MainPlaceHolder_btnGo']")
    private WebElement mainPlaceHolderBtnGo;

    @FindBy (xpath = "//select[@name='ddlLanguage']")
    private WebElement languageCbb;

    @FindBy (xpath = "//option[@value='pt-BR']")
    private WebElement languageCbbPtbr;

    public WebElement getUsuario() {
        return usuario;
    }

    public WebElement getSenha() {
        return senha;
    }

    public WebElement getBtnLogon() {
        return btnLogon;
    }

    public WebElement getMainContent() {
        return mainContent;
    }

    public WebElement getBtnTerminateSession() {
        return btnTerminateSession;
    }

    public WebElement getMainPlaceHolderBtnGo() {
        return mainPlaceHolderBtnGo;
    }

    public WebElement getLanguageCbb() {
        return languageCbb;
    }

    public WebElement getLanguageCbbPtbr() {
        return languageCbbPtbr;
    }

    public WebElement getBtnContinue() {
        return btnContinue;
    }


    //mapeamento de elemento, page object
}
