package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_FormularioFDC.CargaMasivaDEX2Map;
import io.qameta.allure.Step;

public class CargaMasivaDEX2Page extends CargaMasivaDEX2Map {

	public CargaMasivaDEX2Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Carga Masiva DEX")
	public CargaMasivaDEX2Page CargaDEX(String DocACM, String resultado, File folderPath, String Evidencia) throws Exception {
		time(1);

		ByPixel();
		time(1);
		click(btnCarga,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocACM);
		time(2);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(6);
		Assert.assertEquals(getElement(lblResultadoCarga).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(9);
		click(btnOkey,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnCancelar,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

}
