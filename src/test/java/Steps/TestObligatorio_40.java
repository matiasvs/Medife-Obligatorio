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

public class TestObligatorio_40 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio as Dado un usuario conectado")
	public void obligatorio_as_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio as completar la pantalla Alta de responsabilidad de pago")
	public void obligatorio_as_completar_la_pantalla_Alta_de_responsabilidad_de_pago() {
	    System.out.println("Se ingreso a la pantalla");
	}

	@Given("Obligatorio as con los campos Tipos de responsabilidad(.*)")
	public void obligatorio_as_con_los_campos_Tipos_de_responsabilidad_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio as buscar entidad")
	public void obligatorio_as_buscar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio as ingresar Descripcion(.*)")
	public void obligatorio_as_ingresar_Descripcion_SEIRE_SA(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio as ingresar cuit cuil(.*)")
	public void obligatorio_as_ingresar_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio as seleccionar resultado y confirmar entidad")
	public void obligatorio_as_seleccionar_resultado_y_confirmar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(800);
		buscarEntidad.check();
		Thread.sleep(810);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio as completar campo Mail(.*)")
	public void obligatorio_as_completar_campo_Mail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio as completar campo Fecha de vigecnia(.*)")
	public void obligatorio_as_completar_campo_Fecha_de_vigecnia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio as Seleccionar boton Confimar")
	public void obligatorio_as_Seleccionar_boton_Confimar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio as Validar pantalla Carga de datos fiscales")
	public void obligatorio_as_Validar_pantalla_Carga_de_datos_fiscales() {
	    CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    //fiscales.checkPantallaDatosFiscales();
	}
	//ingresoTipoDeTelefono
	@Then("Obligatorio as Seleccionar boton Nuevo telefo")
	public void obligatorio_as_Seleccionar_boton_Nuevo_telefo() throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
		Thread.sleep(6000);
	    fiscales.ingresoNuevoTelefono();
	}
	//ingresoTipoDeTelefono
	@Then("Obligatorio as completar campos Tipo de telefono(.*)")
	public void obligatorio_as_completar_campos_Tipo_de_telefono_Particular(String tipoDeTelefono) throws InterruptedException {
	    CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoTipoDeTelefono(tipoDeTelefono);
	}

	@Then("Obligatorio as completar campos Prefijo(.*)")
	public void obligatorio_as_completar_campos_Prefijo(String prefijo) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoPrefijo(prefijo);
	}

	@Then("Obligatorio as completar campos Numero(.*)")
	public void obligatorio_as_completar_campos_Numero(String numeroPopUp) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoNumeroPopup(numeroPopUp);
	}

	@When("Obligatorio as Seleccionar Confirmar")
	public void obligatorio_as_Seleccionar_Confirmar() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoConfirmarPopUp();
	}

	@Then("Obligatorio as Validar que se guardo los datos ingresados")
	public void obligatorio_as_Validar_que_se_guardo_los_datos_ingresados() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkTelefonoTipo();
	    fiscales.checkTelefonoPrefijo();
	    fiscales.checkTelefonoNumero();
	}
}
