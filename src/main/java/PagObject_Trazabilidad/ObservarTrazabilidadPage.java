package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.ObservarTrazabilidadMap;
import io.qameta.allure.Step;

public class ObservarTrazabilidadPage extends ObservarTrazabilidadMap {


	
	public ObservarTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Trazabilidad")
    public ObservarTrazabilidadPage VerTrazabilidad(File folderPath) throws Exception {

		time(800);
		click(btnVer,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
        time(10000);
        
        return this;
    }
	
}
