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

public class TestObligatorio_36 {
	
	private WebDriver driver;
	
	String pathChrome = PropertyManager.getInstance().getPathChrome();
	String browser = PropertyManager.getInstance().getBrowser();
	String baseURL = PropertyManager.getInstance().getURL();
	
	// STEPS - CUCUMBER //
	
	@Given("Obligatorio jl Dado un usuario conectado")
	public void obligatorio_jl_Dado_un_usuario_conectado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Usuario: <maru>")
	public void obligatorio_jl_Usuario_maru() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Pass: <p{int}>")
	public void obligatorio_jl_Pass_p(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Dentro de La pantalla Alta de responsable de pago desplegada")
	public void obligatorio_jl_Dentro_de_La_pantalla_Alta_de_responsable_de_pago_desplegada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl los siguientes datos ingresados y confirmados:")
	public void obligatorio_jl_los_siguientes_datos_ingresados_y_confirmados() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Tipo de Responsable Empresa")
	public void obligatorio_jl_Tipo_de_Responsable_Empresa() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl PopUp Busqueda de entidades")
	public void obligatorio_jl_PopUp_Busqueda_de_entidades() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Ingreso descripcion NORAUTO ARGENTINA S.A")
	public void obligatorio_jl_Ingreso_descripcion_NORAUTO_ARGENTINA_S_A() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Ingreso cuit cuil {int}")
	public void obligatorio_jl_Ingreso_cuit_cuil(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Busqueda seleccion y confirmacion de entidad")
	public void obligatorio_jl_Busqueda_seleccion_y_confirmacion_de_entidad() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales")
	public void obligatorio_jl_Ingreso_campos_necesarios_mail_y_fecha_de_vigencia_para_que_se_pueda_ejecutar_datos_fiscales() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Ingreso eMail catfer@email.com")
	public void obligatorio_jl_Ingreso_eMail_catfer_email_com() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Obligatorio jl Ingreso fecha de vigencia {int}\\/{int}\\/{int}")
	public void obligatorio_jl_Ingreso_fecha_de_vigencia(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio jl Cuando seleccion boton confirmar")
	public void obligatorio_jl_Cuando_seleccion_boton_confirmar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl validar ingreso a Datos fiscales")
	public void obligatorio_jl_validar_ingreso_a_Datos_fiscales() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl Y los siguientes datos ingresados")
	public void obligatorio_jl_Y_los_siguientes_datos_ingresados() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl Forma de pago habilitada Debito")
	public void obligatorio_jl_Forma_de_pago_habilitada_Debito() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl CBU numero{int} corresponde al cuit {int}EOREWT {int}")
	public void obligatorio_jl_CBU_numero_corresponde_al_cuit_EOREWT(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl Alias OIUREWYTUIO")
	public void obligatorio_jl_Alias_OIUREWYTUIO() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Obligatorio jl Seleccion boton guardar")
	public void obligatorio_jl_Seleccion_boton_guardar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl se activa el servicio de Interbanking")
	public void obligatorio_jl_se_activa_el_servicio_de_Interbanking() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl validadando CBU u validacion de cuit cbu. \\(El CBU debe coincidir con el CUIT del responsable de pago.)")
	public void obligatorio_jl_validadando_CBU_u_validacion_de_cuit_cbu_El_CBU_debe_coincidir_con_el_CUIT_del_responsable_de_pago() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Obligatorio jl guarda los datos ingresados")
	public void obligatorio_jl_guarda_los_datos_ingresados() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
