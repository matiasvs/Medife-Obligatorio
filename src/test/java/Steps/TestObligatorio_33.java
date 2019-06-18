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

public class TestObligatorio_33 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio dr Dado un usuario conectado")
	public void obligatorio_dr_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio dr Usuario: <maru>")
	public void obligatorio_dr_Usuario_maru() {
		System.out.println("Ingreso usuario");
	}

	@Given("Obligatorio dr Pass: <p{int}>")
	public void obligatorio_dr_Pass_p(Integer int1) {
		System.out.println("ingreso password");
	}

	@Given("Obligatorio dr Dentro de La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_dr_Dentro_de_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se carga la pantalla Alta de responsable de pago desplegada");
	}

	@Given("Obligatorio dr los siguientes datos ingresados y confirmados:")
	public void obligatorio_dr_los_siguientes_datos_ingresados_y_confirmados() {
		System.out.println("Inicio ingreso de datos");
	}

	@Given("Obligatorio dr Tipo de Responsable(.*)")
	public void obligatorio_dr_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio dr PopUp Busqueda de entidades")
	public void obligatorio_dr_PopUp_Busqueda_de_entidades() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio dr Ingreso descripcion(.*)")
	public void obligatorio_dr_Ingreso_descripcion_JARDIN_DE_INFANTES_E_DE_COLORES_S_R_L(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio dr Ingreso cuit cuil(.*)")
	public void obligatorio_dr_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio dr Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_dr_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(800);
		buscarEntidad.check();
		Thread.sleep(810);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio dr Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_dr_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
		System.out.println("Inicio cargo de mail y fecha de vigencia");
	}

	@Given("Obligatorio dr Ingreso eMail(.*)")
	public void obligatorio_dr_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio dr Ingreso fecha de vigencia(.*)")
	public void obligatorio_dr_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio dr Cuando seleccion boton confirmar")
	public void obligatorio_dr_Cuando_seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio dr validar ingreso a Datos fiscales")
	public void obligatorio_dr_validar_ingreso_a_Datos_fiscales() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkPantallaDatosFiscales();
	}

	@Then("Obligatorio dr Y los siguientes datos ingresados")
	public void obligatorio_dr_Y_los_siguientes_datos_ingresados() {
	    System.out.println("Datos ingresados");
	}

	@Then("Obligatorio dr Campo Condicion IVA(.*)")
	public void obligatorio_dr_Campo_Condicion_IVA_Monotributo(String condicionIVA) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoCondicionIVA(condicionIVA);
	}

	@Then("Obligatorio dr Campo Fecha inicio condidicon IVA(.*)")
	public void obligatorio_dr_Campo_Fecha_inicio_condidicon_IVA(String fechaInicioCondicionIVA) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoFechaInicioCondicionIVA(fechaInicioCondicionIVA);
	}

	@When("Obligatorio dr Selecciono boton Guardar")
	public void obligatorio_dr_Selecciono_boton_Guardar() throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.btnGuardar();
	}

	@Then("Obligatorio dr la aplicacion guarda los datos ingresados CIERRA LA VENTANA O PERMANECE - pregunta")
	public void obligatorio_dr_la_aplicacion_guarda_los_datos_ingresados_CIERRA_LA_VENTANA_O_PERMANECE_pregunta() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
