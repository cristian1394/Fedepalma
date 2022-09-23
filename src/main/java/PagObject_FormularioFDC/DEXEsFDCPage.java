package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.DEXEsFDCMap;
import io.qameta.allure.Step;

public class DEXEsFDCPage extends DEXEsFDCMap {
	

        
        
    public DEXEsFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear DEX")
    public DEXEsFDCPage CrearDEX(String resultado, File folderPath, String Evidencia) throws Exception {
        
    	time(3);
        click(btnCrear,folderPath, "click xpath" , Evidencia);
        time(5);
        String [] Dex = {"1234567", "18190015",  "292929", "920012"};
        Random aleatorio = new Random();            
        int Dex2 = aleatorio.nextInt(Dex.length);
        System.out.println(Dex[Dex2]);
        String txtDex = String.valueOf(Dex[Dex2]);
        
        time(1);
        writeText(txtDEX, txtDex, null, txtDex, Evidencia);
        time(1);
        click(btnConsultar,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnFiltro,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnSeleccion,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnseleccion,folderPath, "click xpath" , Evidencia);
        time(2);
        String Total = getElement(lblTotal).getText();
        time(2);
        writeText(txtAsociar, Total, null, Total, Evidencia);
        time(3);
        String Totals = getElement(lblTotals).getText();
        time(2);
        writeText(txtasociar, Totals, null, Totals, Evidencia);
        time(1);
        click(btnAdicionar,folderPath, "click xpath" , Evidencia);
        time(18);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(5);
        click(btnOk,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }

}
