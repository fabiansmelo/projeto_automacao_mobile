package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.AdicionarDespesasPage;

public class AdicionarDespesasSteps {

    AdicionarDespesasPage ad = new AdicionarDespesasPage(driver);

    @Dado("que o usuario esteja na pagina principal do aplicativo")
    public void queOUsuarioEstejaNaPaginaPrincipalDoAplicativo() {
        ad.paginaPrincipal();
    }

    @Dado("o usuario adiciona uma despesa de {string} da categoria {string}")
    public void oUsuarioAdicionaUmaDespesaDeDaCategoria(String valor, String categoria) {
        ad.pularTutorial();
        ad.adicionarDespesa(valor, categoria);

    }

    @Entao("o aplicativo adiciona uma nova despesa")
    public void oAplicativoAdicionaUmaNovadespesa() {
        ad.validarAdicaoDespesas();
    }

    //Rever este metodo
//	@Quando("o usuario altera o valor para {string}")
//	public void oUsuarioAlteraOValorPara(String string) {

    /// /	    ad.editarValorFamilia();
//	}
//
//	@Entao("a despesa eealterada para {string}")
//	public void aDespesaEealteradaPara(String string) {
//	    
//	}
    @Dado("o usuario adiciona uma despesa de exercicio")
    public void oUsuarioAdicionaUmaDespesaDeExercicio() {
        ad.adicionarDespesaExercicio();

    }

    @Entao("o sistema exibe a soma das transacoes: {string}")
    public void oSistemaExibeASomaDasTransacoes(String string) {
        ad.validarAdicaoDespesas();
    }

}
