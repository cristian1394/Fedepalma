package PagObject_ConsultaDCD;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.GenerarDCDMap;
import io.qameta.allure.Step;

public class GenerarDCDPage extends GenerarDCDMap {

	
	public GenerarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Generar DCD")
    public GenerarDCDPage GenerarDCD(File folderPath) throws Exception {
        time(1);
        
        click(btnDemostracion,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(1);
        click(btnDCD,folderPath, "click xpath");
        time(1);
		click(btnEstado,folderPath, "click xpath");
		time(1);
		click(btnRevisado,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
		click(btnBuscar,folderPath, "click xpath");
		time(10);
		click(btnSeleccion,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		ByPixel();
		time(1);
		click(btnGenerar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnFirmar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		
		
        return this;
    }
	
	@Step("Firma DCD")
	public GenerarDCDPage Firma(String Firma, String Resultado, File folderPath) throws Exception {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(20);
		click(btnFirma,folderPath, "click xpath");
		time(1);
		writeText(txtFirma, Firma, folderPath, Resultado);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnEnviar,folderPath, "click xpath");
		time(5);
		Assert.assertEquals(getElement(lblResultadoFirma).getText(),Resultado);
		captureScreen(folderPath, "Capture screen");
		time(3);
		click(btnSeguir,folderPath, "click xpath");
		driver.switchTo().window((String) ventana.get(0));
        
		return this;
	}
	
	@Step("Salto de Pagina DCD")
	public GenerarDCDPage confirmar(String Resultado, File folderPath) throws Exception {
		
		time(9);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2);
        
		return this;
		
	}

}

