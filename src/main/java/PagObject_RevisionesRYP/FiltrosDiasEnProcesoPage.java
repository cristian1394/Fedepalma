package PagObject_RevisionesRYP;

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

public class FiltrosDiasEnProcesoPage extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnDiasP=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[15]/a[1]/span");
	By btnDespliege=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[5]");
	By txtDiasP=By.xpath("/html/body/div[5]/form/div[1]/input");//1
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public FiltrosDiasEnProcesoPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Observar Validaciones de Filtro Dias en Proceso")
    public FiltrosDiasEnProcesoPage ValidarFiltroDiasP(String Kg) {
        
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
        click(btnDespliege);
        Utilidades.time(1000);
        click(btnComienza);
        Utilidades.time(1000);
        writeText(txtDiasP, Kg);
        Utilidades.time(900);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }

}
