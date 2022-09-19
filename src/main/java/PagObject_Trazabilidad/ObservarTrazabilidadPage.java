package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ObservarTrazabilidadPage extends BasePage {

	By btnVer=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/i");
	
	public ObservarTrazabilidadPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Trazabilidad")
    public ObservarTrazabilidadPage VerTrazabilidad() {

		Utilidades.time(800);
		click(btnVer);
		Utilidades.time(500);
		Utilidades.screenshot();
        Utilidades.time(10000);
        
        return this;
    }
	
}
