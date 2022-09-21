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
	public FiltrarFFPPage FiltrarFFP(String Termine, String Inicia, String Igual, File folderPath) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath");
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath");
		time(1);
		click(btnSAno,folderPath, "click xpath");
		time(1);
		click(btnAno,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(15);

		click(btnExportar,folderPath, "click xpath");

		time(3);
		click(btnFMes,folderPath, "click xpath");
		time(2500);
		click(btnFiltro,folderPath, "click xpath");
		time(1);
		click(btnTermina,folderPath, "click xpath");
		time(1);
		writeText(txtMes, Termine, folderPath, Igual);
		time(1);
		click(btnFiltrar,folderPath, "click xpath");
		time(2);
		click(btnPalmero,folderPath, "click xpath");
		time(1);
		click(btnfiltro,folderPath, "click xpath");
		time(1);
		click(btnComienza,folderPath, "click xpath");
		time(1);
		writeText(txtPalmero, Inicia, folderPath, Igual);
		time(1);
		click(btnfiltrar,folderPath, "click xpath");
		time(2);
		click(btnTipo,folderPath, "click xpath");
		time(1);
		writeText(txtTipo, Igual, folderPath, Igual);
		time(1);
		click(btnFiltrarA,folderPath, "click xpath");
		time(1);
		click(btnExportar,folderPath, "click xpath");
		time(5);
		captureScreen(folderPath, "Capture screen");

		return this;
	}

}
