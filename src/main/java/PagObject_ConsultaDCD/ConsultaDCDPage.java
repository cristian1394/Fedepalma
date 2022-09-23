package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.ConsultaDCDMap;
import io.qameta.allure.Step;

public class ConsultaDCDPage extends ConsultaDCDMap {

	public ConsultaDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta DCD")
	public ConsultaDCDPage ConsultaDCD(File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnDemostracion, folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnDCD, folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

	@Step("Revicion DCD")
	public ConsultaDCDPage RevicionDCD(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		click(btnRevisar, folderPath, "click xpath" , Evidencia);
		time(1);

		return this;
	}

	@Step("Validar Revicion DCD")
	public ConsultaDCDPage ValidarRevicionDCD(String Resultado,File folderPath, String Evidencia) throws Exception {

		time(6);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(), Resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOk, folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

}
