package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_Trazabilidad.ExcepcionTrazabilidadMap;
import io.qameta.allure.Step;

public class ExcepcionTrazabilidadPage extends ExcepcionTrazabilidadMap {
	
	
	
	public ExcepcionTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Rellenar Trazabilidad")
    public ExcepcionTrazabilidadPage RellenarTrazabilidad(File folderPath) throws Exception {
     
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnConsultar,folderPath, "click xpath");
        time(3);
        captureScreen(folderPath, "Capture screen");

         
        return this;
    }
	
	@Step("Exportar Formulario Trazabiidad")
    public ExcepcionTrazabilidadPage ValidarResultadoTrazabilidad(String resultado, File folderPath) throws Exception {
		
		time(1);
		Assert.assertEquals(getElement(lblResultadoTrazabilidad).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(6);
        click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(3);
         
        return this;
    }
}
