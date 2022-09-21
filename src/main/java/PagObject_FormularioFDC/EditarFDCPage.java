package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.EditarFDCMap;
import io.qameta.allure.Step;

public class EditarFDCPage extends EditarFDCMap {

	
	
	public EditarFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FDC")
    public EditarFDCPage FormularioFDC(File folderPath) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
        time(1);
        click(btnDemostracion,folderPath, "click xpath");
        time(1);
        click(btnFDC,folderPath, "click xpath");
        time(1);
        click(btnEstado,folderPath, "click xpath");
        time(1);
        click(btnBorrador,folderPath, "click xpath");
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
	
	@Step("Editar FDC")
    public EditarFDCPage EditarFDC(String doc, File folderPath) throws Exception {
        time(5);
        
		click(btnEditar,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(10);
        scrollElementV(folderPath, btnBarra, "scroll ");
         time(3);
        click(btnCasual,folderPath, "click xpath");
        time(5);
        captureScreen(folderPath, "Capture screen");
        time(1);
        click(btnOk,folderPath, "click xpath");
        time(1);
        click(btnObservar,folderPath, "click xpath");
        time(5);
        captureScreen(folderPath, "Capture screen");
        time(1);
        click(btnOK,folderPath, "click xpath");
        time(1);
        click(btnLupa,folderPath, "click xpath");
        time(5);
        captureScreen(folderPath, "Capture screen");
        time(1);
        click(btnCerrar,folderPath, "click xpath");
        time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);
		ByPixel();
		time(1);
        click(btnSalir,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2);
        
        return this;
    }
	
}
