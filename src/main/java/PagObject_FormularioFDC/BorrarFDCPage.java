package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.BorrarFDCMap;
import io.qameta.allure.Step;

public class BorrarFDCPage extends BorrarFDCMap {

	
	
	public BorrarFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Eliminar FDC")
    public BorrarFDCPage BorrarFDC(String resultado, File folderPath) throws Exception {
        time(8);
		click(btnBorrar,folderPath, "Capture screen");
		captureScreen(folderPath, "Capture screen");
        time(5);
        click(btnOk,folderPath, "Capture screen");
        time(1);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(6);
        click(btnOK,folderPath, "Capture screen");
        captureScreen(folderPath, "Capture screen");;
        time(2);
        
        return this;
    }
	
}
