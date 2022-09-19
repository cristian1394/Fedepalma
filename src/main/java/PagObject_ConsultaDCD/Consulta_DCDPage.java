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

public class Consulta_DCDPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");
	By txtProveedor=By.id("idNitProveedor");//C.i. Tequendama S.A.S.
	By btnCI=By.xpath("//*[@id=\"idNitProveedor_listbox\"]/li");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	By btnProducto=By.xpath("//*[@id=\"idProductos\"]");
	By btnPalma=By.xpath("//*[@id=\"idProductos\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public Consulta_DCDPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Consulta DCD")
    public Consulta_DCDPage ConsultaDCD(String Proveedor) {
        
        Utilidades.time(5000);
        click(btnDemostracion);
         Utilidades.time(3000);
        click(btnDCD);
        Utilidades.time(1000);
        click(btnProveedor);
        Utilidades.time(500);
        writeText(txtProveedor, Proveedor);
        Utilidades.time(1000);
        click(btnCI);
        Utilidades.time(1800);
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
	
}
