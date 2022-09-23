package com.FormularioFDC.test;

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
@Epic("Carga Masiva")
@Feature("Carga Masiva Test")

public class CargaMasivaFDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	public void Logeo(String nameTest, File folderPath) throws Exception {

		GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
	
		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

		GenerarReportePdf.setImgContador(0);
	}
		
	@Test(priority=0, description="Carga Masiva DEX Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Carga Masiva DEX Portal Fedepalma")
    @Story("Carga Masiva DEX")
    @TmsLink("XRPRJ-1")
    public void CargarDEXPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia"));      
        CargaDEX.CargaDEX(getProperties().getProperty("exc"), "Se cargaron los registros correctamente.", folderPath);
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
        
    }
			
		@Test(priority=1, description="Carga Masiva FMM Portal Fedepalma")
	    @Severity(SeverityLevel.NORMAL)
	    @Description("Carga Masiva FMM Portal Fedepalma")
	    @Story("Carga Masiva FMM")
	    @TmsLink("XRPRJ-1")
	    public void CargaFMMPortalFedepalma () throws Exception {
			
			// OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
			MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

			Logeo(nomTest, folderPath);
			
			home.irPortal(getProperties().getProperty("url"));
	        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
	        		getProperties().getProperty("pwd"), folderPath);
	        FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia"));      
	        CargaFMM.CargaFMM(getProperties().getProperty("exc"), "Se cargaron los registros correctamente.", folderPath);
	        
	        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
	     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	    }
	
}
