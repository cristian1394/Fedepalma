package PagObject_FormularioFDC;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import MapObject_FormularioFDC.Cargar_DEXMap;
import io.qameta.allure.Step;

public class Cargar_DEXPage extends Cargar_DEXMap {

	public Cargar_DEXPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Cagar DEX")
	public Cargar_DEXPage CargaDEX(String doc, String resultado, File folderPath, String Evidencia) throws Exception {
		
		time(2);
		scrollElementV(folderPath, btnCargas, "scroll " , Evidencia);
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaDEX);
		ruta.sendKeys(file.getAbsolutePath());
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar FMM")
	public Cargar_DEXPage CargaFMM(String doc, String resultado,File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaFMM);
		ruta.sendKeys(file.getAbsolutePath());
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar CD")
	public Cargar_DEXPage CargaCD(String doc, String resultado, File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaCD);
		ruta.sendKeys(file.getAbsolutePath());
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar Poliza")
	public Cargar_DEXPage CargaPoliza(String doc, String resultado, File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaPoliza);
		ruta.sendKeys(file.getAbsolutePath());
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Cagar Incumplimiento")
	public Cargar_DEXPage CargaIncumplimiento(String doc, String resultado, File folderPath, String Evidencia) throws Exception {
		time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaIncumplimiento);
		ruta.sendKeys(file.getAbsolutePath());
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Revisar FDC")
	public Cargar_DEXPage RevisarFDC(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(7);

		return this;
	}

	@Step("Salir FDC")
	public Cargar_DEXPage SalirFDC(File folderPath, String Evidencia) throws Exception {

		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnSalir,folderPath, "click xpath" , Evidencia);
		time(8);

		return this;
	}

}
