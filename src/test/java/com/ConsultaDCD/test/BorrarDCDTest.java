package com.ConsultaDCD.test;

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
@Epic("Borrar DCD")
@Feature("Borrar DCD Test")

public class BorrarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Borrar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Borrar DCD Portal Fedepalma")
    @Story("Borrar DCD")
    @TmsLink("XRPRJ-1")
    public void BorrarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        Rellenar.RellenarDCD();	
        Borrar.BorrarDCD(getProperties().getProperty("observaciones"))
        	  .ValidarResultadoBorrarDCD("Proceso realizado exitosamente!");
        
    }
	
}
