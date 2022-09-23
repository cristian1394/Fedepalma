package com.Trazabilidad.test;

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
@Epic("En Tramite Trazabilidad")
@Feature("En Tramite Trazabilidad Test")

public class TramitesTrazabilidadTest extends BaseTest{
	
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
		
	@Test(priority=0, description="En Tramite Trazabilidad Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("En Tramite Trazabilidad Portal Fedepalma")
    @Story("En Tramite Trazabilidad")
    @TmsLink("XRPRJ-1")
    public void EnTramiteTrazabilidadPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath, getProperties().getProperty("Evidencia"));
        MenuTrazabilidad.IniciarTrazabilidad(folderPath, getProperties().getProperty("Evidencia"));
        EnTramite.EnTramiteTrazabilidad(getProperties().getProperty("Termina"), getProperties().getProperty("Declarante"),
        		getProperties().getProperty("Contiene"),getProperties().getProperty("Dcd"),
        		getProperties().getProperty("Grupo"), folderPath, getProperties().getProperty("Evidencia"))
        		.VerTrazabilidad(folderPath, getProperties().getProperty("Evidencia"));
     
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
}
