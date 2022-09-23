package PagObject_FormularioNuevoFFP;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.ConsultarFFPMap;
import io.qameta.allure.Step;

public class ConsultarFFPPage extends ConsultarFFPMap {

	public ConsultarFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FFP")
	public ConsultarFFPPage Consulta_FFP(File folderPath, String Evidencia) throws Exception {

		time(7);
		click(btnFFP,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}
}
