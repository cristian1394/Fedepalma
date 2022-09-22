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
	public FiltrosDCDPage VerificacionFiltrosDCD(String Decla, File folderPath, String Evidencia) throws Exception {

		time(5);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
		time(2);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnDCD, "scroll " , Evidencia);
		time(1);
		click(btnDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(15);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		click(btnProveedor,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnFiltra,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnContiene,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtPalma, Decla, folderPath, Decla, Evidencia);
		time(1);
		click(btnFiltrar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		String Aceite = getElement(lblProducto).getText();
		time(1);
		click(btnProducto,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtAceite, Aceite, folderPath, "texto prueba" , Evidencia);
		time(1);
		click(btnfiltrar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		String texto = getElement(lblEstadoDCD).getText();
		time(1);
		click(btnEstadoDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnfiltra,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnComienza,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtTexto, texto, folderPath, "texto prueba" , Evidencia);
		time(1);
		click(btnfiltro,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Verificacion de Exportacion DCD")
	public FiltrosDCDPage ExportacionExcel(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
