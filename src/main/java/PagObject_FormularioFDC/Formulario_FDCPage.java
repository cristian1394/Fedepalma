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
	public Formulario_FDCPage FormularioFDC(File folderPath, String Evidencia) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
		time(1);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnFDC,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnEstado,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnBorrador,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

	@Step("Consulta FDC")
	public Formulario_FDCPage FormularioExepcionFDC(File folderPath, String Evidencia) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
		time(1);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnFDC,folderPath, "click xpath" , Evidencia);
		time(10);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

}
