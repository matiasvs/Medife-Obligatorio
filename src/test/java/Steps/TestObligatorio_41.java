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

public class TestObligatorio_41 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio bs Dado un usuario conectado")
	public void obligatorio_bs_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio bs completar la pantalla Alta de responsabilidad de pago")
	public void obligatorio_bs_completar_la_pantalla_Alta_de_responsabilidad_de_pago() {
		System.out.println("Se ingreso a la pantalla");
	}

	@Given("Obligatorio bs con los campos Tipos de responsabilidad(.*)")
	public void obligatorio_bs_con_los_campos_Tipos_de_responsabilidad_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio bs buscar entidad")
	public void obligatorio_bs_buscar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio bs ingresar Descripcion(.*)")
	public void obligatorio_bs_ingresar_Descripcion_FUNES_CARLOS_ALBERTO(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio bs ingresar cuit cuil(.*)")
	public void obligatorio_bs_ingresar_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio bs seleccionar resultado y confirmar entidad")
	public void obligatorio_bs_seleccionar_resultado_y_confirmar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(800);
		buscarEntidad.check();
		Thread.sleep(810);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio bs completar campo Mail(.*)")
	public void obligatorio_bs_completar_campo_Mail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio bs completar campo Fecha de vigecnia(.*)")
	public void obligatorio_bs_completar_campo_Fecha_de_vigecnia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio bs Seleccionar boton Confimar")
	public void obligatorio_bs_Seleccionar_boton_Confimar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio bs Validar pantalla Carga de datos fiscales")
	public void obligatorio_bs_Validar_pantalla_Carga_de_datos_fiscales() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkPantallaDatosFiscales();
	}

	@Then("Obligatorio bs Seleccionar boton Nuevo telefo")
	public void obligatorio_bs_Seleccionar_boton_Nuevo_telefo() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoNuevoTelefono();
	}

	@When("Obligatorio bs selcciono el valor Laboral en el campo Tipo de Telefono(.*)")
	public void obligatorio_bs_selcciono_el_valor_Laboral_en_el_campo_Tipo_de_Telefono_Laboral(String tipoDeTelefono) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoTipoDeTelefono(tipoDeTelefono);
	}

	@Then("Obligatorio bs Validar que la aplicacion despliega el campo Interno")
	public void obligatorio_bs_Validar_que_la_aplicacion_despliega_el_campo_Interno() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkInternoHabilitado();
	}
}
