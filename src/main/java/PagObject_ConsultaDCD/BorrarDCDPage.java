package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.BorrarDCDMap;
import io.qameta.allure.Step;

public class BorrarDCDPage extends BorrarDCDMap {

	public BorrarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Eliminar DCD")
	public BorrarDCDPage BorrarDCD(String observaciones,File folderPath) throws Exception {

		time(50);
		click(btnBorrar,folderPath, "click xpath");
		time(5);
		time(9);
		click(btnOk,folderPath, "click xpath");
		time(2);
		click(btnObs,folderPath, "click xpath");
		time(1);
		writeText(txtObs, observaciones, folderPath, observaciones);
		time(1);
		click(btnGuardar,folderPath, "click xpath");
		time(8);

		return this;
	}

	@Step("Resultado de Eliminacion del DCD")
	public BorrarDCDPage ValidarResultadoBorrarDCD(String resultado, File folderPath) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(6);
		click(btnOkey,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

}
