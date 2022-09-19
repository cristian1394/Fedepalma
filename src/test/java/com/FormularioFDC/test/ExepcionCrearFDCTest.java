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
@Epic("Crear FDC")
@Feature("Crear FDC Test")

public class ExepcionCrearFDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Crear FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FDC Portal Fedepalma")
    @Story("Crear FDC")
    @TmsLink("XRPRJ-1")
    public void ExepcionCrearFDCPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDCB.FormularioExepcionFDC();      
        ECrearFDC.CrearFDC("Seleccione el año y el mes");
        
	}
	
}
