package stepdefinitions;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import funcionalidades.FacilitadorFuncionalidade;

public class VerificarParametrosParaParcelamentoDeFaturaStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public VerificarParametrosParaParcelamentoDeFaturaStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }
    @Quando ("^Realizar os parâmetros para parcelamento de fatura$")
    public void realizarOsParâmetrosParaParcelamentoDeFatura() throws Throwable {

    }

    @Então ("^O os perfis serão editados$")
    public void oOsPerfisSerãoEditados() throws Throwable {

    }


}
