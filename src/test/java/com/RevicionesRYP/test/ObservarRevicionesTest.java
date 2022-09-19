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
@Epic("Ver Revicion RYP")
@Feature("Ver Revicion RYP Test")

public class ObservarRevicionesTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Ver Revicion RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ver Revicion RYP Portal Fedepalma")
    @Story("Ver Revicion RYP")
    @TmsLink("XRPRJ-1")
    public void VerRevicionRYPPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));   
        MenuRYP.IniciarRYP();
        Reviciones.VerRevicion(getProperties().getProperty("Observacion"),getProperties().getProperty("Grupo"))
        		  .ValidarGuardarRevicion("El proceso se realizo correctamente.");
        
    }
	
}
