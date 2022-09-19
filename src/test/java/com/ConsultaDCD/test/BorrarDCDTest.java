package com.ConsultaDCD.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;
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
				getProperties().getProperty("url"));

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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
				getProperties().getProperty("pwd"), folderPath);
		Rellenar.RellenarDCD(folderPath);
		Borrar.BorrarDCD(getProperties().getProperty("observaciones"), folderPath)
				.ValidarResultadoBorrarDCD("Proceso realizado exitosamente!", folderPath);

		// MyScreenRecorder.stopRecording();

		GenerarReportePdf.closeTemplate("");

	}

}
