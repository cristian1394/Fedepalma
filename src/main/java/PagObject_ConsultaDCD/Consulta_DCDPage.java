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
    public Consulta_DCDPage ConsultaDCD(String Proveedor, File folderPath) throws Exception {
        
        time(5);
        click(btnDemostracion,folderPath, "click xpath");
        time(3);
        click(btnDCD,folderPath, "click xpath");
        time(1);
        click(btnProveedor,folderPath, "click xpath");
        time(1);
        writeText(txtProveedor, Proveedor, folderPath, "write");
        time(1);
        click(btnCI,folderPath, "click xpath");
        time(2);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        click(btnSMes,folderPath, "click xpath");
        time(1);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnProducto,folderPath, "click xpath");
        time(1);
        click(btnPalma,folderPath, "click xpath");
		
		time(1);
		click(btnBuscar,folderPath, "click xpath");
        time(4);
        captureScreen(folderPath, "Capture screen");
        return this;
    }
	
}
