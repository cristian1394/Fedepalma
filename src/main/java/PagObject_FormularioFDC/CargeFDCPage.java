package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class CargeFDCPage extends BasePage {

	By btnCargaDEX=By.id("CargarDex");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaFMM=By.id("CargarDex");
	By btnOkey=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaCD=By.id("CargarDex");
	By btnOkay=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaPoliza=By.id("CargarDex");
	By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	
	public CargeFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Cagar DEX")
    public CargeFDCPage CagarDEX(String doc) throws Exception {
        Utilidades.time(2000);
        
        Utilidades.time(8000);
		 File file = new File(doc);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(btnCargaDEX);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
		click(btnOk);
        Utilidades.time(800);
        click(btnOkey);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
@Step("Cagar FMM")
public CargeFDCPage CargaFMM(String doc) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaFMM);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(1000);
	Utilidades.screenshot();
	Utilidades.time(3000);
	click(btnOk);
	Utilidades.screenshot();
	Utilidades.time(2500);
		
	return this;
}

@Step("Cagar CD")
public CargeFDCPage CargaCD(String doc) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaCD);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(1000);
	Utilidades.screenshot();
	Utilidades.time(3000);
	click(btnOk);
	Utilidades.time(2500);
	
	return this;	
}

@Step("Cagar Poliza")
public CargeFDCPage CargaPoliza(String doc) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaPoliza);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(1000);
	Utilidades.screenshot();
	Utilidades.time(3000);
	click(btnOk);
	Utilidades.time(2500);
	click(btnRevisar);
	Utilidades.time(2500);
		
	return this;
}
	
}
