package MapObject_Trazabilidad;

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

public class TrazabilidadPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a/span");
	By btnTrazabilidad=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[9]/a");
	By btnSMes=By.xpath("//*[@id=\"IdMes\"]");
	By btnMes=By.xpath("//*[@id=\"IdMes\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"IdAnio\"]");
	By btnAno=By.xpath("//*[@id=\"IdAnio\"]/option[2]");
	
	By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	By btnExportar=By.xpath("//*[@id=\"GridTrazabilidad\"]/div[1]/a");
	
	public TrazabilidadPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Rellenar Trazabilidad")
    public TrazabilidadPage Trazabilidad() {
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
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnConsultar);
        Utilidades.time(2500);
        Utilidades.screenshot();

         
        return this;
    }
	
	@Step("Exportar Formulario Trazabiidad")
    public TrazabilidadPage Exportar() {
		
		Utilidades.time(1000);
        click(btnExportar);
        Utilidades.time(10000);
        Utilidades.ByPixel();
        Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(1000);
         
        return this;
    }
}
