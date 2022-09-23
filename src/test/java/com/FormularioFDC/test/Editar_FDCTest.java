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
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));      
        Editar_FDC.FormularioFDC(folderPath, getProperties().getProperty("Evidencia")).EditarFDC(folderPath, getProperties().getProperty("Evidencia"));
        Carga.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath, getProperties().getProperty("Evidencia")).CargaFMM(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente", folderPath, getProperties().getProperty("Evidencia"))
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath, getProperties().getProperty("Evidencia")).CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente", folderPath, getProperties().getProperty("Evidencia"))
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath, getProperties().getProperty("Evidencia")).RevisarFDC(folderPath, getProperties().getProperty("Evidencia")).SalirFDC(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
}
