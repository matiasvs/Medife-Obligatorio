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

public class TestObligatorio_18 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio S Dado un usuario conectado")
	public void obligatorio_S_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio S Usuario: <maru>")
	public void obligatorio_S_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio S Pass: <p{int}>")
	public void obligatorio_S_Pass_p(Integer int1) {
		System.out.println("Password: 12365489");
	}

	@Given("Obligatorio S La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_S_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio S los siguientes datos seleccionados:")
	public void obligatorio_S_los_siguientes_datos_seleccionados() {
		System.out.println("Se inicia la seleccion de datos");
	}

	@Given("Obligatorio S Tipo de Responsable(.*)$")
	public void obligatorio_S_Tipo_de_Responsable_Externo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio S y los siguientes datos ingresados")
	public void obligatorio_S_y_los_siguientes_datos_ingresados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio S Ingreso Razon social - Apellido nombre(.*)$")
	public void obligatorio_S_Ingreso_Razon_social_Apellido_nombre_Catalina_Fernandez(String razonSocial) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoRazonSocial(razonSocial);
	}

	@Given("Obligatorio S Ingreso Email(.*)$")
	public void obligatorio_S_Ingreso_Email_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@When("Obligatorio S Cuando Seleccionar el Boton Confirmar")
	public void obligatorio_S_Cuando_Seleccionar_el_Boton_Confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio S Entonces la aplicacion emite un mensaje indicando que el Cuit es requerido. Y no guarda los datos y no habilita la seccion Daatos Fiscales")
	public void obligatorio_S_Entonces_la_aplicacion_emite_un_mensaje_indicando_que_el_Cuit_es_requerido_Y_no_guarda_los_datos_y_no_habilita_la_seccion_Daatos_Fiscales() {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.checkCampoRequerido();
	}
}
