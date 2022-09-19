package PagObject_Trazabilidad;

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

public class ExcepcionTrazabilidadPage extends BasePage {
	
	By btnSMes=By.xpath("//*[@id=\"IdMes\"]");
	By btnMes=By.xpath("//*[@id=\"IdMes\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"IdAnio\"]");
	By btnAno=By.xpath("//*[@id=\"IdAnio\"]/option[3]");
	
	By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	By lblResultadoTrazabilidad=By.xpath("//p");
	By btnOk=By.xpath("//div[7]/div/button");
	
	public ExcepcionTrazabilidadPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Rellenar Trazabilidad")
    public ExcepcionTrazabilidadPage RellenarTrazabilidad() {
     
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
    public ExcepcionTrazabilidadPage ValidarResultadoTrazabilidad(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoTrazabilidad).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(6000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
         
        return this;
    }
}
