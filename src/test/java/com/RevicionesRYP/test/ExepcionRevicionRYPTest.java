package com.RevicionesRYP.test;

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
@Epic("Exepcion Revicion RYP")
@Feature("Exepcion Revicion RYP Test")

public class ExepcionRevicionRYPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Exepcion Revicion RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepcion Revicion RYP Portal Fedepalma")
    @Story("Exepcion Revicion RYP")
    @TmsLink("XRPRJ-1")
    public void ExepcionRevicionRYPPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));  
        MenuRYP.IniciarRYP();
        RYP.GuardarRevicion().ValidarGuardarRevicion1("No se encontraron compensaciones para validar.");
        
    }
	
}
