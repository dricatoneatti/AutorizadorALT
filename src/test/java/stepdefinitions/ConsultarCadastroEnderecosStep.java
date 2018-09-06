package stepdefinitions;

import cucumber.api.java.pt.Então;
import funcionalidades.FacilitadorFuncionalidade;

public class ConsultarCadastroEnderecosStep {
    private FacilitadorFuncionalidade facilitadorFacilit;

    public ConsultarCadastroEnderecosStep(){
        this.facilitadorFacilit = new FacilitadorFuncionalidade ();
    }

    @Então ("^A grid Endereço é apresentada com os dados do Cliente$")
    public void aGridEndereçoÉApresentadaComOsDadosDoCliente() throws Throwable {
    facilitadorFacilit.consultarCadastroEnderecos ();
    }
}
