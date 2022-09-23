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
	public BorrarDCDPage BorrarDCD(String observaciones,File folderPath, String Evidencia) throws Exception {

		time(50);
		click(btnBorrar,folderPath, "click xpath" , Evidencia);
		time(5);
		time(9);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnObs,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtObs, observaciones, folderPath, observaciones, Evidencia);
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(8);

		return this;
	}

	@Step("Resultado de Eliminacion del DCD")
	public BorrarDCDPage ValidarResultadoBorrarDCD(String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(6);
		click(btnOkey,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
