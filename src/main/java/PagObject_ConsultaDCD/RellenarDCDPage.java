package PagObject_ConsultaDCD;

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

public class RellenarDCDPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]");
	By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnMesN=By.xpath("//*[@id=\"idMes\"]");
	By btnFebrero=By.xpath("//*[@id=\"idMes\"]/option[11]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public RellenarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Rellenar Formulario DCD")
    public RellenarDCDPage RellenarDCD() {
        
//		Utilidades.waitInMs(5000);
//		WebElement Element = driver.findElement(btnDemostracion);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracion);
//        Utilidades.waitInMs(1000);
//        WebElement Elements = driver.findElement(btnDCD);
//        JavascriptExecutor Js = (JavascriptExecutor) driver;
//        Js.executeScript("arguments[0].scrollIntoView();", Elements);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnDCD);
        Utilidades.time(3000);
        click(btnEstado);
        Utilidades.time(800);
        click(btnBorrador);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(1000);
        click(btnMesN);
        Utilidades.time(800);
        click(btnFebrero);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
		Utilidades.time(6500);
        Utilidades.screenshot();
        
        return this;
    }
	
}
