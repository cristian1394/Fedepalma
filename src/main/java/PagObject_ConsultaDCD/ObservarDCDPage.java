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
    public ObservarDCDPage ObservarDCD(File folderPath, String Evidencia) throws Exception {
        time(6);
        
        click(btnLupa,folderPath, "click xpath" , Evidencia);
        time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        ByPixel();
        time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        click(btnCancelar,folderPath, "click xpath" , Evidencia);
        time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        return this;
    }
	
}
