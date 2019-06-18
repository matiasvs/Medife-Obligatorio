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

public class TestObligatorio_7 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio G Dado un usuario conectado")
	public void obligatorio_G_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio G Usuario: <maru>")
	public void obligatorio_G_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio G Pass: <p{int}>")
	public void obligatorio_G_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio G La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_G_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio G los siguientes datos ingresados:")
	public void obligatorio_G_los_siguientes_datos_ingresados() {
		System.out.println("Se inicia la carga de datos");
	}

	@Given("Obligatorio G Tipo de Responsable(.*)$")
	public void obligatorio_G_Tipo_de_Responsable_Grup(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(1000);
	}

	@Then("Obligatorio G Se habilita el boton del Buscador, que permitira la seleccion de entidades")
	public void obligatorio_G_Se_habilita_el_boton_del_Buscador_que_permitira_la_seleccion_de_entidades() throws InterruptedException {
		WebElement btnBuscador = driver.findElement(By.xpath("(.//*[normalize-space(text()) "
				+ "and normalize-space(.)='Email'])[1]/following::button[1]"));
		System.out.println("El boton busqueda de entidad es visible?: "+btnBuscador.isDisplayed());
	}


}
