package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.HistorialFDCMap;
import io.qameta.allure.Step;

public class HistorialFDCPage extends HistorialFDCMap {


	
	public HistorialFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ver Historial FDC")
    public HistorialFDCPage HistorialFDC(File folderPath) throws Exception {
		
        time(5);
		click(btnHistorial,folderPath, "click xpath");
        time(9);
        captureScreen(folderPath, "Capture screen");
        click(btnCerrar,folderPath, "click xpath");
        time(2);
        
        return this;
    }
	
}
