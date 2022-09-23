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
		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"),getProperties().getProperty("Evidencia"));
		
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
		
		File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"),folderPath,getProperties().getProperty("Evidencia"));
        FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath,getProperties().getProperty("Evidencia"))
        .SeleccionarMes(folderPath,getProperties().getProperty("Evidencia")).Buscar(folderPath,getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
        
        GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
   
	}
	
	@Test(priority=1, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP (DEX)")
    @TmsLink("XRPRJ-1")
    public void CrearDEXPortalFedepalma () throws Exception {
		
		// Error al consultar DCD
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
		
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"),folderPath,getProperties().getProperty("Evidencia"));
		
		FormularioFCP.FormularioFCP(folderPath,getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath,getProperties().getProperty("Evidencia"))
		    .SeleccionarMes(folderPath,getProperties().getProperty("Evidencia")).CrearFCP(folderPath,getProperties().getProperty("Evidencia"))
		    .DigitarDex(folderPath,getProperties().getProperty("Evidencia"))
			.Calendario(folderPath,getProperties().getProperty("Evidencia")).Pais(folderPath, getProperties().getProperty("Pais"),getProperties().getProperty("Evidencia"))
			.ProductosExportados(folderPath,getProperties().getProperty("Evidencia"))
			.DigitarProducto(folderPath, getProperties().getProperty("Producto"),getProperties().getProperty("Evidencia"))
			.KilosExportados(folderPath, getProperties().getProperty("kilosExpo"),getProperties().getProperty("Evidencia"))
			.Adicionar(folderPath,getProperties().getProperty("Evidencia")).DigitarProducto(folderPath, getProperties().getProperty("producto"),getProperties().getProperty("Evidencia"))
			.KilosExportados(folderPath, getProperties().getProperty("kilosExpo"),getProperties().getProperty("Evidencia"))
			.Adicionar(folderPath,getProperties().getProperty("Evidencia")).Guardar(folderPath,getProperties().getProperty("Evidencia")).ConsultarDCD(folderPath,getProperties().getProperty("Evidencia"))
			.FiltroD(folderPath,getProperties().getProperty("Evidencia")).Check(folderPath,getProperties().getProperty("Evidencia"))
			.Asociar(folderPath,getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath,getProperties().getProperty("Evidencia"))
			.CargaDEX(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente",getProperties().getProperty("Evidencia"))
			.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente",getProperties().getProperty("Evidencia")).
			RevisarFCP(folderPath,getProperties().getProperty("Evidencia")).SalirFCP(folderPath,getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}

	@Test(priority=2, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP (FMM)")
    @TmsLink("XRPRJ-1")
    public void CrearFMMPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest,folderPath);
		
		
		home.irPortal(getProperties().getProperty("url"));
		
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"),folderPath,getProperties().getProperty("Evidencia"));
		
		FormularioFCP.FormularioFCP(folderPath,getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath,getProperties().getProperty("Evidencia"))
		.SeleccionarMes(folderPath,getProperties().getProperty("Evidencia")).CrearFCP(folderPath,getProperties().getProperty("Evidencia")).DigitarFmm(folderPath,getProperties().getProperty("Evidencia"))
		.Calendario1(folderPath,getProperties().getProperty("Evidencia")).Pais1(folderPath, getProperties().getProperty("Pais"),getProperties().getProperty("Evidencia"))
		.ProductosRelacionados(folderPath,getProperties().getProperty("Evidencia"))
		.DigitarProducto(folderPath, getProperties().getProperty("Producto"),getProperties().getProperty("Evidencia")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"),getProperties().getProperty("Evidencia"))
		.Adicionar(folderPath,getProperties().getProperty("Evidencia")).DigitarProducto(folderPath, getProperties().getProperty("producto"),getProperties().getProperty("Evidencia"))
		.KilosExportados(folderPath, getProperties().getProperty("kilosExpo"),getProperties().getProperty("Evidencia"))
		.Adicionar(folderPath,getProperties().getProperty("Evidencia")).Guardar(folderPath,getProperties().getProperty("Evidencia"))
		.ConsultarDCD(folderPath,getProperties().getProperty("Evidencia")).FiltroD(folderPath,getProperties().getProperty("Evidencia")).Check(folderPath,getProperties().getProperty("Evidencia"))
		.Asociar(folderPath,getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath,getProperties().getProperty("Evidencia"))
		.CargaFMM(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente",getProperties().getProperty("Evidencia"))
		.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente",getProperties().getProperty("Evidencia")).
		RevisarFCP(folderPath,getProperties().getProperty("Evidencia")).SalirFCP(folderPath,getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=3, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP (Incumplimiento)")
    @TmsLink("XRPRJ-1")
    public void CrearIncumplimientoPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video")); 
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath,getProperties().getProperty("Evidencia"));
		
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).CrearFCP(folderPath, getProperties().getProperty("Evidencia")).DigitarIncumplimiento(folderPath, getProperties().getProperty("Evidencia")).
		ConsultarDCD(folderPath, getProperties().getProperty("Evidencia")).FiltroD(folderPath, getProperties().getProperty("Evidencia")).Check(folderPath, getProperties().getProperty("Evidencia")).Asociar(folderPath, getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath, getProperties().getProperty("Evidencia")).
		CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente" , getProperties().getProperty("Evidencia")).
		RevisarFCP(folderPath, getProperties().getProperty("Evidencia")).SalirFCP(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=4, description="Eliminar FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Eliminar FCP Portal Fedepalma")
    @Story("Eliminar FCP")
    @TmsLink("XRPRJ-1")
    public void EliminarFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video")); 
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).SeleccionarEstado(folderPath, getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
		ConsultarFCP.Eliminar(folderPath, "Operación Exitosa", getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=5, description="Historial FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Historial FCP Portal Fedepalma")
    @Story("Historial FCP")
    @TmsLink("XRPRJ-1")
    public void HistorialFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video")); 
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).Evidencia(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
		ConsultarFCP.Historial(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=6, description="Observacion FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Observacion FCP Portal Fedepalma")
    @Story("Observacion FCP")
    @TmsLink("XRPRJ-1")
    public void ObservacionFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).Evidencia(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
		ConsultarFCP.VerFDC(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=7, description="Editar FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Editar FCP Portal Fedepalma")
    @Story("Editar FCP")
    @TmsLink("XRPRJ-1")
    public void EditarFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video")); 
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).Evidencia(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
		ConsultarFCP.Editar(folderPath, getProperties().getProperty("Evidencia")).SeleccionarCausales(folderPath, getProperties().getProperty("Evidencia")).Observar(folderPath, getProperties().getProperty("Evidencia")).Lupa(folderPath, getProperties().getProperty("Evidencia")).Salir(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=8, description="Crear FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Crear FCP Portal Fedepalma")
    @Story("Crear FCP")
    @TmsLink("XRPRJ-1")
    public void CrearFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NIT"), getProperties().getProperty("USR"),
        		getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath, getProperties().getProperty("Evidencia")).SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).CrearFCP(folderPath, getProperties().getProperty("Evidencia")).DigitarDex(folderPath, getProperties().getProperty("Evidencia"))
		.Calendario(folderPath, getProperties().getProperty("Evidencia")).Pais(folderPath, getProperties().getProperty("Pais"), getProperties().getProperty("Evidencia")).ProductosExportados(folderPath, getProperties().getProperty("Evidencia"))
		.DigitarProducto(folderPath, getProperties().getProperty("Producto"), getProperties().getProperty("Evidencia")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"), getProperties().getProperty("Evidencia"))
		.Adicionar(folderPath, getProperties().getProperty("Evidencia")).DigitarProducto(folderPath, getProperties().getProperty("producto"), getProperties().getProperty("Evidencia")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"), getProperties().getProperty("Evidencia"))
		.Adicionar(folderPath, getProperties().getProperty("Evidencia")).Guardar(folderPath, getProperties().getProperty("Evidencia")).ConsultarDCD(folderPath, getProperties().getProperty("Evidencia")).FiltroD(folderPath, getProperties().getProperty("Evidencia")).Check(folderPath, getProperties().getProperty("Evidencia")).Asociar(folderPath, getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath, getProperties().getProperty("Evidencia"))
		.DigitarFmm(folderPath, getProperties().getProperty("Evidencia")).Calendario1(folderPath, getProperties().getProperty("Evidencia")).Pais1(folderPath, getProperties().getProperty("Pais"), getProperties().getProperty("Evidencia")).ProductosRelacionados(folderPath, getProperties().getProperty("Evidencia"))
		.DigitarProducto(folderPath, getProperties().getProperty("Producto"), getProperties().getProperty("Evidencia")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"), getProperties().getProperty("Evidencia"))
		.Adicionar(folderPath, getProperties().getProperty("Evidencia")).DigitarProducto(folderPath, getProperties().getProperty("producto"), getProperties().getProperty("Evidencia")).KilosExportados(folderPath, getProperties().getProperty("kilosExpo"), getProperties().getProperty("Evidencia"))
		.Adicionar(folderPath, getProperties().getProperty("Evidencia")).Guardar(folderPath, getProperties().getProperty("Evidencia")).ConsultarDCD(folderPath, getProperties().getProperty("Evidencia")).FiltroD(folderPath, getProperties().getProperty("Evidencia")).Check(folderPath, getProperties().getProperty("Evidencia")).Asociar(folderPath, getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath, getProperties().getProperty("Evidencia"))
		.DigitarIncumplimiento(folderPath, getProperties().getProperty("Evidencia")).ConsultarDCD(folderPath, getProperties().getProperty("Evidencia")).FiltroD(folderPath, getProperties().getProperty("Evidencia")).Check(folderPath, getProperties().getProperty("Evidencia")).Asociar(folderPath, getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath, getProperties().getProperty("Evidencia"))
		.CargaDEX(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente", getProperties().getProperty("Evidencia"))
		.CargaFMM(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente", getProperties().getProperty("Evidencia"))
		.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente", getProperties().getProperty("Evidencia")).
		RevisarFCP(folderPath, getProperties().getProperty("Evidencia")).RadicarFCP(folderPath, getProperties().getProperty("Evidencia")).FirmarFCP(folderPath, getProperties().getProperty("Firma"), getProperties().getProperty("Evidencia")).SalirFCP(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=9, description="Revisar en Incompleto FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revisar FCP Portal Fedepalma")
    @Story("Revisar Incompleto FCP")
    @TmsLink("XRPRJ-1")
    public void RevisarIFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath, getProperties().getProperty("Evidencia"));
		
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).Evidencia(folderPath, getProperties().getProperty("Evidencia")).Comprador(folderPath, getProperties().getProperty("NIT"), getProperties().getProperty("Evidencia")).SComprador(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia")).FNumeroDCD(folderPath, getProperties().getProperty("Evidencia"));
		ConsultarFCP.Revisar(folderPath, getProperties().getProperty("Evidencia")).SCorreo(folderPath, getProperties().getProperty("Evidencia")).ACorreo(folderPath, getProperties().getProperty("Correo"), getProperties().getProperty("Evidencia")).IngresarAVIncompleto(folderPath, getProperties().getProperty("Evidencia"))
		.VerCausales(folderPath, getProperties().getProperty("Evidencia")).SeleccionarCausal(folderPath, getProperties().getProperty("Evidencia")).Observar(folderPath,getProperties().getProperty("Observacion")).GuardarFCP(folderPath, getProperties().getProperty("Evidencia")).
		VGuardarFCP(folderPath, getProperties().getProperty("NIT"),getProperties().getProperty("USR"),getProperties().getProperty("pwd"), getProperties().getProperty("Evidencia"))
		.EditarFCP(folderPath, getProperties().getProperty("Evidencia")).AVEnviar(folderPath, getProperties().getProperty("Evidencia")).CargaOtros(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente", getProperties().getProperty("Evidencia"))
		.GuardarFCP(folderPath, getProperties().getProperty("Evidencia")).Salir(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
	
	@Test(priority=10, description="Revisar en Rechazado FCP Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Revisar FCP Portal Fedepalma")
    @Story("Revisar Rechazado FCP")
    @TmsLink("XRPRJ-1")
    public void RevisarRFCPPortalFedepalma () throws Exception {
		
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
        String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        File folderPath = BasePage.createFolder(nomTest,getProperties().getProperty("path"),  getProperties().getProperty("Evidencia"));
        MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video")); 
		Logeo(nomTest,folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFCP.FormularioFCP(folderPath, getProperties().getProperty("Evidencia")).Evidencia(folderPath, getProperties().getProperty("Evidencia")).Comprador(folderPath, getProperties().getProperty("NIT"), getProperties().getProperty("Evidencia")).SComprador(folderPath, getProperties().getProperty("Evidencia")).SeleccionarAño(folderPath, getProperties().getProperty("Evidencia"))
		.SeleccionarMes(folderPath, getProperties().getProperty("Evidencia")).Buscar(folderPath, getProperties().getProperty("Evidencia"));
		ConsultarFCP.Revisar(folderPath, getProperties().getProperty("Evidencia")).SCorreo(folderPath, getProperties().getProperty("Evidencia")).ACorreo(folderPath, getProperties().getProperty("Correo"), getProperties().getProperty("Evidencia")).IngresarAVRechazar(folderPath, getProperties().getProperty("Evidencia"))
		.VerCausales(folderPath, getProperties().getProperty("Evidencia")).SeleccionarCausal(folderPath, getProperties().getProperty("Evidencia")).Observar(folderPath,getProperties().getProperty("Observacion")).GuardarFCP(folderPath, getProperties().getProperty("Evidencia"))
		.VGuardarFCP1(folderPath, getProperties().getProperty("NIT"),getProperties().getProperty("USR"),getProperties().getProperty("pwd"), getProperties().getProperty("Evidencia"));
		FormularioFCP.ConsultarDCD(folderPath, getProperties().getProperty("Evidencia")).FiltroD(folderPath, getProperties().getProperty("Evidencia")).Check(folderPath, getProperties().getProperty("Evidencia")).Asociar(folderPath, getProperties().getProperty("Evidencia")).AdicionarFCP(folderPath, getProperties().getProperty("Evidencia"))
		.CargaDEX(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente", getProperties().getProperty("Evidencia"))
		.CargaIncumplimiento(folderPath, getProperties().getProperty("doc"), "Se cargo el archivo correctamente", getProperties().getProperty("Evidencia"))
		.RevisarFCP(folderPath, getProperties().getProperty("Evidencia")).SalirFCP(folderPath, getProperties().getProperty("Evidencia"));
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
		GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
	}
}
