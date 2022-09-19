package com.ConsultaReporteUDD.test;

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
@Epic("Reporte Utilizacion Documentos de Demostracion")
@Feature("Reporte Utilizacion Documentos de Demostracion Test")

public class ConsultaReporteUDDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (DEX)")
    @TmsLink("XRPRJ-1")
    public void ConsultarDEXPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().Calendario().SeleccionarMes().SeleccionarDia().Calendario1().SeleccionarMes1()
        .SeleccionarDia1().Buscar();
       
	}
	
	@Test(priority=1, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (FMM)")
    @TmsLink("XRPRJ-1")
    public void ConsultarFMMPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().TD().FMM().Calendario().SeleccionarMes().SeleccionarDia().Calendario1().SeleccionarMes1()
        .SeleccionarDia1().Buscar();
        
	}

	@Test(priority=2, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (Poliza)")
    @TmsLink("XRPRJ-1")
    public void ConsultarPolizaPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().TD().Poliza().Calendario().SeleccionarMes().SeleccionarDia().Calendario1().SeleccionarMes1()
        .SeleccionarDia1().Buscar();
		
	}
	
	@Test(priority=3, description="Filtros Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros Reporte Utilizacion Documentos de Demostracion")
    @Story("Filtros RUDD")
    @TmsLink("XRPRJ-1")
    public void FiltrosRUDDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().Buscar().FE(getProperties().getProperty("Declarante")).FDCD(getProperties().getProperty("Kg"))
        .FProducto(getProperties().getProperty("Producto")).FPais(getProperties().getProperty("pais"));
		
	}
	
	@Test(priority=4, description="Exportar Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exportar Reporte Utilizacion Documentos de Demostracion")
    @Story("Exportar RUDD")
    @TmsLink("XRPRJ-1")
    public void ExportarRUDDPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().TD().Poliza().Buscar().FPais(getProperties().getProperty("pais")).Exportar();
		
	}
	
	
}
