package PagObject_ConsultaDCD;

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

public class ConsultaDCDPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisar\"]");
	By btnOk=By.xpath("//div[7]/div/button");
	By lblResultadoRevicion=By.xpath("//div[8]/p");
	
	public ConsultaDCDPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Consulta DCD")
    public ConsultaDCDPage ConsultaDCD() {
        
        Utilidades.time(5000);
        click(btnDemostracion);
         Utilidades.time(3000);
        click(btnDCD);
        Utilidades.time(1000);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Revicion DCD")
    public ConsultaDCDPage RevicionDCD() {
		
		Utilidades.time(800);
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnRevisar);
		Utilidades.time(1000);
		
		return this;
	}
	
	@Step("Validar Revicion DCD")
    public ConsultaDCDPage ValidarRevicionDCD(String Resultado) {
		
		Utilidades.time(6000);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnOk);
        Utilidades.time(2000);
        Utilidades.screenshot();
		
		return this;
	}
	
}
