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
	public ExepcionConsultaDCDPage ConsultaDCD(File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnProducto,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnPalma,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

	@Step("Resultado No existen datos en la busqueda")
	public ExepcionConsultaDCDPage ValidarResultadoDCD(String resultado,File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoOK).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(6);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
