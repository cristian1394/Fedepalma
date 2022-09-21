package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.IniciacionTrazabilidadMap;
import io.qameta.allure.Step;

public class IniciacionTrazabilidadPage extends IniciacionTrazabilidadMap {

	public IniciacionTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Iniciar Menu Trazabilidad")
	public IniciacionTrazabilidadPage IniciarTrazabilidad(File folderPath) throws Exception {
		time(5000);
		time(2000);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		time(1000);
		click(btnDemostracion,folderPath, "click xpath");
		time(2000);
		scrollElementV(folderPath, btnTrazabilidad, "scroll ");
		time(1000);
		click(btnTrazabilidad,folderPath, "click xpath");
		time(800);
		captureScreen(folderPath, "Capture screen");
		time(2000);

		return this;
	}

}
