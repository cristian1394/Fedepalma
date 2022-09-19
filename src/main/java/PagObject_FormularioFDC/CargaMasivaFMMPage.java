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

public class CargaMasivaFMMPage extends BasePage {
	
	By btnCargaFmm=By.xpath("//*[@id=\"btnCargaMasivaFmm\"]");
	By btnArchivoFmm=By.id("fileCargueMasivoFmm");
	By btnCargar=By.xpath("//*[@id=\"CargaMasivaFmm\"]");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By lblResultadoCarga=By.xpath("/html/body/div[8]/p");
	By btnCancela=By.xpath("//*[@id=\"CargueMasivoFMM\"]/div/div/div[4]/button");
	 
	public CargaMasivaFMMPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@Step("Carga Masiva FMM")
    public CargaMasivaFMMPage CargaFMM(String exc, String resultado) {
        Utilidades.time(1000);
        
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnCargaFmm);
		Utilidades.time(2500);
		 File file = new File(exc);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnArchivoFmm);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
		Utilidades.screenshot();
		click(btnCargar);
		Utilidades.time(6000);
		Assert.assertEquals(getElement(lblResultadoCarga).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
		click(btnOkey);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnCancela);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
}
