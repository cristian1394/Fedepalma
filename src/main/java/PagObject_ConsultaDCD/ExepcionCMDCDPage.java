package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_ConsultaDCD.ExepcionCMDCDMap;
import io.qameta.allure.Step;

public class ExepcionCMDCDPage extends ExepcionCMDCDMap {

	public ExepcionCMDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Carga Masiva DCD")
	public ExepcionCMDCDPage CargaDCD(String DocACM, File folderPath) throws Exception {
		time(1000);

		ByPixel();
		time(1000);
		click(btnCarga,folderPath, "click xpath");
		time(2500);
		File file = new File(DocACM);
		time(1200);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath());
		time(2000);
		captureScreen(folderPath, "Capture screen");
		time(5000);
		click(btnOk,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(8000);

		return this;
	}

	@Step("Resultado de la carga masiva del DCD")
	public ExepcionCMDCDPage ValidarResultadoCargaDCD(String resultado, File folderPath) throws Exception {

		Assert.assertEquals(getElement(lblResultadoCargaArchivo).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(6000);
		click(btnOkey,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(2000);

		return this;
	}
}
