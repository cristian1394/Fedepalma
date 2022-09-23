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
    public FiltrosFDCPage ValidarFiltrosFDC(String numero, String Kg, String Creacion, String Estado,File folderPath, String Evidencia) throws Exception {
        
        time(5);
        scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
        time(2);
        click(btnDemostracion,folderPath, "click xpath" , Evidencia);
        time(1);
        scrollElementV(folderPath, btnFDC, "scroll " , Evidencia);
        time(1);
        click(btnFDC,folderPath, "click xpath" , Evidencia);
         time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(10);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnNumero,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFiltra,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnComienza,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtNumero, numero, folderPath, Estado, Evidencia);
        time(1);
        click(btnFiltrar,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnKgPalma,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtKG, Kg, folderPath, Estado, Evidencia);
        time(1);
        click(btnfiltrar,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnKgPalmiste,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnLista,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnDiferente,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtKg, Kg, folderPath, Estado, Evidencia);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnCreacion,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnlista,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnTermina,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtTermina, Creacion, folderPath, Estado, Evidencia);
        time(1);
        click(btnFiltrarC,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnEstado,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnfiltra,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnNoContiene,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtBorrador, Estado, folderPath, Estado, Evidencia);
        time(1);
        click(btnfiltro,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        
        return this;
    }
	
	@Step("Verificacion de Exportacion FDC")
    public FiltrosFDCPage ExportacionExcel(File folderPath, String Evidencia) throws Exception {
        
		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		
        return this;
    }
	
}
