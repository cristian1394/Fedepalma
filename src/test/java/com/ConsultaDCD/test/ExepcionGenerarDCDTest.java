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
@Epic("Exepciones Generar DCD")
@Feature("Exepciones Generar DCD Test")

public class ExepcionGenerarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Exepciones Generar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepciones Generar DCD Portal Fedepalma")
    @Story("Exepciones Generar DCD")
    @TmsLink("XRPRJ-1")
    public void ExepcionesGenerarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        RDCD.ConsultaDCD();    
        GDCD.GenerarDCD().ValidarGeneracionDCD("Debe seleccionar una consulta.");
    
        //String validar=consultaBD("select acc_nombre from C_ACCIONES where acc_nombre='ADMINISTRACION_CLIENTES'");
        //Assert.assertEquals(validar, getProperties().getProperty("nit"));
        
    }
	
}
