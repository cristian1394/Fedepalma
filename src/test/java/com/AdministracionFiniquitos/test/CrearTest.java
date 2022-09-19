package com.AdministracionFiniquitos.test;

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


@SuppressWarnings("unused")
@Listeners({ TestListener.class })
@Epic("Formulario Administracion FCP")
@Feature("Formulario Administracion FCP Test")

public class CrearTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;  
      
    }
	
	MyScreenRecorder recording;
	
	public void Logeo(String nameTest, File folderPath) throws Exception {
		
	 GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
		//File folderPath = BasePage.createFolder(getProperties().getProperty("nameFolder"),
				//getProperties().getProperty("path"));

		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"));
		
		GenerarReportePdf.setImgContador(0);
	}
	
	
	@Test(priority=0, description="Consultar Formulario Administracion FCP")
    @Severity(SeverityLevel.NORMAL)
    @Description("Consultar Formulario Administracion FCP")
    @Story("Consultar FCP")
    @TmsLink("XRPRJ-1")
    public void ConsultarFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"),folderPath);
        FormularioFCP.FormularioFCP(folderPath).SeleccionarAño(folderPath).SeleccionarMes(folderPath).Buscar(folderPath);
        
        MyScreenRecorder.stopRecording();
        
        GenerarReportePdf.closeTemplate("");
   
	}
	
	@Test(priority=1, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP (DEX)")
    @TmsLink("XRPRJ-1")
    public void CrearDEXPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"),folderPath);
		
		FormularioFCP.FormularioFCP(folderPath).SeleccionarAño(folderPath).SeleccionarMes(folderPath).CrearFCP(folderPath).DigitarDex(folderPath)
			.Calendario(folderPath).Pais(folderPath, getProperties().getProperty("Pais")).ProductosExportados(folderPath)
			.DigitarProducto(folderPath, getProperties().getProperty("Producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
			.Adicionar(folderPath).DigitarProducto(folderPath, getProperties().getProperty("producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
			.Adicionar(folderPath).Guardar(folderPath).ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath)
			.CargaDEX(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
			.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente").
			RevisarFCP(folderPath).SalirFCP(folderPath);
        
		GenerarReportePdf.closeTemplate("");
	}

	@Test(priority=2, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP (FMM)")
    @TmsLink("XRPRJ-1")
    public void CrearFMMPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		
		home.irPortal(getProperties().getProperty("url"));
		
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"),folderPath);
		
		FormularioFCP.FormularioFCP(folderPath).SeleccionarAño(folderPath).SeleccionarMes(folderPath).CrearFCP(folderPath).DigitarFmm(folderPath)
		.Calendario1(folderPath).Pais1(folderPath, getProperties().getProperty("Pais")).ProductosRelacionados(folderPath)
		.DigitarProducto(folderPath, getProperties().getProperty("Producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
		.Adicionar(folderPath).DigitarProducto(folderPath, getProperties().getProperty("producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
		.Adicionar(folderPath).Guardar(folderPath).ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath)
		.CargaFMM(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente").
		RevisarFCP(folderPath).SalirFCP(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=3, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP (Incumplimiento)")
    @TmsLink("XRPRJ-1")
    public void CrearIncumplimientoPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath);
		
		FormularioFCP.FormularioFCP(folderPath).SeleccionarAño(folderPath).SeleccionarMes(folderPath).CrearFCP(folderPath).DigitarIncumplimiento(folderPath).
		ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath).
		CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente").
		RevisarFCP(folderPath).SalirFCP(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=4, description="Eliminar FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Eliminar FCP Portal Fedepalma")
    @Story("Eliminar FCP")
    @TmsLink("XRPRJ-1")
    public void EliminarFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).SeleccionarEstado(folderPath).SeleccionarAño(folderPath).SeleccionarMes(folderPath).Buscar(folderPath);
		ConsultarFCP.Eliminar(folderPath, "Operación Exitosa");
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=5, description="Historial FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Historial FCP Portal Fedepalma")
    @Story("Historial FCP")
    @TmsLink("XRPRJ-1")
    public void HistorialFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).Evidencia(folderPath).Buscar(folderPath);
		ConsultarFCP.Historial(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=6, description="Observacion FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Observacion FCP Portal Fedepalma")
    @Story("Observacion FCP")
    @TmsLink("XRPRJ-1")
    public void ObservacionFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).Evidencia(folderPath).Buscar(folderPath);
		ConsultarFCP.VerFDC(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=7, description="Editar FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Editar FCP Portal Fedepalma")
    @Story("Editar FCP")
    @TmsLink("XRPRJ-1")
    public void EditarFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).Evidencia(folderPath).Buscar(folderPath);
		ConsultarFCP.Editar(folderPath).SeleccionarCausales(folderPath).Observar(folderPath).Lupa(folderPath).Salir(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=8, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP")
    @TmsLink("XRPRJ-1")
    public void CrearFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).SeleccionarAño(folderPath).SeleccionarMes(folderPath).CrearFCP(folderPath).DigitarDex(folderPath)
		.Calendario(folderPath).Pais(folderPath, getProperties().getProperty("Pais")).ProductosExportados(folderPath)
		.DigitarProducto(folderPath, getProperties().getProperty("Producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
		.Adicionar(folderPath).DigitarProducto(folderPath, getProperties().getProperty("producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
		.Adicionar(folderPath).Guardar(folderPath).ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath)
		.DigitarFmm(folderPath).Calendario1(folderPath).Pais1(folderPath, getProperties().getProperty("Pais")).ProductosRelacionados(folderPath)
		.DigitarProducto(folderPath, getProperties().getProperty("Producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
		.Adicionar(folderPath).DigitarProducto(folderPath, getProperties().getProperty("producto")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"))
		.Adicionar(folderPath).Guardar(folderPath).ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath)
		.DigitarIncumplimiento(folderPath).ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath)
		.CargaDEX(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		.CargaFMM(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente").
		RevisarFCP(folderPath).RadicarFCP(folderPath).FirmarFCP(folderPath, getProperties().getProperty("Firma")).SalirFCP(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=9, description="Revisar en Incompleto FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revisar FCP Portal Fedepalma")
    @Story("Revisar Incompleto FCP")
    @TmsLink("XRPRJ-1")
    public void RevisarIFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).Evidencia(folderPath).Comprador(folderPath, getProperties().getProperty("NIT")).SComprador(folderPath).Buscar(folderPath).FNumeroDCD(folderPath);
		ConsultarFCP.Revisar(folderPath).SCorreo(folderPath).ACorreo(folderPath, getProperties().getProperty("Correo")).IngresarAVIncompleto(folderPath)
		.VerCausales(folderPath).SeleccionarCausal(folderPath).Observar(folderPath,getProperties().getProperty("Observacion")).GuardarFCP(folderPath).
		VGuardarFCP(folderPath, getProperties().getProperty("NIT"),getProperties().getProperty("USR"),getProperties().getProperty("pwd"))
		.EditarFCP(folderPath).AVEnviar(folderPath).CargaOtros(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		.GuardarFCP(folderPath).Salir(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
	
	@Test(priority=10, description="Revisar en Rechazado FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revisar FCP Portal Fedepalma")
    @Story("Revisar Rechazado FCP")
    @TmsLink("XRPRJ-1")
    public void RevisarRFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"));
		
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
		FormularioFCP.FormularioFCP(folderPath).Evidencia(folderPath).Comprador(folderPath, getProperties().getProperty("NIT")).SComprador(folderPath).SeleccionarAño(folderPath)
		.SeleccionarMes(folderPath).Buscar(folderPath);
		ConsultarFCP.Revisar(folderPath).SCorreo(folderPath).ACorreo(folderPath, getProperties().getProperty("Correo")).IngresarAVRechazar(folderPath)
		.VerCausales(folderPath).SeleccionarCausal(folderPath).Observar(folderPath,getProperties().getProperty("Observacion")).GuardarFCP(folderPath)
		.VGuardarFCP1(folderPath, getProperties().getProperty("NIT"),getProperties().getProperty("USR"),getProperties().getProperty("pwd"));
		FormularioFCP.ConsultarDCD(folderPath).FiltroD(folderPath).Check(folderPath).Asociar(folderPath).AdicionarFCP(folderPath)
		.CargaDEX(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		.RevisarFCP(folderPath).SalirFCP(folderPath);
		
		GenerarReportePdf.closeTemplate("");
	}
}
