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
@Epic("Editar FDC Estado Borrador")
@Feature("Editar FDC Estado Borrador Test")

public class Editar_FDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Editar FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Editar FDC Portal Fedepalma")
    @Story("Editar FDC Estado Borrador")
    @TmsLink("XRPRJ-1")
    public void EditarEstadoBorradorPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));      
        Editar_FDC.FormularioFDC().EditarFDC();
        Carga.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").CargaFMM(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaCD(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC().SalirFDC();
        
    }
	
}
