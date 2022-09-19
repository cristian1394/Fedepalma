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
@Epic("Validar RYP")
@Feature("Validar RYP Test")

public class ValidacionesRYPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Validar RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar RYP Portal Fedepalma")
    @Story("Validar RYP")
    @TmsLink("XRPRJ-1")
    public void ValidarRYPPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuRYP.IniciarRYP();
        ValidarRYP.ValidarFormulario().ValidarDCD();

     
    }
	
}
