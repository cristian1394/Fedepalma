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
@Epic("Borrar FFP")
@Feature("Borrar FFP Test")

public class BorrarFFPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Borrar FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Borrar FFP Portal Fedepalma")
    @Story("Borrar FFP")
    @TmsLink("XRPRJ-1")
    public void BorrarFFP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitA"), getProperties().getProperty("UsrG"),
        		getProperties().getProperty("pwd"));
        BorrarFFP.BorrarFFP(getProperties().getProperty("NoProcesadoH"), getProperties().getProperty("PalmisteE"),
        		getProperties().getProperty("KGH"), getProperties().getProperty("TPalma"));

     
    }
	
}
