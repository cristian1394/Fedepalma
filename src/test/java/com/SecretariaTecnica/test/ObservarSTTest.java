package com.SecretariaTecnica.test;

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
@Epic("Ver Secretaria Tecnica")
@Feature("Ver Secretaria Tecnica Test")

public class ObservarSTTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Ver Secretaria Tecnica Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ver Secretaria Tecnica Portal Fedepalma")
    @Story("Ver Secretaria Tecnica")
    @TmsLink("XRPRJ-1")
    public void ObservarSTecnicaPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuST.IniciarST();  
        VerSTecnica.VerSTecnica(getProperties().getProperty("Observacion")).ValidarGuardarRevicion("El proceso se realizo correctamente.");
        
    }
	
}
