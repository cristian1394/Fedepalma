package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_FormularioFDC.CargaMasivaFMMMap;
import io.qameta.allure.Step;

public class CargaMasivaFMMPage extends CargaMasivaFMMMap {

	public CargaMasivaFMMPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Carga Masiva FMM")
	public CargaMasivaFMMPage CargaFMM(String exc, String resultado, File folderPath) throws Exception {
		time(1);

		ByPixel();
		time(1);
		click(btnCargaFmm,folderPath, "click xpath");
		time(3);
		File file = new File(exc);
		time(2);
		WebElement ruta = driver.findElement(btnArchivoFmm);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		captureScreen(folderPath, "Capture screen");
		click(btnCargar,folderPath, "click xpath");
		time(6);
		Assert.assertEquals(getElement(lblResultadoCarga).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOkey,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnCancela,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

}
