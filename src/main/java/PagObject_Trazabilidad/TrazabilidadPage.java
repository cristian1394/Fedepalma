package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.TrazabilidadMap;
import io.qameta.allure.Step;

public class TrazabilidadPage extends TrazabilidadMap {

	public TrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Rellenar Trazabilidad")
	public TrazabilidadPage Trazabilidad(File folderPath) throws Exception {
		time(2000);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		time(1000);
		click(btnDemostracion,folderPath, "click xpath");
		time(2000);
		scrollElementV(folderPath, btnTrazabilidad, "scroll ");
		time(1000);
		click(btnTrazabilidad,folderPath, "click xpath");
		time(800);
		click(btnSMes,folderPath, "click xpath");
		time(800);
		click(btnMes,folderPath, "click xpath");
		time(800);
		click(btnSAno,folderPath, "click xpath");
		time(800);
		click(btnAno,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnConsultar,folderPath, "click xpath");
		time(2500);
		captureScreen(folderPath, "Capture screen");

		return this;
	}

	@Step("Exportar Formulario Trazabiidad")
	public TrazabilidadPage Exportar(File folderPath) throws Exception {

		time(1000);
		click(btnExportar,folderPath, "click xpath");
		time(10000);
		ByPixel();
		time(500);
		captureScreen(folderPath, "Capture screen");
		time(1000);

		return this;
	}
}
