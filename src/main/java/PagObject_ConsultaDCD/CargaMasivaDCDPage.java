package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_ConsultaDCD.CargaMasivaDCDMap;
import io.qameta.allure.Step;

public class CargaMasivaDCDPage extends CargaMasivaDCDMap {

	
	public CargaMasivaDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Carga Masiva DCD")
    public CargaMasivaDCDPage CargaDCD(String Doc, File folderPath) throws Exception {
        time(1);
        
		ByPixel();
		time(1);
		click(btnCarga,folderPath, "click xpath");
		time(3);
		File file = new File(Doc);
		time(1200);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath()); 
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(5);
		click(btnOk,folderPath, "click xpath");
		time(15);
		
        
        return this;
    }
	
	@Step("Resultado de la carga masiva del DCD")
    public CargaMasivaDCDPage ValidarResultadoCargaDCD(String resultado,File folderPath) throws Exception {
		
		time(1);
		Assert.assertEquals(getElement(lblResultadoCargaArchivo).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(6);
		click(btnOkey,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
        time(2);
		
		return this;
	}
}
