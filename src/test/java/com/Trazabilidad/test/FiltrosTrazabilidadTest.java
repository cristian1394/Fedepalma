package com.Trazabilidad.test;

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
@Epic("Filtros Trazabilidad")
@Feature("Filtros Trazabilidad Test")

public class FiltrosTrazabilidadTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Filtros Trazabilidad Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros Trazabilidad Portal Fedepalma")
    @Story("Filtros Trazabilidad")
    @TmsLink("XRPRJ-1")
    public void FiltrosTrazabilidadPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        MenuTrazabilidad.IniciarTrazabilidad(folderPath);
        FiltroTrazabilidad.ValidarFiltrosTrazabilidad(getProperties().getProperty("Inicia"), getProperties().getProperty("Declarante"),
        		getProperties().getProperty("Contiene"),getProperties().getProperty("Dcd"),
        		getProperties().getProperty("Grupo"), folderPath);
     
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
}
