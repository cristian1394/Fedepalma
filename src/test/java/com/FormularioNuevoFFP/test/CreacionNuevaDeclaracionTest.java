package com.FormularioNuevoFFP.test;

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
@Epic("Crear Nueva Declaracion FFP")
@Feature("Crear Nueva Declaracion FFP Test")

public class CreacionNuevaDeclaracionTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Crear Nueva Declaracion FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear Nueva Declaracion FFP Portal Fedepalma")
    @Story("Crear Nueva Declaracion FFP")
    @TmsLink("XRPRJ-1")
    public void CrearNuevaDeclaracionFFP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath, getProperties().getProperty("Evidencia"));
        Consulta_FFP.ConsultaFFP(folderPath, getProperties().getProperty("Evidencia"));
        NuevaDeclaracion.NuevaDeclaracionFFP(getProperties().getProperty("DocRPF"),getProperties().getProperty("PropiosG"),
        		getProperties().getProperty("PropiosH"),getProperties().getProperty("RPFG"), getProperties().getProperty("RPFH"), folderPath, getProperties().getProperty("Evidencia"))
        		.ContratanteMaquilaFFP(getProperties().getProperty("DocACM"),getProperties().getProperty("FrutoG"),
                getProperties().getProperty("PalmisteP"),getProperties().getProperty("FrutoH"), getProperties().getProperty("PalmisteE"), 
                getProperties().getProperty("PalmaP"),getProperties().getProperty("PalmaE"), folderPath, getProperties().getProperty("Evidencia"))
        		.FrutoVendidoFFP(getProperties().getProperty("DocRFV"),getProperties().getProperty("InicialFrutoG"),
                getProperties().getProperty("InicialFrutoH"),getProperties().getProperty("KgG"), getProperties().getProperty("KgH"), folderPath, getProperties().getProperty("Evidencia"))
        		.FrutoEnviadoFFP(getProperties().getProperty("DocRFEM"),getProperties().getProperty("BajaFrutoG"),
                getProperties().getProperty("BajaFrutoH"),getProperties().getProperty("KGG"), getProperties().getProperty("KGH"), 
                getProperties().getProperty("NoProcesadoG"),getProperties().getProperty("NoProcesadoH"), folderPath, getProperties().getProperty("Evidencia"))
        		.ProveedoresAlmendra(getProperties().getProperty("DocRPA"),getProperties().getProperty("PPalmaIngresada"),
                getProperties().getProperty("RPalmaIngresada"),getProperties().getProperty("KG"), folderPath, getProperties().getProperty("Evidencia"))
        		.AlmendraRecibida(getProperties().getProperty("DocARPM"),getProperties().getProperty("KG"),
                getProperties().getProperty("PalmaProcesada"),getProperties().getProperty("PalmaRecibida"), getProperties().getProperty("PlamisteProducida"), 
                getProperties().getProperty("PalmisteRecibida"), folderPath, getProperties().getProperty("Evidencia"));
        Inventarios.AceitePalma(getProperties().getProperty("Palma"),getProperties().getProperty("PalmaA"),
                getProperties().getProperty("PalmaB"),getProperties().getProperty("PalmaC"), getProperties().getProperty("PalmaD"), folderPath, getProperties().getProperty("Evidencia"))
        		.AceitePalmaOPalmiste(getProperties().getProperty("PalmaoPalmiste"),getProperties().getProperty("PalmaoPalmisteA"),
                getProperties().getProperty("PalmaoPalmisteB"),getProperties().getProperty("PalmaoPalmisteC"), 
                getProperties().getProperty("PalmaoPalmisteD"), folderPath, getProperties().getProperty("Evidencia"))
        		.AceitePalmiste(getProperties().getProperty("Palmiste"),getProperties().getProperty("PalmisteA"),
                getProperties().getProperty("PalmisteB"),getProperties().getProperty("PalmisteC"), getProperties().getProperty("PalmisteD"), folderPath, getProperties().getProperty("Evidencia"))
        		.TotalPlama(getProperties().getProperty("TotalPalma"), folderPath, getProperties().getProperty("Evidencia"));

        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
     
    }
	
}
