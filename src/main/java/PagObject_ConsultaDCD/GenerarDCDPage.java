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
        time(1000);
        
         click(btnDemostracion,folderPath, "click xpath");
         captureScreen(folderPath, "Capture screen");
          time(1000);
         click(btnDCD,folderPath, "click xpath");
         time(800);
		click(btnEstado,folderPath, "click xpath");
		time(1000);
		click(btnRevisado,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMes,folderPath, "click xpath");
		click(btnBuscar,folderPath, "click xpath");
		time(8000);
		click(btnSeleccion,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		ByPixel();
		time(1000);
		click(btnGenerar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1500);
		click(btnFirmar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		
		
        return this;
    }
	
	@Step("Firma DCD")
	public GenerarDCDPage Firma(String Firma, String Resultado, File folderPath) throws Exception {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(20000);
		click(btnFirma,folderPath, "click xpath");
		time(1000);
		writeText(txtFirma, Firma, folderPath, Resultado);
		captureScreen(folderPath, "Capture screen");
		time(1000);
		click(btnEnviar,folderPath, "click xpath");
		time(5000);
		Assert.assertEquals(getElement(lblResultadoFirma).getText(),Resultado);
		captureScreen(folderPath, "Capture screen");
		time(3000);
		click(btnSeguir,folderPath, "click xpath");
		driver.switchTo().window((String) ventana.get(0));
        
		return this;
	}
	
	@Step("Salto de Pagina DCD")
	public GenerarDCDPage confirmar(String Resultado, File folderPath) throws Exception {
		
		time(9000);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		captureScreen(folderPath, "Capture screen");
		time(2000);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
		return this;
		
	}

}

