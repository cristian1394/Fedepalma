package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.FiltrosDiasEnProcesoMap;
import io.qameta.allure.Step;

public class FiltrosDiasEnProcesoPage extends FiltrosDiasEnProcesoMap {

	public FiltrosDiasEnProcesoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Validaciones de Filtro Dias en Proceso")
	public FiltrosDiasEnProcesoPage ValidarFiltroDiasP(String Kg, File folderPath) throws Exception {

		time(2);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll ");
		time(4);
		ByPixelA();
		time(4);
		click(btnDiasP,folderPath, "click xpath");
		time(1);
		click(btnDespliege,folderPath, "click xpath");
		time(1);
		click(btnComienza,folderPath, "click xpath");
		time(1);
		writeText(txtDiasP, Kg, folderPath, Kg);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltrar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2500);

		return this;
	}

}
