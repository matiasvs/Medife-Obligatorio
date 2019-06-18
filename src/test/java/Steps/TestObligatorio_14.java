package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AltaResponsableDePago;
import PageObjects.BusquedaDeEntidad;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class TestObligatorio_14 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio N Dado un usuario conectado")
	public void obligatorio_N_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio N Usuario: <maru>")
	public void obligatorio_N_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio N Pass: <p{int}>")
	public void obligatorio_N_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio N La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_N_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio N los siguientes datos selccionados:")
	public void obligatorio_N_los_siguientes_datos_selccionados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio N Tipo de Responsable(.*)$")
	public void obligatorio_N_Tipo_de_Responsable_Externo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio N y los siguientes datos ingresados")
	public void obligatorio_N_y_los_siguientes_datos_ingresados() {
		System.out.println("Se inicia los datos");
	}

	@Given("Obligatorio N Ingreso de razon social(.*)$")
	public void obligatorio_N_Ingreso_de_razon_social(String razonSocial) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoRazonSocial(razonSocial);
	}

	@When("Obligatorio N Cuando Seleccionar el Boton Guardar")
	public void obligatorio_N_Cuando_Seleccionar_el_Boton_Guardar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnGuardar();
	}

	@Then("Obligatorio N Entonces La aplicacion emite un mensaje: El campo CUIT\\/CUIL es requerdido. Y no guarda los datos")
	public void obligatorio_N_Entonces_La_aplicacion_emite_un_mensaje_El_campo_CUIT_CUIL_es_requerdido_Y_no_guarda_los_datos() {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.checkCampoRequeridoXpath();
		AltaResDePago.checkFechaVigencia();
	}
}
