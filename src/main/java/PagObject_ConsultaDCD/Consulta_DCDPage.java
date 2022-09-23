package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_ConsultaDCD.Consulta_DCDMap;
import io.qameta.allure.Step;

public class Consulta_DCDPage extends Consulta_DCDMap {
	

	
	public Consulta_DCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta DCD")
    public Consulta_DCDPage ConsultaDCD(String Proveedor, File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnDemostracion,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnDCD,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnProveedor,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtProveedor, Proveedor, folderPath, "write" , Evidencia);
        time(1);
        click(btnCI,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnProducto,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnPalma,folderPath, "click xpath" , Evidencia);
		
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
        time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        return this;
    }
	
}
