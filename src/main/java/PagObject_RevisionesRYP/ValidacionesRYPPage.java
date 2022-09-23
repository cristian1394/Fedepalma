package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.ValidacionesRYPMap;
import io.qameta.allure.Step;

public class ValidacionesRYPPage extends ValidacionesRYPMap {

	public ValidacionesRYPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Validaciones Formulario")
	public ValidacionesRYPPage ValidarFormulario(File folderPath, String Evidencia) throws Exception {

		time(2);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);

		time(4);
		ByPixelA();
		time(4);
		click(btnFormulario,folderPath, "click xpath" , Evidencia);
		time(23);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnBajar, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		driver.findElement(btnSalir).sendKeys(Keys.ESCAPE);
		time(3);

		return this;
	}

	@Step("Observar Validaciones DCD")
	public ValidacionesRYPPage ValidarDCD(File folderPath, String Evidencia) throws Exception {

		time(1);
		scrollElementV(folderPath, btnDespliege, "scroll " , Evidencia);
		time(2);
		ByPixelA();
		time(1);
		click(btnDCD,folderPath, "click xpath" , Evidencia);
		click(btnDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(4);
		click(btnNDCD,folderPath, "click xpath" , Evidencia);
		time(15);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		scrollElementV(folderPath, btnCancelar, "scroll " , Evidencia);

		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
