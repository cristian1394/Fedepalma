package com.RevicionesRYP.test;

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
@Epic("Ver Revicion RYP")
@Feature("Ver Revicion RYP Test")

public class ObservarRevicionesTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Ver Revicion RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ver Revicion RYP Portal Fedepalma")
    @Story("Ver Revicion RYP")
    @TmsLink("XRPRJ-1")
    public void VerRevicionRYPPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);   
        MenuRYP.IniciarRYP(folderPath);
        Reviciones.VerRevicion(getProperties().getProperty("Observacion"),getProperties().getProperty("Grupo"), folderPath)
        		  .ValidarGuardarRevicion("El proceso se realizo correctamente.", folderPath);
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
}
