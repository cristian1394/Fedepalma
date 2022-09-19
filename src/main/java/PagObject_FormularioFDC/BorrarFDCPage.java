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

public class BorrarFDCPage extends BasePage {

	By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]/div/i");
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By btnOK=By.xpath("/html/body/div[6]/div[7]/div/button");
	By lblResultadoBorrar=By.xpath("//div[6]/h2");
	 
	public BorrarFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Eliminar FDC")
    public BorrarFDCPage BorrarFDC(String resultado) {
        Utilidades.time(8000);
		click(btnBorrar);
        Utilidades.screenshot();
        Utilidades.time(5000);
        click(btnOk);
        Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(6000);
        click(btnOK);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
}
