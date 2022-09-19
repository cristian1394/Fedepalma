package PagObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class CargaMasivaDEXPage extends BasePage {

	By btnCarga=By.xpath("//*[@id=\"btnCargaMasivaDex\"]");
	By btnArchivo=By.id("fileCargueMasivoDex");
	By btnOk=By.xpath("//*[@id=\"CargaMasivaDex\"]");
	By lblResultadoBorrar=By.xpath("/html/body/div[8]/p");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By btnCancelar=By.xpath("//*[@id=\"CargueMasivoDEX\"]/div/div/div[4]/button");
	 
	public CargaMasivaDEXPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Carga Masiva DEX")
    public CargaMasivaDEXPage CargaDEX(String exc, String resultado) {
        Utilidades.time(1000);
        
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnCarga);
		Utilidades.time(2500);
		 File file = new File(exc);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnArchivo);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
		click(btnOk);
		Utilidades.time(6000);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
		click(btnOkey);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnCancelar);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
}
