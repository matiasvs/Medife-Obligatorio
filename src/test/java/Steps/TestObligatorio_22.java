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

public class TestObligatorio_22 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio vb Dado un usuario conectado")
	public void obligatorio_vb_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio vb Usuario: <maru>")
	public void obligatorio_vb_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio vb Pass: <p{int}>")
	public void obligatorio_vb_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio vb La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_vb_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio vb los siguientes datos ingresados y confirmados:")
	public void obligatorio_vb_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio de datos ingresados  confirmaciones");
	}

	@Given("Obligatorio vb Tipo de Responsable(.*)")
	public void obligatorio_vb_Tipo_de_Responsable_Grupo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio vb PopUp Busqueda de entidades")
	public void obligatorio_vb_PopUp_Busqueda_de_entidades() {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio vb Ingreso descripcion (.*)")
	public void obligatorio_vb_Ingreso_descripcion_MOSAICOS_ROSSI_HNOS_S_R_L(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
		System.out.println("text");
	}
	
	@Given("Obligatorio vb Ingreso cuit cuil (.*)")
	public void obligatorio_vb_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	

	@Given("Obligatorio vb Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_vb_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(1000);
		buscarEntidad.check();
		Thread.sleep(1000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio vb Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_vb_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
		System.out.println("Ingreso de los campos requeridos");
	}

	@Given("Obligatorio vb Ingreso eMail (.*)")
	public void obligatorio_vb_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio vb Ingreso fecha de vigencia (.*)")
	public void obligatorio_vb_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@Given("Obligatorio vb Seleccion boton confirmar")
	public void obligatorio_vb_Seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio vb validar pantalla de Datos fiscales")
	public void obligatorio_vb_validar_pantalla_de_Datos_fiscales() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.checkPantallaDatosFiscales();
	}

	@When("Obligatorio vb Condicion de IVA (.*)")
	public void obligatorio_vb_Condicion_de_IVA_Exento() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Fecha inicio condicion IVA (.*)")
	public void obligatorio_vb_Fecha_inicio_condicion_IVA(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio vb Selecciono el boton confirmar")
	public void obligatorio_vb_Selecciono_el_boton_confirmar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb La apliacion emite un mensaje indicando que Fecha Inicio Cond. De IVA es dato requerido para Condicion IVA Exento. y que los siguientes campos son requeridos,")
	public void obligatorio_vb_La_apliacion_emite_un_mensaje_indicando_que_Fecha_Inicio_Cond_De_IVA_es_dato_requerido_para_Condicion_IVA_Exento_y_que_los_siguientes_campos_son_requeridos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Forma de pago (.*)")
	public void obligatorio_vb_Forma_de_pago_check() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Adherido factura electronica (.*)")
	public void obligatorio_vb_Adherido_factura_electronica_dato() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Provincia (.*)")
	public void obligatorio_vb_Provincia_provincia() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Localidad (.*)")
	public void obligatorio_vb_Localidad_localidad() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb codigo postal (.*)")
	public void obligatorio_vb_codigo_postal_cp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb calle (.*)")
	public void obligatorio_vb_calle_calle() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Partido (.*)")
	public void obligatorio_vb_Partido_partido() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Nro (.*)")
	public void obligatorio_vb_Nro_nro() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Tipo telefono (.*)")
	public void obligatorio_vb_Tipo_telefono_tipoTelefono() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Prefijo (.*)")
	public void obligatorio_vb_Prefijo_prefigo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb Numero (.*)")
	public void obligatorio_vb_Numero_numero() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio vb no guarda los datos")
	public void obligatorio_vb_no_guarda_los_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
