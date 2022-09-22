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
	public RevicionesRYPPage FiltarRYP(String Grupo, File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnFiltro,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSelect,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnDiferente,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnFiltra,folderPath, "click xpath" , Evidencia);
		writeText(txtFiltra, Grupo, folderPath, Grupo, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		click(btnFiltrar,folderPath, "click xpath" , Evidencia);
		time(2);

		return this;
	}

	@Step("Revicion RYP")
	public RevicionesRYPPage RevicionRYP(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(1);
		ByPixelA();
		time(1);
		click(btnRevisar, folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Observar RYP")
	public RevicionesRYPPage ObservarRYP(String Observacion, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnObservacion, folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtObservacion, Observacion, folderPath, Observacion, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnLupa, folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnCerrar, folderPath, "click xpath" , Evidencia);

		return this;
	}

	@Step("Guardar Revicion")
	public RevicionesRYPPage GuardarRevicion(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnGuardar, folderPath, "click xpath" , Evidencia);
		time(4);

		return this;
	}

	@Step("Resultado Guardar Revicion")
	public RevicionesRYPPage ValidarGuardarRevicion(String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk, folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Resultado de Guardar Revicion")
	public RevicionesRYPPage ValidarGuardarRevicion1(String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar1).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOK, folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Resultado de Guardar Revicion")
	public RevicionesRYPPage ValidarGuardarRevicion2(String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar2).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOK, folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}
}
