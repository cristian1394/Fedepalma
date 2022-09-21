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
@Epic("Crear FDC")
@Feature("Crear FDC Test")

public class CrearFDCTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Crear FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FDC Portal Fedepalma")
    @Story("Crear FDC")
    @TmsLink("XRPRJ-1")
    public void CrearDCDPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        FDC.FormularioFDC(folderPath);      
        CrearFDC.CrearFDC(getProperties().getProperty("Pais"), getProperties().getProperty("Producto"), folderPath);
        DEX.IngresarDEXPalma(folderPath).CrearDEXPalmiste(getProperties().getProperty("Pais"),getProperties().getProperty("producto"), folderPath)
        	.IngresarDEXPalmiste("El formulario se guardo correctamente.", folderPath);
        FMM.CrearFMM(getProperties().getProperty("Pais"),getProperties().getProperty("Producto"), folderPath).IngresarFMMPalma("El formulario se guardo correctamente.", folderPath);
        Poliza.CrearPoliza(getProperties().getProperty("Aseguradora"), getProperties().getProperty("Fecha"),
        		getProperties().getProperty("valor"), folderPath).IngresarPoliza( getProperties().getProperty("Asociar"), "El formulario se guardo correctamente.", folderPath);
        Cargas.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).CargaFMM(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente", folderPath)
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente", folderPath)
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).RevisarFDC(folderPath);
        Radicar.RadicarFDC(folderPath).FirmarFDC(getProperties().getProperty("Firma"), folderPath).SalirFDC(folderPath);
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
	}
	
}
