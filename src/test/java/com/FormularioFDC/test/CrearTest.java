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
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
//		for(int a=0;a<50 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia"));
        DEXFDC.CrearDEX("El formulario se guardo correctamente.", folderPath);
        Cargas.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).RevisarFDC(folderPath, getProperties().getProperty("Evidencia")).SalirFDC(folderPath, getProperties().getProperty("Evidencia"));
        
//        System.out.println("Caso Numero:"+a); 
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
//		for(int a=0;a<50 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia"));
        FMMFDC.CrearFDC(folderPath, getProperties().getProperty("Evidencia")).CrearFMM("El formulario se guardo correctamente.", folderPath);
        Cargas.CargaFMM(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).RevisarFDC(folderPath, getProperties().getProperty("Evidencia")).SalirFDC(folderPath, getProperties().getProperty("Evidencia"));
        
//        System.out.println("Caso Numero:"+a); 
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		for(int a=0;a<10 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitA"), getProperties().getProperty("Usr"),
        		getProperties().getProperty("pwd"), folderPath);
        FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia"));
        PolizaFDC.CrearFDC(folderPath, getProperties().getProperty("Evidencia")).CrearPoliza("El formulario se guardo correctamente.", folderPath);
        Cargas.CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente", folderPath)
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).RevisarFDC(folderPath, getProperties().getProperty("Evidencia")).SalirFDC(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
//		for(int a=0;a<50 ;a++) {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia"));
        Incumplimiento1.CrearFDC(folderPath, getProperties().getProperty("Evidencia")).GenerarIncumplimiento(folderPath, getProperties().getProperty("Evidencia"));
        Cargas.CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).RevisarFDC(folderPath, getProperties().getProperty("Evidencia")).SalirFDC(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
        
//        System.out.println("Caso Numero:"+a); 
//        
//		}
	}
	
}
