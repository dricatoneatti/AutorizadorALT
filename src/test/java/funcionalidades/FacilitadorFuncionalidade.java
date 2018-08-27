package funcionalidades;

import Bases.LerExcel;
import configuration.BaseTest;
import pageobjects.FacilitadorPage;
import pageobjects.LoginPage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FacilitadorFuncionalidade extends BaseTest {

    private FacilitadorPage page;

    //construtor padrão
    public FacilitadorFuncionalidade() {
        page = new FacilitadorPage ();
    }

    public void atendimentoAoCLiente() {
        driver.switchTo ().frame ("contentFrame");
        page.getMenuAtendimentoCliente ().click ();
        driver.switchTo ().defaultContent ();
    }

    public void buscarCartao() throws Exception {
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
        page.getCampoNumeroCliente ().click ();

        ArrayList<String> lista = LerExcel.leituraCartao (0);

        for (int i = 1; i < lista.size (); i++) {
            page.getCampoNumeroCliente ().sendKeys (lista.get (i));
            page.getBotaoPesquisa ().click ();
            //Inserir prints
            page.getCampoNumeroCliente ().clear ();
            page.getCampoNumeroCliente ();
            if (lista == null) {
                System.out.println ("Todos os créditos dos cartões da lista, foram consultados");
            }

        }

    }

}