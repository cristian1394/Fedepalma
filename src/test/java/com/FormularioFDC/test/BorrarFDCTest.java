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
@Epic("Eliminar FDC")
@Feature("Eliminar FDC Test")

public class BorrarFDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Eliminar FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Eliminar FDC Portal Fedepalma")
    @Story("Borrar FDC")
    @TmsLink("XRPRJ-1")
    public void CargarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDCB.FormularioFDC();      
        BorrarFDC.BorrarFDC("Operación Exitosa");
        
    }
	
}
