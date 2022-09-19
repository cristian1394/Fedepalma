package PagObject_ConsultaDCD;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ExepcionesGenerarDCDPage extends BasePage {
	
	By btnGenerar=By.id("btnGenerar");
	By btnOk=By.xpath("//div[7]/div/button");
	By lblResultadoGenerar=By.xpath("//div[8]/p");
	
	public ExepcionesGenerarDCDPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Revicion DCD")
    public ExepcionesGenerarDCDPage GenerarDCD() {
		
		Utilidades.time(800);
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnGenerar);
		Utilidades.time(1000);
		
		return this;
	}
	
	@Step("Validar Generacion DCD")
    public ExepcionesGenerarDCDPage ValidarGeneracionDCD(String Resultado) {
		
		Utilidades.time(6000);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnOk);
        Utilidades.time(2000);
        Utilidades.screenshot();
		
		return this;
	}
	
}
