package com.ConsultaReporteUDD.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;

import PagObject_demoautomatizacion.BasePage;


@Listeners({ TestListener.class })
@Epic("Reporte Utilizacion Documentos de Demostracion")
@Feature("Reporte Utilizacion Documentos de Demostracion Test")

public class ConsultaReporteUDDTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	public void Logeo(String nameTest, File folderPath) throws Exception {

		GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
	
		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"));

		GenerarReportePdf.setImgContador(0);
	}
		
	@Test(priority=0, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (DEX)")
    @TmsLink("XRPRJ-1")
    public void ConsultarDEXPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().Calendario().SeleccionarMes().SeleccionarDia().Calendario1().SeleccionarMes1()
        .SeleccionarDia1().Buscar();
        
         // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
       
	}
	
	@Test(priority=1, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (FMM)")
    @TmsLink("XRPRJ-1")
    public void ConsultarFMMPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().TD().FMM().Calendario().SeleccionarMes().SeleccionarDia().Calendario1().SeleccionarMes1()
        .SeleccionarDia1().Buscar();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
	}

	@Test(priority=2, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (Poliza)")
    @TmsLink("XRPRJ-1")
    public void ConsultarPolizaPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().TD().Poliza().Calendario().SeleccionarMes().SeleccionarDia().Calendario1().SeleccionarMes1()
        .SeleccionarDia1().Buscar();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
		
	}
	
	@Test(priority=3, description="Filtros Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros Reporte Utilizacion Documentos de Demostracion")
    @Story("Filtros RUDD")
    @TmsLink("XRPRJ-1")
    public void FiltrosRUDDPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().Buscar().FE(getProperties().getProperty("Declarante")).FDCD(getProperties().getProperty("Kg"))
        .FProducto(getProperties().getProperty("Producto")).FPais(getProperties().getProperty("pais"));
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
		
	}
	
	@Test(priority=4, description="Exportar Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exportar Reporte Utilizacion Documentos de Demostracion")
    @Story("Exportar RUDD")
    @TmsLink("XRPRJ-1")
    public void ExportarRUDDPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ConsultaRUDD.MenuRUDD().TD().Poliza().Buscar().FPais(getProperties().getProperty("pais")).Exportar();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
		
	}
	
	
}
