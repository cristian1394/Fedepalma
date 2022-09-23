package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_SecretariaTecnica.IniciacionSTMap;
import io.qameta.allure.Step;

public class IniciacionSTPage extends IniciacionSTMap {

	public IniciacionSTPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Iniciar Menu Secretaria Tecnica")
	public IniciacionSTPage IniciarST(File folderPath, String Evidencia) throws Exception {
		time(5);
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnSTecnica, "scroll " , Evidencia);
		time(1);
		click(btnSTecnica,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

}
