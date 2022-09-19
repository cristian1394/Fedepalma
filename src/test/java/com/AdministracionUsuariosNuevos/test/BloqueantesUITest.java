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

import PagObject_demoautomatizacion.BasePage;


@Listeners({ TestListener.class })
@Epic("Administracion de Solicuitudes Nuevas")
@Feature("Administracion de Solicuitudes Nuevas Test")

public class BloqueantesUITest extends BaseTest{
	
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
		
	@Test(priority=0, description="Al quitar el permiso de enviar email, aunque muestre la imagen, el clic no permite enviar el correo.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Al quitar el permiso de enviar email, aunque muestre la imagen, el clic no permite enviar el correo.")
    @Story("Quitar permiso Email")
    @TmsLink("XRPRJ-1")
    public void QuitarPermisoEmail () throws Exception {
		
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).BloquearEmail(folderPath).SelecionarMenu1(folderPath).SelecionarMenu2(folderPath).EscojerTabla(folderPath)
        		  .QuitarBloqueoEmail(folderPath);
        
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=1, description="Al quitar el permiso de enviar firma, aunque muestre la imagen del check, el clic no permite quitar o poner.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Al quitar el permiso de enviar firma, aunque muestre la imagen del check, el clic no permite quitar o poner.")
    @Story("Quitar Permiso Firma")
    @TmsLink("XRPRJ-1")
    public void QuitarPermisoFirma () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).BloquearFirma(folderPath).SelecionarMenu1(folderPath).SelecionarMenu2(folderPath)
        		  .EscojerTabla(folderPath).QuitarBloqueoFirma(folderPath);
        
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=2, description="Al quitar el permiso de editar perfil, el combo no se despliega al darle clic.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Al quitar el permiso de editar perfil, el combo no se despliega al darle clic.")
    @Story("Quitar Permiso Perfil")
    @TmsLink("XRPRJ-1")
    public void QuitarPermisoPerfil () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).BloquearPerfil(folderPath).SelecionarMenu1(folderPath).SelecionarMenu2(folderPath)
        		  .EscojerTabla(folderPath).QuitarBloqueoPerfil(folderPath);
        
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=3, description="Validar que se puede Dasasociar un usuario")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que se puede Dasasociar un usuario")
    @Story("Desasociar un Usuario")
    @TmsLink("XRPRJ-1")
    public void DesasociarUsuario () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("NitB"), getProperties().getProperty("Usuario"),
			 getProperties().getProperty("pwd"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).SelecionarMenu1(folderPath).Desasociar(folderPath);
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=4, description="Al quitar el permiso de editar bloqueo, al darle clic no permite realizar la acción.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Al quitar el permiso de editar bloqueo, al darle clic no permite realizar la acción.")
    @Story("Quitar Permiso de Bloqueo")
    @TmsLink("XRPRJ-1")
    public void QuitarPermisoBoqueo () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).BloquearUsuario(folderPath).SelecionarMenu1(folderPath).SelecionarMenu2(folderPath)
        		  .EscojerTabla(folderPath).QuitarBloqueoUsuario(folderPath);
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
    }
	
	@Test(priority=5, description="Los que tengan el permiso deben funcionar en todas las opciones normalmente.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Los que tengan el permiso deben funcionar en todas las opciones normalmente.")
    @Story("Funcionamiento sin bloqueos")
    @TmsLink("XRPRJ-1")
    public void FuncionamientoSinBloqueos () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).BloquearFirma(folderPath).SelecionarMenu1(folderPath).BloquearUsuario1(folderPath).EditarPerfil(folderPath)
        		  .Enviar(folderPath).Desasociar(folderPath).SelecionarMenu2(folderPath).EscojerTabla(folderPath).QuitarBloqueoFirma(folderPath);
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
        
    }
	
	@Test(priority=6, description="Visualizar en contenedor al 100% de la página.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Visualizar en contenedor al 100% de la página.")
    @Story("Visualizar en contenedor al 100% de la página.")
    @TmsLink("XRPRJ-1")
    public void VisualizarContenedor () throws Exception {
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"));

		// MyScreenRecorder.startRecording(nomTest, folderPath);

		Logeo(nomTest, folderPath);
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath);
        Bloqueante.SelecionarMenu(folderPath).EscojerTabla(folderPath).SelecionarMenu1(folderPath).EditarPerfil1(folderPath).Enviar(folderPath).Firmar(folderPath)
        		  .BloquearUsuario1(folderPath);
     // MyScreenRecorder.stopRecording();

     		GenerarReportePdf.closeTemplate("");
    }
	
}