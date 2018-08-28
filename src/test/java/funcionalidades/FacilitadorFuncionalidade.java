package funcionalidades;

import configuration.BaseTest;
import pageobjects.FacilitadorPage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FacilitadorFuncionalidade extends BaseTest {

    private FacilitadorPage page;

    //construtor padrão
    public FacilitadorFuncionalidade(){
        page = new FacilitadorPage (driver);
    }

    public void atendimentoAoCliente() {
        driver.switchTo ().frame ("contentFrame");
        page.getMenuAtendimentoCliente ().click ();
        driver.switchTo ().defaultContent ();
    }

    public void buscarCartao() throws Exception {
        ArrayList<String> lista = LerExcel.leituraCartao (0);

        for (int i = 1; i < lista.size (); i++) {
            driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardLeftPage");
            page.getCampoNumeroCliente ().clear ();
            page.getCampoNumeroCliente ().sendKeys (lista.get (i));
            page.getBotaoPesquisa ().click ();

            driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
            driver.switchTo ().frame ("contentFrame").switchTo ().frame ("applicationFrame").switchTo ().frame ("CardMainPage");
            String saldo =  page.getSaldoCreditoCartao ().getText ();
            System.out.println ("Saldo do crédito do cartão " + lista.get (i) +  ": " + saldo );
            driver.switchTo ().defaultContent ();

            if (lista == null) {
                System.out.println ("Todos os cartões já foram consultados pelo seu número");
            }
        }

    }

}

