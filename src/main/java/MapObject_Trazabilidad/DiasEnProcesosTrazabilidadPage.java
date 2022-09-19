package MapObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_ConsultaDCD.BorrarDCDPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class DiasEnProcesosTrazabilidadPage extends BasePage {

	By btnConsultar=By.id("ConsultaTrazabilidad");
	By btnDiasP=By.xpath("//th[18]/a[2]");
	By btnDias=By.xpath("//tr[10]/td[18]");
	 
	public DiasEnProcesosTrazabilidadPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Iniciar Menu Trazabilidad")
    public DiasEnProcesosTrazabilidadPage DiasPTrazabilidad() {
		
        Utilidades.time(5000);
		click(btnConsultar);
        Utilidades.time(5500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        Utilidades.ByPixel();
         Utilidades.time(1000);
         WebElement Elements = driver.findElement(btnDias);
         JavascriptExecutor Js = (JavascriptExecutor) driver;
         Js.executeScript("arguments[0].scrollIntoView();", Elements);
          Utilidades.time(1000);
          Utilidades.ByPixelA();
          Utilidades.time(2000);
         click(btnDiasP);
         Utilidades.time(1000);
         click(btnDiasP);
         Utilidades.time(800);
 		Utilidades.screenshot();
         Utilidades.time(4000);
         
        return this;
    }

}
