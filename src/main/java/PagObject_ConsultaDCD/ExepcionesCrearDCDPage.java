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
    public ExepcionesCrearDCDPage CrearDCD(String nitcrear, String Kilos, File folderPath, String Evidencia) throws Exception {
        time(2);
        
        click(btnCrear,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnNit,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtNit, nitcrear, folderPath, "texto prueba" , Evidencia);
        click(btnDV,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        click(btnMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnProducto,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnPalma,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMercado,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMCI,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnKilos,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtKilos, Kilos, folderPath, "texto prueba" , Evidencia);
        time(1);
        click(btnExportar,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnGuardar,folderPath, "click xpath" , Evidencia);
        
        
        return this;
    }
	
	@Step("Validar Creacion DCD")
    public ExepcionesCrearDCDPage ValidarCreacionDCD(String resultado, File folderPath, String Evidencia) throws Exception {
        
		time(1);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        click(btnOk,folderPath, "click xpath" , Evidencia);
        time(1);
        
        //Proceso realizado con éxito
        
        return this;
	}
}
