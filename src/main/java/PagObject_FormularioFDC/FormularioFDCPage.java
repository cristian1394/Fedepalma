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
    public FormularioFDCPage FormularioFDC(File folderPath, String Evidencia) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
        time(1);
        click(btnDemostracion,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFDC,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesA,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
        time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        return this;
    }
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioEFDC(File folderPath, String Evidencia) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
 	  
        time(1);
        click(btnDemostracionA,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFDCA,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesA,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
        time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        return this;
    }
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioFDC1(File folderPath, String Evidencia) throws Exception {
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
 	  
        time(1);
        click(btnDemostracion,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFDC,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMes,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
        time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        return this;
    }
	
}
