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
@Epic("Exepciones Consultar DCD")
@Feature("Exepciones Consultar DCD Test")

public class ExepcionConsultarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Exepciones Consultar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepciones Consultar DCD Portal Fedepalma")
    @Story("Exepciones Consultar DCD")
    @TmsLink("XRPRJ-1")
    public void ExepcionesConsultarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        EDCD.ConsultaDCD().ValidarResultadoDCD("No se encontraron datos.");      
    
        //String validar=consultaBD("select acc_nombre from C_ACCIONES where acc_nombre='ADMINISTRACION_CLIENTES'");
        //Assert.assertEquals(validar, getProperties().getProperty("nit"));
        
    }
	
}
