package com.ConsultaDCD.test;

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

import PagObject_demoautomatizacion.BasePage;

@Listeners({ TestListener.class })
@Epic("Borrar DCD")
@Feature("Borrar DCD Test")

public class BorrarDCDTest extends BaseTest {

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

	@Test(priority = 0, description = "Borrar DCD Portal Fedepalma")
	@Severity(SeverityLevel.NORMAL)
	@Description("Borrar DCD Portal Fedepalma")
	@Story("Borrar DCD")
	@TmsLink("XRPRJ-1")
	public void BorrarDCDPortalFedepalma() throws Exception {
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
				getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		Rellenar.RellenarDCD(folderPath, getProperties().getProperty("Evidencia"));
		Borrar.BorrarDCD(getProperties().getProperty("observaciones"), folderPath, getProperties().getProperty("Evidencia"))
				.ValidarResultadoBorrarDCD("Proceso realizado exitosamente!", folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));

	}

}
