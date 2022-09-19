package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_ConsultaDCD.BorrarDCDPage;
import PagObject_SecretariaTecnica.RevicionSTecnicaPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class RevicionesRYPPage extends BasePage {

	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[9]/a[1]/span");
	By btnSelect=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	By btnDiferente=By.xpath("//div[2]/div/div[2]/ul/li[2]");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By txtFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[2]/td[21]/div/i");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnCerrar=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[7]/p");
	By lblResultadoGuardar1=By.xpath("//p");
	By lblResultadoGuardar2=By.xpath("//h2");
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By btnOK=By.xpath("//div[7]/div/button");
	 
	public RevicionesRYPPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Filtrar RYP")
    public RevicionesRYPPage FiltarRYP(String Grupo) {

         Utilidades.time(2000);
         click(btnFiltro);
         Utilidades.time(1000);
         click(btnSelect);
         Utilidades.time(2500);
         click(btnDiferente);
         Utilidades.time(1000);
         click(btnFiltra);
         writeText(txtFiltra, Grupo);
         Utilidades.time(1000);
         Utilidades.screenshot();
         click(btnFiltrar);
         Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Revicion RYP")
    public RevicionesRYPPage RevicionRYP() {

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
	
	@Step("Observar RYP")
    public RevicionesRYPPage ObservarRYP(String Observacion) {
		
		Utilidades.time(500);
		click(btnObservacion);
		Utilidades.time(1000);
		writeText(txtObservacion, Observacion);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnLupa);
        Utilidades.time(2500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnCerrar);
        
        return this;
	}
	
	@Step("Guardar Revicion")
    public RevicionesRYPPage GuardarRevicion() {
		
		Utilidades.time(1000);
        Utilidades.ByPixel(); 
        Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnGuardar);
        Utilidades.time(4000);
        
        return this;
	}
	
	@Step("Resultado Guardar Revicion")
    public RevicionesRYPPage ValidarGuardarRevicion(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(3000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Resultado de Guardar Revicion")
    public RevicionesRYPPage ValidarGuardarRevicion1(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoGuardar1).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOK);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
	}
	
	@Step("Resultado de Guardar Revicion")
    public RevicionesRYPPage ValidarGuardarRevicion2(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoGuardar2).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOK);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
	}
}
