package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_ConsultaDCD.ObservarDCDMap;
import io.qameta.allure.Step;

public class ObservarDCDPage extends ObservarDCDMap  {


	
	public ObservarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ver DCD")
    public ObservarDCDPage ObservarDCD(File folderPath) throws Exception {
        time(6000);
        
        click(btnLupa,folderPath, "click xpath");
        time(2000);
        captureScreen(folderPath, "Capture screen");
        ByPixel();
        time(3000);
        captureScreen(folderPath, "Capture screen");
        click(btnCancelar,folderPath, "click xpath");
        time(3000);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
}
