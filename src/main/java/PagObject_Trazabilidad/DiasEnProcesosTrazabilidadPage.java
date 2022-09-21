package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.DiasEnProcesosTrazabilidadMap;
import io.qameta.allure.Step;

public class DiasEnProcesosTrazabilidadPage extends DiasEnProcesosTrazabilidadMap {

	public DiasEnProcesosTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Iniciar Menu Trazabilidad")
	public DiasEnProcesosTrazabilidadPage DiasPTrazabilidad(File folderPath) throws Exception {

		time(5);
		click(btnConsultar,folderPath, "click xpath");
		time(6);
		captureScreen(folderPath, "Capture screen");
		time(1);
		ByPixel();
		time(1);
		scrollElementV(folderPath, btnDias, "scroll ");
		time(1);
		ByPixelA();
		time(2);
		click(btnDiasP,folderPath, "click xpath");
		time(1);
		click(btnDiasP,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(4);
		return this;
	}

}
