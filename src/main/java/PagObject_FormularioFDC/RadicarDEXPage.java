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
public RadicarDEXPage RadicarFDC(File folderPath, String Evidencia) throws Exception {

	time(3);
	click(btnRadicar,folderPath, "click xpath" , Evidencia);
	time(1);
	click(btnOk,folderPath, "click xpath" , Evidencia);
	time(1);
	click(btnCerrar,folderPath, "click xpath" , Evidencia);
	time(1);
		
	return this;
}

@Step("Firmar FDC")
public RadicarDEXPage FirmarFDC(String Firma, File folderPath, String Evidencia) throws Exception {
	
	ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window((String) ventana.get(1));
	time(25);
	click(btnFirma,folderPath, "click xpath" , Evidencia);
	time(1);
	writeText(txtFirma, Firma, folderPath, Firma, Evidencia);
	captureScreen(folderPath, "Capture screen" , Evidencia);
	time(1);
	click(btnEnviar,folderPath, "click xpath" , Evidencia);
	time(3);
	captureScreen(folderPath, "Capture screen" , Evidencia);
	click(btnSeguir,folderPath, "click xpath" , Evidencia);
	driver.switchTo().window((String) ventana.get(0));
	
	return this;
}

@Step("Salir FDC")
public RadicarDEXPage SalirFDC(File folderPath, String Evidencia) throws Exception {
	
	time(9);
    captureScreen(folderPath, "Capture screen" , Evidencia);
    click(btnSalir,folderPath, "click xpath" , Evidencia);
    time(5);
    captureScreen(folderPath, "Capture screen" , Evidencia);
	
	return this;
}
	
}
