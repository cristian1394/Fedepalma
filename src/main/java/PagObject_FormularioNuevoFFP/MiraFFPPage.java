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
	public MiraFFPPage MirarFFP(File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnConsultar,folderPath, "click xpath" , Evidencia);
		time(3);
		scrollElementV(folderPath, btnLiquidacionFP, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnRProveedorFruto, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnACM, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnRFV, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnRFEM, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnRPA, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnARM, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnGenerarPDF,folderPath, "click xpath" , Evidencia);
		time(8);
		click(btnSalir,folderPath, "click xpath" , Evidencia);
		time(4);
		click(btnSi,folderPath, "click xpath" , Evidencia);
		time(10);

		return this;
	}

}
