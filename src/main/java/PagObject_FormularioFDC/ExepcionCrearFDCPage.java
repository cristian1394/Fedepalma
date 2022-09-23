package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.ExepcionCrearFDCMap;
import io.qameta.allure.Step;

public class ExepcionCrearFDCPage extends ExepcionCrearFDCMap {

	
	public ExepcionCrearFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear FDC")
    public ExepcionCrearFDCPage CrearFDC(String resultado, File folderPath, String Evidencia) throws Exception {
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
