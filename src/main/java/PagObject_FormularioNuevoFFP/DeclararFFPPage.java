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
    public DeclararFFPPage DeclararFFP(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        time(2);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(3);
        click(btnEditar,folderPath, "click xpath" , Evidencia);
        time(4);
        click(btnDeclarar,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnok,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnok,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		
        return this;
    }
	
	@Step("Firma FFP")
	public DeclararFFPPage Firma(String Firma, String Resultado, File folderPath, String Evidencia) throws Exception {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(15);
		click(btnFirma,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtFirma, Firma, folderPath, Resultado, Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnEnviar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnSeguir,folderPath, "click xpath" , Evidencia);
		driver.switchTo().window((String) ventana.get(0));
		return this;
	}
	
	@Step("Salto de Pagina DCD")
	public DeclararFFPPage confirmar(String Resultado, File folderPath, String Evidencia) throws Exception {
		
		time(9);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(9);
		click(btnOk,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
		return this;
	}
}
