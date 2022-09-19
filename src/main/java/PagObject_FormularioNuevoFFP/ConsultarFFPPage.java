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

public class ConsultarFFPPage extends BasePage {
	
	By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[8]/a");
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnOk=By.xpath("//div[7]/div/button");
	
	public ConsultarFFPPage(WebDriver driver) {
		super(driver);
	}
	
	
	@Step("Consulta FFP")
    public ConsultarFFPPage Consulta_FFP() {
        
		 Utilidades.time(7000);
	        click(btnFFP);
	         Utilidades.time(3000);
	        click(btnNuevoFFP);
	        Utilidades.time(1800);
	        click(btnSMes);
	        Utilidades.time(800);
	        click(btnMes);
	        Utilidades.time(800);
	        click(btnSAno);
	        Utilidades.time(800);
	        click(btnAno);
	        Utilidades.time(200);
	        Utilidades.screenshot();
			Utilidades.time(800);
			click(btnBuscar);
			Utilidades.time(1200);
			Utilidades.screenshot();
	        Utilidades.time(2500);
	        click(btnOk);
			Utilidades.time(3000);
        
        
        return this;
    }
}
