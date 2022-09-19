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
@Epic("Correccion FFP")
@Feature("Correccion FFP Test")

public class CorreccionFFPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Correccion FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Correccion FFP Portal Fedepalma")
    @Story("Correccion FFP")
    @TmsLink("XRPRJ-1")
    public void CorreccionFFP () throws Exception {
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

     
    }
	//	900551700      	900556147
}
