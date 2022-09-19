package MapObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class HistorialFDCPage extends BasePage {

	By btnHistorial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	By btnCerrar=By.xpath("//*[@id=\"FormFDC\"]/div/div/div[2]/div[2]/button");
	 
	public HistorialFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ver Historial FDC")
    public HistorialFDCPage HistorialFDC() {
		
        Utilidades.time(5000);
		click(btnHistorial);
        Utilidades.time(9000);
        Utilidades.screenshot();
        click(btnCerrar);
        Utilidades.time(2000);
        
        return this;
    }
	
}
