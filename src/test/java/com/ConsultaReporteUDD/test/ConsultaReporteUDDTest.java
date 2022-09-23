package com.ConsultaReporteUDD.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;
import utilities.MyScreenRecorder;

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
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

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

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"), folderPath);
        ConsultaRUDD.MenuRUDD(folderPath, getProperties().getProperty("Evidencia")).Calendario(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDia(folderPath, getProperties().getProperty("Evidencia")).Calendario1(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes1(folderPath, getProperties().getProperty("Evidencia"))
        .SeleccionarDia1(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
        
         MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
       
	}
	
	@Test(priority=1, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (FMM)")
    @TmsLink("XRPRJ-1")
    public void ConsultarFMMPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"), folderPath);
        ConsultaRUDD.MenuRUDD(folderPath, getProperties().getProperty("Evidencia")).TD(folderPath, getProperties().getProperty("Evidencia")).FMM(folderPath, getProperties().getProperty("Evidencia")).Calendario(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDia(folderPath, getProperties().getProperty("Evidencia")).Calendario1(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes1(folderPath, getProperties().getProperty("Evidencia"))
        .SeleccionarDia1(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
        
	}

	@Test(priority=2, description="Consulta Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consulta Reporte Utilizacion Documentos de Demostracion")
    @Story("Consultar RUDD (Poliza)")
    @TmsLink("XRPRJ-1")
    public void ConsultarPolizaPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"), folderPath);
        ConsultaRUDD.MenuRUDD(folderPath, getProperties().getProperty("Evidencia")).TD(folderPath, getProperties().getProperty("Evidencia")).Poliza(folderPath, getProperties().getProperty("Evidencia")).Calendario(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDia(folderPath, getProperties().getProperty("Evidencia")).Calendario1(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes1(folderPath, getProperties().getProperty("Evidencia"))
        .SeleccionarDia1(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
		
	}
	
	@Test(priority=3, description="Filtros Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Filtros Reporte Utilizacion Documentos de Demostracion")
    @Story("Filtros RUDD")
    @TmsLink("XRPRJ-1")
    public void FiltrosRUDDPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"), folderPath);
        ConsultaRUDD.MenuRUDD(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia")).FE(getProperties().getProperty("Declarante"), folderPath).FDCD(getProperties().getProperty("Kg"), folderPath)
        .FProducto(getProperties().getProperty("Producto"), folderPath).FPais(getProperties().getProperty("pais"), folderPath);
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
		
	}
	
	@Test(priority=4, description="Exportar Reporte Utilizacion Documentos de Demostracion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Exportar Reporte Utilizacion Documentos de Demostracion")
    @Story("Exportar RUDD")
    @TmsLink("XRPRJ-1")
    public void ExportarRUDDPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"), folderPath);
        ConsultaRUDD.MenuRUDD(folderPath, getProperties().getProperty("Evidencia")).TD(folderPath, getProperties().getProperty("Evidencia")).Poliza(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia")).FPais(getProperties().getProperty("pais"), folderPath).Exportar(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
		
	}
	
	
}
