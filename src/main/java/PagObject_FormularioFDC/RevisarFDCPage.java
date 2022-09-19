package PagObject_FormularioFDC;

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

public class RevisarFDCPage extends BasePage {

	By btnCrear=By.id("btnCrear");
	By btnRevisar=By.id("btnRevisarFdc");
	By btnSalir=By.id("btnSalirFdc");
	By lblResultadoRevisar=By.xpath("//div[17]/p");
	By btnOk=By.xpath("//div[7]/div/button");
	
	public RevisarFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Crear FDC")
    public RevisarFDCPage CrearFDC() throws Exception {
		
        Utilidades.time(2000);
        click(btnCrear);
		Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }

@Step("Revisar FDC")
public RevisarFDCPage RevisarFDC(String resultado) {
	
	Utilidades.time(500);
	Utilidades.ByPixel();
	Utilidades.time(1000);
	click(btnRevisar);
	Utilidades.time(4000);
    Utilidades.screenshot();
    Utilidades.time(1000);
	Assert.assertEquals(getElement(lblResultadoRevisar).getText(),resultado);
	Utilidades.screenshot();
    Utilidades.time(6000);
    click(btnOk);
    Utilidades.screenshot();
    Utilidades.time(2000);
	
	return this;
}

@Step("Salir FDC")
public RevisarFDCPage SalirFDC() {
	
	Utilidades.time(500);
	Utilidades.screenshot();
	Utilidades.time(500);
	click(btnSalir);
	Utilidades.time(8000);
	
	return this;
}

	
}
