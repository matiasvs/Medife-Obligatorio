package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AltaResponsableDePago;
import PageObjects.Browser;
import PageObjects.Helpers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class TestObligatorio_01 {
	
	
	
	private WebDriver driver;
	
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	
	// STEPS - CUCUMBER //
	
	@Given("Dado un usuario perfil xx conectado con lo siguientes datos")
	public void dado_un_usuario_perfil_xx_conectado_con_lo_siguientes_datos() {		
		  System.out.println("Inicio de conexcion"); System.setProperty(pathChrome,
		  browser ); driver = new ChromeDriver(); //driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(baseURL); driver.manage().window().maximize();		 
	}

	@Given("Usuario: <maru>")
	public void usuario_maru() {
	    System.out.println("Login de usuario: Maru");
	}

	@Given("Pass: <{int}>")
	public void pass(Integer password) {
	    System.out.println("Ingreso de password: " + password);
	}

	@Given("la pantalla Alta de responsible de pago desplegada")
	public void la_pantalla_Alta_de_responsible_de_pago_desplegada() {
	    System.out.println("Se carga la vista: Alta responsable de pago");
	}

	@When("seleciona el campo Tipo de Responsable")
	public void seleciona_el_campo_Tipo_de_Responsable() throws InterruptedException {
		Helpers helpers = new Helpers(driver);
		helpers.waits(1);
	    System.out.println("Inicio selecciono de de valores de Tipo de responsable");
	}

	@When("A Selecciono Empresa(.*)$")
	public void a_Selecciono_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);		
		Helpers helpers = new Helpers(driver);
		helpers.waits(2);
		helpers.closed();
	}
	
}
