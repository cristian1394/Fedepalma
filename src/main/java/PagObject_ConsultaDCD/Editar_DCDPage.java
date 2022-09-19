package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_ConsultaDCD.Editar_DCDMap;
import io.qameta.allure.Step;

public class Editar_DCDPage extends Editar_DCDMap {

	
	
	public Editar_DCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Rellenar Formulario DCD")
    public Editar_DCDPage RellenarDCD(File folderPath) throws Exception {
        
        time(1);
        click(btnDemostracion,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        time(1);
        click(btnDCD,folderPath, "click xpath");
        time(3);
        click(btnEstado,folderPath, "click xpath");
        time(1);
        click(btnBorrador,folderPath, "click xpath");
        time(1);
        click(btnSAno,folderPath, "click xpath");
        time(1);
        click(btnAno,folderPath, "click xpath");
        time(1);
        click(btnMesN,folderPath, "click xpath");
        time(1);
        click(btnFebrero,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(7);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Editar DCD")
    public Editar_DCDPage EditarDCD(String kg, String CP, String kilos, File folderPath) throws Exception {
        time(26);
		click(btnEditar,folderPath, "click xpath");
		time(1);
		click(btnProductoA,folderPath, "click xpath");
		time(1);
		click(btnPalmiste,folderPath, "click xpath");
		time(1);
		click(btnMercado,folderPath, "click xpath");
		time(1);
		click(btnPais,folderPath, "click xpath");
		time(1);
		click(btnBorrar,folderPath, "click xpath");
		time(1);
		clear(btnBorrar,folderPath, "click xpath");
		time(1);
		writeText(txtKilos, kg, folderPath, kilos);
		time(1);
		ByPixel();
		time(1);
		click(btnCP,folderPath, "click xpath");
		time(1);
		writeText(txtCP, CP, folderPath, kilos);
		time(1);
		click(btnKg,folderPath, "click xpath");
		time(1);
		writeText(txtKg, kilos, folderPath, kilos);
        time(3);
		click(btnCalendario,folderPath, "click xpath");
		time(1);
		click(btnSelMes,folderPath, "click xpath");
		time(1);
		click(btnMes,folderPath, "click xpath");
		time(1);
		click(btnDia,folderPath, "click xpath");
		time(1);
		click(btnAdicionar,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		
        return this;
    }
	
	@Step("Validar Adicion CD")
    public Editar_DCDPage ValidarAdicionCD(String resultado, File folderPath) throws Exception {
		
		time(10);
		Assert.assertEquals(getElement(lblResultadoAdicion).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(6);
		click(btnOk,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		//Certificado Guardado Correctamente.
		
		return this;
	}
	
	public Editar_DCDPage CargaCD(String EXC, File folderPath) throws InterruptedException {
		
		time(8);
		 File file = new File(EXC);
		 time(3);
		 WebElement ruta = driver.findElement(btnCargaM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 time(1);

       return this;
	}
	
	@Step("Validar Carga CD")
    public Editar_DCDPage ValidarCargaCD(String resultado, File folderPath) throws Exception {
		
		time(9);
		Assert.assertEquals(getElement(lblResultadoCarga).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnOkey,folderPath, "click xpath");
		ByPixel();
		time(2);
		click(btnGuardar,folderPath, "click xpath");
		//Certificados Guardados Correctamente.
		
		return this;
	}
	
	@Step("Validar Guardar CD")
    public Editar_DCDPage ValidarGuardarDCD(String resultado, File folderPath) throws Exception {
		
		time(9);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(),resultado);
		time(3);
		click(btnOkay,folderPath, "click xpath");
		time(5);
       captureScreen(folderPath, "Capture screen");
		//Proceso realizado con éxito
		
		return this;
	}
	
}
	

