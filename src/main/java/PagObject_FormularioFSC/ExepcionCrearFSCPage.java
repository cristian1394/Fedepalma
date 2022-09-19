package PagObject_FormularioFSC;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ExepcionCrearFSCPage extends BasePage {

	By btnCrear=By.id("btnCrear");
	By btnOK=By.xpath("//div[7]/div[7]/div/button");//Seleccione el año y el mes
	By lblResultadoCrear=By.xpath("//div[7]/p");
	 
	public ExepcionCrearFSCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Crear FSC")
    public ExepcionCrearFSCPage CrearFSC(String resultado) {
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
