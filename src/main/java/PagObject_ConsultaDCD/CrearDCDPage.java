package PagObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class CrearDCDPage extends BasePage {
	
	By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	By btnNit=By.xpath("//*[@id=\"proveedorNit_div\"]/span");
	By txtNit=By.xpath("//*[@id=\"nitProveedor\"]");
	By btnDV=By.xpath("//*[@id=\"dvProveedor\"]");
	By btnSMes=By.xpath("//*[@id=\"idMonth\"]");
	By btnMes=By.xpath("//*[@id=\"idMonth\"]/option[10]");
	By btnSAno=By.xpath("//*[@id=\"idYear\"]");
	By btnAno=By.xpath("//*[@id=\"idYear\"]/option[3]");
	By btnProducto=By.xpath("//*[@id=\"idProducto\"]");
	By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnMercado=By.xpath("//*[@id=\"idMercado\"]");
	By btnMCI=By.xpath("//*[@id=\"idMercado\"]/option[6]");
	By btnKilos=By.xpath("//*[@id=\"idKgT\"]");
	By txtKilos=By.xpath("//*[@id=\"idKgT\"]");
	By btnExportar=By.xpath("//*[@id=\"option1\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnGuardar\"]");
	By btnOk=By.xpath("/html/body/div[5]/div[7]/div/button");
	By lblResultadoCrear=By.xpath("//div[5]/p");
	
	
	public CrearDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Crear DCD")
    public CrearDCDPage CrearDCD(String nit, String Proveedor, String Kilos) {
        Utilidades.time(2000);
        
        click(btnCrear);
        Utilidades.time(3000);
        click(btnNit);
        Utilidades.time(1000);
        writeText(txtNit, nit);
        click(btnDV);
        Utilidades.time(1000);
        click(btnSMes);
        click(btnMes);
        Utilidades.time(500);
        click(btnSAno);
        Utilidades.time(1000);
        click(btnAno);
        Utilidades.time(1000);
        click(btnProducto);
        Utilidades.time(1000);
        click(btnPalma);
        Utilidades.time(1000);
        click(btnMercado);
        Utilidades.time(1000);
        click(btnMCI);
        Utilidades.time(1000);
        click(btnKilos);
        Utilidades.time(1000);
        writeText(txtKilos, Kilos);
        Utilidades.time(1000);
        click(btnExportar);
        Utilidades.time(800);
        click(btnGuardar);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Validar Creacion DCD")
    public CrearDCDPage ValidarCreacionDCD(String resultado) {
        
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoCrear).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(3500);
        
        //Proceso realizado con éxito
        
        return this;
    }
}
