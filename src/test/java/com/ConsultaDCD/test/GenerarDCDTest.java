package com.ConsultaDCD.test;

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



@Listeners({ TestListener.class })
@Epic("Generar DCD")
@Feature("Generar DCD Test")

public class GenerarDCDTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Generar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Generar DCD Portal Fedepalma")
    @Story("Generar DCD")
    @TmsLink("XRPRJ-1")
    public void GenerarDCDPortalFedepalma () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
        Generar.GenerarDCD(folderPath, getProperties().getProperty("Evidencia")).Firma(getProperties().getProperty("Firma"),"Formularios firmados exitosamente.", folderPath, getProperties().getProperty("Evidencia")).confirmar("Se ha realizado el cambio de estado", folderPath, getProperties().getProperty("Evidencia"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
}
