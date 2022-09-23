package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_SecretariaTecnica.DiasEnProcesoSTMap;
import io.qameta.allure.Step;

public class DiasEnProcesoSTPage extends DiasEnProcesoSTMap {

	
	public DiasEnProcesoSTPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Revicion RYP")
	public DiasEnProcesoSTPage ValidarST(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(4);
		ByPixelA();
		time(2);
		click(btnDias,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnDias,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnLupa,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnSalir,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

}
