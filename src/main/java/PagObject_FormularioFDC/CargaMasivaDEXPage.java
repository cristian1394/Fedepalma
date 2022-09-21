package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_FormularioFDC.CargaMasivaDEXMap;
import io.qameta.allure.Step;

public class CargaMasivaDEXPage extends CargaMasivaDEXMap {

	public CargaMasivaDEXPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Carga Masiva DEX")
	public CargaMasivaDEXPage CargaDEX(String exc, String resultado, File folderPath) throws Exception {
		time(1);

		ByPixel();
		time(1);
		click(btnCarga,folderPath, "click xpath");
		time(2);
		File file = new File(exc);
		time(2);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnOk,folderPath, "click xpath");
		time(6);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOkey,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnCancelar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

}
