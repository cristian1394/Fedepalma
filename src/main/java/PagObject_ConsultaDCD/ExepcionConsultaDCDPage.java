package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.ExepcionConsultaDCDMap;
import io.qameta.allure.Step;

public class ExepcionConsultaDCDPage extends ExepcionConsultaDCDMap {

	public ExepcionConsultaDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta DCD")
	public ExepcionConsultaDCDPage ConsultaDCD(File folderPath) throws Exception {

		time(5000);
		click(btnDemostracion,folderPath, "click xpath");
		time(3000);
		click(btnDCD,folderPath, "click xpath");
		time(1000);
		click(btnSAno,folderPath, "click xpath");
		time(800);
		click(btnAno,folderPath, "click xpath");
		time(800);
		click(btnSMes,folderPath, "click xpath");
		time(800);
		click(btnMes,folderPath, "click xpath");
		time(1000);
		click(btnProducto,folderPath, "click xpath");
		time(800);
		click(btnPalma,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnBuscar,folderPath, "click xpath");
		time(3500);
		captureScreen(folderPath, "Capture screen");
		return this;
	}

	@Step("Resultado No existen datos en la busqueda")
	public ExepcionConsultaDCDPage ValidarResultadoDCD(String resultado,File folderPath) throws Exception {

		time(1000);
		Assert.assertEquals(getElement(lblResultadoOK).getText(), resultado);
		captureScreen(folderPath, "Capture screen");
		time(6000);
		click(btnOK,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(2500);

		return this;
	}

}
