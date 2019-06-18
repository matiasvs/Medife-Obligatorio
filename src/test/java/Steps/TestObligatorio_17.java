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

public class TestObligatorio_17 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio L Dado un usuario conectado")
	public void obligatorio_L_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio L Usuario: <maru>")
	public void obligatorio_L_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio L Pass: <p{int}>")
	public void obligatorio_L_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio L La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_L_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio L los siguientes datos seleccionados:")
	public void obligatorio_L_los_siguientes_datos_seleccionados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio L Tipo de Responsable(.*)$")
	public void obligatorio_L_Tipo_de_Responsable_Externo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio L Ingreso Razon social - Apellido nombre(.*)$")
	public void obligatorio_L_Ingreso_Razon_social_Apellido_nombre_razonSocial(String razonSocial) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoRazonSocial(razonSocial);
	}

	@Given("Obligatorio L Ingreso Email(.*)$")
	public void obligatorio_L_Ingreso_Email_email(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio L y los siguientes datos ingresados cuit cuil(.*)$")
	public void obligatorio_L_y_los_siguientes_datos_ingresados_cuit_cuil(String cuitCuil) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoCuitCuil(cuitCuil);
	}
	
	@Given("Obligatorio L Ingreso fecha de vigencia(.*)$")
	public void obligatorio_L_Ingreso_fecha_de_vigencia_fechaVigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio L Cuando Seleccionar el Boton Confirmar")
	public void obligatorio_L_Cuando_Seleccionar_el_Boton_Confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio L la aplicacion Guarda los datos ingresados y continua en la siguiente tarea: habilita la seccion Datos Fiscales mostrando los siguientes campos precargados y editables")
	public void obligatorio_L_la_aplicacion_Guarda_los_datos_ingresados_y_continua_en_la_siguiente_tarea_habilita_la_seccion_Datos_Fiscales_mostrando_los_siguientes_campos_precargados_y_editables() {
	    CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
	    datosFiscales.checkPantallaDatosFiscales();
	}

	@Then("Obligatorio L Validar valor condicion IVA <excento>")
	public void obligatorio_L_Validar_valor_condicion_IVA_excento() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio L Validar valor Fecha inicio condicion IVA <fechaInicioCondicionIVA>")
	public void obligatorio_L_Validar_valor_Fecha_inicio_condicion_IVA_fechaInicioCondicionIVA() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio L Validar valor Nro. IIBB <nroIIBB>")
	public void obligatorio_L_Validar_valor_Nro_IIBB_nroIIBB() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio L Validar valor Condicion IIBB <condicionIIBB>")
	public void obligatorio_L_Validar_valor_Condicion_IIBB_condicionIIBB() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
     
	@Then("Obligatorio L Validar valor Forma de pago <formaDePago>")
	public void obligatorio_L_Validar_valor_Forma_de_pago_formaDePago() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio L Validar valor Adherido factura electronica <adheridoFacturaElectronica>")
	public void obligatorio_L_Validar_valor_Adherido_factura_electronica_adheridoFacturaElectronica() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio L Validar valor DFmail <DFmail>")
	public void obligatorio_L_Validar_valor_DFmail_DFmail() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
