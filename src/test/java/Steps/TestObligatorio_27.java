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

public class TestObligatorio_27 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio fz Dado un usuario conectado")
	public void obligatorio_fz_Dado_un_usuario_conectado() {
		System.setProperty(pathChrome, browser );		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); driver.manage().window().maximize();
		System.out.println("Se muestra la pantalla Alta de responsable de pago");
	}

	@Given("Obligatorio fz Usuario: <maru>")
	public void obligatorio_fz_Usuario_maru() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Pass: <p{int}>")
	public void obligatorio_fz_Pass_p(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_fz_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz los siguientes datos ingresados y confirmados:")
	public void obligatorio_fz_los_siguientes_datos_ingresados_y_confirmados() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Tipo de Responsable Grupo")
	public void obligatorio_fz_Tipo_de_Responsable_Grupo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz PopUp Busqueda de entidades")
	public void obligatorio_fz_PopUp_Busqueda_de_entidades() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Ingreso cuit cuil {int}")
	public void obligatorio_fz_Ingreso_cuit_cuil(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Ingreso descripcion MOSAICOS ROSSI HNOS. S.R.L.")
	public void obligatorio_fz_Ingreso_descripcion_MOSAICOS_ROSSI_HNOS_S_R_L() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_fz_Busqueda_seleccion_y_confirmacion_de_entidad() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_fz_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Ingreso eMail catfer@email.com")
	public void obligatorio_fz_Ingreso_eMail_catfer_email_com() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Ingreso fecha de vigencia {int}\\/{int}\\/{int}")
	public void obligatorio_fz_Ingreso_fecha_de_vigencia(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio fz Seleccion boton confirmar")
	public void obligatorio_fz_Seleccion_boton_confirmar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fz validar pantalla de Datos fiscales")
	public void obligatorio_fz_validar_pantalla_de_Datos_fiscales() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fz Ingreso Condicion IVA <condicionIva>")
	public void obligatorio_fz_Ingreso_Condicion_IVA_condicionIva() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fz Ingreso fecha inicio condicion IVA {int}\\/{int}\\/{int}")
	public void obligatorio_fz_Ingreso_fecha_inicio_condicion_IVA(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio fz Selecciono el boton guardar")
	public void obligatorio_fz_Selecciono_el_boton_guardar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fz Entonces La aplicacion emite un mensaje: Fecha Inicio Cond. De IVA debe ser menor o igual a la fecha del dia")
	public void obligatorio_fz_Entonces_La_aplicacion_emite_un_mensaje_Fecha_Inicio_Cond_De_IVA_debe_ser_menor_o_igual_a_la_fecha_del_dia() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio fz Y no guarda los datos")
	public void obligatorio_fz_Y_no_guarda_los_datos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
