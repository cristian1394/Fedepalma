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
@Epic("Editar DCD")
@Feature("Editar DCD Test")

public class EditarDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Editar DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Editar DCD Portal Fedepalma")
    @Story("Editar DCD")
    @TmsLink("XRPRJ-1")
    public void EditarDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        Editar.RellenarDCD().EditarDCD(getProperties().getProperty("kg"), getProperties().getProperty("CP"), 
        		getProperties().getProperty("kilos")).ValidarAdicionCD("Certificado Guardado Correctamente.")
        		.CargaCD(getProperties().getProperty("EXC")).ValidarCargaCD("Certificados Guardados Correctamente.")
        		.ValidarGuardarDCD("Proceso realizado con éxito");
        
    }
	
}
