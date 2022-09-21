package com.FormularioFSC.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;
import PagObject_demoautomatizacion.BasePage;


@Listeners({ TestListener.class })
@Epic("Formulario FSC")
@Feature("Formulario FSC")

public class FormularioFSCTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Externo)")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Externo)")
    @Story("Arrojar informacion en el usuario Externo")
    @TmsLink("XRPRJ-1")
    public void BuscarE () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        	 getProperties().getProperty("pwd"), folderPath);
        FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath);
        
        // MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=1, description="Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Interno)")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Interno)")
    @Story("Arrojar informacion en el Usuario Interno")
    @TmsLink("XRPRJ-1")
    public void BuscarI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"), getProperties().getProperty("password"), folderPath);
		FormularioFSC.FormularioFSC1(folderPath).BuscarFSC(folderPath);   
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=2, description="Validar la interfaz de creacion de un formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la interfaz de creacion de un formulario FSC")
    @Story("Validar la interfaz de creacion de un formulario FSC")
    @TmsLink("XRPRJ-1")
    public void InterfazCreacion () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=3, description="Validar que en la tabla de DMI's se muestre los DIM existentes para adjuntarlo al formulario en creacion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que en la tabla de DMI se muestre los DIM's existentes para adjuntarlo al formulario en creacion")
    @Story("DMI's Existentes")
    @TmsLink("XRPRJ-1")
    public void DMIExistentes () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
				 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=4, description="Validar que al ingresar en el tipo de documento ya este seleccionado INCUMPLIMENTO POR CANTIDADES NO DEMOSTRADAS")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de docuemnto ya este seleccionado INCUMPLIMENTO POR CANTIDADES NO DEMOSTRADAS")
    @Story("Deteminado el tipo de documento INCUMPLIMENTO POR CANTIDADES NO DEMOSTRADAS")
    @TmsLink("XRPRJ-1")
    public void ICND () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).TD(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=5, description="Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @Story("tipo de documento CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @TmsLink("XRPRJ-1")
    public void CFMI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC1(folderPath).CrearFSC(folderPath).TD(folderPath).CFMI(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=6, description="Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO INCORPORACION PROPIA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO INCORPORACION PROPIA")
    @Story("tipo de documento CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @TmsLink("XRPRJ-1")
    public void CIP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC2(folderPath).CrearFSC(folderPath).TD(folderPath).CIP(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=7, description="Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO CONTRATOS DE MANDATO")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO CONTRATOS DE MANDATO")
    @Story("tipo de documento CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @TmsLink("XRPRJ-1")
    public void CCM () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC3(folderPath).CrearFSC(folderPath).TD(folderPath).CCM(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=8, description="Validar adicionar un DMI al formulario")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar adicionar un DMI al formulario")
    @Story("Validar adicionar un DMI al formulario")
    @TmsLink("XRPRJ-1")
    public void AdicionarDMI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath).SalirFSC(folderPath)
			 .ConsultarFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath).AceptarEliminarFSC(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=9, description="Validar el carge de un FMI al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un FMI al formulario FSC")
    @Story("Validar el carge de un FMI al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeFMI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath)
			 .CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath).SalirFSC(folderPath)
			 .ConsultarFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath).AceptarEliminarFSC(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=10, description="Validar el carge de un CCM al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un CCM al formulario FSC")
    @Story("Validar el carge de un CCM al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeCCM () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath)
			 .CargaCCM(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath).SalirFSC(folderPath)
			 .ConsultarFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath).AceptarEliminarFSC(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=11, description="Validar el carge de un CIP al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un CIP al formulario FSC")
    @Story("Validar el carge de un CIP al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeCIP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath)
			 .CargaCIP(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath).SalirFSC(folderPath)
			 .ConsultarFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath).AceptarEliminarFSC(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=12, description="Validar el carge de un Incumplimiento al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un Incumplimiento al formulario FSC")
    @Story("Validar el carge de un Incumplimiento al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeIncumplimento () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath)
			 .CargaIncumplimiento(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath).SalirFSC(folderPath)
			 .ConsultarFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath).AceptarEliminarFSC(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=13, description="Validar el Resumen de demostracion del formulario FSC despues de adicionar un DMI")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el Resumen de demostracion del formulario FSC despues de adicionar un DMI")
    @Story("Resumen de demostracion")
    @TmsLink("XRPRJ-1")
    public void ResumenDemostracion () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath)
		 	 .CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
		 	 .CargaCCM(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
		 	 .CargaCIP(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
			 .CargaIncumplimiento(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
			 .ResumenDemostracion(folderPath).SalirFSC(folderPath).ConsultarFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath).AceptarEliminarFSC(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=14, description="Validar el boton Salir dentro de la creacion de un Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el boton Salir dentro de la creacion de un Formulario FSC")
    @Story("Validar el boton Salir dentro de la creacion de un Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void SalirFSC () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).SalirFSC(folderPath);
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=15, description="Validar la revicion del formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la revicion del formulario FSC")
    @Story("Validar la revicion del formulario FSC")
    @TmsLink("XRPRJ-1")
    public void RevisarFSC () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).ConsultarFSC(folderPath).CrearFSC(folderPath).ConsultarDMI(folderPath).SeleccionarDMI(folderPath).AdicionarDMI("El formulario se guardo correctamente.", folderPath)
		 	 .CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
		 	 .CargaCCM(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
		 	 .CargaCIP(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
			 .CargaIncumplimiento(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
			 .RevisarFSC(folderPath).SalirFSC(folderPath);
        
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=16, description="Validar el Historial de Formulario")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el Historial de Formulario")
    @Story("Validar el Historial de Formulario")
    @TmsLink("XRPRJ-1")
    public void VerHistorial () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
		     getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath).Historial(folderPath).CerrarHistorial(folderPath);  
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=17, description="Validar el Exportar a Excel del Historial")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el Exportar a Excel del Historial")
    @Story("Validar el Exportar a Excel del Historial")
    @TmsLink("XRPRJ-1")
    public void ExportarHistorial () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath).Historial(folderPath).ExportarHistorial(folderPath).CerrarHistorial(folderPath); 
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=18, description="Validar que la lupa muestre el formulario FSC creado")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que la lupa muestre el formulario FSC creado")
    @Story("Validar que la lupa muestre el formulario FSC creado")
    @TmsLink("XRPRJ-1")
    public void VerFSC () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath).VerFSC(folderPath);    
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=19, description="Validar la interfaz de Editar Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la interfaz de Editar Formulario FSC")
    @Story("Validar la interfaz de Editar Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void VerEdicionFSC () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath).EditarFSC(folderPath).SalirFSC1(folderPath);   
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=20, description="Validar la Edicion del Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la Edicion del Formulario FSC")
    @Story("Validar la Edicion del Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void EdicionFSC () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath).EditarFSC(folderPath).CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente", folderPath)
			 .SalirFSC1(folderPath);   
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=21, description="Validar la Eliminacion de un Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la Eliminacion de un Formulario FSC")
    @Story("Validar la Eliminacion de un Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void EliminarFSC () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));
		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath);
		FormularioFSC.FormularioFSC(folderPath).BuscarFSC(folderPath).EliminarFSC(folderPath).AceptarEliminarFSC(folderPath); 
		
		// MyScreenRecorder.stopRecording();
     	GenerarReportePdf.closeTemplate("");
    }
}