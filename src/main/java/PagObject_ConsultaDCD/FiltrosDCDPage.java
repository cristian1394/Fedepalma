package PagObject_ConsultaDCD;

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

public class FiltrosDCDPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnBuscar=By.id("btnSearch");
	By btnProveedor=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[3]");
	By txtPalma=By.xpath("/html/body/div[7]/form/div[1]/input");//Palma
	By btnFiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");

	By lblProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[10]");
	By btnProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[10]/a[1]/span");
	By txtAceite=By.xpath("/html/body/div[8]/form/div[1]/input");//Aceite
	By btnfiltrar=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By lblEstadoDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[12]");
	By btnEstadoDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[12]/a[1]/span");
	By btnfiltra=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[5]");
	By txtTexto=By.xpath("/html/body/div[9]/form/div[1]/input");//Texto
	By btnfiltro=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public FiltrosDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Verificacion de Filtros DCD")
    public FiltrosDCDPage VerificacionFiltrosDCD(String Decla) {
        
        Utilidades.time(5000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(2000);
        click(btnDemostracion);
        Utilidades.time(2000);
        WebElement Elements = driver.findElement(btnDCD);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView();", Elements);
        Utilidades.time(1000);
        click(btnDCD);
         Utilidades.time(800);
		Utilidades.screenshot();
		Utilidades.time(600);
		click(btnBuscar);
		Utilidades.time(15000);
        Utilidades.screenshot();
        
        click(btnProveedor);
        Utilidades.time(1500);
        click(btnFiltra);
        Utilidades.time(1000);
        click(btnContiene);
        Utilidades.time(800);
        writeText(txtPalma, Decla);
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        String Aceite = getElement(lblProducto).getText();
        Utilidades.time(800);
        click(btnProducto);
        Utilidades.time(900);
        writeText(txtAceite, Aceite);
        Utilidades.time(1000);
        click(btnfiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        String texto = getElement(lblEstadoDCD).getText();
        Utilidades.time(800);
        click(btnEstadoDCD);
        Utilidades.time(1000);
        click(btnfiltra);
        Utilidades.time(1000);
        click(btnComienza);
        Utilidades.time(900);
        writeText(txtTexto, texto);
        Utilidades.time(1000);
        click(btnfiltro);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Verificacion de Exportacion DCD")
    public FiltrosDCDPage ExportacionExcel() {
        
		Utilidades.time(1000);
		click(btnExportar);
		Utilidades.time(500);
		Utilidades.screenshot();
		Utilidades.time(3000);
		
        return this;
    }
	
}
