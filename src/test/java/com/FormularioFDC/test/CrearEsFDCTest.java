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
@Epic("Crear FDC")
@Feature("Crear FDC Test")

public class CrearEsFDCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Crear FDC Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FDC Portal Fedepalma")
    @Story("Crear FDC")
    @TmsLink("XRPRJ-1")
    public void CrearFDCEspecialPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        		getProperties().getProperty("pwd"));
        FDC.FormularioFDC();
        DEXFDC.CrearDEX("El formulario se guardo correctamente.");
        FMMFDC.CrearFMM("El formulario se guardo correctamente.");
        PolizaFDC.CrearPoliza("El formulario se guardo correctamente.");
        Incumplimiento.GenerarIncumplimiento(getProperties().getProperty("Asocia"));
        Cargas.CargaDEX(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").CargaFMM(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaCD(getProperties().getProperty("doc"), "Se cargo el archivo correctamente").CargaPoliza(getProperties().getProperty("doc"),
        		"Se cargo el archivo correctamente")
        	  .CargaIncumplimiento(getProperties().getProperty("doc"),"Se cargo el archivo correctamente").RevisarFDC();
        Radicar.RadicarFDC().FirmarFDC(getProperties().getProperty("Firma")).SalirFDC();
        
        
        
	}
	
}