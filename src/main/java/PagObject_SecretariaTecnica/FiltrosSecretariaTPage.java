package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_SecretariaTecnica.FiltrosSecretariaTMap;
import io.qameta.allure.Step;

public class FiltrosSecretariaTPage extends FiltrosSecretariaTMap {
	
	
	
	public FiltrosSecretariaTPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Verificacion de Filtros")
    public FiltrosSecretariaTPage ValidarFiltrosST(String Termina, String Inicia, String DCD, File folderPath) throws Exception {

        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnFiltra,folderPath, "click xpath");
        time(1);
        click(btnTermina,folderPath, "click xpath");
        time(1);
        writeText(txtMes, Termina, folderPath, DCD);
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
        writeText(txtInicial, Inicia, folderPath, DCD);
        time(1);
        click(btnFiltrarD,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        String Comprador = getElement(lblComprador).getText();
        click(btnComprador,folderPath, "click xpath");
        time(1);
        writeText(txtComprador, Comprador, folderPath, Comprador);
        time(1);
        click(btnFiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        time(1);
        click(btnDCD,folderPath, "click xpath");
        time(1);
        click(btnfiltra,folderPath, "click xpath");
        time(1);
        click(btnDiferente,folderPath, "click xpath");
        time(1);
        writeText(txtDCD, DCD, folderPath, Comprador);
        time(1);
        click(btnfiltro,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto,folderPath, "click xpath");
        time(1);
        click(btnLista,folderPath, "click xpath");
        time(1);
        click(btnContiene,folderPath, "click xpath");
        time(1);
        writeText(txtProducto, Producto, folderPath, Producto);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Verificacion de Exportacion")
    public FiltrosSecretariaTPage ExportacionExcel(File folderPath) throws Exception {
        
		time(1);
		click(btnExportar,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		
        return this;
    }
	
}
