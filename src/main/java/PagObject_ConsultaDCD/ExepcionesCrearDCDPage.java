package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_ConsultaDCD.ExepcionesCrearDCDMap;
import io.qameta.allure.Step;

public class ExepcionesCrearDCDPage extends ExepcionesCrearDCDMap {
	

	
	public ExepcionesCrearDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear DCD")
    public ExepcionesCrearDCDPage CrearDCD(String nitcrear, String Kilos, File folderPath) throws Exception {
        time(2000);
        
        click(btnCrear,folderPath, "click xpath");
        time(3000);
        click(btnNit,folderPath, "click xpath");
        time(1000);
        writeText(txtNit, nitcrear, folderPath, Kilos);
        click(btnDV,folderPath, "click xpath");
        time(1000);
        click(btnSMes,folderPath, "click xpath");
        click(btnMes,folderPath, "click xpath");
        time(500);
        click(btnSAno,folderPath, "click xpath");
        time(1000);
        click(btnAno,folderPath, "click xpath");
        time(1000);
        click(btnProducto,folderPath, "click xpath");
        time(1000);
        click(btnPalma,folderPath, "click xpath");
        time(1000);
        click(btnMercado,folderPath, "click xpath");
        time(1000);
        click(btnMCI,folderPath, "click xpath");
        time(1000);
        click(btnKilos,folderPath, "click xpath");
        time(1000);
        writeText(txtKilos, Kilos, folderPath, Kilos);
        time(1000);
        click(btnExportar,folderPath, "click xpath");
        time(800);
        click(btnGuardar,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Validar Creacion DCD")
    public ExepcionesCrearDCDPage ValidarCreacionDCD(String resultado, File folderPath) throws Exception {
        
		time(1000);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
        time(2000);
        click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(3500);
        
        //Proceso realizado con éxito
        
        return this;
	}
}
