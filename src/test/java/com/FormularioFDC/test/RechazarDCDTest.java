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
@Epic("Rechazar DCD")
@Feature("Rechazar DCD Test")

public class RechazarDCDTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Rechazar DCD FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Rechazar DCD FDC Portal Fedepalma")
    @Story("Rechazar DCD")
    @TmsLink("XRPRJ-1")
    public void RechazarDCDPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
		RechazarDCD.IngresarFDC().ConsultarFDC(getProperties().getProperty("nitComprador")).RevisarFDC()
			  .RechazarFDC(getProperties().getProperty("Obs")).GuardarFDC("El proceso se realizo correctamente.")
			  .NumeroDCD(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			   getProperties().getProperty("pwd")).SeleccionarDCD("El formulario se guardo correctamente.");
        Cargas.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC();
        Radicar.RadicarFDC().FirmarFDC(getProperties().getProperty("Firma")).SalirFDC();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
	}
	
	
	
}
