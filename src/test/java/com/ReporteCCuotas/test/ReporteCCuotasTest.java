package com.ReporteCCuotas.test;

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
@Epic("Reporte Comparativo - Cuotas")
@Feature("Reporte Comparativo - Cuotas Test")

public class ReporteCCuotasTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Validar la interfaz de Reporte Comparativo - Cuotas")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la interfaz de Reporte Comparativo - Cuotas")
    @Story("Validar la interfaz de Reporte Comparativo - Cuotas")
    @TmsLink("XRPRJ-1")
    public void PortalFedepalma1 () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ReporteCCuotas.MenuRCCuotas();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=1, description="Validar que en la interfaz de Reporte Comparativo - Cuotas se encuentre el boton Exportary validar su funcionalidad")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que en la interfaz de Reporte Comparativo - Cuotas se encuentre el boton Exportary validar su funcionalidad")
    @Story("Validar que en la interfaz de Reporte Comparativo - Cuotas se encuentre el boton Exportary validar su funcionalidad")
    @TmsLink("XRPRJ-1")
    public void PortalFedepalma2 () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ReporteCCuotas.MenuRCCuotas().Exportar();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
	}

	@Test(priority=2, description="Validar que todas las columnas de saldos deben tener separación de miles con 0 decimales")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que todas las columnas de saldos deben tener separación de miles con 0 decimales")
    @Story("Validar que todas las columnas de saldos deben tener separación de miles con 0 decimales")
    @TmsLink("XRPRJ-1")
    public void PortalFedepalma3 () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ReporteCCuotas.MenuRCCuotas().FNIT1(getProperties().getProperty("nitReporteCC")).ScrollDerecha().Evidencia();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
		
	}
	
	@Test(priority=3, description="Validar que las columnas de Fecha deben visualizarse sin la hora")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que las columnas de Fecha deben visualizarse sin la hora")
    @Story("Validar que las columnas de Fecha deben visualizarse sin la hora")
    @TmsLink("XRPRJ-1")
    public void PortalFedepalma4 () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ReporteCCuotas.MenuRCCuotas().FNIT1(getProperties().getProperty("nitReporteCC1")).ScrollDerecha1().Evidencia();
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=4, description="Validar los filtros que muestra la interfaz")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar los filtros que muestra la interfaz")
    @Story("Validar los filtros que muestra la interfaz")
    @TmsLink("XRPRJ-1")
    public void PortalFedepalma5 () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ReporteCCuotas.MenuRCCuotas().FP(getProperties().getProperty("Inicia")).FNIT(getProperties().getProperty("numero"))
        .FSCPalma(getProperties().getProperty("contiene")).FSCPalmiste(getProperties().getProperty("Kg")).ScrollDerecha1().Evidencia();
		
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=5, description="Validar la paginacion de la interfaz")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la paginacion de la interfaz")
    @Story("Validar la paginacion de la interfaz")
    @TmsLink("XRPRJ-1")
    public void PortalFedepalma6 () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        ReporteCCuotas.MenuRCCuotas().ScrollAbajo1().Paginacion();
		
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
	}
}
