package PagObject_AdministracionSolicitudesNuevas;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import MapObject_AdministracionSolicitudesNuevas.CreacionSolicitudMaps;
import io.qameta.allure.Step;


@SuppressWarnings("unused")
public class CreacionSolicitudPage extends CreacionSolicitudMaps {

		
	public CreacionSolicitudPage(WebDriver driver) {
		super(driver);
	}
	

	@Step("Selecionar menu")
    public CreacionSolicitudPage SelecionarMenu(File folderPath) throws Exception {
        
        time(2);
        click(Seguridad, folderPath, "click seguridad");
        time(1);
        time(1);
        click(SUsuariosN, folderPath, "click s usuarios n");
        time(1);
        captureScreen(folderPath, "capture evidencia");
        time(1);
        
        return this;
    }
	
	@Step("Crear Solicitud")
    public CreacionSolicitudPage Crear(File folderPath) throws Exception {
        
		time(1);
        ByPixel();
        time(1);
        click(btnCrear, folderPath, "click crear");
        time(2);
        captureScreen(folderPath, "capture evidencia");
        time(1);
        
        return this;
    }
	
	@Step("Ingresar Identificacion")
    public CreacionSolicitudPage Identificacion(File folderPath,String Id) throws Exception {
        
        time(1);
        writeText(txtID, Id, folderPath, "escribe id");
        time(1);
        click(Nombre, folderPath, "click nombre");
        time(1);
        captureScreen(folderPath, "capture evidencia");
        time(1);
        
        return this;
    }
	
	
	@Step("Creacion de solicitud con identificacion deseada")
    public CreacionSolicitudPage Creacion(File folderPath) throws Exception {
        
        time(1);
        click(btnSi, folderPath, "click si");
        time(1);
        
        time(1);
        
        return this;
    }
	
	@Step("Cancelar Creacion")
    public CreacionSolicitudPage CancelarCreacion(File folderPath) throws Exception {
        
        time(3);
        click(btnNo, folderPath, "click no");
        time(2);
        
        time(1);
        
        return this;
    }
	
	@Step("Ingresar Observacion")
    public CreacionSolicitudPage Observacion(File folderPath,String observacion) throws Exception {
        
		time(2);
        writeText(txtObservacion, observacion, folderPath, "escribe observacion");
        time(1);
        click(btnSi, folderPath, "click si");
        time(1);
        
        time(1);
        
        return this;
    }
	
	
	@Step("Ingresar Observacion")
    public CreacionSolicitudPage Observacion2(File folderPath) throws Exception {
        
        time(4);
        click(btnSi, folderPath, "click si");
        time(1);
       
        time(2);
        
        return this;
    }
	
	@Step("Confirmar Creacion")
    public CreacionSolicitudPage ConfirmarCreacion(File folderPath,String resultado) throws Exception {
        
		time(3);
		Assert.assertEquals(getElement(lblResultadoSolicitud).getText(),resultado);
		captureScreen(folderPath,"captura Screen");
        time(2);
        click(btnOk, folderPath, "click ok");
        time(2);
       
        time(1);
        
        return this;
    }
	
	
	@Step("Confirmacion de cancelacion de la creacion")
    public CreacionSolicitudPage CancelacionCreciona(File folderPath,String resultado) throws Exception {
        
		time(3);
		Assert.assertEquals(getElement(lblResultadoSolicitud).getText(),resultado);
		captureScreen(folderPath,"captura Screen");
        time(1);
        click(btnOk, folderPath, "click ok");
        time(1);
        
        time(1);
        
        return this;
    }
	
	@Step("Eliminar Usuario")
    public CreacionSolicitudPage EliminarUsuario(File folderPath) throws Exception {
        
		
	    click(Eliminar, folderPath, "click eliminar");
	    time(2);
	    click(btnEliminar, folderPath, "click Eliminar");
	    time(1);
	    
	    time(2);
	    click(btnEliminar, folderPath, "click Eliminar");
	    time(3);
	    
        time(1);
        
        return this;
    }
	
public void numeroAleatorio()throws Exception {
		
		Random aleatorio = new Random();           
    	
   	 int min = 1;
        int max = 9;
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        int random_int2 = (int)(Math.random() * (max - min + 1) + min);
        
        driver.findElement(txtID).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}



}