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
@Epic("Exepcion Observacion RYP")
@Feature("Exepcion Observacion RYP Test")

public class ExepcionObservacionRYPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Exepcion Observacion RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepcion Observacion RYP Portal Fedepalma")
    @Story("Exepcion Observacion RYP")
    @TmsLink("XRPRJ-1")
    public void RevicionSTecnicaPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
		MenuRYP.IniciarRYP(); 
        RYP.RevicionRYP().GuardarRevicion().ValidarGuardarRevicion2("¡Advertencia!");
        
    }
	
}
