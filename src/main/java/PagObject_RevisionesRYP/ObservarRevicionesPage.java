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
	public ObservarRevicionesPage VerRevicion(String Observacion, String Grupo, File folderPath, String Evidencia) throws Exception {

		time(3);
		click(btnDesplegar,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		ByPixel();
		time(2);
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(3);
		ByPixelA();
		time(3);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnObservacion,folderPath, "click xpath" , Evidencia);
		writeText(txtObservacion, Observacion, folderPath, Grupo, Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(4);
		ByPixel();
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(6);

		return this;
	}

	@Step("Resultado de Revicion")
	public ObservarRevicionesPage ValidarGuardarRevicion(String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
