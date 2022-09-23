package com.FormularioFSC.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;
import utilities.MyScreenRecorder;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;
import PagObject_demoautomatizacion.BasePage;


@Listeners({ TestListener.class })
@Epic("Formulario FSC")
@Feature("Formulario FSC")

public class ExepcionFSCTest extends BaseTest{
	
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
		
	@Test(priority=0, description="Validar que no debe dejar crear un FSC si no tiene Año y Mes")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no debe dejar crear un FSC si no tiene Año y Mes")
    @Story("Validar que no debe dejar crear un FSC si no tiene Año y Mes")
    @TmsLink("XRPRJ-1")
    public void ExepcionCrear () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia"));
        ECrearFSC.CrearFSC("Seleccione el año y el mes", folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=1, description="Validar que no debe dejar revisar si no se ha ingresado un DMI")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no debe dejar revisar si no se ha ingresado un DMI")
    @Story("Validar que no debe dejar revisar si no se ha ingresado un DMI")
    @TmsLink("XRPRJ-1")
    public void BuscarI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).RevisarFSC(folderPath, getProperties().getProperty("Evidencia")).ERevisarFSC("No ha asociado todos los kilogramos a un tipo de DCD", folderPath, getProperties().getProperty("Evidencia"));     
		
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=2, description="Validar que no debe dejar revisar si no se ha Cargado ningun archivo")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no debe dejar revisar si no se ha Cargado ningun archivo")
    @Story("Validar que no debe dejar revisar si no se ha Cargado ningun archivo")
    @TmsLink("XRPRJ-1")
    public void ERevisarCreacion () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarDMI(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDMI(folderPath, getProperties().getProperty("Evidencia")).AdicionarDMI("El formulario se guardo correctamente.", folderPath, getProperties().getProperty("Evidencia"))
			 .RevisarFSC(folderPath, getProperties().getProperty("Evidencia")).ERevisarFSC1(folderPath, getProperties().getProperty("Evidencia")).SalirFSC(folderPath, getProperties().getProperty("Evidencia")) .ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).BuscarFSC(folderPath, getProperties().getProperty("Evidencia")).EliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=3, description="Validar que no permita cargar otro formato que pdf en el carge FMI")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge FMI")
    @Story("Validar que no permita cargar otro formato que pdf en el carge FMI")
    @TmsLink("XRPRJ-1")
    public void ECargeFMI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarDMI(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDMI(folderPath, getProperties().getProperty("Evidencia")).AdicionarDMI("El formulario se guardo correctamente.", folderPath, getProperties().getProperty("Evidencia"))
		 .CargaFMI(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf", folderPath, getProperties().getProperty("Evidencia")).SalirFSC(folderPath, getProperties().getProperty("Evidencia"))
		 .ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).BuscarFSC(folderPath, getProperties().getProperty("Evidencia")).EliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=4, description="Validar que no permita cargar otro formato que pdf en el carge CCM")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge CCM")
    @Story("Validar que no permita cargar otro formato que pdf en el carge CCM")
    @TmsLink("XRPRJ-1")
    public void ECargeCCM () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarDMI(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDMI(folderPath, getProperties().getProperty("Evidencia")).AdicionarDMI("El formulario se guardo correctamente.", folderPath, getProperties().getProperty("Evidencia"))
		 .CargaCCM(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf", folderPath, getProperties().getProperty("Evidencia")).SalirFSC(folderPath, getProperties().getProperty("Evidencia"))
		 .ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).BuscarFSC(folderPath, getProperties().getProperty("Evidencia")).EliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=5, description="Validar que no permita cargar otro formato que pdf en el carge CIP")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge CIP")
    @Story("Validar que no permita cargar otro formato que pdf en el carge CIP")
    @TmsLink("XRPRJ-1")
    public void ECargeCIP () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarDMI(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDMI(folderPath, getProperties().getProperty("Evidencia")).AdicionarDMI("El formulario se guardo correctamente.", folderPath, getProperties().getProperty("Evidencia"))
		 .CargaCIP(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf", folderPath, getProperties().getProperty("Evidencia")).SalirFSC(folderPath, getProperties().getProperty("Evidencia"))
		 .ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).BuscarFSC(folderPath, getProperties().getProperty("Evidencia")).EliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=6, description="Validar que no permita cargar otro formato que pdf en el carge Incumplimiento")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge Incumplimiento")
    @Story("Validar que no permita cargar otro formato que pdf en el carge Incumplimiento")
    @TmsLink("XRPRJ-1")
    public void ECargeIncumplimiento () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarDMI(folderPath, getProperties().getProperty("Evidencia")).SeleccionarDMI(folderPath, getProperties().getProperty("Evidencia")).AdicionarDMI("El formulario se guardo correctamente.", folderPath, getProperties().getProperty("Evidencia"))
		 .CargaIncumplimiento(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf", folderPath, getProperties().getProperty("Evidencia")).SalirFSC(folderPath, getProperties().getProperty("Evidencia"))
		 .ConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).BuscarFSC(folderPath, getProperties().getProperty("Evidencia")).EliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia")).AceptarEliminarFSC(folderPath, getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
	@Test(priority=7, description="Validar que si no hay DIM salga el aviso (No se encontraron registros para los parámetros de búsqueda.)")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que si no hay DIM salga el aviso (No se encontraron registros para los parámetros de búsqueda.)")
    @Story("Validar que si no hay DIM salga el aviso (No se encontraron registros para los parámetros de búsqueda.)")
    @TmsLink("XRPRJ-1")
    public void EConsultaDMI () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"), folderPath, getProperties().getProperty("Evidencia"));
		FormularioFSC.FormularioFSC(folderPath, getProperties().getProperty("Evidencia")).EConsultarFSC(folderPath, getProperties().getProperty("Evidencia")).CrearFSC(folderPath, getProperties().getProperty("Evidencia")).ConsultarDMI(folderPath, getProperties().getProperty("Evidencia")).AlertaDMI("No se encontraron registros para los parámetros de búsqueda.", folderPath, getProperties().getProperty("Evidencia"));
        
		MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }

}