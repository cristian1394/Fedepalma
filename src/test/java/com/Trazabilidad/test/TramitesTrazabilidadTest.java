package com.Trazabilidad.test;

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
@Epic("En Tramite Trazabilidad")
@Feature("En Tramite Trazabilidad Test")

public class TramitesTrazabilidadTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="En Tramite Trazabilidad Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("En Tramite Trazabilidad Portal Fedepalma")
    @Story("En Tramite Trazabilidad")
    @TmsLink("XRPRJ-1")
    public void EnTramiteTrazabilidadPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuTrazabilidad.IniciarTrazabilidad();
        EnTramite.EnTramiteTrazabilidad(getProperties().getProperty("Termina"), getProperties().getProperty("Declarante"),
        		getProperties().getProperty("Contiene"),getProperties().getProperty("Dcd"),
        		getProperties().getProperty("Grupo"))
        		.VerTrazabilidad();
     
    }
	
}
