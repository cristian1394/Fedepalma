package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_RevisionesRYP.RevicionesRYPMap;
import io.qameta.allure.Step;

public class RevicionesRYPPage extends RevicionesRYPMap {

	public RevicionesRYPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Filtrar RYP")
	public RevicionesRYPPage FiltarRYP(String Grupo, File folderPath) throws Exception {

		time(2);
		click(btnFiltro,folderPath, "click xpath");
		time(1);
		click(btnSelect,folderPath, "click xpath");
		time(3);
		click(btnDiferente,folderPath, "click xpath");
		time(1);
		click(btnFiltra,folderPath, "click xpath");
		writeText(txtFiltra, Grupo, folderPath, Grupo);
		time(1);
		captureScreen(folderPath, "Capture screen");
		click(btnFiltrar,folderPath, "click xpath");
		time(2);

		return this;
	}

	@Step("Revicion RYP")
	public RevicionesRYPPage RevicionRYP(File folderPath) throws Exception {

		time(1);
		ByPixel();
		scrollElementV(folderPath, btnlupa, "scroll ");
		time(1);
		ByPixelA();
		time(1);
		click(btnRevisar, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Observar RYP")
	public RevicionesRYPPage ObservarRYP(String Observacion, File folderPath) throws Exception {

		time(1);
		click(btnObservacion, folderPath, "click xpath");
		time(1);
		writeText(txtObservacion, Observacion, folderPath, Observacion);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnLupa, folderPath, "click xpath");
		time(3);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnCerrar, folderPath, "click xpath");

		return this;
	}

	@Step("Guardar Revicion")
	public RevicionesRYPPage GuardarRevicion(File folderPath) throws Exception {

		time(1);
		ByPixel();
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnGuardar, folderPath, "click xpath");
		time(4);

		return this;
	}

	@Step("Resultado Guardar Revicion")
	public RevicionesRYPPage ValidarGuardarRevicion(String resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnOk, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Resultado de Guardar Revicion")
	public RevicionesRYPPage ValidarGuardarRevicion1(String resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar1).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOK, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Resultado de Guardar Revicion")
	public RevicionesRYPPage ValidarGuardarRevicion2(String resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar2).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOK, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}
}
