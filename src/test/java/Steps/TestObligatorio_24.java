package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AltaResponsableDePago;
import PageObjects.BusquedaDeEntidad;
import PageObjects.CargaDeDatosFiscalesTarea;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class TestObligatorio_24 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio fw Dado un usuario conectado")
	public void obligatorio_fw_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio fw Usuario: <maru>")
	public void obligatorio_fw_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio fw Pass: <p{int}>")
	public void obligatorio_fw_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio fw La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_fw_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio fw los siguientes datos ingresados y confirmados:")
	public void obligatorio_fw_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio de datos ingresados  confirmaciones");
	}

	@Given("Obligatorio fw Tipo de Responsable(.*)")
	public void obligatorio_fw_Tipo_de_Responsable_Grupo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio fw PopUp Busqueda de entidades")
	public void obligatorio_fw_PopUp_Busqueda_de_entidades() {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}
	
	@Given("Obligatorio fw Ingreso descripcion(.*)")
	public void obligatorio_fw_Ingreso_descripcion_MOSAICOS_ROSSI_HNOS_S_R_L(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio fw Ingreso cuit cuil(.*)")
	public void obligatorio_fw_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}	

	@Given("Obligatorio fw Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_fw_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(1000);
		buscarEntidad.check();
		Thread.sleep(1000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio fw Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_fw_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
		System.out.println("Ingreso de los campos requeridos");
	}

	@Given("Obligatorio fw Ingreso eMail(.*)")
	public void obligatorio_fw_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio fw Ingreso fecha de vigencia(.*)")
	public void obligatorio_fw_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@Given("Obligatorio fw Seleccion boton confirmar")
	public void obligatorio_fw_Seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio fw validar pantalla de Datos fiscales")
	public void obligatorio_fw_validar_pantalla_de_Datos_fiscales() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.checkPantallaDatosFiscales();
	}

	@When("Obligatorio fw Condicion de IVA Monotributo")
	public void obligatorio_fw_Condicion_de_IVA_Monotributo() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.ingresoCondicionIVAMonotributo();
	}

	@Then("Obligatorio fw Fecha inicio condicion IVA(.*)")
	public void obligatorio_fw_Fecha_inicio_condicion_IVA(String fechaInicioCondicionIVA) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarFechaInicioCondicionIVA(fechaInicioCondicionIVA);
	}

	@When("Obligatorio fw Selecciono el boton confirmar")
	public void obligatorio_fw_Selecciono_el_boton_confirmar() throws InterruptedException {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.btnConfirmar();
	}

	@Then("Obligatorio fw La aplicacion emite un mensaje indicando que:")
	public void obligatorio_fw_La_aplicacion_emite_un_mensaje_indicando_que() {
	    System.out.println("Mensaje indicando el mensaje");
	}

	@Then("Obligatorio fw Y que los siguientes campos son requeridos")
	public void obligatorio_fw_Y_que_los_siguientes_campos_son_requeridos() {
	    System.out.println("Campos requeridos");
	}

	@Then("Obligatorio fw Forma de pago check")
	public void obligatorio_fw_Forma_de_pago_check() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Adherido factura electronica dato")
	public void obligatorio_fw_Adherido_factura_electronica_dato() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Provincia <provincia>")
	public void obligatorio_fw_Provincia_provincia() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Localidad <localidad>")
	public void obligatorio_fw_Localidad_localidad() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw codigo postal <cp>")
	public void obligatorio_fw_codigo_postal_cp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw calle <calle>")
	public void obligatorio_fw_calle_calle() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Partido <partido>")
	public void obligatorio_fw_Partido_partido() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Nro <nro>")
	public void obligatorio_fw_Nro_nro() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Tipo telefono <tipoTelefono>")
	public void obligatorio_fw_Tipo_telefono_tipoTelefono() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Prefijo <prefigo>")
	public void obligatorio_fw_Prefijo_prefigo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw Numero <numero>")
	public void obligatorio_fw_Numero_numero() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fw no guarda los datos")
	public void obligatorio_fw_no_guarda_los_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
