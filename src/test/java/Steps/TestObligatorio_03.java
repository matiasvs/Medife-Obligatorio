package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AltaResponsableDePago;
import PageObjects.BusquedaDeEntidad;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PropertyManager;

public class TestObligatorio_03 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //

	@Given("Obligatorio C La pantalla Altas de responsibles de pago desplegada")
	public void obligatorio_C_La_pantalla_Altas_de_responsibles_de_pago_desplegada() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver(); //driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
	}

	@Given("Obligatorio C Tipo de Responsable(.*)$")
	public void obligatorio_C_Tipo_de_Responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);	
	}

	@Given("Obligatorio C Ventana Buscador de Entidades desplegada:")
	public void obligatorio_C_Ventana_Buscador_de_Entidades_desplegada() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	    System.out.println("Seleccion boton Buscar entidad");
	}
	
	@Given("Obligatorio C Los siguientes datos ingresados")
	public void obligatorio_C_Los_siguientes_datos_ingresados() {
	    System.out.println("Los siguientes datos cargados");
	}

	@Given("Obligatorio C El campo Descripcion con un valor correspondiente a una Empresa(.*)$")
	public void obligatorio_C_El_campo_Descripcion_con_un_valor_correspondiente_a_una_Empresa_INSTITUTO_NUESTRA_SRA_DE_LUJAN(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@When("Obligatorio C Seleccionar el Boton Buscar")
	public void obligatorio_C_Seleccionar_el_Bot_n_Buscar() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
	    System.out.println("Seleccion de boton Buscar dentro del PopUp");
	    Thread.sleep(2400);
	}

	@Then("Obligatorio C La pantalla lista los datos que coinciden con Descripcion - Cuit-Cuil")
	public void obligatorio_C_La_pantalla_lista_los_datos_que_coinciden_con_Descripcion_Cuit_Cuil() {
	    System.out.println("Los valores coinciden con la busqueda");
	    BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
	    buscarEntidad.validarResposableEmpresa();
	    buscarEntidad.validarResultadoDescripcionTest3();
	    AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
	    AltaResDePago.closed();
	}
}
