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

public class TestObligatorio_16 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio R Dado un usuario conectado")
	public void obligatorio_R_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio R Usuario: <maru>")
	public void obligatorio_R_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio R Pass: <p{int}>")
	public void obligatorio_R_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio R La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_R_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio R los siguientes datos seleccionados:")
	public void obligatorio_R_los_siguientes_datos_seleccionados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio R Tipo de Responsable(.*)$")
	public void obligatorio_R_Tipo_de_Responsable_Externo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio R y los siguientes datos ingresados cuit cuil(.*)$")
	public void obligatorio_R_y_los_siguientes_datos_ingresados_cuit_cuil(String cuitCuil) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoCuitCuil(cuitCuil);
	}

	@When("Obligatorio R Cuando Seleccionar el Boton Guardar o Confirmar")
	public void obligatorio_R_Cuando_Seleccionar_el_Boton_Guardar_o_Confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnGuardar();
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio R La aplicacion emite un mensaje: CUIT - CUIL invalido. Ya existe un asociado activo que posee el cuit - cuil Y no guarda los datos")
	public void obligatorio_R_La_aplicacion_emite_un_mensaje_CUIT_CUIL_invalido_Ya_existe_un_asociado_activo_que_posee_el_cuit_cuil_Y_no_guarda_los_datos() {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.checkCampoRequerido();
	}
}
