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
@Epic("Historial DCD")
@Feature("Historial DCD Test")

public class HistorialDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Historial DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Historial DCD Portal Fedepalma")
    @Story("Historial DCD")
    @TmsLink("XRPRJ-1")
    public void HistorialDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        Rellenar.RellenarDCD();
        HistorialDCD.HistorialDCD();
        
    }
	
}
