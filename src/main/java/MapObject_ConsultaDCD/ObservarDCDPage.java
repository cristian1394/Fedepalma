package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ObservarDCDPage extends BasePage {

	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	By btnCancelar=By.xpath("//*[@id=\"btnCancelar\"]");
	
	public ObservarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ver DCD")
    public ObservarDCDPage ObservarDCD() {
        Utilidades.time(6000);
        
        click(btnLupa);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.ByPixel();
        Utilidades.time(3000);
        Utilidades.screenshot();
        click(btnCancelar);
        Utilidades.time(3000);
        Utilidades.screenshot();
        
        return this;
    }
	
}
