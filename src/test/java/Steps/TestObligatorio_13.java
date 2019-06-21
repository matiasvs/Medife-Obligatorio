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

public class TestObligatorio_13 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio M Dado un usuario conectado")
	public void obligatorio_M_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio M Usuario: <maru>")
	public void obligatorio_M_Usuario_maru() {
		 System.out.println("Usuario: cucumber");
	}

	@Given("Obligatorio M Pass: <p{int}>")
	public void obligatorio_M_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio M La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_M_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio M los siguientes datos selccionados:")
	public void obligatorio_M_los_siguientes_datos_selccionados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio M Tipo de Responsable(.*)$")
	public void obligatorio_M_Tipo_de_Responsable_Externo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio M los siguientes datos ingresados")
	public void obligatorio_M_los_siguientes_datos_ingresados() {
	    System.out.println("Ingreso de datos");
	}

	@Given("Obligatorio M Ingreso de cuit cuil(.*)$")
	public void obligatorio_M_Ingreso_de_cuit_cuil(String cuitCuil) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoCuitCuil(cuitCuil);
	}

	@When("Obligatorio M Cuando Seleccionar el Boton Guardar")
	public void obligatorio_M_Cuando_Seleccionar_el_Boton_Guardar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnGuardar();
	}

	@Then("Obligatorio M Guarda los datos ingresados e inicia el proceso, habilitando la seccion Datos Fiscales.")
	public void obligatorio_M_Guarda_los_datos_ingresados_e_inicia_el_proceso_habilitando_la_seccion_Datos_Fiscales() {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.checkGuardar();
	}
}
