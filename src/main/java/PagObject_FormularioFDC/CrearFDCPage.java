package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.CrearFDCMap;
import io.qameta.allure.Step;

public class CrearFDCPage extends CrearFDCMap {
	
	
	
	public CrearFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear FDC")
    public CrearFDCPage CrearFDC(String Pais, String Producto, File folderPath) throws Exception {
        time(2);
        
        click(btnCrear,folderPath, "click xpath");
        time(3);
        click(btnDEX,folderPath, "click xpath");
        time(1);
        numeroAleatorio();
        time(1);
        click(btnCalendario,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnAño,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnDia,folderPath, "click xpath");
        time(2);
        click(btnPais,folderPath, "click xpath");
        time(1);
        writeText(txtPais, Pais, folderPath, Producto);
        time(1);
        click(btnTipoPro,folderPath, "click xpath");
        time(4);
        click(btnSPalma,folderPath, "click xpath");
        time(1);
        click(btnConsultar,folderPath, "click xpath");
        time(2);
        click(btnDemostrados,folderPath, "click xpath");
        time(1);
        String Total = getElement(lblTotal).getText();
        
        click(btnPExpo,folderPath, "click xpath");
        time(1);
        click(btnProducto,folderPath, "click xpath");
        time(1);
        writeText(txtProducto, Producto, folderPath, Total);
        time(1);
        click(btnPalma,folderPath, "click xpath");
        time(1);
        click(btnKilos,folderPath, "click xpath");
        time(1);
        writeText(txtKilos, Total, folderPath, Total);
        time(1);
        click(btnAdicionar,folderPath, "click xpath");
        time(1);
        click(btnGuardar,folderPath, "click xpath");
       captureScreen(folderPath, "Capture screen");
       
        
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
        
        driver.findElement(btnDEX).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}

}
