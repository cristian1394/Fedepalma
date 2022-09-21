package PagObject_FormularioFSC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFSC.ExepcionCrearFSCMap;
import io.qameta.allure.Step;

public class ExepcionCrearFSCPage extends ExepcionCrearFSCMap {

	
	
	public ExepcionCrearFSCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear FSC")
    public ExepcionCrearFSCPage CrearFSC(String resultado, File folderPath) throws Exception {
        time(8000);
		click(btnCrear,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
        time(1000);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(6000);
        click(btnOK,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
}
