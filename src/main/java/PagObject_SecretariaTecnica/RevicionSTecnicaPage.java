package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_RevisionesRYP.ObservarRevicionesPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class RevicionSTecnicaPage extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[7]/td[21]/div/i");
	By btnDevolver=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[18]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnSalir=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[6]/p");
	By lblResultadoGuardar1=By.xpath("//h2");
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	//By btnSalir=By.id("btnSalirFdcValidacion");
	 
	public RevicionSTecnicaPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Devolucion Secretaria Tecnica")
    public RevicionSTecnicaPage RevicionSTecnica() {

         Utilidades.time(500);
         Utilidades.ByPixel();
         WebElement Elementos = driver.findElement(btnlupa);
         JavascriptExecutor JS = (JavascriptExecutor) driver;
         JS.executeScript("arguments[0].scrollIntoView();", Elementos);
        Utilidades.time(1000);
        Utilidades.ByPixelA();
        Utilidades.time(1000);
		click(btnDevolver);
		Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
 
        return this;
    }
	
	@Step("Revicion Secretaria Tecnica")
    public RevicionSTecnicaPage RevicionSTecnica1() {

         Utilidades.time(500);
         Utilidades.ByPixel();
         WebElement Elementos = driver.findElement(btnlupa);
         JavascriptExecutor JS = (JavascriptExecutor) driver;
         JS.executeScript("arguments[0].scrollIntoView();", Elementos);
        Utilidades.time(1000);
        Utilidades.ByPixelA();
        Utilidades.time(1000);
		click(btnRevisar);
		Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
 
        return this;
    }
	
	@Step("Observar Secretaria Tecnica")
    public RevicionSTecnicaPage ObservarST(String Observacion) {
		
		Utilidades.time(500);
		click(btnObservacion);
		Utilidades.time(1000);
		writeText(txtObservacion, Observacion);
        Utilidades.time(1000);
        click(btnLupa);
        Utilidades.time(2500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnSalir);
        
        return this;
	}
	
	@Step("Guardar Revicion")
    public RevicionSTecnicaPage GuardarRevicion() {
		
		Utilidades.time(1000);
        Utilidades.ByPixel();
        Utilidades.time(1000);
        click(btnGuardar);
        Utilidades.time(4000);
        
        return this;
	}
	
	@Step("Resultado de Guardar Revicion")
    public RevicionSTecnicaPage ValidarGuardarRevicion(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
	}
	
	@Step("Resultado de Guardar Revicion")
    public RevicionSTecnicaPage ValidarGuardarRevicion1(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoGuardar1).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
	}
}
