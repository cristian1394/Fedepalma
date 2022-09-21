package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.Editar_FDCMap;
import io.qameta.allure.Step;

public class Editar_FDCPage extends Editar_FDCMap {

	public Editar_FDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FDC")
	public Editar_FDCPage FormularioFDC(File folderPath) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll ");
		click(btnDemostracion,folderPath, "click xpath");
		time(1);
		click(btnFDC,folderPath, "click xpath");
		time(2);
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
		click(btnMes, folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(4);
		captureScreen(folderPath, "Capture screen");
		return this;
	}

	@Step("Editar FDC")
	public Editar_FDCPage EditarFDC(File folderPath) throws Exception {
		time(10);

		click(btnEditar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(10);
		scrollElementV(folderPath, btnBarra, "scroll ");
		
		time(3);
		click(btnCP,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnCP,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

}
