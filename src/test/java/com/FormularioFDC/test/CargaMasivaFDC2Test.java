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
@Epic("Carga Masiva")
@Feature("Carga Masiva Test")

public class CargaMasivaFDC2Test extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Carga Masiva DEX Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Carga Masiva DEX Portal Fedepalma")
    @Story("Carga Masiva DEX")
    @TmsLink("XRPRJ-1")
    public void CargarDEXPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();      
        CMDEX.CargaDEX(getProperties().getProperty("DocACM"), "Se encontraron errores en el archivo por favor validar.");
        
    }
			
		@Test(priority=1, description="Carga Masiva FMM Portal Fedepalma")
	    @Severity(SeverityLevel.NORMAL)
	    @Description("Carga Masiva FMM Portal Fedepalma")
	    @Story("Carga Masiva FMM")
	    @TmsLink("XRPRJ-1")
	    public void CargaFMMPortalFedepalma () throws Exception {
			home.irPortal(getProperties().getProperty("url"));
	        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
	        		getProperties().getProperty("pwd"));
	        FDC.FormularioFDC();      
	        CMFMM.CargaFMM(getProperties().getProperty("DocACM"), "Se encontraron errores en el archivo por favor validar.");
	        
	    }
		
	}

