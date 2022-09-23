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
    public CrearFDCPage CrearFDC(String Pais, String Producto, File folderPath, String Evidencia) throws Exception {
        time(2);
        
        click(btnCrear,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnDEX,folderPath, "click xpath" , Evidencia);
        time(1);
        numeroAleatorio();
        time(1);
        click(btnCalendario,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAño,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnDia,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnPais,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtPais, Pais, folderPath, Producto, Evidencia);
        time(1);
        click(btnTipoPro,folderPath, "click xpath" , Evidencia);
        time(4);
        click(btnSPalma,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnConsultar,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnDemostrados,folderPath, "click xpath" , Evidencia);
        time(1);
        String Total = getElement(lblTotal).getText();
        
        click(btnPExpo,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnProducto,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtProducto, Producto, folderPath, Total, Evidencia);
        time(1);
        click(btnPalma,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnKilos,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtKilos, Total, folderPath, Total, Evidencia);
        time(1);
        click(btnAdicionar,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnGuardar,folderPath, "click xpath" , Evidencia);
       captureScreen(folderPath, "Capture screen" , Evidencia);
       
        
       captureScreen(folderPath, "Capture screen" , Evidencia);
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
