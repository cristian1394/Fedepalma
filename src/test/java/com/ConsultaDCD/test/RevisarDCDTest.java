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
@Epic("Revisar DCD")
@Feature("Revisar DCD Test")

public class RevisarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Revisar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revisar DCD Portal Fedepalma")
    @Story("Revisar DCD")
    @TmsLink("XRPRJ-1")
    public void RevisarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        Revisar.RevisarDCD(getProperties().getProperty("Proveedor")).ValidarRevicionDCD("Se ha realizado el cambio de estado");
        
    }
	
}
