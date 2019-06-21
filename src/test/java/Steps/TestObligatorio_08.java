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

public class TestObligatorio_08 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio H Dado un usuario conectado")
	public void obligatorio_H_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio H Usuario: <maru>")
	public void obligatorio_H_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio H Pass: <p{int}>")
	public void obligatorio_H_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio H La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_H_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio H los siguientes datos ingresados:")
	public void obligatorio_H_los_siguientes_datos_ingresados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio H Tipo de Responsable(.*)$")
	public void obligatorio_H_Tipo_de_Responsable_Grup(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(1000);
	}

	@When("Obligatorio H Selecciono el Boton Buscador de Entidades")
	public void obligatorio_H_Selecciono_el_Boton_Buscador_de_Entidades() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	    System.out.println("Seleccion boton Buscar entidad");
	}

	@Then("Obligatorio H La aplicacion despliega la ventana Buscador de Entidades. Mostrando los siguientes campos:")
	public void obligatorio_H_La_aplicacion_despliega_la_ventana_Buscador_de_Entidades_Mostrando_los_siguientes_campos() {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		//buscarEntidad.validarTituloPopup();
	}

	@Then("Obligatorio H Solo lectura Tipo de Entidad Grupo Familiar habilitados para el ingreso de datos: descripcion cuit cuil")
	public void obligatorio_H_Solo_lectura_Tipo_de_Entidad_Grupo_Familiar_habilitados_para_el_ingreso_de_datos_descripcion_cuit_cuil() {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.validarResposableGrupoFamiliar();
		buscarEntidad.descripcionIsEnabled();
		buscarEntidad.cuitCuilIsEnabled();		
	}
	

}
