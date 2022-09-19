package MapObject_RevisionesRYP;

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

public class DiasEnProcesoRYPPage extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnDiasP=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[15]/a[2]");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnSalir=By.xpath("/html/body/div[1]/main/div/div/section[4]/div/div/div/div[1]/div/button");
	
	By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public DiasEnProcesoRYPPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Validaciones de Filtro Dias en Proceso")
    public DiasEnProcesoRYPPage ValidarDiasEnProceso() {
        
         Utilidades.time(2000);
         Utilidades.ByPixel();
         Utilidades.time(4000);
         WebElement ElementosA = driver.findElement(btnlupa);
         JavascriptExecutor jS = (JavascriptExecutor) driver;
         jS.executeScript("arguments[0].scrollIntoView();", ElementosA);
         Utilidades.time(4000);
         Utilidades.ByPixelA();
         Utilidades.time(4000);
        click(btnDiasP);
        Utilidades.time(800);
        click(btnDiasP);
        Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnLupa);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(2500);
        click(btnSalir);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }

}
