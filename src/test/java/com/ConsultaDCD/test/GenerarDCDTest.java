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
@Epic("Generar DCD")
@Feature("Generar DCD Test")

public class GenerarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Generar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Generar DCD Portal Fedepalma")
    @Story("Generar DCD")
    @TmsLink("XRPRJ-1")
    public void GenerarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        Generar.GenerarDCD().Firma(getProperties().getProperty("Firma"),"Formularios firmados exitosamente.").confirmar("Se ha realizado el cambio de estado");
    }
	
}
