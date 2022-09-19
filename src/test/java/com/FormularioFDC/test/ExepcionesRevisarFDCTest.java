package com.FormularioFDC.test;

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
@Epic("Revisar FDC")
@Feature("Revisar FDC Test")

public class ExepcionesRevisarFDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Revisar FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revisar FDC Portal Fedepalma")
    @Story("Revisar FDC")
    @TmsLink("XRPRJ-1")
    public void RevisarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();
        RevisarFDC.CrearFDC().RevisarFDC("No ha asociado todos los kilogramos a un tipo de DCD").SalirFDC();
      
        
        
        
	}
	
}
