package com.AdministracionUsuariosNuevos.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;
import utilities.MyScreenRecorder;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;

import PagObject_AdministracionUsuariosNuevos.BloqueantePage;
import PagObject_demoautomatizacion.BasePage;

@SuppressWarnings("unused")
@Listeners({ TestListener.class })
@Epic("Administracion de Solicuitudes Nuevas")
@Feature("Administracion de Solicuitudes Nuevas Test")

public class BloqueantesUETest extends BaseTest {

	public Properties fileprops = new Properties();

	public Properties getProperties() throws Exception {
		fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
		return fileprops;
	}

	public void Logeo(String nameTest, File folderPath) throws Exception {

		GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
		// File folderPath =
		// BasePage.createFolder(getProperties().getProperty("nameFolder"),
		// getProperties().getProperty("path"));

		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

		GenerarReportePdf.setImgContador(0);
	}

	@Test(priority = 0, description = "Al quitar el permiso de enviar email, aunque muestre la imagen, el clic no permite enviar el correo.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Al quitar el permiso de enviar email, aunque muestre la imagen, el clic no permite enviar el correo.")
	@Story("Quitar permiso Email en usuario Externo")
	@TmsLink("XRPRJ-1")
	public void QuitarPermisoEmailUE() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		
		Bloqueante.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearEmail(folderPath, getProperties().getProperty("Evidencia"))
				.SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
				.QuitarBloqueoEmail(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}

	@Test(priority = 1, description = "Al quitar el permiso de enviar firma, aunque muestre la imagen del check, el clic no permite quitar o poner.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Al quitar el permiso de enviar firma, aunque muestre la imagen del check, el clic no permite quitar o poner.")
	@Story("Quitar Permiso Firma")
	@TmsLink("XRPRJ-1")
	public void QuitarPermisoFirmaUE() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);

		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueante.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearFirma(folderPath, getProperties().getProperty("Evidencia"))
				.SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
				.QuitarBloqueoFirma(folderPath, getProperties().getProperty("Evidencia"));
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}

	@Test(priority = 2, description = "Validar que se puede Dasasociar un usuario")
	@Severity(SeverityLevel.NORMAL)
	@Description("Validar que se puede Dasasociar un usuario")
	@Story("Desasociar un Usuario")
	@TmsLink("XRPRJ-1")
	public void DesasociarUsuario() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);

		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueante.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia"))
				.Desasociar(folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

	@Test(priority = 3, description = "Al quitar el permiso de editar bloqueo, al darle clic no permite realizar la acci??n.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Al quitar el permiso de editar bloqueo, al darle clic no permite realizar la acci??n.")
	@Story("Quitar Permiso de Bloqueo")
	@TmsLink("XRPRJ-1")
	public void QuitarPermisoBoqueoUE() throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueante.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearUsuario(folderPath, getProperties().getProperty("Evidencia"))
				.SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
				.QuitarBloqueoUsuario(folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

	@Test(priority = 4, description = "Los que tengan el permiso deben funcionar en todas las opciones normalmente.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Los que tengan el permiso deben funcionar en todas las opciones normalmente.")
	@Story("Funcionamiento sin bloqueos")
	@TmsLink("XRPRJ-1")
	public void FuncionamientoSinBloqueosUE() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);

		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueante.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearFirma(folderPath, getProperties().getProperty("Evidencia"))
				.SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).Enviar(folderPath, getProperties().getProperty("Evidencia")).BloquearUsuario1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia"))
				.EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).QuitarBloqueoFirma(folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

	@Test(priority = 5, description = "Visualizar en contenedor al 100% de la p??gina.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Visualizar en contenedor al 100% de la p??gina.")
	@Story("Visualizar en contenedor al 100% de la p??gina.")
	@TmsLink("XRPRJ-1")
	public void VisualizarContenedorUE() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueante.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia"))
				.EditarPerfil1(folderPath, getProperties().getProperty("Evidencia")).Enviar(folderPath, getProperties().getProperty("Evidencia")).Firmar(folderPath, getProperties().getProperty("Evidencia")).Desasociar(folderPath, getProperties().getProperty("Evidencia"))
				.BloquearUsuario1(folderPath, getProperties().getProperty("Evidencia"));
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}

}