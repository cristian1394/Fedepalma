package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_ConsultaDCD.FiltrosDCDMap;
import io.qameta.allure.Step;

public class FiltrosDCDPage extends FiltrosDCDMap {

	public FiltrosDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Verificacion de Filtros DCD")
	public FiltrosDCDPage VerificacionFiltrosDCD(String Decla, File folderPath) throws Exception {

		time(5000);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		time(2000);
		click(btnDemostracion,folderPath, "click xpath");
		time(2000);
		scrollElementV(folderPath, btnDCD, "scroll ");
		time(1000);
		click(btnDCD,folderPath, "click xpath");
		time(800);
		captureScreen(folderPath, "Capture screen");
		time(600);
		click(btnBuscar,folderPath, "click xpath");
		time(15000);
		captureScreen(folderPath, "Capture screen");

		click(btnProveedor,folderPath, "click xpath");
		time(1500);
		click(btnFiltra,folderPath, "click xpath");
		time(1000);
		click(btnContiene,folderPath, "click xpath");
		time(800);
		writeText(txtPalma, Decla, folderPath, Decla);
		time(1000);
		click(btnFiltrar,folderPath, "click xpath");
		time(1000);
		captureScreen(folderPath, "Capture screen");

		String Aceite = getElement(lblProducto).getText();
		time(800);
		click(btnProducto,folderPath, "click xpath");
		time(900);
		writeText(txtAceite, Aceite, folderPath, Aceite);
		time(1000);
		click(btnfiltrar,folderPath, "click xpath");
		time(1000);
		captureScreen(folderPath, "Capture screen");

		String texto = getElement(lblEstadoDCD).getText();
		time(800);
		click(btnEstadoDCD,folderPath, "click xpath");
		time(1000);
		click(btnfiltra,folderPath, "click xpath");
		time(1000);
		click(btnComienza,folderPath, "click xpath");
		time(900);
		writeText(txtTexto, texto, folderPath, texto);
		time(1000);
		click(btnfiltro,folderPath, "click xpath");
		time(1000);
		captureScreen(folderPath, "Capture screen");

		return this;
	}

	@Step("Verificacion de Exportacion DCD")
	public FiltrosDCDPage ExportacionExcel(File folderPath) throws Exception {

		time(1000);
		click(btnExportar,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
		time(3000);

		return this;
	}

}
