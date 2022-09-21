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
	public IniciacionSTPage IniciarST(File folderPath) throws Exception {
		time(5);
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		click(btnDemostracion,folderPath, "click xpath");
		time(2);
		scrollElementV(folderPath, btnSTecnica, "scroll ");
		time(1);
		click(btnSTecnica,folderPath, "click xpath");
		time(800);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

}
