package PagObject_FormularioNuevoFFP;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.InventariosMap;
import io.qameta.allure.Step;

public class InventariosPage extends InventariosMap {

	public InventariosPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Aceite Palma Crudo")
	public InventariosPage AceitePalma(String Palma, String PalmaA, String PalmaB, String PalmaC, String PalmaD, File folderPath, String Evidencia) throws Exception {

		time(2);
		scrollElementV(folderPath, txtPalma, "scroll " , Evidencia);
		time(1);
		writeText(txtPalma, Palma, folderPath, PalmaD, Evidencia);
		time(2);
		writeText(txtPalmaA, PalmaA, folderPath, PalmaD, Evidencia);
		time(1);
		writeText(txtPalmaB, PalmaB, folderPath, PalmaD, Evidencia);
		time(1);
		writeText(txtPalmaC, PalmaC, folderPath, PalmaD, Evidencia);
		time(1);
		writeText(txtPalmaD, PalmaD, folderPath, PalmaD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Aceite Palma o Palmiste Crudo")
	public InventariosPage AceitePalmaOPalmiste(String PalmaoPalmiste, String PalmaoPalmisteA, String PalmaoPalmisteB,
			String PalmaoPalmisteC, String PalmaoPalmisteD, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtPalmaoPalmiste, PalmaoPalmiste, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		writeText(txtPalmaoPalmisteA, PalmaoPalmisteA, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		writeText(txtPalmaoPalmisteB, PalmaoPalmisteB, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		writeText(txtPalmaoPalmisteC, PalmaoPalmisteC, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		writeText(txtPalmaoPalmisteD, PalmaoPalmisteD, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Aceite Palmiste Crudo")
	public InventariosPage AceitePalmiste(String Palmiste, String PalmisteA, String PalmisteB, String PalmisteC,
			String PalmisteD,File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtPalmiste, Palmiste, folderPath, PalmisteD, Evidencia);
		time(1);
		writeText(txtPalmisteA, PalmisteA, folderPath, PalmisteD, Evidencia);
		time(1);
		writeText(txtPalmisteB, PalmisteB, folderPath, PalmisteD, Evidencia);
		time(1);
		writeText(txtPalmisteC, PalmisteC, folderPath, PalmisteD, Evidencia);
		time(1);
		writeText(txtPalmisteD, PalmisteD, folderPath, PalmisteD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Total Plama Crudo")
	public InventariosPage TotalPlama(String TotalPalma,File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		writeText(txtTotalPlama, TotalPalma, folderPath, TotalPalma, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnSi,folderPath, "click xpath" , Evidencia);
		time(5);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(12);

		return this;
	}

	@Step("Total Plama Crudo")
	public InventariosPage Total_Plama(String TotalPalma, File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		writeText(txtTotalPlama, TotalPalma, folderPath, TotalPalma, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnsi,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnsi,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(12);

		return this;
	}

	@Step("Total Plama Crudo")
	public InventariosPage Total_Plama1(String TotalPalma, File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		writeText(txtTotalPlama, TotalPalma, folderPath, TotalPalma, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnSi,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSi,folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(12);

		return this;
	}
}
