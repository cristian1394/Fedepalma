package com.AdministracionSolicitudesNuevos.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;
import utilities.MyScreenRecorder;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;

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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"),getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);

		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearEmail(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearFirma(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
				.QuitarBloqueoFirma(folderPath, getProperties().getProperty("Evidencia"));
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}

	@Test(priority = 2, description = "Al quitar el permiso de editar perfil, el combo no se despliega al darle clic.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Al quitar el permiso de editar perfil, el combo no se despliega al darle clic.")
	@Story("Quitar Permiso Perfil")
	@TmsLink("XRPRJ-1")
	public void QuitarPermisoPerfilUE() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearPerfil(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
				.QuitarBloqueoPerfil(folderPath, getProperties().getProperty("Evidencia"));
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

	@Test(priority = 3, description = "Validar que al quitar el permiso no permite eliminar una solicitud.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Validar que al quitar el permiso no permite eliminar una solicitud.")
	@Story("Quitar Permiso Eliminar")
	@TmsLink("XRPRJ-1")
	public void QuitarPermisoEliminarUE() throws Exception {

		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearEliminar(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia"))
				.EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).QuitarBloqueoEliminar(folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

	@Test(priority = 3, description = "Al quitar el permiso de editar bloqueo, al darle clic no permite realizar la acción.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Al quitar el permiso de editar bloqueo, al darle clic no permite realizar la acción.")
	@Story("Quitar Permiso de Bloqueo")
	@TmsLink("XRPRJ-1")
	public void QuitarPermisoBoqueoUE() throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearUsuario(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia"))
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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).BloquearFirma(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).EditarPerfil(folderPath, getProperties().getProperty("Evidencia")).Enviar(folderPath, getProperties().getProperty("Evidencia"))
				.BloquearUsuario1(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu2(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).QuitarBloqueoFirma(folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

	@Test(priority = 5, description = "Visualizar en contenedor al 100% de la página.")
	@Severity(SeverityLevel.NORMAL)
	@Description("Visualizar en contenedor al 100% de la página.")
	@Story("Visualizar en contenedor al 100% de la página.")
	@TmsLink("XRPRJ-1")
	public void VisualizarContenedorUE() throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Bloqueantes.SelecionarMenu(folderPath, getProperties().getProperty("Evidencia")).EscojerTabla(folderPath, getProperties().getProperty("Evidencia")).SelecionarMenu1(folderPath, getProperties().getProperty("Evidencia")).EditarPerfil1(folderPath, getProperties().getProperty("Evidencia")).Enviar(folderPath, getProperties().getProperty("Evidencia")).Firmar(folderPath, getProperties().getProperty("Evidencia"))
				.BloquearUsuario1(folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

}