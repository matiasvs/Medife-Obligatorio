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

public class TestObligatorio_12 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio nm Dado un usuario conectado")
	public void obligatorio_nm_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio nm Usuario: <maru>")
	public void obligatorio_nm_Usuario_maru() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio nm Pass: <p{int}>")
	public void obligatorio_nm_Pass_p(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio nm La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_nm_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio nm Tipo de Responsable Externo")
	public void obligatorio_nm_Tipo_de_Responsable_Externo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio nm Ventana Buscador de Entidades desplegada con el siguiente resultado listado en la grilla, de la busqueda ejecutada")
	public void obligatorio_nm_Ventana_Buscador_de_Entidades_desplegada_con_el_siguiente_resultado_listado_en_la_grilla_de_la_busqueda_ejecutada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio nm Ingreso de descripcion GOMEZ")
	public void obligatorio_nm_Ingreso_de_descripcion_GOMEZ() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio nm Selecciono valor Externo para el campo tipo de responsable")
	public void obligatorio_nm_Selecciono_valor_Externo_para_el_campo_tipo_de_responsable() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio nm Entonces La aplicacion habilita los campos para ingresar los datos manualmente")
	public void obligatorio_nm_Entonces_La_aplicacion_habilita_los_campos_para_ingresar_los_datos_manualmente() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio nm Excepto: Fecha de Baja y Estado que no son Editables")
	public void obligatorio_nm_Excepto_Fecha_de_Baja_y_Estado_que_no_son_Editables() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio nm Inhabilita el Boton Buscador de entidades")
	public void obligatorio_nm_Inhabilita_el_Boton_Buscador_de_entidades() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
