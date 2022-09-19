package PagObject_FormularioNuevoFFP;

import java.util.Random;

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

public class MiraFFPPage extends BasePage {
	
	By btnConsultar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[9]/div/i");
	By btnLiquidacionFP=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[7]/div/div[1]/label");
	By btnRProveedorFruto=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div/div[1]/div");
	By btnACM=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div/div/div[1]/div");
	By btnRFV=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[1]/div");
	By btnRFEM=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div/div/div/div[1]/div");
	By btnRPA=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[14]/div/div/div/div[1]/div");
	By btnARM=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[16]/div/div/div/div[1]/div");
	By btnGenerarPDF=By.xpath("//*[@id=\"btnPdfDeclaration\"]");
	By btnSalir=By.xpath("//*[@id=\"btnCancelDeclaration\"]");
	
	By btnSi=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public MiraFFPPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Ver FFP")
    public MiraFFPPage MirarFFP() {
        
        Utilidades.time(5000);
        click(btnConsultar);
         Utilidades.time(3000);
         WebElement Element = driver.findElement(btnLiquidacionFP);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView();", Element);
          Utilidades.time(400);
          Utilidades.screenshot();
          Utilidades.time(2000);
          WebElement Elements = driver.findElement(btnRProveedorFruto);
          JavascriptExecutor Js = (JavascriptExecutor) driver;
          Js.executeScript("arguments[0].scrollIntoView();", Elements);
          Utilidades.time(400);
          Utilidades.screenshot();
          Utilidades.time(2000);
          WebElement element = driver.findElement(btnACM);
          JavascriptExecutor JS = (JavascriptExecutor) driver;
          JS.executeScript("arguments[0].scrollIntoView();", element);
           Utilidades.time(400);
           Utilidades.screenshot();
           Utilidades.time(2000);
           WebElement Elementos = driver.findElement(btnRFV);
           JavascriptExecutor jS = (JavascriptExecutor) driver;
           jS.executeScript("arguments[0].scrollIntoView();", Elementos);
           Utilidades.time(400);
           Utilidades.screenshot();
           Utilidades.time(2000);
           WebElement elemento = driver.findElement(btnRFEM);
           JavascriptExecutor jss = (JavascriptExecutor) driver;
           jss.executeScript("arguments[0].scrollIntoView();", elemento);
            Utilidades.time(400);
            Utilidades.screenshot();
            Utilidades.time(2000);
            WebElement Elemento = driver.findElement(btnRPA);
            JavascriptExecutor Jss = (JavascriptExecutor) driver;
            Jss.executeScript("arguments[0].scrollIntoView();", Elemento);
            Utilidades.time(400);
            Utilidades.screenshot();
            Utilidades.time(2000);
            WebElement elemental = driver.findElement(btnARM);
            JavascriptExecutor jSS = (JavascriptExecutor) driver;
            jSS.executeScript("arguments[0].scrollIntoView();", elemental);
             Utilidades.time(400);
             Utilidades.screenshot();
             Utilidades.time(2000);
             click(btnGenerarPDF);
             Utilidades.time(8000);
             click(btnSalir);
             Utilidades.time(4000);
             click(btnSi);
             Utilidades.time(10000);
            
        return this;
    }
	
}
