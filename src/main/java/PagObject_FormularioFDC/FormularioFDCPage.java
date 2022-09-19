package PagObject_FormularioFDC;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class FormularioFDCPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDemostracionA=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[3]/a/span");
	By btnDemostracionB=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[4]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	By btnFDCA=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[3]/ul/li[2]/a");
	By btnFDCc=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[2]/a");
	By btnFDCB=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[4]/ul/li[2]/a");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMesA=By.xpath("//*[@id=\"idMes\"]/option[9]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public FormularioFDCPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioFDC() {
        Utilidades.time(2000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracion);
        Utilidades.time(1000);
        click(btnFDC);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesA);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
        Utilidades.time(3500);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioEFDC() {
        Utilidades.time(2000);
 	   WebElement Element = driver.findElement(btnDemostracionA);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracionA);
        Utilidades.time(1000);
        click(btnFDCA);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesA);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
        Utilidades.time(3500);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Consulta FDC")
    public FormularioFDCPage FormularioFDC1() {
        Utilidades.time(2000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracion);
        Utilidades.time(1000);
        click(btnFDC);
        Utilidades.time(1000);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
        Utilidades.time(3500);
        Utilidades.screenshot();
        return this;
    }
	
}
