package com.FormularioNuevoFFP.test;

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
@Epic("Firma Gerente")
@Feature("Firma Gerente Test")

public class FirmaGerenteTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Firma Gerente Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Declarar FFP Portal Fedepalma")
    @Story("Firma Gerente")
    @TmsLink("XRPRJ-1")
    public void FirmaGerenteFFP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitA"), getProperties().getProperty("UsrG"),
        		getProperties().getProperty("pwd"), folderPath);
        FirmaG.DeclararFFP(getProperties().getProperty("RPFH"), getProperties().getProperty("PalmisteE"),
        		getProperties().getProperty("PPalmaIngresada"), folderPath).Firma(getProperties().getProperty("Firma"), folderPath)
        		.confirmar(folderPath);
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
     
    }
	
}
