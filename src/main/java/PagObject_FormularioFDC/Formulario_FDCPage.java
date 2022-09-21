package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.Formulario_FDCMap;
import io.qameta.allure.Step;

public class Formulario_FDCPage extends Formulario_FDCMap {

	public Formulario_FDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FDC")
	public Formulario_FDCPage FormularioFDC(File folderPath) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		time(1);
		click(btnDemostracion,folderPath, "click xpath");
		time(1);
		click(btnFDC,folderPath, "click xpath");
		time(1);
		click(btnEstado,folderPath, "click xpath");
		time(1);
		click(btnBorrador,folderPath, "click xpath");
		time(1);
		click(btnSAno,folderPath, "click xpath");
		time(1);
		click(btnAno,folderPath, "click xpath");
		time(1);
		click(btnSMes,folderPath, "click xpath");
		time(1);
		click(btnMes,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(4);
		captureScreen(folderPath, "Capture screen");
		return this;
	}

	@Step("Consulta FDC")
	public Formulario_FDCPage FormularioExepcionFDC(File folderPath) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		time(1);
		click(btnDemostracion,folderPath, "click xpath");
		time(1);
		click(btnFDC,folderPath, "click xpath");
		time(10);
		click(btnBuscar,folderPath, "click xpath");
		time(4);
		captureScreen(folderPath, "Capture screen");
		return this;
	}

}
