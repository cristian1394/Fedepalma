package MapObject_FormularioFDC;

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

public class Editar_FDCPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	By btnEstado=By.id("idEstado");
	By btnBorrador=By.xpath("//*[@id=\"idEstado\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	By btnBarra=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]");
	By btnCP=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div[1]/div/table/tbody/tr[1]/td[16]/a");
	
	 
	public Editar_FDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Consulta FDC")
    public Editar_FDCPage FormularioFDC() {
        Utilidades.time(2000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracion);
        Utilidades.time(1000);
        click(btnFDC);
        Utilidades.time(2000);
        click(btnEstado);
        Utilidades.time(1000);
        click(btnBorrador);
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
	
	@Step("Editar FDC")
    public Editar_FDCPage EditarFDC() {
        Utilidades.time(10000);
        
		click(btnEditar);
        Utilidades.screenshot();
        Utilidades.time(10000);
        WebElement Element = driver.findElement(btnBarra);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
         Utilidades.time(3000);
        click(btnCP);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(200);
        click(btnCP);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(800);
        
        return this;
    }
	
}
