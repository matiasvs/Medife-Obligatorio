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

public class TestObligatorio_32 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio za Dado un usuario conectado")
	public void obligatorio_za_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio za Usuario: <maru>")
	public void obligatorio_za_Usuario_maru() {
	    System.out.println("Ingreso usuario");
	}

	@Given("Obligatorio za Pass: <p{int}>")
	public void obligatorio_za_Pass_p(Integer int1) {
	    System.out.println("ingreso password");
	}

	@Given("Obligatorio za Dentro de La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_za_Dentro_de_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
	    System.out.println("Se carga la pantalla Alta de responsable de pago desplegada");
	}

	@Given("Obligatorio za los siguientes datos ingresados y confirmados:")
	public void obligatorio_za_los_siguientes_datos_ingresados_y_confirmados() {
	    System.out.println("Inicio ingreso de datos");
	}

	@Given("Obligatorio za Tipo de Responsable(.*)")
	public void obligatorio_za_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio za PopUp Busqueda de entidades")
	public void obligatorio_za_PopUp_Busqueda_de_entidades() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio za Ingreso descripcion(.*)")
	public void obligatorio_za_Ingreso_descripcion_ZALAZAR(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio za Ingreso cuit cuil(.*)")
	public void obligatorio_za_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio za Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_za_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(800);
		buscarEntidad.check();
		Thread.sleep(810);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio za Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_za_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
	    System.out.println("Inicio cargo de mail y fecha de vigencia");	    
	}

	@Given("Obligatorio za Ingreso eMail(.*)")
	public void obligatorio_za_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio za Ingreso fecha de vigencia(.*)")
	public void obligatorio_za_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio za Cuando seleccion boton confirmar")
	public void obligatorio_za_Cuando_seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio za validar ingreso a Datos fiscales")
	public void obligatorio_za_validar_ingreso_a_Datos_fiscales() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkPantallaDatosFiscales();
	}

	@Then("Obligatorio za Y los siguientes datos ingresados")
	public void obligatorio_za_Y_los_siguientes_datos_ingresados() {
	    System.out.println("Inicio datos ingresados");
	}

	@Then("Obligatorio za Condicion IVA:(.*)")
	public void obligatorio_za_Condicion_IVA_Consumidor(String condicionIVA) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoCondicionIVA(condicionIVA);
	}

	@Then("Obligatorio za Fecha inicio condicion IVA(.*)")
	public void obligatorio_za_Fecha_inicio_condicion_IVA(String fechaInicioCondicionIVA) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoFechaInicioCondicionIVA(fechaInicioCondicionIVA);
	}

	@When("Obligatorio za Selecciono el boton Guardar")
	public void obligatorio_za_Selecciono_el_boton_Guardar() throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.btnGuardar();
	}

	@Then("Obligatorio za Entonces en la aplicacion emite un mensaje: Para Responsible de pago tipo Empresa, no es valido condicion de IVA Consumidor Final.")
	public void obligatorio_za_Entonces_en_la_aplicacion_emite_un_mensaje_Para_Responsible_de_pago_tipo_Empresa_no_es_valido_condicion_de_IVA_Consumidor_Final() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio za No guarda los datos")
	public void obligatorio_za_No_guarda_los_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
