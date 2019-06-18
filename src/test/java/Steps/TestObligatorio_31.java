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

public class TestObligatorio_31 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio dv Dado un usuario conectado")
	public void obligatorio_dv_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio dv Usuario: <maru>")
	public void obligatorio_dv_Usuario_maru() {
		System.out.println("Se ingresa el usuario: ");
	}

	@Given("Obligatorio dv Pass: <p{int}>")
	public void obligatorio_dv_Pass_p(Integer int1) {
		System.out.println("Se ingresa el password: ");
	}

	@Given("Obligatorio dv La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_dv_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
	    System.out.println("Se despliega la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio dv los siguientes datos ingresados")
	public void obligatorio_dv_los_siguientes_datos_ingresados() {
	    System.out.println("Inicio carga de datos");
	}

	@Given("Obligatorio dv Tipo de Responsable(.*)")
	public void obligatorio_dv_Tipo_de_Responsable_Grupo(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio dv PopUp Busqueda de entidades")
	public void obligatorio_dv_PopUp_Busqueda_de_entidades() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio dv Ingreso descripcion(.*)")
	public void obligatorio_dv_Ingreso_descripcion_UNIVERSIDAD_NACIONAL_DE_LANUS(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(500);
	}

	@Given("Obligatorio dv Ingreso cuit cuil(.*)")
	public void obligatorio_dv_Ingreso_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio dv Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_dv_Busqueda_seleccion_y_confirmacion_de_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(500);
		buscarEntidad.check();
		Thread.sleep(200);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio dv Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_dv_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
	    System.out.println("Ingreso de campos mail y fecha de vigencia");
	}

	@Given("Obligatorio dv Ingreso eMail(.*)")
	public void obligatorio_dv_Ingreso_eMail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio dv Ingreso fecha de vigencia(.*)")
	public void obligatorio_dv_Ingreso_fecha_de_vigencia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio dv Cuando seleccion boton confirmar")
	public void obligatorio_dv_Cuando_seleccion_boton_confirmar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio dv validar ingreso a Datos fiscales")
	public void obligatorio_dv_validar_ingreso_a_Datos_fiscales() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkPantallaDatosFiscales();
	}

	@When("Obligatorio dv Cuando se seleciona el valor (.*) para el campo Condicion de IVA")
	public void obligatorio_dv_Cuando_se_seleciona_el_valor_Consumidor_para_el_campo_Condicion_de_IVA(String condicionIVA) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoCondicionIVA(condicionIVA);
	}

	@When("Obligatorio dv Fecha inicio condicion IVA(.*)")
	public void obligatorio_dv_Fecha_inicio_condicion_IVA(String fechaInicioCondicionIVA) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoFechaInicioCondicionIVA(fechaInicioCondicionIVA);
	}

	@When("Obligatorio dv selecciono el boton confirmar")
	public void obligatorio_dv_selecciono_el_boton_confirmar() throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.btnConfirmar();
	}

	@Then("Obligatorio dv Resultado esperado la aplicacion emite un mensaje indicando que:")
	public void obligatorio_dv_Resultado_esperado_la_aplicacion_emite_un_mensaje_indicando_que() {
	    System.out.println("Indicando que: ");
	}

	@Then("Obligatorio dv Los siguientes campos son requeridos")
	public void obligatorio_dv_Los_siguientes_campos_son_requeridos() {
	    System.out.println("Son requeridos");
	}

	@Then("Obligatorio dv Forma de pago, Adherido factura electronica, Provincia, Localidad, CP, Calle, Partido, NroTipo Telefono, Prefijo, Numero")
	public void obligatorio_dv_Forma_de_pago_Adherido_factura_electronica_Provincia_Localidad_CP_Calle_Partido_NroTipo_Telefono_Prefijo_Numero() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio dv No guarda los datos")
	public void obligatorio_dv_No_guarda_los_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
