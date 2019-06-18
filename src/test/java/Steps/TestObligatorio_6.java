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

public class TestObligatorio_6 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio F Ventana Buscador de Entidades desplegada con el siguiente resultado de la busqueda ejecuta listado en la grilla")
	public void obligatorio_F_Ventana_Buscador_de_Entidades_desplegada_con_el_siguiente_resultado_de_la_b_squeda_ejecuta_listado_en_la_grilla() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}
	
	@Given("Obligatorio F Seleccionar tipo de responsable(.*)")
	public void obligatorio_F_Seleccionar_tipo_de_responsable_Empresa(String tipoResponsable) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
	}

	@Given("Obligatorio F ingreso descripcion(.*)")
	public void obligatorio_F_ingreso_descripcion_descripcionA(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
		//buscarEntidad.ingresoDescripcion(descripcion);
	}

	@Given("Obligatorio F ingreso cuit cuil(.*)")
	public void obligatorio_F_ingreso_cuit_cuil_cuitCuilA(String BusquedaCuit) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		//buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
		buscarEntidad.botonBusqueda();
	}

	@When("Obligatorio F el cursor marca el ultimo registro y Selecciona el Boton Seleccionar")
	public void obligatorio_F_el_cursor_marca_el_ultimo_registro_y_Selecciona_el_Boton_Seleccionar() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ultimaPagina();
		buscarEntidad.checkboxLast();
	}

	@Then("Obligatorio F La aplicacion cierra la ventana Buscador de Entidades y los datos del registro seleccionado se visualizan  ingresados en la pantalla Alta de Responsable de Pago no permitiendo su edicion")
	public void obligatorio_F_La_aplicaci_n_cierra_la_ventana_Buscador_de_Entidades_y_los_datos_del_registro_seleccionado_se_visualizan_ingresados_en_la_pantalla_Alta_de_Responsable_de_Pago_no_permitiendo_su_edicion() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ConfirmarEntidad();
	}
}
