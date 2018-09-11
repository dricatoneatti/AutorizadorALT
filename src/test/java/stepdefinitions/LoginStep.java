package stepdefinitions;

import cucumber.api.java.pt.Dado;
import funcionalidades.FacilitadorFuncionalidade;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import funcionalidades.LoginFuncionalidade;


public class LoginStep extends FacilitadorFuncionalidade{
//    static  String nomeScreenshot = acessarNomeDaPagina () + Screenshots.dataHoraArquivo ();
    private LoginFuncionalidade loginFacilit;
    private XMLSlideShow ppt = new XMLSlideShow ();
//


    public LoginStep(){
        this.loginFacilit = new LoginFuncionalidade ();


    }
    @Dado("^Que o Tsprime seja inicializado com o usuário \"([^\"]*)\" e a senha \"([^\"]*)\"$")
    public void queOTsprimeSejaInicializadoComOUsuárioEASenha(String usuario, String senha) throws Throwable {
//        Screenshots.CriarDiretorio ();
        loginFacilit.logarTsPrime (usuario, senha);
        /*Screenshots.TirarFoto (Screenshots.DIR, acessarNomeDaPagina (), Screenshots.dataHoraArquivo ());
        Screenshots.createSlide (nomeScreenshot, ppt, "Release 18-4 - Parametros");*/

//        Screenshots.createSlide ("");
        loginFacilit.alterarIdioma ();
    }
}
