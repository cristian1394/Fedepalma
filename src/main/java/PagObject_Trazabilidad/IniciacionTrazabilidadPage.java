package PagObject_Trazabilidad;

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

public class IniciacionTrazabilidadPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnTrazabilidad=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[9]/a");
	 
	public IniciacionTrazabilidadPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Iniciar Menu Trazabilidad")
    public IniciacionTrazabilidadPage IniciarTrazabilidad() {
        Utilidades.time(5000);
        
        Utilidades.time(2000);
  	   WebElement Element = driver.findElement(btnDemostracion);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
         Utilidades.time(1000);
         click(btnDemostracion);
         Utilidades.time(2000);
         WebElement Elements = driver.findElement(btnTrazabilidad);
         JavascriptExecutor Js = (JavascriptExecutor) driver;
         Js.executeScript("arguments[0].scrollIntoView();", Elements);
          Utilidades.time(1000);
         click(btnTrazabilidad);
         Utilidades.time(800);
 		Utilidades.screenshot();
         Utilidades.time(2000);
         
        return this;
    }

}
