package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.PolizaEsFDCMap;
import io.qameta.allure.Step;

public class PolizaEsFDCPage extends PolizaEsFDCMap {
	
	
	
	public PolizaEsFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar a creacion FDC")
    public PolizaEsFDCPage CrearFDC(File folderPath, String Evidencia) throws Exception {
	
	time(2);
    click(btnCrear,folderPath, "click xpath" , Evidencia);
    time(1);
    captureScreen(folderPath, "Capture screen" , Evidencia);
    time(4);
    
    return this;
}
	
	@Step("Crear poliza")
    public PolizaEsFDCPage CrearPoliza(String resultado, File folderPath, String Evidencia) throws Exception {
        time(1);
        ByPixelA();
        time(1);
        click(btnTDemo,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnPoliza,folderPath, "click xpath" , Evidencia);
        time(2);
        String [] Poliza = {"18190013",  "123456789",  "181900167", "181900491"};
        Random aleatorio = new Random();            
        int Poliza2 = aleatorio.nextInt(Poliza.length);
        System.out.println(Poliza[Poliza2]);
        String txtPoliza = String.valueOf(Poliza[Poliza2]);
        time(1);
        writeText(txtPoli, txtPoliza, folderPath, txtPoliza, Evidencia);
        time(2);
        click(btnConsulta,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnFiltro,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnSelect,folderPath, "click xpath" , Evidencia);
        time(1);
        String Total = getElement(lblTotal).getText();
        time(2);
        writeText(txtAsociar, Total, folderPath, Total, Evidencia);
//        Utilidades.waitInMs(1);
//        click(btnSeleccionar);
//        Utilidades.waitInMs(1);
//        String Totals = getElement(lblTotals).getText();
//        Utilidades.waitInMs(2);
//        writeText(txtasociar, Totals);
        time(3);
        click(btnAdicionar,folderPath, "click xpath" , Evidencia);
        time(18);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        click(btnOkey,folderPath, "click xpath" , Evidencia);
        time(2);
    	ByPixel();
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }
	
}
