package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_RevisionesRYP.ObservarRevicionesMap;
import io.qameta.allure.Step;

public class ObservarRevicionesPage extends ObservarRevicionesMap {

	public ObservarRevicionesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Reviciones")
	public ObservarRevicionesPage VerRevicion(String Observacion, String Grupo, File folderPath) throws Exception {

		time(3);
		click(btnDesplegar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(3);
		ByPixel();
		time(2);
		scrollElementV(folderPath, btnlupa, "scroll ");
		time(3);
		ByPixelA();
		time(3);
		click(btnRevisar,folderPath, "click xpath");
		time(1);
		click(btnObservacion,folderPath, "click xpath");
		writeText(txtObservacion, Observacion, folderPath, Grupo);
		captureScreen(folderPath, "Capture screen");
		time(4);
		ByPixel();
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnGuardar,folderPath, "click xpath");
		time(6);

		return this;
	}

	@Step("Resultado de Revicion")
	public ObservarRevicionesPage ValidarGuardarRevicion(String resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOk,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

}
