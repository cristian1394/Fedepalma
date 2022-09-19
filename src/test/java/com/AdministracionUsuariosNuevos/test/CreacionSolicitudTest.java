package com.AdministracionUsuariosNuevos.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;

import PagObject_AdministracionUsuariosNuevos.CrearSolicitudPage;
import PagObject_demoautomatizacion.BasePage;


@SuppressWarnings("unused")
@Listeners({ TestListener.class })
@Epic("Creacion en Usuarios Externo")
@Feature("Creacion en Usuarios Externo Test")

public class CreacionSolicitudTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	

	
	
	public void Logeo(String nameTest, File folderPath) throws Exception {

		GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
		// File folderPath =
		// BasePage.createFolder(getProperties().getProperty("nameFolder"),
		// getProperties().getProperty("path"));

		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"));

		GenerarReportePdf.setImgContador(0);
	}
	
	@Test(priority=0, description="El usuario externo realiza el proceso completo con una persona ya existente como usuario y se debe validar que la tarea le quede correctamente creada con los datos (el texto con la observación) al administrador configurable del sistema.")
    @Severity(SeverityLevel.NORMAL)
    @Description("El usuario externo realiza el proceso completo con una persona ya existente como usuario y se debe validar que la tarea le quede correctamente creada con los datos (el texto con la observación) al administrador configurable del sistema.")
    @Story("Realizar creacion completa")
    @TmsLink("XRPRJ-1")
    public void CreacionCompleta () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
        	 getProperties().getProperty("pwd"), folderPath);
        CrearSolicitud.SelecionarMenu(folderPath).Crear(folderPath).Identificacion(folderPath, getProperties().getProperty("Id")).Creacion(folderPath)
        	 .Observacion(folderPath, getProperties().getProperty("observacion")).ConfirmarCreacion(folderPath, "Tarea generada con exito");
        // MyScreenRecorder.stopRecording();

 		GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=1, description="El usuario externo realiza la solicitud de una cedula que ya tiene usuario, pero cuando le pregunta que si desea realizar la solicitud le dice “No”, le debe mostrar el mensaje y borrar la identificación.")
    @Severity(SeverityLevel.NORMAL)
    @Description("El usuario externo realiza la solicitud de una cedula que ya tiene usuario, pero cuando le pregunta que si desea realizar la solicitud le dice “No”, le debe mostrar el mensaje y borrar la identificación.")
    @Story("Cancelar Creacion")
    @TmsLink("XRPRJ-1")
    public void CancelarCreacion () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
        	 getProperties().getProperty("pwd"), folderPath);
        CrearSolicitud.SelecionarMenu(folderPath).Crear(folderPath).Identificacion(folderPath, getProperties().getProperty("Id")).CancelarCreacion(folderPath)
        	 .CancelacionCreciona(folderPath, "No se creó la solicitud"); 
        // MyScreenRecorder.stopRecording();

 		GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=2, description="Si el usuario externo no ingresa la observación, le indica que el campo es obligatorio.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Si el usuario externo no ingresa la observación, le indica que el campo es obligatorio.")
    @Story("Obsarvacion Tiene que ser campo Obligatorio")
    @TmsLink("XRPRJ-1")
    public void ObservacioObligatorio () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
	         getProperties().getProperty("pwd"), folderPath);
	    CrearSolicitud.SelecionarMenu(folderPath).Crear(folderPath).Identificacion(folderPath, getProperties().getProperty("Id")).Creacion(folderPath)
	    	 .Observacion2(folderPath);
	    // MyScreenRecorder.stopRecording();

 		GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=3, description="Al crear un Usuario debera aparecer en Administracion de solicitud de usuarios ademas tambien tiene que aparecer en la campanita de notificaciones la creacion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Al crear un Usuario debera aparecer en Administracion de solicitud de usuarios ademas tambien tiene que aparecer en la campanita de notificaciones la creacion")
    @Story("Creacion de Usuarios y muestra la creacion")
    @TmsLink("XRPRJ-1")
    public void ValidacionDeCreacionDeUsuarios () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
	         getProperties().getProperty("pwd"), folderPath);
	    CrearSolicitud1.SelecionarMenu(folderPath).Crear(folderPath).Informacion(getProperties().getProperty("nombre"), getProperties().getProperty("apellido"),
		     getProperties().getProperty("correo"), folderPath).SelecionarTU(folderPath).EnviarSolicitud("La soliciud fue envíada con éxito", folderPath)
	    	 .Notificacion(folderPath).EliminarCreacion(folderPath);
	    // MyScreenRecorder.stopRecording();

 		GenerarReportePdf.closeTemplate("");
    }
	
}