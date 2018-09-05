package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;
import org.junit.Assert;

public class VerificarParametrosParaParcelamentoDeFaturaStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public VerificarParametrosParaParcelamentoDeFaturaStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }
    @E ("^Realizar os parâmetros para parcelamento de fatura$")
    public void realizarOsParâmetrosParaParcelamentoDeFatura() throws Throwable {
        facilitadorFacilit.acessarGridCartoes ();

    }

    @Então ("^O os perfis serão editados$")
    public void oOsPerfisSerãoEditados() throws Throwable {
        System.out.println ("O sistema exibiu a tela para editar perfis");
    }


}
