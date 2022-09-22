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
    public ExepcionesGenerarDCDPage GenerarDCD(File folderPath, String Evidencia) throws Exception {
		
		time(1);
		ByPixel();
		time(1);
		click(btnGenerar,folderPath, "click xpath" , Evidencia);
		time(1);
		
		return this;
	}
	
	@Step("Validar Generacion DCD")
    public ExepcionesGenerarDCDPage ValidarGeneracionDCD(String Resultado, File folderPath, String Evidencia) throws Exception {
		
		time(6);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOk,folderPath, "click xpath" , Evidencia);
        time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		
		return this;
	}
	
}
