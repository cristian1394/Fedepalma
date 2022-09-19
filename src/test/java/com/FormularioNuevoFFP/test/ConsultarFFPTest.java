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
@Epic("Consulta FFP")
@Feature("Consulta FFP Test")

public class ConsultarFFPTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Consulta FFP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta FFP Portal Fedepalma")
    @Story("Consulta FFP")
    @TmsLink("XRPRJ-1")
    public void ConsultaFFP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        ConsultaFFP.ConsultaFFP();
        MirarFFP.MirarFFP();

     
    }
	
}
