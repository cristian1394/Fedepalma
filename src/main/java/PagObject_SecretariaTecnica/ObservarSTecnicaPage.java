package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_SecretariaTecnica.ObservarSTecnicaMap;
import io.qameta.allure.Step;

public class ObservarSTecnicaPage extends ObservarSTecnicaMap {

	public ObservarSTecnicaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Secretaria Tecnica")
	public ObservarSTecnicaPage VerSTecnica(String Observacion,File folderPath) throws Exception {

		time(2);
		click(btnDesplegar,folderPath, "click xpath");
		time(2);
		ByPixel();
		time(1);
		scrollElementV(folderPath, btnObservacion, "scroll ");
		time(1);
		ByPixelA();
		time(1);
		click(btnRevisar,folderPath, "click xpath");
		time(1);
		click(btnObservacion,folderPath, "click xpath");
		time(1);
		writeText(txtObservacion, Observacion, folderPath, Observacion);
		time(1);
		click(btnLupa,folderPath, "click xpath");
		time(3);
		click(btnSalir,folderPath, "click xpath");
		time(1);
		ByPixel();
		time(1);
		click(btnGuardar,folderPath, "click xpath");
		time(4);

		return this;
	}

	@Step("Resultado Guardar Secretaria Tecnica")
	public ObservarSTecnicaPage ValidarGuardarRevicion(String resultado,File folderPath) throws Exception {

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
