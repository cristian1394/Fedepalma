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
@Epic("Crear DCD")
@Feature("Crear DCD Test")

public class CrearDCDTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Crear DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear DCD Portal Fedepalma")
    @Story("Crear DCD")
    @TmsLink("XRPRJ-1")
    public void CrearDCDPortalFedepalma () throws Exception {
		
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));

		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"), folderPath);
        DCD.ConsultaDCD(getProperties().getProperty("Proveedor"), folderPath);      
        CrearDCD.CrearDCD(getProperties().getProperty("nit"), getProperties().getProperty("Proveedor"), 
        		getProperties().getProperty("kilos"), folderPath).ValidarCreacionDCD("Proceso realizado con éxito", folderPath);
        EditarDCD.EditarDCD(getProperties().getProperty("Proveedor1"), getProperties().getProperty("CP"), 
        		getProperties().getProperty("kilos"), folderPath).ValidarAdicionCD("Certificado Guardado Correctamente.", folderPath).RevisarDCD(folderPath, getProperties().getProperty("Evidencia"))
        		.ValidarRevicionDCD("Proceso realizado exitosamente!", folderPath).FirmarDCD(getProperties().getProperty("Firma"),"Formulario firmado exitosamente.", folderPath)
        		.ValidarGenerarDCD("Proceso realizado exitosamente!", folderPath);
        
        //String validar=consultaBD("select acc_nombre from C_ACCIONES where acc_nombre='ADMINISTRACION_CLIENTES'");
        //Assert.assertEquals(validar, getProperties().getProperty("nit"));

		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));

		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
}
