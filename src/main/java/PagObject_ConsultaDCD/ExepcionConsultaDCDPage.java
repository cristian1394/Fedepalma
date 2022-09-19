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

public class ExepcionConsultaDCDPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[12]");
	By btnProducto=By.xpath("//*[@id=\"idProductos\"]");
	By btnPalma=By.xpath("//*[@id=\"idProductos\"]/option[2]");
	By btnBuscar=By.id("btnSearch");
	By btnOK=By.xpath("//div[7]/div/button");
	By lblResultadoOK=By.xpath("//div[8]/p");
	
	public ExepcionConsultaDCDPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Consulta DCD")
    public ExepcionConsultaDCDPage ConsultaDCD() {
        
        Utilidades.time(5000);
        click(btnDemostracion);
         Utilidades.time(3000);
        click(btnDCD);
        Utilidades.time(1000);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
        Utilidades.time(1000);
        click(btnProducto);
        Utilidades.time(800);
        click(btnPalma);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
        Utilidades.time(3500);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Resultado No existen datos en la busqueda")
    public ExepcionConsultaDCDPage ValidarResultadoDCD(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoOK).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(6000);
        click(btnOK);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
}
