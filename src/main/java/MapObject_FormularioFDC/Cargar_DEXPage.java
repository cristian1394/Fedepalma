package MapObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class Cargar_DEXPage extends BasePage {

	By btnCargas=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div");
	
	By btnCargaDEX=By.id("fileElementCargarDex");
	By btnOk=By.xpath("/html/body/div[18]/div[7]/div/button");
	
	By btnCargaFMM=By.id("fileElementCargarFmm");
	
	By btnCargaCD=By.id("fileElementCargarPoliza");
	
	By btnCargaPoliza=By.id("fileElementCargarCP");
	
	By btnCargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	By btnSalir=By.id("btnSalirFdc");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");
	
	public Cargar_DEXPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Cagar DEX")
    public Cargar_DEXPage CargaDEX(String doc, String resultado) throws Exception {
        Utilidades.time(2000);
        
        WebElement Element = driver.findElement(btnCargas);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(8000);
		 File file = new File(doc);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(btnCargaDEX);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(5000);
		Utilidades.screenshot();
	    Utilidades.time(1000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
@Step("Cagar FMM")
public Cargar_DEXPage CargaFMM(String doc, String resultado) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaFMM);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(4000);
	 Utilidades.screenshot();
	 Utilidades.time(2000);
	click(btnOk);
	Utilidades.screenshot();
	Utilidades.time(2500);
		
	return this;
}

@Step("Cagar CD")
public Cargar_DEXPage CargaCD(String doc, String resultado) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaCD);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(4000);
	Utilidades.screenshot();
	Utilidades.time(2000);
	click(btnOk);
	Utilidades.time(2500);
	
	return this;	
}

@Step("Cagar Poliza")
public Cargar_DEXPage CargaPoliza(String doc, String resultado) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaPoliza);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(4000);
	 Utilidades.screenshot();
	 Utilidades.time(2000);
	click(btnOk);
	Utilidades.time(2500);
		
	return this;
}

@Step("Cagar Incumplimiento")
public Cargar_DEXPage CargaIncumplimiento(String doc, String resultado) {
    Utilidades.time(8000);
	 File file = new File(doc);
	 Utilidades.time(3000);
	 WebElement ruta = driver.findElement(btnCargaIncumplimiento);
	 ruta.sendKeys(file.getAbsolutePath()); 
	 Utilidades.time(4000);
	Utilidades.screenshot();
	Utilidades.time(2000);
	click(btnOk);
	Utilidades.time(2500);
		
	return this;
}

@Step("Revisar FDC")
public Cargar_DEXPage RevisarFDC() {
	
	Utilidades.time(500);
	click(btnRevisar);
	Utilidades.time(7000);
	
	return this;
}

@Step("Salir FDC")
public Cargar_DEXPage SalirFDC() {
	
	Utilidades.time(500);
	Utilidades.screenshot();
	Utilidades.time(500);
	click(btnSalir);
	Utilidades.time(8000);
	
	return this;
}

	
}
