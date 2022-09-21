package PagObject_FormularioNuevoFFP;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.MiraFFPMap;
import io.qameta.allure.Step;

public class MiraFFPPage extends MiraFFPMap {

	public MiraFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ver FFP")
	public MiraFFPPage MirarFFP(File folderPath) throws Exception {

		time(5);
		click(btnConsultar,folderPath, "click xpath");
		time(3);
		scrollElementV(folderPath, btnLiquidacionFP, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnRProveedorFruto, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnACM, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnRFV, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnRFEM, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnRPA, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		scrollElementV(folderPath, btnARM, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnGenerarPDF,folderPath, "click xpath");
		time(8);
		click(btnSalir,folderPath, "click xpath");
		time(4);
		click(btnSi,folderPath, "click xpath");
		time(10);

		return this;
	}

}
