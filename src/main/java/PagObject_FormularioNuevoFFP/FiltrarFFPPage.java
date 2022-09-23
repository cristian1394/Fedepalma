package PagObject_FormularioNuevoFFP;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.FiltrarFFPMap;
import io.qameta.allure.Step;

public class FiltrarFFPPage extends FiltrarFFPMap {

	public FiltrarFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Filtros FFP")
	public FiltrarFFPPage FiltrarFFP(String Termine, String Inicia, String Igual, File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(15);

		click(btnExportar,folderPath, "click xpath" , Evidencia);

		time(3);
		click(btnFMes,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnFiltro,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnTermina,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtMes, Termine, folderPath, Igual, Evidencia);
		time(1);
		click(btnFiltrar,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnPalmero,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnfiltro,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnComienza,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtPalmero, Inicia, folderPath, Igual, Evidencia);
		time(1);
		click(btnfiltrar,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnTipo,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtTipo, Igual, folderPath, Igual, Evidencia);
		time(1);
		click(btnFiltrarA,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

}
