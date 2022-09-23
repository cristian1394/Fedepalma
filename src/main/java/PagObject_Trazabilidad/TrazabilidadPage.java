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
	public TrazabilidadPage Trazabilidad(File folderPath, String Evidencia) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
		time(1);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnTrazabilidad, "scroll " , Evidencia);
		time(1);
		click(btnTrazabilidad,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnConsultar,folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Exportar Formulario Trazabiidad")
	public TrazabilidadPage Exportar(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(10);
		ByPixel();
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}
}
