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
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
		RechazarDCD.IngresarFDC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFDC(getProperties().getProperty("nitComprador"), folderPath).RevisarFDC(folderPath, getProperties().getProperty("Evidencia"))
			  .RechazarFDC(getProperties().getProperty("Obs"), folderPath).GuardarFDC("El proceso se realizo correctamente.", folderPath)
			  .NumeroDCD(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			   getProperties().getProperty("pwd"), folderPath).SeleccionarDCD("El formulario se guardo correctamente.", folderPath);
        Cargas.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath)
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente", folderPath).RevisarFDC(folderPath, getProperties().getProperty("Evidencia"));
        Radicar.RadicarFDC(folderPath, getProperties().getProperty("Evidencia")).FirmarFDC(getProperties().getProperty("Firma"), folderPath).SalirFDC(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	
	
}
