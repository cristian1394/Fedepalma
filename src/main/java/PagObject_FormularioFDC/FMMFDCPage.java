package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.FMMFDCMap;
import io.qameta.allure.Step;

public class FMMFDCPage extends FMMFDCMap {
	
	
	
   	public FMMFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar a creacion FDC")
    public FMMFDCPage CrearFDC(File folderPath) throws Exception {
	
	time(2);
    click(btnCrear,folderPath, "click xpath");
    time(1);
    captureScreen(folderPath, "Capture screen");
    time(4);
    
    return this;
}
	
	@Step("Crear FMM")
    public FMMFDCPage CrearFMM(String Pais, String producto, File folderPath) throws Exception {
        time(2);
        
        click(btnTipoDemo,folderPath, "click xpath");
        time(1);
        click(btnFMM,folderPath, "click xpath");
        time(2);
        click(btnFmm,folderPath, "click xpath");
		time(2);
        numeroAleatorio();
        time(3);
        click(btnCalendario,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnDia,folderPath, "click xpath");
        time(1);
        click(btnPais,folderPath, "click xpath");
        time(1);
        writeText(txtPais, Pais, folderPath, producto);
        time(1);
        click(btnTipoPro,folderPath, "click xpath");
        time(1);
        click(btnPalma,folderPath, "click xpath");
        time(1);
        click(btnConsultar,folderPath, "click xpath");
        time(5);
        click(btnDemostrados,folderPath, "click xpath");
        time(3);
        String Totals = getElement(lblTotal).getText();
        time(4);
        click(btnPRela,folderPath, "click xpath");
        time(1);
        click(btnProducto,folderPath, "click xpath");
        time(1);
        writeText(txtProducto, producto, folderPath, Totals);
        time(1);
        click(btnpPalma,folderPath, "click xpath");
        time(1);
        click(btnKg,folderPath, "click xpath");
        time(1);
        writeText(txtKg, Totals, folderPath, Totals);
        time(1);
        click(btnAdicionar,folderPath, "click xpath");
        time(1);
        click(btnGuardar,folderPath, "click xpath");
        
        captureScreen(folderPath, "Capture screen");
        time(2);
        
        return this;
    }
        
    	@Step("Ingresar FMM Palma")
        public FMMFDCPage IngresarFMMPalma(String resultado,File folderPath) throws Exception {
    	
    	time(2);
        click(btnSAS,folderPath, "click xpath");
        time(1);
        String Totales = getElement(lblTotal).getText();
        time(1);
        click(btnAsociar,folderPath, "click xpath");
        time(1);
        writeText(txtAsociar, Totales, null, Totales);
        time(1);
        click(btnAdi,folderPath, "click xpath");
        time(20);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(5);
        click(btnOk,folderPath, "click xpath");
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
        
        driver.findElement(btnFmm).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
	}

}
