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
@Epic("Exepciones Revisar DCD")
@Feature("Exepciones Revisar DCD Test")

public class ExepcionRevisarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Exepciones Revisar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exepciones Revisar DCD Portal Fedepalma")
    @Story("Exepciones Revisar DCD")
    @TmsLink("XRPRJ-1")
    public void ExepcionesRevisarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        RDCD.ConsultaDCD().RevicionDCD().ValidarRevicionDCD("Debe seleccionar una consulta.");      

        
    }
	
}
