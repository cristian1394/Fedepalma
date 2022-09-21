package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.FirmaGerenteMap;
import io.qameta.allure.Step;

public class FirmaGerentePage extends FirmaGerenteMap {

	public FirmaGerentePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Declaracion gerente FFP")
	public FirmaGerentePage DeclararFFP(String RPFH, String PalmisteE, String PPalmaIngresada, File folderPath) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath");
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath");
		time(2);
		click(btnSMes,folderPath, "click xpath");
		time(1);
		click(btnMes,folderPath, "click xpath");
		time(1);
		click(btnSAno,folderPath, "click xpath");
		time(1);
		click(btnAno,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnEditar,folderPath, "click xpath");
		time(19);
		clear(txtFrutoBaja,folderPath, "click xpath");
		time(1);
		writeText(txtFrutoBaja, RPFH, folderPath, PPalmaIngresada);
		time(3);
		clear(txtPalma,folderPath, "click xpath");
		time(1);
		writeText(txtPalma, PalmisteE, folderPath, PPalmaIngresada);
		time(1);
		clear(txtPalmiste,folderPath, "click xpath");
		time(1);
		writeText(txtPalmiste, PPalmaIngresada, folderPath, PPalmaIngresada);
		time(2);
		click(btnGuardar,folderPath, "click xpath");
		time(5);
		click(btnsi,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnsi,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnOK,folderPath, "click xpath");
		time(15);
		click(btnSMes,folderPath, "click xpath");
		time(1);
		click(btnMes,folderPath, "click xpath");
		time(1);
		click(btnSAno,folderPath, "click xpath");
		time(1);
		click(btnAno,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnEditar,folderPath, "click xpath");
		time(5);
		click(btnDeclarar,folderPath, "click xpath");
		time(3);
		click(btnok,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnok,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");

		return this;
	}

	@Step("Firma FFP")
	public FirmaGerentePage Firma(String Firma, File folderPath) throws Exception {

		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(15);
		click(btnFirma,folderPath, "click xpath");
		time(1);
		writeText(txtFirma, Firma, folderPath, Firma);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnEnviar,folderPath, "click xpath");
		time(5);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnSeguir,folderPath, "click xpath");
		driver.switchTo().window((String) ventana.get(0));

		return this;
	}

	@Step("Confirmar Declaracion")
	public FirmaGerentePage confirmar(File folderPath) throws Exception {

		time(9);
		captureScreen(folderPath, "Capture screen");
		time(9);
		click(btnOk,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}
}
