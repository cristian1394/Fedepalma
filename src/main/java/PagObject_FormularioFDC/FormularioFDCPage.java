package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.FormularioFDCMap;
import io.qameta.allure.Step;

public class FormularioFDCPage extends FormularioFDCMap {
	

	
	public FormularioFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FDC")
    public FormularioFDCPage FormularioFDC(File folderPath) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
        time(1);
        click(btnDemostracion,folderPath, "click xpath");
        time(1);
        click(btnFDC,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMesA,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
        time(4);
        captureScreen(folderPath, "Capture screen");
        return this;
    }
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioEFDC(File folderPath) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
 	  
        time(1);
        click(btnDemostracionA,folderPath, "click xpath");
        time(1);
        click(btnFDCA,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMesA,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
        time(4);
        captureScreen(folderPath, "Capture screen");
        return this;
    }
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioFDC1(File folderPath) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
 	  
        time(1);
        click(btnDemostracion,folderPath, "click xpath");
        time(1);
        click(btnFDC,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
        time(4);
        captureScreen(folderPath, "Capture screen");
        return this;
    }
	
}
