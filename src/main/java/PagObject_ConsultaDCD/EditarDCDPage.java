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
		time(1);

		click(btnProveedor, folderPath, "click xpath");
		time(1);
		writeText(txtProveedor, Proveedor, folderPath, kilos);
		time(1);
		click(btnCI, folderPath, "click xpath");
		time(1);
		click(btnEstado, folderPath, "click xpath");
		time(1);
		click(btnBorrador, folderPath, "click xpath");
		time(1);
		click(btnSAno, folderPath, "click xpath");
		time(1);
		click(btnAno, folderPath, "click xpath");
		time(1);
		click(btnProducto, folderPath, "click xpath");
		time(1);
		click(btnPalma, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar, folderPath, "click xpath");
		time(10);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnEditar, folderPath, "click xpath");
		time(1);
		ByPixel();
		time(1);
		click(btnCP, folderPath, "click xpath");
		time(1);
		writeText(txtCP, CP, folderPath, kilos);
		time(1);
		click(btnKg, folderPath, "click xpath");
		time(1);
		writeText(txtKg, kilos, folderPath, kilos);
		time(3);
		click(btnCalendario, folderPath, "click xpath");
		time(1);
		click(btnSelMes, folderPath, "click xpath");
		time(1);
		click(btnSelAno, folderPath, "click xpath");
		time(1);
		click(btnMes, folderPath, "click xpath");
		time(1);
		click(btnDia, folderPath, "click xpath");
		time(1);
		click(btnAdicionar, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");

		return this;
	}

	@Step("Validar Adicion CD")
	public EditarDCDPage ValidarAdicionCD(String resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoAdicion).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(6);
		click(btnOk, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		// Certificado Guardado Correctamente.

		return this;
	}

	@Step("Revisar DCD")
	public EditarDCDPage RevisarDCD(File folderPath) throws Exception {

		time(3);
		click(btnRevisar, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Validar Revicion DCD")
	public EditarDCDPage ValidarRevicionDCD(String Resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(6);
		click(btnOkey, folderPath, "click xpath");
		time(2);
		ByPixel();
		// Proceso realizado exitosamente!

		return this;
	}

	@Step("Generar DCD")
	public EditarDCDPage FirmarDCD(String Firma, String Resultado, File folderPath) throws Exception {

		time(1);
		click(btnGenerar, folderPath, "click xpath");
		time(1);
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(13);
		captureScreen(folderPath, "Capture screen");
		click(btnFirma, folderPath, "click xpath");
		time(1);
		writeText(txtFirma, Firma, folderPath, Resultado);
		time(1);
		click(btnEnviar, folderPath, "click xpath");
		time(5);
		Assert.assertEquals(getElement(lblResultadoFirma).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnSeguir, folderPath, "click xpath");
		driver.switchTo().window((String) ventana.get(0));

		return this;
	}

	@Step("Validar la generacion del DCD")
	public EditarDCDPage ValidarGenerarDCD(String Resultado, File folderPath) throws Exception {

		time(9);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOks, folderPath, "click xpath");
		time(2);
		ByPixel();
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnCancelar, folderPath, "click xpath");
		time(10);
		// Proceso realizado exitosamente!

		return this;
	}
}
