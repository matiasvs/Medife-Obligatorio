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

public class TestObligatorio_19 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio T Dado un usuario conectado")
	public void obligatorio_T_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio T Usuario: <maru>")
	public void obligatorio_T_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio T Pass: <p{int}>")
	public void obligatorio_T_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio T La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_T_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio T los siguientes datos ingresados y confirmados:")
	public void obligatorio_T_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio de datos ingresados  confirmaciones");
	}

	@Given("Obligatorio T Tipo de Responsable(.*)$")
	public void obligatorio_T_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}
	
	@Given("Obligatorio T PopUp Busqueda de entidades")
	public void obligatorio_T_PopUp_Busqueda_de_entidades() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}
	
	@Given("Obligatorio T Ingreso descripcion(.*)$")
	public void obligatorio_T_Ingreso_descripcion_CIORDIA_SCOCOZZA_Y_ASOCIADOS(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}
	
	@Given("Obligatorio T Ingreso descripcion para Razon social - Apellido nombre Catalina Fernandez")
	public void obligatorio_T_Ingreso_descripcion_para_Razon_social_Apellido_nombre_Catalina_Fernandez() {
	   System.out.println("no");
	}

	@Given("Obligatorio T Ingreso cuit cuil(.*)$")
	public void obligatorio_T_Ingreso_cuit_cuil_cuitCuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}
	
	@Given("Obligatorio T Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_T_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(1000);
		buscarEntidad.check();
		Thread.sleep(1000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio T Ingreso Razon social - Apellido nombre(.*)$")
	public void obligatorio_T_Ingreso_Razon_social_Apellido_nombre_Catalina_Fernandez(String razonSocial) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoRazonSocial(razonSocial);
	}

	@Given("Obligatorio T Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_T_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() throws InterruptedException {
		System.out.println("Ingreso de los campos requeridos");
	}

	@Given("Obligatorio T Ingreso eMail(.*)")
	public void obligatorio_T_Ingreso_eMail_mail(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio T Ingreso fecha de vigencia(.*)")
	public void obligatorio_T_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@Given("Obligatorio T Seleccion boton confirmar")
	public void obligatorio_T_Seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio T validar ingreso a Datos fiscales")
	public void obligatorio_T_validar_ingreso_a_Datos_fiscales() {
	   CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
	   datosFiscales.checkPantallaDatosFiscales();
	}
	//condicionIva
	@When("Obligatorio T Cuando se seleciona el valor(.*)para el campo Condicion de IVA")
	public void obligatorio_T_Cuando_se_seleciona_el_valor_Responsable_para_el_campo_Condicion_de_IVA(String condicionIva) throws InterruptedException {
		Thread.sleep(4000);
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.ingresoCondicionIVAResponsableInscripto();
	}

	@Then("Obligatorio T Entonces la aplicacion muestra los siguientes campos editables")
	public void obligatorio_T_Entonces_la_aplicacion_muestra_los_siguientes_campos_editables() {
	    System.out.println("campos editables");
	}

	@Then("Obligatorio T Fecha inicio condicion IVA(.*)")
	public void obligatorio_T_Fecha_inicio_condicion_IVA_condicionIva(String fechaInicioCondicionIVA) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarFechaInicioCondicionIVA(fechaInicioCondicionIVA);
	}

	@Then("Obligatorio T Nro. IIBB(.*)")
	public void obligatorio_T_Nro_IIBB_nroIIBB(String numeroIIBB) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarByNumeroIIBB(numeroIIBB);
	}

	@Then("Obligatorio T Condicion IIBB(.*)")
	public void obligatorio_T_Condicion_IIBB_CondicionIIBB(String condicionIIBB) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarCondicionIIBB(condicionIIBB);
	}

	@Then("Obligatorio T Forma de pago(.*)")
	public void obligatorio_T_Forma_de_pago_formaPago(String formaDepago) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarFormaDePago();
	}

	@Then("Obligatorio T Adherido factura electronica(.*)")
	public void obligatorio_T_Adherido_factura_electronica_facturaElectronica(String adheridoAFacturaElectronica) throws InterruptedException {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarAdheridoAFacturaElectronica();
	}

	@Then("Obligatorio T Email(.*)")
	public void obligatorio_T_Email_DatosFiscalesMail(String emailAdherido) {
		CargaDeDatosFiscalesTarea datosFiscales = new CargaDeDatosFiscalesTarea(driver);
		datosFiscales.validarEmailAdherido(emailAdherido);
	}
}
