package PagObject_AdministracionSolicitudesNuevas;

import java.io.File;

import org.openqa.selenium.WebDriver;

import MapObject_AdministracionSolicitudesNuevas.BloqueantesMaps;
import io.qameta.allure.Step;


public class BloqueantesPage extends BloqueantesMaps {

	public BloqueantesPage(WebDriver driver) {
		super(driver);

	}

	@Step("Selecionar menu")
	public BloqueantesPage SelecionarMenu(File folderPath) throws Exception {

		time(2);
		click(Seguridad,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(PUsuarios,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Selecionar el formulario y el perfil de la lista a bloquear")
	public BloqueantesPage EscojerTabla(File folderPath) throws Exception {

		time(2);
		click(Formulario,folderPath, "click xpath");
		time(1);
		click(SIFF,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(Perfil,folderPath, "click xpath");
		time(1);
		click(Administrador,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Bloquear Email")
	public BloqueantesPage BloquearEmail(File folderPath) throws Exception {

		time(1);
		click(btnBloquearEmail, folderPath, null);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Bloquear Firma")
	public BloqueantesPage BloquearFirma(File folderPath) throws Exception {

		time(1);
		click(btnBloquearFirma,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Bloquear Perfil")
	public BloqueantesPage BloquearPerfil(File folderPath) throws Exception {

		time(1);
		click(btnBloquearPerfil,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Bloquear Eliminar")
	public BloqueantesPage BloquearEliminar(File folderPath) throws Exception {

		time(1);
		click(btnBloquearEliminar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Bloquear Usuario")
	public BloqueantesPage BloquearUsuario(File folderPath) throws Exception {

		time(1);
		click(btnBloquearUsuario,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Selecionar menu")
	public BloqueantesPage SelecionarMenu1(File folderPath) throws Exception {

		time(1);
		click(btnMenu,folderPath, "click xpath");
		time(1);
		click(Seguridad,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(SUsuariosN,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Seleccionar Enviar")
	public BloqueantesPage Email(File folderPath) throws Exception {

		time(1);
		click(btnEnviar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Seleccionar Perfil")
	public BloqueantesPage Perfil(File folderPath) throws Exception {

		time(1);
		click(btnPerfil,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Seleccionar Firma")
	public BloqueantesPage Firma(File folderPath) throws Exception {

		time(1);
		click(btnFirmar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Seleccionar Bloquear Usuario")
	public BloqueantesPage BUsuario(File folderPath) throws Exception {

		time(1);
		click(btnBloqueo,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Selecionar menu")
	public BloqueantesPage SelecionarMenu2(File folderPath) throws Exception {

		time(1);
		click(btnMenu,folderPath, "click xpath");
		time(1);
		click(Seguridad,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(PUsuarios,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Quitar Bloqueo Email")
	public BloqueantesPage QuitarBloqueoEmail(File folderPath) throws Exception {

		time(1);
		click(btnBloquearEmail,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Quitar Bloqueo Firma")
	public BloqueantesPage QuitarBloqueoFirma(File folderPath) throws Exception {

		time(1);
		click(btnBloquearFirma,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Quitar Bloqueo Perfil")
	public BloqueantesPage QuitarBloqueoPerfil(File folderPath) throws Exception {

		time(1);
		click(btnBloquearPerfil,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Quitar Bloqueo Eliminar")
	public BloqueantesPage QuitarBloqueoEliminar(File folderPath) throws Exception {

		time(1);
		click(btnBloquearEliminar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Quitar Bloqueo Usuario")
	public BloqueantesPage QuitarBloqueoUsuario(File folderPath) throws Exception {

		time(1);
		click(btnBloquearUsuario,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Enviar Correo")
	public BloqueantesPage Enviar(File folderPath) throws Exception {

		time(1);
		click(btnEnviar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnAceptar,folderPath, "click xpath");
		time(21);
		click(btnOk,folderPath, "click xpath");
		time(1);

		return this;
	}

	@Step("Firmar Usuario")
	public BloqueantesPage Firmar(File folderPath) throws Exception {

		time(1);
		click(btnFirmar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Enviar Correo")
	public BloqueantesPage BloquearUsuario1(File folderPath) throws Exception {

		time(1);
		click(btnBloqueo,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnAceptar1,folderPath, "click xpath");
		time(10);
		click(btnOk,folderPath, "click xpath");
		time(1);

		return this;
	}

	@Step("Editar Perfil")
	public BloqueantesPage EditarPerfil(File folderPath) throws Exception {

		time(1);
		click(btnPerfil,folderPath, "click xpath");
		time(1);
		click(btnlista,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnAceptar,folderPath, "click xpath");
		time(11);
		click(btnOk,folderPath, "click xpath");
		time(1);

		return this;
	}

	@Step("Editar Perfil")
	public BloqueantesPage EditarPerfil1(File folderPath) throws Exception {

		time(1);
		click(btnPerfil,folderPath, "click xpath");
		time(1);
		click(btnlista1,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnAceptar1,folderPath, "click xpath");
		time(10);
		click(btnOk,folderPath, "click xpath");
		time(1);

		return this;
	}

	@Step("Desasociar Usuario")
    public BloqueantesPage Desasociar(File folderPath) throws Exception {
		
	        time(1);
	        click(btnDesasociar,folderPath, "click xpath");
	        time(1);
	        captureScreen(folderPath, "Capture screen");
	        time(1);
	        click(btnAceptar,folderPath, "click xpath");
	        time(28);
	        click(btnOk,folderPath, "click xpath");
	        time(1);
	        captureScreen(folderPath, "Capture screen");
	        time(6);
        
        return this;
    }

	
}