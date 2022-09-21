package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.DiasEnProcesoRYPMap;
import io.qameta.allure.Step;

public class DiasEnProcesoRYPPage extends DiasEnProcesoRYPMap {

	public DiasEnProcesoRYPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Validaciones de Filtro Dias en Proceso")
	public DiasEnProcesoRYPPage ValidarDiasEnProceso(File folderPath) throws Exception {

		time(2);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll ");
		time(4);
		ByPixelA();
		time(4);
		click(btnDiasP,folderPath, "click xpath");
		time(1);
		click(btnDiasP,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnLupa,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnSalir,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

}
