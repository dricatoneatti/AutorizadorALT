package funcionalidades;

import configuration.BaseTest;
import pageobjects.LoginPage;

    public class LoginFuncionalidade extends BaseTest {

        private LoginPage page;

        //construtor padrão
        public LoginFuncionalidade(){
            page = new LoginPage(driver);
        }

        public void logarTsPrime(String usuario, String senha){
            page.getUsuario().click();
            page.getUsuario().sendKeys(usuario);
            page.getSenha().click();
            page.getSenha().sendKeys(senha);
            page.getBtnLogon().click();

            if(page.getMainContent().isDisplayed ()){
            page.getBtnTerminateSession().click();
            page.getMainPlaceHolderBtnGo ().click();

            }else { page.getMainPlaceHolderBtnGo().click ();
            }
    }
        public void alterarIdioma(){
            driver.switchTo().frame("bannerFrame");
            page.getLanguageCbb().click();
            page.getLanguageCbbPtbr().click();
        }
        //ações dos elementos Funcionalidades
}
