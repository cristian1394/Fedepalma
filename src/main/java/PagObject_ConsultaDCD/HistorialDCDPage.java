package PagObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class HistorialDCDPage extends BasePage {

	By btnHistorial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	By btnDCD=By.id("FormDCD");
	
	public HistorialDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ver Historial DCD")
    public HistorialDCDPage HistorialDCD() {
        Utilidades.time(1000);
        
        click(btnHistorial);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(15000);
        click(btnDCD);
        Utilidades.time(3000);
        
        return this;
    }
	
}
