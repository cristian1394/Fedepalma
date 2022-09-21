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

		time(2000);
		ByPixel();
		time(4000);
		scrollElementV(folderPath, btnlupa, "scroll ");
		time(4000);
		ByPixelA();
		time(4000);
		click(btnDiasP,folderPath, "click xpath");
		time(800);
		click(btnDiasP,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
		time(2000);
		click(btnLupa,folderPath, "click xpath");
		time(1000);
		captureScreen(folderPath, "Capture screen");
		time(2500);
		click(btnSalir,folderPath, "click xpath");
		time(1000);
		captureScreen(folderPath, "Capture screen");
		time(2500);

		return this;
	}

}
