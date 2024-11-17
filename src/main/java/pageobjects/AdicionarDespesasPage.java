package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AdicionarDespesasPage {

    protected WebDriver driver;

    public AdicionarDespesasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public AdicionarDespesasPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Continuar sem criar uma conta")
    private WebElement botaoEntrar;

    @AndroidFindBy(accessibility = "Come�ar")
    private WebElement botaoComecar;

    @AndroidFindBy(accessibility = "Pr�ximo")
    private WebElement botaoProximo;

    @AndroidFindBy(accessibility = "Pr�ximo")
    private WebElement botaoProximo2;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
    private WebElement botaoNovaDespesa;

    @AndroidFindBy(accessibility = "Selecionar o tipo de transa��o")
    private WebElement pularTutorial;
    @AndroidFindBy(accessibility = "Insira o valor")
    private WebElement pularTutorial2;
    @AndroidFindBy(accessibility = "Selecione a moeda da transa��o")
    private WebElement pularTutorial3;
    @AndroidFindBy(accessibility = "Especificar conta")
    private WebElement pularTutorial4;
    @AndroidFindBy(accessibility = "Selecionar um �cone para a categoria")
    private WebElement pularTutorial5;
    @AndroidFindBy(accessibility = "Case necess�rio, adicione uma nova categoria")
    private WebElement pularTutorial6;
    @AndroidFindBy(accessibility = "Selecione a data")
    private WebElement pularTutorial7;
    @AndroidFindBy(accessibility = "Adicionar coment�rio")
    private WebElement pularTutorial8;
    @AndroidFindBy(accessibility = "Voc� pode adicionar uma foto")
    private WebElement pularTutorial9;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    private WebElement campoValor;

    @AndroidFindBy(accessibility = "Fam�lia")
    private WebElement botaoFamilia;

    @AndroidFindBy(accessibility = "Exerc�cio f�sico")
    private WebElement botaoExercicio;

    @AndroidFindBy(accessibility = "Adicionar")
    private WebElement botaoAdicionarDespesa;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    private WebElement validarDespesas;

//	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
//	private WebElement editarValorFamilia;


    public void paginaPrincipal() {
        botaoEntrar.click();
        botaoComecar.click();
        botaoProximo.click();
        botaoProximo2.click();

    }

    public void pularTutorial() {
        botaoNovaDespesa.click();
        pularTutorial.click();
        pularTutorial2.click();
        pularTutorial3.click();
        pularTutorial4.click();
        pularTutorial5.click();
        pularTutorial6.click();
        pularTutorial7.click();
        pularTutorial8.click();
        pularTutorial9.click();
    }

    public void adicionarDespesa(String valor, String categoria) {

        utils.Utils.inputTextAppiumCommand(campoValor, valor);
        if (categoria.equals("familia")) {
            botaoFamilia.click();
        }

        botaoAdicionarDespesa.click();

    }

    // Melhorar validacao final
    public void validarAdicaoDespesas() {
        validarDespesas.isEnabled();
    }

    public void adicionarDespesaExercicio() {
        botaoNovaDespesa.click();
        utils.Utils.inputTextAppiumCommand(campoValor, "120");
        botaoExercicio.click();
        botaoAdicionarDespesa.click();
    }

//	public void editarValorFamilia () {
//		editarValorFamilia.click();
//	}

}
