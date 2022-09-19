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

public class ExepcionCrearFDCPage extends BasePage {

	By btnCrear=By.id("btnCrear");
	By btnOK=By.xpath("//div[7]/div[7]/div/button");
	By lblResultadoCrear=By.xpath("/html/body/div[7]/p");
	 
	public ExepcionCrearFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Crear FDC")
    public ExepcionCrearFDCPage CrearFDC(String resultado) {
        Utilidades.time(8000);
		click(btnCrear);
		Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(6000);
        click(btnOK);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
}
