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
@Epic("Editar FFP")
@Feature("Editar FFP Test")

public class EdicionFFPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Editar FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Editar FFP Portal Fedepalma")
    @Story("Editar FFP")
    @TmsLink("XRPRJ-1")
    public void EditarFFP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        ConsultaFFP.Consulta_FFP(getProperties().getProperty("NitFFP"));
        EditarFFP.EditarFFP(getProperties().getProperty("PropiosH"),getProperties().getProperty("InicialFrutoG"),
                getProperties().getProperty("InicialFrutoH"),getProperties().getProperty("BajaFrutoG"))
        		.ProveedoresAlmendra(getProperties().getProperty("DocRPA"),getProperties().getProperty("KG"))
        		.AlmendraRecibida(getProperties().getProperty("DocARPM"),getProperties().getProperty("KG"), 
                getProperties().getProperty("PalmisteRecibida"));
        InventariosEdicion.AceitePalma(getProperties().getProperty("Palma"),getProperties().getProperty("PalmaA"),
                getProperties().getProperty("PalmaB"),getProperties().getProperty("PalmaC"), getProperties().getProperty("PalmaD"))
        		.AceitePalmaOPalmiste(getProperties().getProperty("PalmaoPalmiste"),getProperties().getProperty("PalmaoPalmisteA"),
                getProperties().getProperty("PalmaoPalmisteB"),getProperties().getProperty("PalmaoPalmisteC"), 
                getProperties().getProperty("PalmaoPalmisteD"))
        		.AceitePalmiste(getProperties().getProperty("Palmiste"),getProperties().getProperty("PalmisteA"),
                getProperties().getProperty("PalmisteB"),getProperties().getProperty("PalmisteC"), getProperties().getProperty("PalmisteD"))
        		.PresentarDeclaracion()
        		.GuardarEdicion();

     
    }
	
}