package PagObject_FormularioFDC;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import MapObject_FormularioFDC.CargeFDCMap;
import io.qameta.allure.Step;

public class CargeFDCPage extends CargeFDCMap {

	public CargeFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Cagar DEX")
	public CargeFDCPage CagarDEX(String doc, File folderPath, String Evidencia) throws Exception {
		time(2);

		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaDEX);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnOkey,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar FMM")
	public CargeFDCPage CargaFMM(String doc, File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaFMM);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar CD")
	public CargeFDCPage CargaCD(String doc, File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaCD);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar Poliza")
	public CargeFDCPage CargaPoliza(String doc, File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaPoliza);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

}
