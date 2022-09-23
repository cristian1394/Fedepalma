package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.ObserverFDCMap;
import io.qameta.allure.Step;

public class ObserverFDCPage extends ObserverFDCMap {

	
		
	public ObserverFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@Step("Ver FDC")
    public ObserverFDCPage VerFDC(File folderPath, String Evidencia) throws Exception {
        time(1);
        
		click(btnVer,folderPath, "click xpath" , Evidencia);
        time(23);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        ByPixel();
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
}
