package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ObservarRevicionesPage extends BasePage {

	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[2]/div/table/thead/tr/th[9]/a[1]/span");
	By btnSelect=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	By btnDiferente=By.xpath("//div[2]/div/div[2]/ul/li[2]");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By txtFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	By btnDesplegar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[6]/p");
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public ObservarRevicionesPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Reviciones")
    public ObservarRevicionesPage VerRevicion(String Observacion, String Grupo) {
        
          Utilidades.time(3000);
			click(btnDesplegar);
			Utilidades.screenshot();
			Utilidades.time(2500);
			Utilidades.ByPixel();
			 Utilidades.time(2000);
	  	   WebElement Elementos = driver.findElement(btnlupa);
	       JavascriptExecutor JS = (JavascriptExecutor) driver;
	       JS.executeScript("arguments[0].scrollIntoView();", Elementos);
	         Utilidades.time(3000);
	         Utilidades.ByPixelA();
	         Utilidades.time(3000);
	        click(btnRevisar);
	        Utilidades.time(1000);
	        click(btnObservacion);
	        writeText(txtObservacion, Observacion);   
	        Utilidades.screenshot();
	        Utilidades.time(4000);
	        Utilidades.ByPixel();
	        Utilidades.screenshot();
			 Utilidades.time(3000);
	        click(btnGuardar);
	        Utilidades.time(6000);
        
        return this;
    }
	
	@Step("Resultado de Revicion")
    public ObservarRevicionesPage ValidarGuardarRevicion(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
	}
	
}
