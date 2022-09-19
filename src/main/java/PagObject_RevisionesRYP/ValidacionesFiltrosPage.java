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

public class ValidacionesFiltrosPage extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnFormulario=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[12]/label");
	By btnSalir=By.id("Productos");
	By btnDespliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[1]/a");
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[3]");
	By txtDeclarante=By.xpath("/html/body/div[5]/form/div[1]/input");//Agropecuaria
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	By Despliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	
	By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public ValidacionesFiltrosPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Filtro RYP")
    public ValidacionesFiltrosPage ValidarFiltros(String Decla) {
        
		Utilidades.time(2000);
        click(btnDeclarante);
        Utilidades.time(900);
        click(btnFiltro);
        Utilidades.time(1000);
        click(btnContiene);
        Utilidades.time(1000);
        writeText(txtDeclarante, Decla);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3000);
        
        
        return this;
    }
	
	@Step("Observar Validaciones Formulario")
    public ValidacionesFiltrosPage ValidarFormulario() {
        
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
        Utilidades.time(19000);
        Utilidades.screenshot();
        driver.findElement(btnSalir).sendKeys(Keys.ESCAPE);  
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Observar Validaciones Filtro")
    public ValidacionesFiltrosPage ValidarFiltro(String Decla1) {
        
		Utilidades.time(1000);
        WebElement Elementos = driver.findElement(btnDespliege);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Elementos);
        Utilidades.time(2000);
        Utilidades.ByPixelA();
        Utilidades.time(1300);
        click(btnDeclarante);
        Utilidades.time(900);
        Utilidades.screenshot();
        Utilidades.time(1000);
        clear(txtDeclarante);
        Utilidades.time(800);
        writeText(txtDeclarante, Decla1);
        Utilidades.time(900);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Desplegar RYP")
    public ValidacionesFiltrosPage DeplegarRYP() {
        
        Utilidades.time(3000);
        click(Despliege);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(5000);
        
        return this;
    }

}
