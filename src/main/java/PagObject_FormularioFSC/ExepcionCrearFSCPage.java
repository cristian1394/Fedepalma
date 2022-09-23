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
    public ExepcionCrearFSCPage CrearFSC(String resultado, File folderPath, String Evidencia) throws Exception {
        time(8);
		click(btnCrear,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(6);
        click(btnOK,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
}
