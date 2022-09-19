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

public class ObservarSTecnicaPage extends BasePage {

	By btnDesplegar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnSalir=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[6]/p");
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	//By btnSalir=By.id("btnSalirFdcValidacion");
	 
	public ObservarSTecnicaPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Secretaria Tecnica")
    public ObservarSTecnicaPage VerSTecnica(String Observacion) {

         Utilidades.time(2000);
 		click(btnDesplegar);
 		 Utilidades.time(2000);
 		Utilidades.ByPixel();
 		Utilidades.time(1000);
         WebElement Elementos = driver.findElement(btnlupa);
         JavascriptExecutor JS = (JavascriptExecutor) driver;
         JS.executeScript("arguments[0].scrollIntoView();", Elementos);
        Utilidades.time(1000);
        Utilidades.ByPixelA();
        Utilidades.time(1000);
		click(btnRevisar);
		Utilidades.time(1000);
		click(btnObservacion);
		Utilidades.time(1000);
		writeText(txtObservacion, Observacion);
        Utilidades.time(1000);
        click(btnLupa);
        Utilidades.time(2500);
        click(btnSalir);
        Utilidades.time(1000);
        Utilidades.ByPixel();
        Utilidades.time(1000);
        click(btnGuardar);
        Utilidades.time(4000);

        
        return this;
    }
	
	@Step("Resultado Guardar Secretaria Tecnica")
    public ObservarSTecnicaPage ValidarGuardarRevicion(String resultado) {
		
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
