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

public class TestObligatorio_02 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();

	// STEPS - CUCUMBER //
	
	@Given("Obligatorio B La pantalla Alta de responsible de pago desplegadas")
	public void obligatorio_B_La_pantalla_Alta_de_responsible_de_pago_desplegadas() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio B Desplegado el combo Tipo de responsable")
	public void obligatorio_B_Desplegado_el_combo_Tipo_de_responsable() {
	    System.out.println("Despliegue de valores de Tipo de responsable");
	}

	@When("Obligatorio B selecciona el campo Tipo de Responsable(.*)$")
	public void obligatorio_B_selecciona_el_campo_Tipo_de_Responsable(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);		
	}

	@Then("Obligatorio B Entonces se habilita el boton del Buscador que permitira la seleccion de entidades")
	public void obligatorio_B_Entonces_se_habilita_el_boton_del_Buscador_que_permitira_la_seleccion_de_entidades() throws InterruptedException {
	    System.out.println("Boton buscar entidad mostrado");
	    WebElement btnBuscador = driver.findElement(By.xpath("(.//*[normalize-space(text()) "
				+ "and normalize-space(.)='Email'])[1]/following::button[1]"));
		System.out.println("El boton busqueda de entidad es visible?: "+btnBuscador.isDisplayed());
	    driver.close();
		driver.quit();
		System.out.println("---AFTER---");
	}	
}