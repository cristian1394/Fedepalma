package PagObject_ConsultaDCD;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.EditarDCDMap;
import io.qameta.allure.Step;

public class EditarDCDPage extends EditarDCDMap {

	public EditarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Editar DCD")
	public EditarDCDPage EditarDCD(String Proveedor, String CP, String kilos, File folderPath) throws Exception {
		time(1000);

		click(btnProveedor, folderPath, "click xpath");
		time(500);
		writeText(txtProveedor, Proveedor, folderPath, kilos);
		time(1000);
		click(btnCI, folderPath, "click xpath");
		time(800);
		click(btnEstado, folderPath, "click xpath");
		time(800);
		click(btnBorrador, folderPath, "click xpath");
		time(800);
		click(btnSAno, folderPath, "click xpath");
		time(800);
		click(btnAno, folderPath, "click xpath");
		time(1000);
		click(btnProducto, folderPath, "click xpath");
		time(800);
		click(btnPalma, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnBuscar, folderPath, "click xpath");
		time(9500);
		captureScreen(folderPath, "Capture screen");
		time(2000);
		click(btnEditar, folderPath, "click xpath");
		time(1000);
		ByPixel();
		time(1000);
		click(btnCP, folderPath, "click xpath");
		time(1000);
		writeText(txtCP, CP, folderPath, kilos);
		time(1000);
		click(btnKg, folderPath, "click xpath");
		time(1000);
		writeText(txtKg, kilos, folderPath, kilos);
		time(2500);
		click(btnCalendario, folderPath, "click xpath");
		time(1000);
		click(btnSelMes, folderPath, "click xpath");
		time(1000);
		click(btnSelAno, folderPath, "click xpath");
		time(1000);
		click(btnMes, folderPath, "click xpath");
		time(1000);
		click(btnDia, folderPath, "click xpath");
		time(1000);
		click(btnAdicionar, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");

		return this;
	}

	@Step("Validar Adicion CD")
	public EditarDCDPage ValidarAdicionCD(String resultado, File folderPath) throws Exception {

		time(1000);
		Assert.assertEquals(getElement(lblResultadoAdicion).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(6000);
		click(btnOk, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		// Certificado Guardado Correctamente.

		return this;
	}

	@Step("Revisar DCD")
	public EditarDCDPage RevisarDCD(File folderPath) throws Exception {

		time(3000);
		click(btnRevisar, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);

		return this;
	}

	@Step("Validar Revicion DCD")
	public EditarDCDPage ValidarRevicionDCD(String Resultado, File folderPath) throws Exception {

		time(1000);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(6000);
		click(btnOkey, folderPath, "click xpath");
		time(2000);
		ByPixel();
		// Proceso realizado exitosamente!

		return this;
	}

	@Step("Generar DCD")
	public EditarDCDPage FirmarDCD(String Firma, String Resultado, File folderPath) throws Exception {

		time(800);
		click(btnGenerar, folderPath, "click xpath");
		time(900);
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(13000);
		captureScreen(folderPath, "Capture screen");
		click(btnFirma, folderPath, "click xpath");
		time(1000);
		writeText(txtFirma, Firma, folderPath, Resultado);
		time(1000);
		click(btnEnviar, folderPath, "click xpath");
		time(5000);
		Assert.assertEquals(getElement(lblResultadoFirma).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(3000);
		click(btnSeguir, folderPath, "click xpath");
		driver.switchTo().window((String) ventana.get(0));

		return this;
	}

	@Step("Validar la generacion del DCD")
	public EditarDCDPage ValidarGenerarDCD(String Resultado, File folderPath) throws Exception {

		time(9000);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(2000);
		click(btnOks, folderPath, "click xpath");
		time(2000);
		ByPixel();
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnCancelar, folderPath, "click xpath");
		time(8000);
		// Proceso realizado exitosamente!

		return this;
	}
}
