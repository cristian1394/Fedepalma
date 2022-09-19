package com.FormularioNuevoFFP.test;

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
@Epic("Filtrar FFP")
@Feature("Filtrar FFP Test")

public class FiltrarFFPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Filtrar FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtrar FFP Portal Fedepalma")
    @Story("Filtrar FFP")
    @TmsLink("XRPRJ-1")
    public void FiltrarFFP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        FiltrarFFP.FiltrarFFP(getProperties().getProperty("Termine"),getProperties().getProperty("Inicia"),
        		getProperties().getProperty("Igual"));

     
    }
	
}
