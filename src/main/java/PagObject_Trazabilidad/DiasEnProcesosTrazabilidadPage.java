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

		time(5000);
		click(btnConsultar,folderPath, "click xpath");
		time(5500);
		captureScreen(folderPath, "Capture screen");
		time(1000);
		ByPixel();
		time(1000);
		scrollElementV(folderPath, btnDias, "scroll ");
		time(1000);
		ByPixelA();
		time(2000);
		click(btnDiasP,folderPath, "click xpath");
		time(1000);
		click(btnDiasP,folderPath, "click xpath");
		time(800);
		captureScreen(folderPath, "Capture screen");
		time(4000);
		return this;
	}

}
