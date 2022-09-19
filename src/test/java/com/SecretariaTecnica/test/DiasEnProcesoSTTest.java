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
@Epic("Dias en Proceso Secretaria Tecnica")
@Feature("Dias en Proceso Secretaria Tecnica Test")

public class DiasEnProcesoSTTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Dias en Proceso Secretaria Tecnica Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Dias en Proceso Secretaria Tecnica Portal Fedepalma")
    @Story("Dias en Proceso Secretaria Tecnica")
    @TmsLink("XRPRJ-1")
    public void DiasEnProcesoSTecnicaPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuST.IniciarST();   
        DiasPST.ValidarST();
        
    }
	
}
