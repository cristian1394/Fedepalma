package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ExepcionCMDCDPage extends BasePage {

	By btnCarga=By.xpath("//*[@id=\"btnCargueMasivo\"]");
	By btnArchivo=By.id("fileElement");
	By btnOk=By.id("acceptLoadFile");
	By btnOkey=By.xpath("//div[7]/div/button");
	By lblResultadoCargaArchivo=By.xpath("//div[9]/p");
	
	public ExepcionCMDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Carga Masiva DCD")
    public ExepcionCMDCDPage CargaDCD(String DocACM) {
        Utilidades.time(1000);
        
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnCarga);
		Utilidades.time(2500);
		 File file = new File(DocACM);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnArchivo);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(2000);
		Utilidades.screenshot();
		Utilidades.time(5000);
		click(btnOk);
		Utilidades.screenshot();
		Utilidades.time(8000);
		
        
        return this;
    }
	
	@Step("Resultado de la carga masiva del DCD")
    public ExepcionCMDCDPage ValidarResultadoCargaDCD(String resultado) {
		
		Assert.assertEquals(getElement(lblResultadoCargaArchivo).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(6000);
		click(btnOkey);
        Utilidades.screenshot();
        Utilidades.time(2000);
		
		return this;
	}
}
