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

public class TestObligatorio_4 {

private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //

	@Given("Obligatorio D Dado un usuario perfil xx conectado con lo siguientes datos")
	public void obligatorio_D_Dado_un_usuario_perfil_xx_conectado_con_lo_siguientes_datos() {
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver(); //driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
	}

	@Given("Obligatorio D Usuario: <maru>")
	public void obligatorio_D_Usuario_maru() {
		System.out.println("Usuario: maru");
	}

	@Given("Obligatorio D Pass: <p{int}>")
	public void obligatorio_D_Pass_p(Integer int1) {
		System.out.println("Password: 12365488");
	}

	@Given("Obligatorio D selecciono Tipo de responsable(.*)")
	public void obligatorio_D_selecciono_Tipo_de_responsable_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio D Ventana Buscador de Entidades desplegada:")
	public void obligatorio_D_Ventana_Buscador_de_Entidades_desplegada() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio D Ingresar una Descripcion: (.*) y un (.*) correspondiente a un grupo familiar existente")
	public void obligatorio_D_Ingresar_una_Descripcion_CACERES_y_un_correspondiente_a_un_grupo_familiar_existente(String descipcion, String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descipcion);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@When("Obligatorio D Seleccionar el Boton Buscar")
	public void obligatorio_D_Seleccionar_el_Boton_Buscar() throws InterruptedException {
	    BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
	    buscarEntidad.botonBusqueda();
	}

	@Then("Obligatorio D La Grilla se muestra vacia. No existen datos que coincidan con los criterios de busqueda ingresados.")
	public void obligatorio_D_La_Grilla_se_muestra_vacia_No_existen_datos_que_coincidan_con_los_criterios_de_busqueda_ingresados() {
	    System.out.println("FALTA VALIDAR GRILLA vacia");
	}
}
