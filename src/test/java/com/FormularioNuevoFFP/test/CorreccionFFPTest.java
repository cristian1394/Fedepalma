package com.FormularioNuevoFFP.test;

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
@Epic("Correccion FFP")
@Feature("Correccion FFP Test")

public class CorreccionFFPTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Correccion FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Correccion FFP Portal Fedepalma")
    @Story("Correccion FFP")
    @TmsLink("XRPRJ-1")
    public void CorreccionFFP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        ConsultaFFP.ConsultaFFP();
        CorregirFFP.CorreccionFFP(getProperties().getProperty("PropiosH"),getProperties().getProperty("InicialFrutoG"),
                getProperties().getProperty("InicialFrutoH"),getProperties().getProperty("BajaFrutoG"))
        		.ProveedoresAlmendra(getProperties().getProperty("RPalmaIngresada"),getProperties().getProperty("DocRPA"),getProperties().getProperty("KG"))
        		.AlmendraRecibida(getProperties().getProperty("DocARPM"),getProperties().getProperty("KG"), 
                getProperties().getProperty("PalmisteRecibida"));
        InventariosCorreccion.AceitePalma( getProperties().getProperty("PalmaD"))
        		.AceitePalmaOPalmiste(getProperties().getProperty("PalmaoPalmiste"),getProperties().getProperty("PalmisteD"))
        		.AceitePalmiste(getProperties().getProperty("PalmisteA"),getProperties().getProperty("PalmisteC"), 
        		getProperties().getProperty("PalmisteD"))
        		.GuardarEdicion(getProperties().getProperty("TotalPalma"),"Declaración creada exitosamente");
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
     
    }
	//	900551700      	900556147
}
