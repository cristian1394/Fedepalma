package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import MapObject_SecretariaTecnica.ValidacionesSTMap;
import io.qameta.allure.Step;

public class ValidacionesSTPage extends ValidacionesSTMap {

	public ValidacionesSTPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Revicion RYP")
	public ValidacionesSTPage ValidarST(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(4);
		ByPixelA();
		time(4);
		click(btnFormulario,folderPath, "click xpath" , Evidencia);
		time(23);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnBajar, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		driver.findElement(btnSalir).sendKeys(Keys.ESCAPE);
		// click(btnSalir);
		time(3);
		scrollElementV(folderPath, btnDespliege, "scroll " , Evidencia);
		time(2);
		ByPixelA();
		time(2);
		click(btnDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(4);
		click(btnNDCD,folderPath, "click xpath" , Evidencia);
		time(15);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		ByPixel();
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
