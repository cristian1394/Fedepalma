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
@Epic("Filtros FDC")
@Feature("Filtros FDC Test")

public class FiltrosFDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Filtros FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros FDC Portal Fedepalma")
    @Story("Filtros FDC")
    @TmsLink("XRPRJ-1")
    public void FiltrosFDCPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FiltrosFDC.ValidarFiltrosFDC(getProperties().getProperty("numero"), getProperties().getProperty("Kg"),
        		getProperties().getProperty("Creacion"), getProperties().getProperty("Estado"))
        		.ExportacionExcel();
        
    }
	
}
