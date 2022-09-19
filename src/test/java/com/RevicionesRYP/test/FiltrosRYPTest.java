package com.RevicionesRYP.test;

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
@Epic("Filtros RYP")
@Feature("Filtros RYP Test")

public class FiltrosRYPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Filtros RYP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros RYP Portal Fedepalma")
    @Story("Filtros RYP")
    @TmsLink("XRPRJ-1")
    public void FiltrosRYPPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuRYP.IniciarRYP();
        FiltrosRYP.ValidarFiltrosRYP(getProperties().getProperty("Año"), getProperties().getProperty("inicial"),
        		getProperties().getProperty("producto"),getProperties().getProperty("Grupo1")).ExportacionExcel();

     
    }
	
}
