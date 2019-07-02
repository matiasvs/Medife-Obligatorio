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

public class TestObligatorio_20 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio x Dado un usuario conectado")
	public void obligatorio_x_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio x Usuario: <maru>")
	public void obligatorio_x_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio x Pass: <p{int}>")
	public void obligatorio_x_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio x La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_x_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio x los siguientes datos ingresados y confirmados:")
	public void obligatorio_x_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio de datos ingresados  confirmaciones");
	}

	@Given("Obligatorio x Tipo de Responsable(.*)")
	public void obligatorio_x_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio x PopUp Busqueda de entidades")
	public void obligatorio_x_PopUp_Busqueda_de_entidades() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}
	
	@Given("Obligatorio x Ingreso descripcion(.*)")
	public void obligatorio_x_Ingreso_descripcion_FUNARG_S_R_L(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio x Ingreso cuit cuil(.*)")
	public void obligatorio_x_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}	

	@Given("Obligatorio x Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_x_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(2000);
		buscarEntidad.check();
		Thread.sleep(2000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio x Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_x_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
	    System.out.println("Se inicia el proceso para completar los posible campos faltantes");
	}

	@Given("Obligatorio x Ingreso eMail(.*)")
	public void obligatorio_x_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio x Ingreso fecha de vigencia(.*)")
	public void obligatorio_x_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@Given("Obligatorio x Seleccion boton confirmar")
	public void obligatorio_x_Seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio x validar pantalla de Datos fiscales")
	public void obligatorio_x_validar_pantalla_de_Datos_fiscales() {
	    CargaDeDatosFiscalesTarea dFiscales = new CargaDeDatosFiscalesTarea(driver);
	    dFiscales.checkPantallaDatosFiscales();
	}

	@When("Obligatorio x Cuando se seleciona el valor(.*)para el campo Condicion de IVA")
	public void obligatorio_x_Cuando_se_seleciona_el_valor_Monotributo_para_el_campo_Condicion_de_IVA(String condicionIVA) {
		CargaDeDatosFiscalesTarea dFiscales = new CargaDeDatosFiscalesTarea(driver);
	    dFiscales.ingresoCondicionIVAMonotributo();
	}

	@Then("Obligatorio x Entonces la aplicacion muestra los siguientes campos editables")
	public void obligatorio_x_Entonces_la_aplicacion_muestra_los_siguientes_campos_editables() {
	    System.out.println("Campos editable");
	}

	@Then("Obligatorio x Fecha inicio condicion IVA(.*)")
	public void obligatorio_x_Fecha_inicio_condicion_IVA(String fechaCondicionIva) {
	    CargaDeDatosFiscalesTarea dFiscales = new CargaDeDatosFiscalesTarea(driver);
	    dFiscales.validarFechaInicioCondicionIVA(fechaCondicionIva);
	}

	@Then("Obligatorio x Forma de pago check")
	public void obligatorio_x_Forma_de_pago_check() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarFormaDePago();
	}

	@Then("Obligatorio x Adherido factura electronica dato")
	public void obligatorio_x_Adherido_factura_electronica_dato() {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarAdheridoAFacturaElectronica();
	}

	@Then("Obligatorio x Email(.*)")
	public void obligatorio_x_Email_variableFiscales_gmail_com(String emailAdherido) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarEmailAdherido(emailAdherido);
	}
}
