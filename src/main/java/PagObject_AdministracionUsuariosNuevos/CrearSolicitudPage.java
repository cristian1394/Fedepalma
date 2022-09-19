package PagObject_AdministracionUsuariosNuevos;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import MapObject_AdministracionUsuariosNuevos.CrearSolicitudMaps;
import io.qameta.allure.Step;

public class CrearSolicitudPage extends CrearSolicitudMaps{

	public CrearSolicitudPage(WebDriver driver) {
		super(driver);

	}

	@Step("Selecionar menu")
	public CrearSolicitudPage SelecionarMenu(File folderPath) throws Exception {
		// click(Formulario, folderPath, "texto prueba");
		// captureScreen(folderPath, "captura Evidencia");
		time(2);
		click(Seguridad, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);
		click(AUsuariosN, folderPath, "texto prueba");
		time(1);
		captureScreen(folderPath, "captura Evidencia");
		time(5);

		return this;
	}

	@Step("Crear Solicitud")
	public CrearSolicitudPage Crear(File folderPath) throws Exception {

		time(5);
		Utilidades.ByPixel();
		time(5);
		click(btnCrear, folderPath, "texto prueba");
		time(12);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Ingresar Identificacion")
	public CrearSolicitudPage Identificacion(String Id, File folderPath) throws Exception {

		time(1);
		writeText(txtID, Id, folderPath, Id);
		time(1);
		click(Nombre, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Ingresar Informacion basica")
	public CrearSolicitudPage Informacion(String nombre, String apellido, String correo, File folderPath)
			throws Exception {

		time(1);
		numeroAleatorio();
		time(1);
		click(Nombre, folderPath, "texto prueba");
		time(3);
		writeText(Nombre, nombre, folderPath, correo);
		time(8);
		writeText(Apellido, apellido, folderPath, correo);
		time(8);
		writeText(Correo, correo, folderPath, correo);
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Selecionar Tipo de Usuario")
	public CrearSolicitudPage SelecionarTU(File folderPath) throws Exception {

		time(2);
		click(Tusuario, folderPath, "texto prueba");
		time(1);
		click(Contacto, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);
		click(Adicionar, folderPath, "texto prueba");
		time(1);
		captureScreen(folderPath, "captura Evidencia");
		time(5);

		return this;
	}

	@Step("Enviar Solicitud")
	public CrearSolicitudPage EnviarSolicitud(String resultado, File folderPath) throws Exception {

		time(2);
		click(EnviarS, folderPath, "texto prueba");
		time(1);
		Assert.assertEquals(getElement(lblResultadoEnviar).getText(), resultado);
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);
		click(btnAceptar, folderPath, "texto prueba");
		time(1);
		captureScreen(folderPath, "captura Evidencia");
		time(5);

		return this;
	}

	@Step("Ver notificacion de creacion")
	public CrearSolicitudPage Notificacion(File folderPath) throws Exception {

		time(2);
		click(Notificacion, folderPath, "texto prueba");
		time(1);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(MNotificaciones);
		action.moveToElement(element).perform();
		time(1);
		captureScreen(folderPath, "captura Evidencia");
		time(2);

		return this;
	}

	@Step("Eliminar creacion")
	public CrearSolicitudPage EliminarCreacion(File folderPath) throws Exception {

		Utilidades.time(2);
		click(Eliminar, folderPath, "texto prueba");
		time(1);
		click(btnEliminar, folderPath, "texto prueba");
		time(1);
		captureScreen(folderPath, "captura Evidencia");
		time(2);
		click(btnEliminar, folderPath, "texto prueba");
		time(3);

		return this;
	}

	@Step("Creacion de solicitud con identificacion deseada")
	public CrearSolicitudPage Creacion(File folderPath) throws Exception {

		time(5);
		click(btnSi, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Cancelar Creacion")
	public CrearSolicitudPage CancelarCreacion(File folderPath) throws Exception {

		time(2);
		click(btnNo, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Ingresar Observacion")
	public CrearSolicitudPage Observacion(String observacion, File folderPath) throws Exception {

		Utilidades.time(15);
		writeText(txtObservacion, observacion, folderPath, observacion);
		time(1);
		click(btnSi, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Ingresar Observacion")
	public CrearSolicitudPage Observacion2(File folderPath) throws Exception {

		time(15);
		click(btnSi, folderPath, "texto prueba");
		time(5);
		captureScreen(folderPath, "captura Evidencia");
		time(2);

		return this;
	}

	@Step("Confirmar Creacion")
	public CrearSolicitudPage ConfirmarCreacion(String resultado, File folderPath) throws Exception {

		Utilidades.time(25);
		Assert.assertEquals(getElement(lblResultadoSolicitud).getText(), resultado);
		captureScreen(folderPath, "captura Evidencia");
		time(5);
		click(btnOk, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	@Step("Confirmacion de cancelacion de la creacion")
	public CrearSolicitudPage CancelacionCreciona(String resultado, File folderPath) throws Exception {

		Utilidades.time(25);
		Assert.assertEquals(getElement(lblResultadoSolicitud).getText(), resultado);
		captureScreen(folderPath, "captura Evidencia");
		time(5);
		click(btnOk, folderPath, "texto prueba");
		time(2);
		captureScreen(folderPath, "captura Evidencia");
		time(3);

		return this;
	}

	public void numeroAleatorio() throws Exception {

		Random aleatorio = new Random();

		int min = 1;
		int max = 9;
		int random_int = (int) (Math.random() * (max - min + 1) + min);
		int random_int2 = (int) (Math.random() * (max - min + 1) + min);

		driver.findElement(txtID).sendKeys(Integer.toString(random_int) + Integer.toString(random_int2));
	}

}