package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.FiltrosRYPMap;
import io.qameta.allure.Step;

public class FiltrosRYPPage extends FiltrosRYPMap {
	
	
	public FiltrosRYPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Verificacion de Filtros RYP")
    public FiltrosRYPPage ValidarFiltrosRYP(String Año, String inicial, String producto, String Grupo, File folderPath) throws Exception {
		
        time(2);
        click(btnAño,folderPath, "click xpath");
        time(1);
        writeText(txtAño, Año, folderPath, Grupo);
        time(1);
        click(btnFiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        String Mes = getElement(lblMes).getText();
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnFiltra,folderPath, "click xpath");
        time(1);
        click(btnContiene,folderPath, "click xpath");
        time(1);
        writeText(txtMes, Mes, folderPath, Mes);
        time(1);
        click(btnfiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
		
        click(btnDeclarante,folderPath, "click xpath");
        time(1);
        click(btnFiltro,folderPath, "click xpath");
        time(1);
        click(btnComienza,folderPath, "click xpath");
        time(1);
        writeText(txtInicial, inicial, folderPath, Mes);
        time(1);
        click(btnFiltrarD,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        click(btnProducto,folderPath, "click xpath");
        time(1);
        click(btnLista,folderPath, "click xpath");
        time(1);
        click(btnNoContiene,folderPath, "click xpath");
        time(1);
        writeText(txtProducto, producto, folderPath, Mes);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        
        time(1);
        click(btnGrupoMercado,folderPath, "click xpath");
        time(1);
        writeText(txtTexto, Grupo, folderPath, Mes);
        time(1);
        click(btnfiltro,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Verificacion de Exportacion")
    public FiltrosRYPPage ExportacionExcel(File folderPath) throws Exception {
        
		time(1);
		click(btnExportar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		
        return this;
    }
	
}
