package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.ExepcionesGenerarDCDMap;
import io.qameta.allure.Step;

public class ExepcionesGenerarDCDPage extends ExepcionesGenerarDCDMap {
	
	
	
	public ExepcionesGenerarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Revicion DCD")
    public ExepcionesGenerarDCDPage GenerarDCD(File folderPath) throws Exception {
		
		time(800);
		ByPixel();
		time(1000);
		click(btnGenerar,folderPath, "click xpath");
		time(1000);
		
		return this;
	}
	
	@Step("Validar Generacion DCD")
    public ExepcionesGenerarDCDPage ValidarGeneracionDCD(String Resultado, File folderPath) throws Exception {
		
		time(6000);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnOk,folderPath, "click xpath");
        time(2000);
        captureScreen(folderPath, "Capture screen");
		
		return this;
	}
	
}
