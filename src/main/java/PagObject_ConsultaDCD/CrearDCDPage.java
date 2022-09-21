package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.CrearDCDMap;
import io.qameta.allure.Step;

public class CrearDCDPage extends CrearDCDMap {
	
	
	public CrearDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear DCD")
    public CrearDCDPage CrearDCD(String nit, String Proveedor, String Kilos, File folderPath) throws Exception {
        time(2);
        
        click(btnCrear,folderPath, "click xpath");

        time(3);
        click(btnNit,folderPath, "click xpath");

        time(1);
        writeText(txtNit, nit, folderPath, Kilos);
        click(btnDV,folderPath, "click xpath");

        time(1);
        click(btnSMes,folderPath, "click xpath");

        click(btnMes,folderPath, "click xpath");

        time(1);
        click(btnSAno,folderPath, "click xpath");

        time(1);
        click(btnAno,folderPath, "click xpath");

        time(1);
        click(btnProducto,folderPath, "click xpath");

        time(1);
        click(btnPalma,folderPath, "click xpath");

        time(1);
        click(btnMercado,folderPath, "click xpath");

        time(1);
        click(btnMCI,folderPath, "click xpath");

        time(1);
        click(btnKilos,folderPath, "click xpath");

        time(1);
        writeText(txtKilos, Kilos, folderPath, Kilos);
        time(1);
        click(btnExportar,folderPath, "click xpath");

        time(1);
        click(btnGuardar,folderPath, "click xpath");

        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Validar Creacion DCD")
    public CrearDCDPage ValidarCreacionDCD(String resultado,File folderPath) throws Exception {
        
		time(1);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(2);
        click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(4);
        
        //Proceso realizado con éxito
        
        return this;
    }
}
