package PagObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class BorrarDCDPage extends BasePage {

	By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]/div/i");
	By btnOk=By.xpath("/html/body/div[8]/div[7]/div/button");
	By btnObs=By.xpath("//*[@id=\"observaciones\"]");
	By txtObs=By.xpath("//*[@id=\"observaciones\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAnularConObs\"]");
	By btnOkey=By.xpath("/html/body/div[7]/div[7]/div/button");
	By lblResultadoBorrar=By.xpath("/html/body/div[7]/p");
	
	public BorrarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Eliminar DCD")
    public BorrarDCDPage BorrarDCD(String observaciones) {
		
        Utilidades.time(50000);
        click(btnBorrar);
        Utilidades.time(5000);
        Utilidades.screenshot();
        Utilidades.time(9000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnObs);
        Utilidades.time(800);
        writeText(txtObs, observaciones);
        Utilidades.time(1000);
        Utilidades.screenshot();
        click(btnGuardar);
        Utilidades.time(8000);
        
        return this;
    }
	
	@Step("Resultado de Eliminacion del DCD")
    public BorrarDCDPage ValidarResultadoBorrarDCD(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(6000);
        click(btnOkey);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
}
