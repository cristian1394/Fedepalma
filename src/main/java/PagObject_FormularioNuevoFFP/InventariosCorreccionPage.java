package PagObject_FormularioNuevoFFP;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioNuevoFFP.InventariosCorreccionMap;
import io.qameta.allure.Step;

public class InventariosCorreccionPage extends InventariosCorreccionMap {

	public InventariosCorreccionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Aceite Palma Crudo")
	public InventariosCorreccionPage AceitePalma(String PalmaD, File folderPath, String Evidencia) throws Exception {

		time(2);
		scrollElementV(folderPath, txtPalmaD, "scroll " , Evidencia);
		time(1);
		clear(txtPalmaD);
		time(1);
		writeText(txtPalmaD, PalmaD, folderPath, PalmaD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Aceite Palma o Palmiste Crudo")
	public InventariosCorreccionPage AceitePalmaOPalmiste(String PalmaoPalmiste, String PalmisteD, File folderPath, String Evidencia) throws Exception {

		time(1);
		clear(txtPalmaoPalmiste);
		time(1);
		writeText(txtPalmaoPalmiste, PalmaoPalmiste, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmaoPalmisteC);
		time(1);
		writeText(txtPalmaoPalmisteC, PalmisteD, folderPath, PalmisteD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Aceite Palmiste Crudo")
	public InventariosCorreccionPage AceitePalmiste(String PalmisteA, String PalmisteC, String PalmisteD, File folderPath, String Evidencia) throws Exception {

		time(1);
		clear(txtPalmisteA);
		time(1);
		writeText(txtPalmisteA, PalmisteA, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmisteC);
		time(1);
		writeText(txtPalmisteC, PalmisteC, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmisteD);
		time(1);
		writeText(txtPalmisteD, PalmisteD, folderPath, PalmisteD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Guardar Edicion")
	public InventariosCorreccionPage GuardarEdicion(String TotalPalma, String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		clear(txtTotalPlama);
		time(1);
		writeText(txtTotalPlama, TotalPalma, folderPath, resultado, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		time(1);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSi,folderPath, "click xpath" , Evidencia);
		time(5);
		Assert.assertEquals(getElement(lblResultadoCorreccion).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(8);

		return this;
	}
}
