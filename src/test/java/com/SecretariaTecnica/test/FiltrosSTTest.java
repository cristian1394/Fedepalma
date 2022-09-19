package com.SecretariaTecnica.test;

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
@Epic("Filtros Secretaria Tecnica")
@Feature("Filtros Secretaria Tecnica Test")

public class FiltrosSTTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Filtros Secretaria Tecnica Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros Secretaria Tecnica Portal Fedepalma")
    @Story("Filtros Secretaria Tecnica")
    @TmsLink("XRPRJ-1")
    public void FiltrosSTPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        MenuST.IniciarST();
        FiltrosST.ValidarFiltrosST(getProperties().getProperty("Termina"), getProperties().getProperty("Declarante"),
        		getProperties().getProperty("DCD")).ExportacionExcel();
     
    }
	
}
