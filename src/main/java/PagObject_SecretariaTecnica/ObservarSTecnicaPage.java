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
	public ObservarSTecnicaPage VerSTecnica(String Observacion,File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnDesplegar,folderPath, "click xpath" , Evidencia);
		time(2);
		ByPixel();
		time(1);
		scrollElementV(folderPath, btnObservacion, "scroll " , Evidencia);
		time(1);
		ByPixelA();
		time(1);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnObservacion,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtObservacion, Observacion, folderPath, Observacion, Evidencia);
		time(1);
		click(btnLupa,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnSalir,folderPath, "click xpath" , Evidencia);
		time(1);
		ByPixel();
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(4);

		return this;
	}

	@Step("Resultado Guardar Secretaria Tecnica")
	public ObservarSTecnicaPage ValidarGuardarRevicion(String resultado,File folderPath, String Evidencia) throws Exception {

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
