package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_ConsultaDCD.HistorialDCDMap;
import io.qameta.allure.Step;

public class HistorialDCDPage extends HistorialDCDMap {

	
	
	public HistorialDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ver Historial DCD")
    public HistorialDCDPage HistorialDCD(File folderPath) throws Exception {
        time(1000);
        
        click(btnHistorial,folderPath, "click xpath");
        time(1000);
        captureScreen(folderPath, "Capture screen");
        time(15000);
        click(btnDCD,folderPath, "click xpath");
        time(3000);
        
        return this;
    }
	
}
