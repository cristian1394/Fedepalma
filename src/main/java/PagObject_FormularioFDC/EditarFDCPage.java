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
        time(2000);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
        time(1000);
        click(btnDemostracion,folderPath, "click xpath");
        time(1000);
        click(btnFDC,folderPath, "click xpath");
        time(800);
        click(btnEstado,folderPath, "click xpath");
        time(1000);
        click(btnBorrador,folderPath, "click xpath");
        time(1000);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMes,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnBuscar,folderPath, "click xpath");
        time(3500);
        captureScreen(folderPath, "Capture screen");
        return this;
    }
	
	@Step("Editar FDC")
    public EditarFDCPage EditarFDC(String doc, File folderPath) throws Exception {
        time(5000);
        
		click(btnEditar,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(10000);
        scrollElementV(folderPath, btnBarra, "scroll ");
         time(3000);
        click(btnCasual,folderPath, "click xpath");
        time(5000);
        captureScreen(folderPath, "Capture screen");
        time(200);
        click(btnOk,folderPath, "click xpath");
        time(1000);
        click(btnObservar,folderPath, "click xpath");
        time(5000);
        captureScreen(folderPath, "Capture screen");
        time(200);
        click(btnOK,folderPath, "click xpath");
        time(1000);
        click(btnLupa,folderPath, "click xpath");
        time(5000);
        captureScreen(folderPath, "Capture screen");
        time(200);
        click(btnCerrar,folderPath, "click xpath");
        time(1000);
		captureScreen(folderPath, "Capture screen");
		time(3000);
		ByPixel();
		time(1000);
        click(btnSalir,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
}
