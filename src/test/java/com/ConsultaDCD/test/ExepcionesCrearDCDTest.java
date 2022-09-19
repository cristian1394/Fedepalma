package com.ConsultaDCD.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;



@Listeners({ TestListener.class })
@Epic("Exepciones Crear DCD")
@Feature("Exepciones Crear DCD Test")

public class ExepcionesCrearDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Exepciones Crear DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepciones Crear DCD Portal Fedepalma")
    @Story("Exepciones Crear DCD")
    @TmsLink("XRPRJ-1")
    public void ExepcionesCrearDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        RDCD.ConsultaDCD();
        ECrearDCD.CrearDCD(getProperties().getProperty("nitcrear"),getProperties().getProperty("kilos"))
        	.ValidarCreacionDCD("Por favor complete el formulario.");
      
        
    }
	
}
