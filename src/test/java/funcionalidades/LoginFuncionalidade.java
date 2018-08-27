package funcionalidades;

import configuration.BaseTest;
import pageobjects.LoginPage;

    public class LoginFuncionalidade extends BaseTest {

        private LoginPage page;

        //construtor padrão
        public LoginFuncionalidade(){
            page = new LoginPage();
        }

        public void logarTsPrime(String conta, String senha){
            page.getUsuario().click();
            page.getUsuario().sendKeys(conta);
            page.getSenha().click();
            page.getSenha().sendKeys();
            page.getBtnLogon().click();
        }
        public void alterarIdioma(){
            driver.switchTo().frame("bannerFrame");
            page.getLanguageCbb().click();
            page.getLanguageCbbPtbr().click();
        }
        //ações dos elementos Funciolidades
}
