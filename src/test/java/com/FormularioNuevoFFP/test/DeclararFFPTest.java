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
@Epic("Declarar FFP")
@Feature("Declarar FFP Test")

public class DeclararFFPTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Declarar FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Declarar FFP Portal Fedepalma")
    @Story("Declarar FFP")
    @TmsLink("XRPRJ-1")
    public void DeclararFFP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitA"), getProperties().getProperty("UsrF"),
        		getProperties().getProperty("pwd"));
        ConsultarFFP.Consulta_FFP();
        NuevaDeclaracionE.NuevaDeclaracionFFP(getProperties().getProperty("DocRPF"),getProperties().getProperty("PropiosG"),
        		getProperties().getProperty("PropiosH"),getProperties().getProperty("RPFG"), getProperties().getProperty("RPFH"))
        		.FrutoVendidoFFP(getProperties().getProperty("InicialFrutoG"), getProperties().getProperty("InicialFrutoH"))
        		.FrutoEnviadoFFP(getProperties().getProperty("BajaFrutoG"), getProperties().getProperty("BajaFrutoH"), 
                getProperties().getProperty("NoProcesadoG"))
        		.ProveedoresAlmendra(getProperties().getProperty("DocRPA"),getProperties().getProperty("PPalmaIngresada"),
                getProperties().getProperty("RPalmaIngresada"),getProperties().getProperty("KG"))
        		.AlmendraRecibida(getProperties().getProperty("DocARPM"),getProperties().getProperty("KG"),
                getProperties().getProperty("PalmaProcesada"),getProperties().getProperty("PalmaRecibida"),
                getProperties().getProperty("PalmisteRecibida"));
        Inventarios.AceitePalma(getProperties().getProperty("Palma"),getProperties().getProperty("PalmaA"),
                getProperties().getProperty("PalmaB"),getProperties().getProperty("PalmaC"), getProperties().getProperty("PalmaD"))
        		.AceitePalmaOPalmiste(getProperties().getProperty("PalmaoPalmiste"),getProperties().getProperty("PalmaoPalmisteA"),
                getProperties().getProperty("PalmaoPalmisteB"),getProperties().getProperty("PalmaoPalmisteC"), 
                getProperties().getProperty("PalmaoPalmisteD"))
        		.AceitePalmiste(getProperties().getProperty("Palmiste"),getProperties().getProperty("PalmisteA"),
                getProperties().getProperty("PalmisteB"),getProperties().getProperty("PalmisteC"), getProperties().getProperty("PalmisteD"))
        		.Total_Plama(getProperties().getProperty("TotalPalma"));
        DeclararFFPF.DeclararFFP().Firma(getProperties().getProperty("Firma"),"Formularios firmados exitosamente.")
        		.confirmar("Se ha realizado el cambio de estado");

        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
}
