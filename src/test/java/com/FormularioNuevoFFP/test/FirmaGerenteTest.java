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
@Epic("Firma Gerente")
@Feature("Firma Gerente Test")

public class FirmaGerenteTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Firma Gerente Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Declarar FFP Portal Fedepalma")
    @Story("Firma Gerente")
    @TmsLink("XRPRJ-1")
    public void FirmaGerenteFFP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitA"), getProperties().getProperty("UsrG"),
        		getProperties().getProperty("pwd"));
        FirmaG.DeclararFFP(getProperties().getProperty("RPFH"), getProperties().getProperty("PalmisteE"),
        		getProperties().getProperty("PPalmaIngresada")).Firma(getProperties().getProperty("Firma"))
        		.confirmar();

     
    }
	
}
