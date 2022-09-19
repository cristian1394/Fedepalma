package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_ConsultaDCD.BorrarDCDPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class DiasEnProcesoSTPage extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[3]/td[21]/div/i");
	By btnDias=By.xpath("//th[15]/a[2]");
	By btnSalir=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[2]/td[21]/div/i");
	
	
	public DiasEnProcesoSTPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Revicion RYP")
    public DiasEnProcesoSTPage ValidarST() {

         Utilidades.time(500);
         Utilidades.ByPixel();
         Utilidades.time(4000);
         WebElement ElementosA = driver.findElement(btnlupa);
         JavascriptExecutor jS = (JavascriptExecutor) driver;
         jS.executeScript("arguments[0].scrollIntoView();", ElementosA);
         Utilidades.time(4000);
         Utilidades.ByPixelA();
         Utilidades.time(2000);
        click(btnDias);
        Utilidades.time(2000);
        click(btnDias);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnLupa);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3000);
        click(btnSalir);
        Utilidades.time(3000);
        
        return this;
    }

}
