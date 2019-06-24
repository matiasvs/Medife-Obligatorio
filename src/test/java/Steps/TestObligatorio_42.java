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

public class TestObligatorio_42 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio cv Dado un usuario conectado")
	public void obligatorio_cv_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio cv completar la pantalla Alta de responsabilidad de pago")
	public void obligatorio_cv_completar_la_pantalla_Alta_de_responsabilidad_de_pago() {
		System.out.println("Se ingreso a la pantalla");
	}

	@Given("Obligatorio cv con los campos Tipos de responsabilidad(.*)")
	public void obligatorio_cv_con_los_campos_Tipos_de_responsabilidad_Empresa(String tipoResponsable) throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoTipoResponsable(tipoResponsable);
		Thread.sleep(600);
	}

	@Given("Obligatorio cv buscar entidad")
	public void obligatorio_cv_buscar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusquedaEntidades();
	}

	@Given("Obligatorio cv ingresar Descripcion(.*)")
	public void obligatorio_cv_ingresar_Descripcion_BAFIR_S_A(String descripcion) throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoDescripcion(descripcion);
		Thread.sleep(800);
	}

	@Given("Obligatorio cv ingresar cuit cuil(.*)")
	public void obligatorio_cv_ingresar_cuit_cuil(String BusquedaCuit) {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.ingresoBusquedaCuit(BusquedaCuit);
	}

	@Given("Obligatorio cv seleccionar resultado y confirmar entidad")
	public void obligatorio_cv_seleccionar_resultado_y_confirmar_entidad() throws InterruptedException {
		BusquedaDeEntidad buscarEntidad = new BusquedaDeEntidad(driver);
		buscarEntidad.botonBusqueda();
		Thread.sleep(1000);
		buscarEntidad.check();
		Thread.sleep(1000);
		buscarEntidad.ConfirmarEntidad();
	}

	@Given("Obligatorio cv completar campo Mail(.*)")
	public void obligatorio_cv_completar_campo_Mail_catfer_email_com(String mail) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoMail(mail);
	}

	@Given("Obligatorio cv completar campo Fecha de vigecnia(.*)")
	public void obligatorio_cv_completar_campo_Fecha_de_vigecnia(String fechaVigencia) {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.ingresoFechaVigencia(fechaVigencia);
	}

	@When("Obligatorio cv Seleccionar boton Confimar")
	public void obligatorio_cv_Seleccionar_boton_Confimar() throws InterruptedException {
		AltaResponsableDePago AltaResDePago = new AltaResponsableDePago(driver);
		AltaResDePago.btnConfirmar();
	}

	@Then("Obligatorio cv Validar pantalla Carga de datos fiscales")
	public void obligatorio_cv_Validar_pantalla_Carga_de_datos_fiscales() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    //fiscales.checkPantallaDatosFiscales();
	}

	@Then("Obligatorio cv Seleccionar boton Nuevo telefo")
	public void obligatorio_cv_Seleccionar_boton_Nuevo_telefo() throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
		Thread.sleep(5000);
	    fiscales.ingresoNuevoTelefono();
	}

	@Then("Obligatorio cv completar campos Tipo de telefono(.*)")
	public void obligatorio_cv_completar_campos_Tipo_de_telefono_Particular(String tipoDeTelefono) throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoTipoDeTelefono(tipoDeTelefono);
	}

	@Then("Obligatorio cv completar campos Prefijo(.*)")
	public void obligatorio_cv_completar_campos_Prefijo(String prefijo) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoPrefijo(prefijo);
	}

	@Then("Obligatorio cv completar campos Numero(.*)")
	public void obligatorio_cv_completar_campos_Numero(String numeroPopUp) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoNumeroPopup(numeroPopUp);
	}

	@Then("Obiligatorio cv selecciono el boton confirmar popUp de telefono")
	public void obiligatorio_cv_selecciono_el_boton_confirmar_popUp_de_telefono() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoConfirmarPopUp();
	}
	
	@Then("Obligatorio cv seleccionar el nuevo telefono con sus checkbox")
	public void obligatorio_cv_seleccionar_el_nuevo_telefono_con_sus_checkbox() throws InterruptedException {
	    CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.checkboxTelefono();
	}

	@When("Obligatorio cv selecciono modificar")
	public void obligatorio_cv_selecciono_modificar() throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.btnModificar(); 
	    Thread.sleep(300);
	}
	
	@When("Obligatorio cv inicio edicion de campos")
	public void obligatorio_cv_inicio_edicion_de_campos() throws InterruptedException {
	    System.out.println("Inicio edicion de campos");
	    //Thread.sleep(4000);
	}

	@When("Obligatorio cv nuevo Tipo de telefono(.*)")
	public void obligatorio_cv_nuevo_Tipo_de_telefono_NuevoTipoDeTelefono(String NuevoTipoDeTelefono) throws InterruptedException {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
		Thread.sleep(5000);
		fiscales.ingresoTipoDeTelefono(NuevoTipoDeTelefono);
	}

	@When("Obligatorio cv nuevo Prifijo(.*)")
	public void obligatorio_cv_nuevo_Prifijo_NuevoPrefijo(String prefijo) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoPrefijoNuevo(prefijo);
	}

	@When("Obligatorio cv nuevo Numero(.*)")
	public void obligatorio_cv_nuevo_Numero_NuevoNumero(String numeroPopUp) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoNumeroPopupNuevo(numeroPopUp);
	}
	
	@When("Obligatorio cv nuevo Interno(.*)")
	public void obligatorio_cv_nuevo_Interno(String interno) {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoNumeroInterno(interno);
	}

	@When("Obligatorio cv nueva Confirmacion")
	public void obligatorio_cv_nueva_Confirmacion() {
		CargaDeDatosFiscalesTarea fiscales = new CargaDeDatosFiscalesTarea(driver);
	    fiscales.ingresoConfirmarPopUpNuevo();
	}

	@Then("Obligatorio cv La aplicacion habilia el registro seleccionado permitiendo su modificacion")
	public void obligatorio_cv_La_aplicacion_habilia_el_registro_seleccionado_permitiendo_su_modificacion() {
	    System.out.println();
	}
}
