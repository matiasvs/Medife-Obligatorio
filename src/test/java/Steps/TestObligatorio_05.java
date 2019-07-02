package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AltaResponsableDePago;
import PageObjects.BusquedaDeEntidad;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class TestObligatorio_05 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio E Dado un usuario perfil situado en la pantalla Alta de responsabilidad de pago")
	public void obligatorio_E_Dado_un_usuario_perfil_situado_en_la_pantalla_Alta_de_responsabilidad_de_pago() {		
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio E Usuario: <maru>")
	public void obligatorio_E_Usuario_maru() {
	    System.out.println("Usuario: maru");
	}

	@Given("Obligatorio E Pass: <p{int}>")
	public void obligatorio_E_Pass_p(Integer int1) {
	    System.out.println("Password: 12365488");
	}

	@Given("Obligatorio E La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_E_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
	    System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio E los siguientes datos ingresados:")
	public void obligatorio_E_los_siguientes_datos_ingresados() {
	    System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio E Tipo de Responsable(.*)$")
	public void obligatorio_E_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		//Thread.sleep(600);
	}
	
	@Given("Obligatorio E Selecciono el boton Busqueda de entidad")
	public void obligatorio_E_Selecciono_el_boton_Busqueda_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	    System.out.println("Seleccion boton Buscar entidad");
	}

	@Given("Obligatorio E Se ingresa un valor de descripcion(.*)$")
	public void obligatorio_E_Se_ingresa_un_valor_de_descripcion_descripcion(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		//Thread.sleep(800);
	}

	@Given("Obligatorio E Se ingresa un valor de cuit(.*)$")
	public void obligatorio_E_Se_ingresa_un_valor_de_cuit(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}	

	@When("Obligatorio E Selecciono el Boton Seleccionar y se selecciona el boton Confirmar entidad")
	public void obligatorio_E_Selecciono_el_Boton_Seleccionar_y_se_selecciona_el_boton_Confirmar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		//Thread.sleep(200);
	}
	
	@Given("Obligatorio E Se selecciona el valor con checkbox")
	public void obligatorio_E_Se_selecciona_el_valor_con_checkbox() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		//buscarEntidad.botonBusqueda();
		//Thread.sleep(3000);
		buscarEntidad.check();
		Thread.sleep(1000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Then("Obligatorio E La aplicacion cierra la ventana Buscador de Entidades y los datos seleccionados se visualizan cargados en la pantalla Alta de Responsable de Pago no permitiendo su edicion")
	public void obligatorio_E_La_aplicacion_cierra_la_ventana_Buscador_de_Entidades_y_los_datos_seleccionados_se_visualizan_cargados_en_la_pantalla_Alta_de_Responsable_de_Pago_no_permitiendo_su_edicion() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.validTipoResonsable05();
		AltaResDePago.validAltaCuitCuil05();
	}
}
