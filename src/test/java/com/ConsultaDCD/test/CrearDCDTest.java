package com.ConsultaDCD.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;



@Listeners({ TestListener.class })
@Epic("Crear DCD")
@Feature("Crear DCD Test")

public class CrearDCDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Crear DCD Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear DCD Portal Fedepalma")
    @Story("Crear DCD")
    @TmsLink("XRPRJ-1")
    public void CrearDCDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        DCD.ConsultaDCD(getProperties().getProperty("Proveedor"));      
        CrearDCD.CrearDCD(getProperties().getProperty("nit"), getProperties().getProperty("Proveedor"), 
        		getProperties().getProperty("kilos")).ValidarCreacionDCD("Proceso realizado con éxito");
        EditarDCD.EditarDCD(getProperties().getProperty("Proveedor1"), getProperties().getProperty("CP"), 
        		getProperties().getProperty("kilos")).ValidarAdicionCD("Certificado Guardado Correctamente.").RevisarDCD()
        		.ValidarRevicionDCD("Proceso realizado exitosamente!").FirmarDCD(getProperties().getProperty("Firma"),"Formulario firmado exitosamente.")
        		.ValidarGenerarDCD("Proceso realizado exitosamente!");
        
        //String validar=consultaBD("select acc_nombre from C_ACCIONES where acc_nombre='ADMINISTRACION_CLIENTES'");
        //Assert.assertEquals(validar, getProperties().getProperty("nit"));
        
    }
	
}
