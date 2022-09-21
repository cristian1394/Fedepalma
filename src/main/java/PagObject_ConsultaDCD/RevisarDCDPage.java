package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.RevisarDCDMap;
import io.qameta.allure.Step;

public class RevisarDCDPage extends RevisarDCDMap {

	public RevisarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Revisar DCD")
	public RevisarDCDPage RevisarDCD(String Proveedor, File folderPath) throws Exception {
//        Utilidades.waitInMs(1);
//        
//        WebElement Element = driver.findElement(btnDemostracion);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", Element);
		time(2);
		click(btnDemostracion,folderPath, "click xpath");
//         Utilidades.waitInMs(1);
//         WebElement Elements = driver.findElement(btnDCD);
//         JavascriptExecutor Js = (JavascriptExecutor) driver;
//         Js.executeScript("arguments[0].scrollIntoView();", Elements);
		time(2);
		click(btnDCD,folderPath, "click xpath");
		time(3);
		click(btnEstado,folderPath, "click xpath");
		time(1);
		click(btnBorrador,folderPath, "click xpath");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(5);
		click(btnSeleccion,folderPath, "click xpath");
		ByPixel();
		time(1);
		click(btnRevisar,folderPath, "click xpath");
		time(1);
		click(btnSRevisar,folderPath, "click xpath");
		time(4);

		return this;
	}

	@Step("Validar Revicion DCD")
	public RevisarDCDPage ValidarRevicionDCD(String Resultado, File folderPath) throws Exception {

		time(15);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnOk,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		// Se ha realizado el cambio de estado

		return this;
	}
}
