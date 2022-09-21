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

public class CrearTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Crear DEX FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear DEX FDC Portal Fedepalma")
    @Story("Crear DEX")
    @TmsLink("XRPRJ-1")
    public void CrearDEXPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
//		for(int a=0;a<50 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();
        DEXFDC.CrearDEX("El formulario se guardo correctamente.");
        Cargas.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC().SalirFDC();
        
//        System.out.println("Caso Numero:"+a); 
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
//		}
	}
	
	@Test(priority=1, description="Crear FMM FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FMM FDC Portal Fedepalma")
    @Story("Crear FMM")
    @TmsLink("XRPRJ-1")
    public void CrearFMMPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
//		for(int a=0;a<50 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();
        FMMFDC.CrearFDC().CrearFMM("El formulario se guardo correctamente.");
        Cargas.CargaFMM(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC().SalirFDC();
        
//        System.out.println("Caso Numero:"+a); 
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
//        
//		}
	}

	@Test(priority=2, description="Crear Poliza FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear Poliza FDC Portal Fedepalma")
    @Story("Crear Poliza")
    @TmsLink("XRPRJ-1")
    public void CrearPolizaPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		for(int a=0;a<10 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitA"), getProperties().getProperty("Usr"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();
        PolizaFDC.CrearFDC().CrearPoliza("El formulario se guardo correctamente.");
        Cargas.CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC().SalirFDC();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        System.out.println("Caso Numero:"+a); 
        
		}
	}
	
	@Test(priority=3, description="Crear Incumplimiento FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear Incumplimiento FDC Portal Fedepalma")
    @Story("Crear Incumplimiento")
    @TmsLink("XRPRJ-1")
    public void CrearIncumplimientoPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
//		for(int a=0;a<50 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();
        Incumplimiento1.CrearFDC().GenerarIncumplimiento();
        Cargas.CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC().SalirFDC();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
//        System.out.println("Caso Numero:"+a); 
//        
//		}
	}
	
}
