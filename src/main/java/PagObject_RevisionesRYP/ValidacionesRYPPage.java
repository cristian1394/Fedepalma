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
	public ValidacionesRYPPage ValidarFormulario(File folderPath) throws Exception {

		time(2);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll ");

		time(4);
		ByPixelA();
		time(4);
		click(btnFormulario,folderPath, "click xpath");
		time(23);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnBajar, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		driver.findElement(btnSalir).sendKeys(Keys.ESCAPE);
		time(3);

		return this;
	}

	@Step("Observar Validaciones DCD")
	public ValidacionesRYPPage ValidarDCD(File folderPath) throws Exception {

		time(1);
		scrollElementV(folderPath, btnDespliege, "scroll ");
		time(2);
		ByPixelA();
		time(1);
		click(btnDCD,folderPath, "click xpath");
		click(btnDCD,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(4);
		click(btnNDCD,folderPath, "click xpath");
		time(15);
		captureScreen(folderPath, "Capture screen");
		scrollElementV(folderPath, btnCancelar, "scroll ");

		time(2);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

}
