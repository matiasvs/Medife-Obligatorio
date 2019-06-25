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

public class TestObligatorio_34 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio dl Dado un usuario conectado")
	public void obligatorio_dl_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio dl Usuario: <maru>")
	public void obligatorio_dl_Usuario_maru() {
		System.out.println("Ingreso usuario");
	}

	@Given("Obligatorio dl Pass: <p{int}>")
	public void obligatorio_dl_Pass_p(Integer int1) {
		System.out.println("ingreso password");
	}

	@Given("Obligatorio dl Dentro de La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_dl_Dentro_de_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se carga la pantalla Alta de responsable de pago desplegada");
	}

	@Given("Obligatorio dl los siguientes datos ingresados y confirmados:")
	public void obligatorio_dl_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio ingreso de datos");
	}

	@Given("Obligatorio dl Tipo de Responsable(.*)")
	public void obligatorio_dl_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio dl PopUp Busqueda de entidades")
	public void obligatorio_dl_PopUp_Busqueda_de_entidades() {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio dl Ingreso descripcion(.*)")
	public void obligatorio_dl_Ingreso_descripcion_LA_PAPELERA_DEL_PLATA_S_A(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio dl Ingreso cuit cuil(.*)")
	public void obligatorio_dl_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio dl Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_dl_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(800);
		buscarEntidad.check();
		Thread.sleep(810);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio dl Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_dl_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
		System.out.println("Inicio cargo de mail y fecha de vigencia");
	}

	@Given("Obligatorio dl Ingreso eMail (.*)")
	public void obligatorio_dl_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio dl Ingreso fecha de vigencia(.*)")
	public void obligatorio_dl_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio dl Cuando seleccion boton confirmar")
	public void obligatorio_dl_Cuando_seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio dl validar ingreso a Datos fiscales")
	public void obligatorio_dl_validar_ingreso_a_Datos_fiscales() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkPantallaDatosFiscales();
	}

	@Then("Obligatorio dl Y los siguientes datos ingresados")
	public void obligatorio_dl_Y_los_siguientes_datos_ingresados() {
		System.out.println("Datos ingresados");
	}

	@Then("Obligatorio dl Forma de pago habilitada(.*)")
	public void obligatorio_dl_Forma_de_pago_habilitada_Debito_automatico(String Debito) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoFormaDePagoDebitoAutomatico();
	}
	
	@Then("Obligatorio dl Numero de tarjeta(.*)")
	public void obligatorio_dl_Numero_de_tarjeta(String numeroTarjeta) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.numeroDeTarjeta(numeroTarjeta);
	}
	
	@Then("Obligatorio dl Fecha de vencimiento(.*)")
	public void obligatorio_dl_Fecha_de_vencimiento_fechaVencimiento(String fechaVencimiento) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.fechaDeVencimientoTarjeta(fechaVencimiento);
	}

	@Then("Obligatorio dl Tipo de tarjeta(.*)")
	public void obligatorio_dl_Tipo_de_tarjeta_tarjeta(String tipoTarjetas) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.tipoDeTarjetaDebito(tipoTarjetas);
		System.out.println("Tipo tarjeta");
		System.out.println("tarjeta");
	}
	
	@Then("Obligatorio dl Descripcion de Tarjeta Dato descripcion de tarjeta")
	public void obligatorio_dl_Descripcion_de_Tarjeta_Dato_descripcion_de_tarjeta() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio dl Seleccion boton guardar")
	public void obligatorio_dl_Seleccion_boton_guardar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio dl El servicio de validacion de BIN completa los datos de tipo y descripcion de tarjeta en caso de estar habilitado.")
	public void obligatorio_dl_El_servicio_de_validacion_de_BIN_completa_los_datos_de_tipo_y_descripcion_de_tarjeta_en_caso_de_estar_habilitado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
