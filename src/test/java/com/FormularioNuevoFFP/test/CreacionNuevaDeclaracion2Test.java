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

public class CreacionNuevaDeclaracion2Test extends BaseTest{
	
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
        NuevaDeclaracionE.NuevaDeclaracionFFP1(getProperties().getProperty("DocRPF"),getProperties().getProperty("PropiosG"),
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
        		.Total_Plama1(getProperties().getProperty("TotalPalma"));

     
    }
	
}
