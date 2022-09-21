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
@Epic("Exepciones Consultar DCD")
@Feature("Exepciones Consultar DCD Test")

public class ExepcionConsultarDCDTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Exepciones Consultar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepciones Consultar DCD Portal Fedepalma")
    @Story("Exepciones Consultar DCD")
    @TmsLink("XRPRJ-1")
    public void ExepcionesConsultarDCDPortalFedepalma () throws Exception {
		
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);
		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        EDCD.ConsultaDCD(folderPath).ValidarResultadoDCD("No se encontraron datos.", folderPath);      
    
        //String validar=consultaBD("select acc_nombre from C_ACCIONES where acc_nombre='ADMINISTRACION_CLIENTES'");
        //Assert.assertEquals(validar, getProperties().getProperty("nit"));

		// MyScreenRecorder.stopRecording();

		GenerarReportePdf.closeTemplate("");
    }
	
}
