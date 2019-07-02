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

public class TestObligatorio_11 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio K Dado un usuario conectado")
	public void obligatorio_K_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio K Usuario: <maru>")
	public void obligatorio_K_Usuario_maru() {
		System.out.println("Usuario: marus");
	}

	@Given("Obligatorio K Pass: <p{int}>")
	public void obligatorio_K_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio K La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_K_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio K los siguientes datos ingresados:")
	public void obligatorio_K_los_siguientes_datos_ingresados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio K Tipo de Responsable(.*)$")
	public void obligatorio_K_Tipo_de_Responsable_Grupo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(1000);
	}

	@Given("Obligatorio K Ventana Buscador de Entidades desplegada con el siguiente resultado listado en la grilla, de la busqueda ejecutada")
	public void obligatorio_K_Ventana_Buscador_de_Entidades_desplegada_con_el_siguiente_resultado_listado_en_la_grilla_de_la_busqueda_ejecutada() throws InterruptedException {
	    BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
	    buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio K Ingreso de descripcion(.*)$")
	public void obligatorio_K_Ingreso_de_descripcion_descripcion(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio k Ingreso de cuit cuil(.*)$")
	public void obligatorio_k_Ingreso_de_cuit_cuil(String BusquedaCuit) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
		buscarEntidad.botonBusqueda();
		buscarEntidad.check();
		Thread.sleep(2000);
		buscarEntidad.ConfirmarEntidad();
	}
	
	@Given("Obligatorio K ingreso fecha de vigencia(.*)")
	public void obligatorio_K_ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio K Cuando Selecciono el Boton Seleccionar")
	public void obligatorio_K_Cuando_Selecciono_el_Boton_Seleccionar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio K La aplicacion cierra la ventana Buscador de Entidades y los datos seleccionados se visualizan ingresados en la pantalla Alta de Responsable de Pago no permitiendo su edicion")
	public void obligatorio_K_La_aplicacion_cierra_la_ventana_Buscador_de_Entidades_y_los_datos_seleccionados_se_visualizan_ingresados_en_la_pantalla_Alta_de_Responsable_de_Pago_no_permitiendo_su_edicion() {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.validTipoResonsable11();
		AltaResDePago.validAltaCuitCuil11();
	}
}
