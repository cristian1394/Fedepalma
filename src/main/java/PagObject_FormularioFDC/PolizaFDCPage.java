package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.PolizaFDCMap;
import io.qameta.allure.Step;

public class PolizaFDCPage extends PolizaFDCMap {
	
	
	
   	public PolizaFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar a creacion FDC")
    public PolizaFDCPage CrearFDC(File folderPath) throws Exception {
	
	time(2);
    click(btnCrear,folderPath, "click xpath");
    time(1);
    captureScreen(folderPath, "Capture screen");
    time(4);
    
    return this;
}
	
	@Step("Crear poliza")
    public PolizaFDCPage CrearPoliza(String Aseguradora, String Fecha, String valor, File folderPath) throws Exception {
		
        time(4);
        ByPixelA();
        time(1);
        click(btnTDemo,folderPath, "click xpath");
        time(3);
        click(btnPoliza,folderPath, "click xpath");
        time(1);
        numeroAleatorio();
        time(1);
        click(btnAseguradora,folderPath, "click xpath");
        time(1);
        writeText(txtAseguradora, Aseguradora, folderPath, valor);
        time(4);
        click(btnCalendario,folderPath, "click xpath");
        time(2);
        writeText(txtFecha, Fecha, folderPath, valor);
        time(1);
        click(btnValor,folderPath, "click xpath");
        time(1);
        writeText(txtValor, valor, folderPath, valor);
        time(1);
        
        captureScreen(folderPath, "Capture screen");
        time(4);
        
        return this;
    }
        
    @Step("Ingresar poliza")
    public PolizaFDCPage IngresarPoliza(String Asociar, String resultado, File folderPath) throws Exception {       
        
        
        click(btnProducto,folderPath, "click xpath");
        time(1);
        click(btnPalma,folderPath, "click xpath");
        time(1);
        click(btnConsulta,folderPath, "click xpath");
        time(1);
        click(btnSelect,folderPath, "click xpath");
        time(1);
        String Total = getElement(lblTotal).getText();
        time(1);
        click(btnAsociar,folderPath, "click xpath");
        time(1);
        writeText(txtAsociar, Total, folderPath, Total);
        time(1);
        click(btnDemo,folderPath, "click xpath");
        time(1);
        String Asegurado = getElement(lblAsegurado).getText();
        time(1);
        click(btnValor,folderPath, "click xpath");
        time(1);
        clear(btnValor,folderPath, "click xpath");
        time(1);
        writeText(txtValor, Asegurado, folderPath, Asegurado);
        time(1);
        click(btnValorDispo,folderPath, "click xpath");
        time(1);
        click(btnAdicionar,folderPath, "click xpath");
        time(20);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(5);
        click(btnOkey,folderPath, "click xpath");
        time(2);
    	ByPixel();
        time(1);
        captureScreen(folderPath, "Capture screen");
        time(4);
        
        return this;
    }
    
public void numeroAleatorio()throws Exception {
		
		Random aleatorio = new Random();           
    	
   	 int min = 1000;
        int max = 99999;
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        int random_int2 = (int)(Math.random() * (max - min + 1) + min);
        
        driver.findElement(btnPoli).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}
	
}
