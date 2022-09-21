package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_ConsultaDCD.RellenarDCDMap;
import io.qameta.allure.Step;

public class RellenarDCDPage extends RellenarDCDMap {


	public RellenarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Rellenar Formulario DCD")
    public RellenarDCDPage RellenarDCD(File folderPath) throws Exception {
        
//		Utilidades.waitInMs(5000);
//		WebElement Element = driver.findElement(btnDemostracion);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", Element);
        time(1);
        click(btnDemostracion,folderPath, "click xpath");
//        Utilidades.waitInMs(1);
//        WebElement Elements = driver.findElement(btnDCD);
//        JavascriptExecutor Js = (JavascriptExecutor) driver;
//        Js.executeScript("arguments[0].scrollIntoView();", Elements);
        time(1);
        captureScreen(folderPath, "Capture screen");
        time(1);
        click(btnDCD,folderPath, "click xpath");
        time(3);
        click(btnEstado,folderPath, "click xpath");
        time(1);
        click(btnBorrador,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        click(btnMesN,folderPath, "click xpath");
        time(1);
        click(btnFebrero,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(7);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
}
