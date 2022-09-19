package com.FormularioNuevoFFP.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;



@Listeners({ TestListener.class })
@Epic("Crear Nueva Declaracion FFP")
@Feature("Crear Nueva Declaracion FFP Test")

public class CreacionNuevaDeclaracionTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Crear Nueva Declaracion FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear Nueva Declaracion FFP Portal Fedepalma")
    @Story("Crear Nueva Declaracion FFP")
    @TmsLink("XRPRJ-1")
    public void CrearNuevaDeclaracionFFP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        Consulta_FFP.ConsultaFFP();
        NuevaDeclaracion.NuevaDeclaracionFFP(getProperties().getProperty("DocRPF"),getProperties().getProperty("PropiosG"),
        		getProperties().getProperty("PropiosH"),getProperties().getProperty("RPFG"), getProperties().getProperty("RPFH"))
        		.ContratanteMaquilaFFP(getProperties().getProperty("DocACM"),getProperties().getProperty("FrutoG"),
                getProperties().getProperty("PalmisteP"),getProperties().getProperty("FrutoH"), getProperties().getProperty("PalmisteE"), 
                getProperties().getProperty("PalmaP"),getProperties().getProperty("PalmaE"))
        		.FrutoVendidoFFP(getProperties().getProperty("DocRFV"),getProperties().getProperty("InicialFrutoG"),
                getProperties().getProperty("InicialFrutoH"),getProperties().getProperty("KgG"), getProperties().getProperty("KgH"))
        		.FrutoEnviadoFFP(getProperties().getProperty("DocRFEM"),getProperties().getProperty("BajaFrutoG"),
                getProperties().getProperty("BajaFrutoH"),getProperties().getProperty("KGG"), getProperties().getProperty("KGH"), 
                getProperties().getProperty("NoProcesadoG"),getProperties().getProperty("NoProcesadoH"))
        		.ProveedoresAlmendra(getProperties().getProperty("DocRPA"),getProperties().getProperty("PPalmaIngresada"),
                getProperties().getProperty("RPalmaIngresada"),getProperties().getProperty("KG"))
        		.AlmendraRecibida(getProperties().getProperty("DocARPM"),getProperties().getProperty("KG"),
                getProperties().getProperty("PalmaProcesada"),getProperties().getProperty("PalmaRecibida"), getProperties().getProperty("PlamisteProducida"), 
                getProperties().getProperty("PalmisteRecibida"));
        Inventarios.AceitePalma(getProperties().getProperty("Palma"),getProperties().getProperty("PalmaA"),
                getProperties().getProperty("PalmaB"),getProperties().getProperty("PalmaC"), getProperties().getProperty("PalmaD"))
        		.AceitePalmaOPalmiste(getProperties().getProperty("PalmaoPalmiste"),getProperties().getProperty("PalmaoPalmisteA"),
                getProperties().getProperty("PalmaoPalmisteB"),getProperties().getProperty("PalmaoPalmisteC"), 
                getProperties().getProperty("PalmaoPalmisteD"))
        		.AceitePalmiste(getProperties().getProperty("Palmiste"),getProperties().getProperty("PalmisteA"),
                getProperties().getProperty("PalmisteB"),getProperties().getProperty("PalmisteC"), getProperties().getProperty("PalmisteD"))
        		.TotalPlama(getProperties().getProperty("TotalPalma"));

     
    }
	
}
