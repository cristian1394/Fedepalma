package com.FormularioFDC.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;

import PagObject_demoautomatizacion.BasePage;



@Listeners({ TestListener.class })
@Epic("Editar FDC Estado Borrador")
@Feature("Editar FDC Estado Borrador Test")

public class Editar_FDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	public void Logeo(String nameTest, File folderPath) throws Exception {

		GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
	
		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"));

		GenerarReportePdf.setImgContador(0);
	}
		
	@Test(priority=0, description="Editar FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Editar FDC Portal Fedepalma")
    @Story("Editar FDC Estado Borrador")
    @TmsLink("XRPRJ-1")
    public void EditarEstadoBorradorPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));      
        Editar_FDC.FormularioFDC().EditarFDC();
        Carga.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").CargaFMM(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC().SalirFDC();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
}
