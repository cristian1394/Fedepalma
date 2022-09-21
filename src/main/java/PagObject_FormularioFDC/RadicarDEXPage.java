package PagObject_FormularioFDC;

import java.io.File;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.RadicarDEXMap;
import io.qameta.allure.Step;

public class RadicarDEXPage extends RadicarDEXMap {
	
	

public RadicarDEXPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@Step("Radicar FDC")
public RadicarDEXPage RadicarFDC(File folderPath) throws Exception {

	time(3);
	click(btnRadicar,folderPath, "click xpath");
	time(1);
	click(btnOk,folderPath, "click xpath");
	time(1);
	click(btnCerrar,folderPath, "click xpath");
	time(1);
		
	return this;
}

@Step("Firmar FDC")
public RadicarDEXPage FirmarFDC(String Firma, File folderPath) throws Exception {
	
	ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window((String) ventana.get(1));
	time(25);
	click(btnFirma,folderPath, "click xpath");
	time(1);
	writeText(txtFirma, Firma, folderPath, Firma);
	captureScreen(folderPath, "Capture screen");
	time(1);
	click(btnEnviar,folderPath, "click xpath");
	time(3);
	captureScreen(folderPath, "Capture screen");
	click(btnSeguir,folderPath, "click xpath");
	driver.switchTo().window((String) ventana.get(0));
	
	return this;
}

@Step("Salir FDC")
public RadicarDEXPage SalirFDC(File folderPath) throws Exception {
	
	time(9);
    captureScreen(folderPath, "Capture screen");
    click(btnSalir,folderPath, "click xpath");
    time(5);
    captureScreen(folderPath, "Capture screen");
	
	return this;
}
	
}
