package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AltaResponsableDePago;
import PageObjects.BusquedaDeEntidad;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class TestObligatorio_10 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio J Dado un usuario perfil situado en la pantalla Alta de responsabilidad de pago")
	public void obligatorio_J_Dado_un_usuario_perfil_situado_en_la_pantalla_Alta_de_responsabilidad_de_pago() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio J Ventana Buscador de Entidades desplegada:")
	public void obligatorio_J_Ventana_Buscador_de_Entidades_desplegada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio J Ingresar el valor de descripcion correspondiente a una empresa existente TIERRA COOP DE TRAB. VIV. Y CONS. LTDA.")
	public void obligatorio_J_Ingresar_el_valor_de_descripcion_correspondiente_a_una_empresa_existente_TIERRA_COOP_DE_TRAB_VIV_Y_CONS_LTDA() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio J Seleccionar el Boton Buscar")
	public void obligatorio_J_Seleccionar_el_Boton_Buscar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio J La Grilla se muestra vacia. No existen datos que coincidan con los criterios de busqueda ingresados.")
	public void obligatorio_J_La_Grilla_se_muestra_vacia_No_existen_datos_que_coincidan_con_los_criterios_de_busqueda_ingresados() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
