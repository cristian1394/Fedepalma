package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_ConsultaDCD.BorrarDCDPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ValidacionesRYPPage extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnFormulario=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[12]/label");
	By btnSalir=By.id("Productos");
	By btnDespliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[7]/td[1]/a");
	By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[7]/a[2]");
	By btnNDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[7]/label");
	By btnCancelar=By.id("btnCancelar");
	By btnBajar=By.xpath("//*[@id=\"InfoFirma\"]/div/div/div[2]/div/div/div/label");
	
	public ValidacionesRYPPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Validaciones Formulario")
    public ValidacionesRYPPage ValidarFormulario() {
        
         Utilidades.time(2000);
         Utilidades.ByPixel();
         Utilidades.time(4000);
         WebElement ElementosA = driver.findElement(btnlupa);
         JavascriptExecutor jS = (JavascriptExecutor) driver;
         jS.executeScript("arguments[0].scrollIntoView();", ElementosA);
         Utilidades.time(4000);
         Utilidades.ByPixelA();
         Utilidades.time(4000);
        click(btnFormulario);
        Utilidades.time(23000);
        Utilidades.screenshot();
        Utilidades.time(2000);
	 	WebElement Element = driver.findElement(btnBajar);
	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        driver.findElement(btnSalir).sendKeys(Keys.ESCAPE);  
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Observar Validaciones DCD")
    public ValidacionesRYPPage ValidarDCD() {
        
        Utilidades.time(1000);
        WebElement Elementos = driver.findElement(btnDespliege);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Elementos);
        Utilidades.time(2000);
        Utilidades.ByPixelA();
        Utilidades.time(800);
        click(btnDCD);
        click(btnDCD);
        Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(4000);
        click(btnNDCD);
        Utilidades.time(15000);
        Utilidades.screenshot();
        WebElement Elemento = driver.findElement(btnCancelar);
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("arguments[0].scrollIntoView();", Elemento);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(3000);
        
        return this;
    }

}
