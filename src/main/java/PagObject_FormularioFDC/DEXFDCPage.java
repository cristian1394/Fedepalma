package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.DEXFDCMap;
import io.qameta.allure.Step;

public class DEXFDCPage extends DEXFDCMap {
	

	
	public DEXFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@Step("Ingresar DEX Palma")
    public DEXFDCPage IngresarDEXPalma(File folderPath) throws Exception {
        time(2);
        
        click(btnSAS,folderPath, "click xpath");
        time(1);
        click(btnAsociar,folderPath, "click xpath");
        time(1);
        
        String Total = getElement(lblTotal).getText();
        time(1);
        click(btnAsociar,folderPath, "click xpath");
        writeText(txtAsociar, Total, folderPath, Total);
        time(1);
        click(btnAdi,folderPath, "click xpath");
        time(20);
        click(btnOk,folderPath, "click xpath");
        time(2);
        
        return this;
    }
        
        
    @Step("Crear DEX Palmiste")
    public DEXFDCPage CrearDEXPalmiste(String Pais, String Producto, File folderPath) throws Exception {
        
    	time(5);
    	click(btnDEX,folderPath, "click xpath");
    	time(2);
        numeroAleatorio();
        time(2);
        click(btnCalendario,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnAño,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnDia,folderPath, "click xpath");
        time(1);
        click(btnPais,folderPath, "click xpath");
        time(1);
        writeText(txtPais, Pais, folderPath, Producto);
        captureScreen(folderPath, "Capture screen");
        time(2);
        click(btnTipoProd,folderPath, "click xpath");
        time(1);
        click(btnpalmiste,folderPath, "click xpath");
        time(1);
        click(btnConsultar,folderPath, "click xpath");
        time(5);
        click(btnDemostrados,folderPath, "click xpath");
        time(1);
        String Totales = getElement(lblTotal).getText();
        
        time(1);
        click(btnPExpo,folderPath, "click xpath");
        time(1);
        click(btnProducto,folderPath, "click xpath");
        time(1);
        writeText(txtProducto, Producto, folderPath, Totales);
        time(1);
        click(btnPalmiste,folderPath, "click xpath");
        time(1);
        click(btnKg,folderPath, "click xpath");
        time(1);
        writeText(txtKg, Totales, folderPath, Totales);
        time(1);
        click(btnAdicionar,folderPath, "click xpath");
        time(1);
        click(btnGuardar,folderPath, "click xpath");
        
        captureScreen(folderPath, "Capture screen");
        time(4);
        
        return this;
    }
	
	@Step("Ingresar DEX Palmiste")
    public DEXFDCPage IngresarDEXPalmiste(String resultado, File folderPath) throws Exception {
		
        time(4);
        click(btnSAS,folderPath, "click xpath");
        time(1);
        String Totals = getElement(lblTotal).getText();
        time(1);
        click(btnAsociar,folderPath, "click xpath");
        writeText(txtAsociar, Totals, folderPath, Totals);
        time(1);
        click(btnAdi,folderPath, "click xpath");
        time(20);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(5);
        click(btnOk,folderPath, "click xpath");
        
        return this;
	}
	
public void numeroAleatorio()throws Exception {
		
		Random aleatorio = new Random();           
    	
   	 int min = 1000;
        int max = 99999;
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        int random_int2 = (int)(Math.random() * (max - min + 1) + min);
        
        driver.findElement(btnDEX).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}

}
