package com.Trazabilidad.test;

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
@Epic("Filtros Trazabilidad")
@Feature("Filtros Trazabilidad Test")

public class FiltrosTrazabilidadTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Filtros Trazabilidad Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros Trazabilidad Portal Fedepalma")
    @Story("Filtros Trazabilidad")
    @TmsLink("XRPRJ-1")
    public void FiltrosTrazabilidadPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuTrazabilidad.IniciarTrazabilidad();
        FiltroTrazabilidad.ValidarFiltrosTrazabilidad(getProperties().getProperty("Inicia"), getProperties().getProperty("Declarante"),
        		getProperties().getProperty("Contiene"),getProperties().getProperty("Dcd"),
        		getProperties().getProperty("Grupo"));
     
    }
	
}
