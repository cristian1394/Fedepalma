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
	public FirmaGerentePage DeclararFFP(String RPFH, String PalmisteE, String PPalmaIngresada, File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnEditar,folderPath, "click xpath" , Evidencia);
		time(19);
		clear(txtFrutoBaja,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtFrutoBaja, RPFH, folderPath, PPalmaIngresada, Evidencia);
		time(3);
		clear(txtPalma,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtPalma, PalmisteE, folderPath, PPalmaIngresada, Evidencia);
		time(1);
		clear(txtPalmiste,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtPalmiste, PPalmaIngresada, folderPath, PPalmaIngresada, Evidencia);
		time(2);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(5);
		click(btnsi,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnsi,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(15);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnEditar,folderPath, "click xpath" , Evidencia);
		time(5);
		click(btnDeclarar,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnok,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnok,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Firma FFP")
	public FirmaGerentePage Firma(String Firma, File folderPath, String Evidencia) throws Exception {

		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(15);
		click(btnFirma,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtFirma, Firma, folderPath, Firma, Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnEnviar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnSeguir,folderPath, "click xpath" , Evidencia);
		driver.switchTo().window((String) ventana.get(0));

		return this;
	}

	@Step("Confirmar Declaracion")
	public FirmaGerentePage confirmar(File folderPath, String Evidencia) throws Exception {

		time(9);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(9);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}
}
