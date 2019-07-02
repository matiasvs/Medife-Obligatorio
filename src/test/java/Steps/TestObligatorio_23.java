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

public class TestObligatorio_23 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio fr Dado un usuario conectado")
	public void obligatorio_fr_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); 
		driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio fr Usuario: <maru>")
	public void obligatorio_fr_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio fr Pass: <p{int}>")
	public void obligatorio_fr_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio fr La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_fr_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio fr los siguientes datos ingresados y confirmados:")
	public void obligatorio_fr_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio de datos ingresados  confirmaciones");
	}

	@Given("Obligatorio fr Tipo de Responsable(.*)")
	public void obligatorio_fr_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio fr PopUp Busqueda de entidades")
	public void obligatorio_fr_PopUp_Busqueda_de_entidades() {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}
	
	@Given("Obligatorio fr Ingreso descripcion(.*)")
	public void obligatorio_fr_Ingreso_descripcion_CARMEJO_OLGA_ROXANA(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
		System.out.println("no");
	}

	@Given("Obligatorio fr Ingreso cuit cuil(.*)")
	public void obligatorio_fr_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}	

	@Given("Obligatorio fr Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_fr_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(1000);
		buscarEntidad.check();
		Thread.sleep(1000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio fr Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_fr_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
		System.out.println("Ingreso de los campos requeridos");
	}

	@Given("Obligatorio fr Ingreso eMail(.*)")
	public void obligatorio_fr_Ingreso_eMail_catfer__email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio fr Ingreso fecha de vigencia(.*)")
	public void obligatorio_fr_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@Given("Obligatorio fr Seleccion boton confirmar")
	public void obligatorio_fr_Seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio fr validar pantalla de Datos fiscales")
	public void obligatorio_fr_validar_pantalla_de_Datos_fiscales() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.checkPantallaDatosFiscales();
	}

	@When("Obligatorio fr Condicion de IVA Responsable")
	public void obligatorio_fr_Condicion_de_IVA_Responsable() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.ingresoCondicionIVAResponsableInscripto();
	}

	@Then("Obligatorio fr Fecha inicio condicion IVA(.*)")
	public void obligatorio_fr_Fecha_inicio_condicion_IVA(String fechaInicioCondicionIVA) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarFechaInicioCondicionIVA(fechaInicioCondicionIVA);
	}

	@When("Obligatorio fr Selecciono el boton confirmar")
	public void obligatorio_fr_Selecciono_el_boton_confirmar() throws InterruptedException {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.btnConfirmar();
	}

	@Then("Obligatorio fr La aplicacion emite un mensaje indicando que:")
	public void obligatorio_fr_La_aplicacion_emite_un_mensaje_indicando_que() {
	    System.out.println("Mensaje a emitarse");
	}

	@Then("Obligatorio fr Mensaje Fecha Inicio Cond. De IVA es dato requerido para Condicion IVA Responsable Inscripto.")
	public void obligatorio_fr_Mensaje_Fecha_Inicio_Cond_De_IVA_es_dato_requerido_para_Condicion_IVA_Responsable_Inscripto() {
	    System.out.println("Mensaje que hay que validar");
	}

	@Then("Obligatorio fr Y que los siguientes campos son requeridos")
	public void obligatorio_fr_Y_que_los_siguientes_campos_son_requeridos() {
	    System.out.println("campo que son requerdios");
	}

	@Then("Obligatorio fr Forma de pago check")
	public void obligatorio_fr_Forma_de_pago_check() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Adherido factura electronica dato")
	public void obligatorio_fr_Adherido_factura_electronica_dato() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Provincia <provincia>")
	public void obligatorio_fr_Provincia_provincia() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Localidad <localidad>")
	public void obligatorio_fr_Localidad_localidad() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr codigo postal <cp>")
	public void obligatorio_fr_codigo_postal_cp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr calle <calle>")
	public void obligatorio_fr_calle_calle() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Partido <partido>")
	public void obligatorio_fr_Partido_partido() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Nro <nro>")
	public void obligatorio_fr_Nro_nro() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Tipo telefono <tipoTelefono>")
	public void obligatorio_fr_Tipo_telefono_tipoTelefono() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Prefijo <prefigo>")
	public void obligatorio_fr_Prefijo_prefigo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr Numero <numero>")
	public void obligatorio_fr_Numero_numero() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fr no guarda los datos")
	public void obligatorio_fr_no_guarda_los_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
