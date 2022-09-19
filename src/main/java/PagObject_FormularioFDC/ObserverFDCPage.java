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

public class ObserverFDCPage extends BasePage {

	By btnVer=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	By btnCerrar=By.xpath("//*[@id=\"btnSalirFdc\"]");
	 
	public ObserverFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ver FDC")
    public ObserverFDCPage VerFDC() {
        Utilidades.time(1000);
        
		click(btnVer);
        Utilidades.time(23000);
        Utilidades.screenshot();
        Utilidades.ByPixel();
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
}
