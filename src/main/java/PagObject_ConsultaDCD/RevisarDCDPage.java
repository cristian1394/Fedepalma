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
//        Utilidades.waitInMs(1000);
//        
//        WebElement Element = driver.findElement(btnDemostracion);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", Element);
		time(2000);
		click(btnDemostracion,folderPath, "click xpath");
//         Utilidades.waitInMs(1000);
//         WebElement Elements = driver.findElement(btnDCD);
//         JavascriptExecutor Js = (JavascriptExecutor) driver;
//         Js.executeScript("arguments[0].scrollIntoView();", Elements);
		time(2000);
		click(btnDCD,folderPath, "click xpath");
		time(3000);
		click(btnEstado,folderPath, "click xpath");
		time(1000);
		click(btnBorrador,folderPath, "click xpath");
		time(1000);
		click(btnBuscar,folderPath, "click xpath");
		time(5000);
		click(btnSeleccion,folderPath, "click xpath");
		ByPixel();
		time(1000);
		click(btnRevisar,folderPath, "click xpath");
		time(1000);
		click(btnSRevisar,folderPath, "click xpath");
		time(4000);

		return this;
	}

	@Step("Validar Revicion DCD")
	public RevisarDCDPage ValidarRevicionDCD(String Resultado, File folderPath) throws Exception {

		time(15000);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(), Resultado);
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnOk,folderPath, "click xpath");
		time(2000);
		captureScreen(folderPath, "Capture screen");
		// Se ha realizado el cambio de estado

		return this;
	}
}
