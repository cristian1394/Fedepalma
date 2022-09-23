package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.IniciacionRYMap;
import io.qameta.allure.Step;

public class IniciacionRYPPage extends IniciacionRYMap {

	public IniciacionRYPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Iniciar Menu RYP")
	public IniciacionRYPPage IniciarRYP(File folderPath, String Evidencia) throws Exception {
		time(5);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
		time(1);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnRYP, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnRYP,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
