package PagObject_FormularioFDC;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_FormularioFDC.CargarDEXMap;
import io.qameta.allure.Step;

public class CargarDEXPage extends CargarDEXMap {

	public CargarDEXPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Cagar DEX")
	public CargarDEXPage CargaDEX(String doc, String resultado, File folderPath, String Evidencia) throws Exception {
		time(2);
		
		scrollElementV(folderPath, btnCargas, "scroll " , Evidencia);
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaDEX);
		ruta.sendKeys(file.getAbsolutePath());
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar FMM")
	public CargarDEXPage CargaFMM(String doc, String resultado,File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaFMM);
		ruta.sendKeys(file.getAbsolutePath());
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar CD")
	public CargarDEXPage CargaCD(String doc, String resultado,File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaCD);
		ruta.sendKeys(file.getAbsolutePath());
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar Poliza")
	public CargarDEXPage CargaPoliza(String doc, String resultado,File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaPoliza);
		ruta.sendKeys(file.getAbsolutePath());
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar Incumplimiento")
	public CargarDEXPage CargaIncumplimiento(String doc, String resultado,File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaIncumplimiento);
		ruta.sendKeys(file.getAbsolutePath());
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Revisar FDC")
	public CargarDEXPage RevisarFDC(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(7);

		return this;
	}

	@Step("Salir FDC")
	public CargarDEXPage SalirFDC(File folderPath, String Evidencia) throws Exception {

		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnSalir,folderPath, "click xpath" , Evidencia);
		time(8);

		return this;
	}

}
