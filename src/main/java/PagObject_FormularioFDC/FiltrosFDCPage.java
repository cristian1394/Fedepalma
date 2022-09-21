package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.FiltrosFDCMap;
import io.qameta.allure.Step;

public class FiltrosFDCPage extends FiltrosFDCMap {

	
	
	public FiltrosFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Validar Filtros FDC")
    public FiltrosFDCPage ValidarFiltrosFDC(String numero, String Kg, String Creacion, String Estado,File folderPath) throws Exception {
        
        time(5);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
        time(2);
        click(btnDemostracion,folderPath, "click xpath");
        time(1);
        scrollElementV(folderPath, btnFDC, "scroll ");
        time(1);
        click(btnFDC,folderPath, "click xpath");
         time(1);
		captureScreen(folderPath, "Capture screen");
		time(10);
		click(btnBuscar,folderPath, "click xpath");
		time(2);
        captureScreen(folderPath, "Capture screen");
        
        click(btnNumero,folderPath, "click xpath");
        time(1);
        click(btnFiltra,folderPath, "click xpath");
        time(1);
        click(btnComienza,folderPath, "click xpath");
        time(1);
        writeText(txtNumero, numero, folderPath, Estado);
        time(1);
        click(btnFiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        click(btnKgPalma,folderPath, "click xpath");
        time(1);
        writeText(txtKG, Kg, folderPath, Estado);
        time(1);
        click(btnfiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        click(btnKgPalmiste,folderPath, "click xpath");
        time(1);
        click(btnLista,folderPath, "click xpath");
        time(1);
        click(btnDiferente,folderPath, "click xpath");
        time(1);
        writeText(txtKg, Kg, folderPath, Estado);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        click(btnCreacion,folderPath, "click xpath");
        time(1);
        click(btnlista,folderPath, "click xpath");
        time(1);
        click(btnTermina,folderPath, "click xpath");
        time(1);
        writeText(txtTermina, Creacion, folderPath, Estado);
        time(1);
        click(btnFiltrarC,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        click(btnEstado,folderPath, "click xpath");
        time(1);
        click(btnfiltra,folderPath, "click xpath");
        time(1);
        click(btnNoContiene,folderPath, "click xpath");
        time(1);
        writeText(txtBorrador, Estado, folderPath, Estado);
        time(1);
        click(btnfiltro,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        
        return this;
    }
	
	@Step("Verificacion de Exportacion FDC")
    public FiltrosFDCPage ExportacionExcel(File folderPath) throws Exception {
        
		time(1);
		click(btnExportar,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
		time(3);
		
        return this;
    }
	
}
