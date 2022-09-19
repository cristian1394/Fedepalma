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
@Epic("Revicion RYP")
@Feature("Revicion RYP Test")

public class RevicionesRYPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Revicion RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revicion RYP Portal Fedepalma")
    @Story("Revicion RYP")
    @TmsLink("XRPRJ-1")
    public void RevicionRYPPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));  
        MenuRYP.IniciarRYP();
        RYP.FiltarRYP(getProperties().getProperty("Grupo")).RevicionRYP().ObservarRYP(getProperties().getProperty("Observacion"))
        	.GuardarRevicion().ValidarGuardarRevicion("El proceso se realizo correctamente.");
        
    }
	
}
