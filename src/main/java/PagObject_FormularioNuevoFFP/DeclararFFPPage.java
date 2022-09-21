package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.DeclararFFPMap;
import io.qameta.allure.Step;

public class DeclararFFPPage extends DeclararFFPMap {
	
	
	
	public DeclararFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Declaracion Fiscal FFP")
    public DeclararFFPPage DeclararFFP(File folderPath) throws Exception {
        
        time(5);
        time(2);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
        time(3);
        click(btnEditar,folderPath, "click xpath");
        time(4);
        click(btnDeclarar,folderPath, "click xpath");
        time(3);
        click(btnok,folderPath, "click xpath");
        time(2);
        click(btnok,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
		
        return this;
    }
	
	@Step("Firma FFP")
	public DeclararFFPPage Firma(String Firma, String Resultado, File folderPath) throws Exception {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(15);
		click(btnFirma,folderPath, "click xpath");
		time(1);
		writeText(txtFirma, Firma, folderPath, Resultado);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnEnviar,folderPath, "click xpath");
		time(5);
		captureScreen(folderPath, "Capture screen");
		time(2);
		click(btnSeguir,folderPath, "click xpath");
		driver.switchTo().window((String) ventana.get(0));
		return this;
	}
	
	@Step("Salto de Pagina DCD")
	public DeclararFFPPage confirmar(String Resultado, File folderPath) throws Exception {
		
		time(9);
		captureScreen(folderPath, "Capture screen");
		time(9);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2);
        
		return this;
	}
}
