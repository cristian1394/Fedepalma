package PagObject_FormularioNuevoFFP;

import java.io.File;
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

public class InventariosEdicionPage extends BasePage {
	
	By txtPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[2]/input");//937.375
	By txtPalmaA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[2]/input");//67.890.987
	By txtPalmaB=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[2]/input");//65.456.789
	By txtPalmaC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[2]/input");//45.678.987
	By txtPalmaD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[2]/input");//232.022
	
	By txtPalmaoPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[3]/input");//95.509
	By txtPalmaoPalmisteA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[3]/input");//12.345.654
	By txtPalmaoPalmisteB=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[3]/input");//123.432
	By txtPalmaoPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[3]/input");//145.432
	By txtPalmaoPalmisteD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[3]/input");//2.345.432
	
	By txtPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[4]/input");//465.544
	By txtPalmisteA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//39.999
	By txtPalmisteB=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[4]/input");//234.321
	By txtPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[4]/input");//9.000
	By txtPalmisteD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[4]/input");//3.234
	
	By btnPresentar=By.xpath("//*[@id=\"btnPresentarDeclaracion\"]");
	By btnOk=By.xpath("/html/body/div[21]/div[7]/div/button");
	
	By btnGuardar=By.id("btnSaveDeclaration");
	By btnSi=By.xpath("/html/body/div[25]/div[7]/div/button");
	By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	
	public InventariosEdicionPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Aceite Palma Crudo")
    public InventariosEdicionPage AceitePalma(String Palma, String PalmaA, String PalmaB, String PalmaC, String PalmaD) {
        
		Utilidades.time(2000);
	  	   WebElement Element = driver.findElement(txtPalma);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        clear(txtPalma);
        Utilidades.time(500);
        writeText(txtPalma, Palma);
        Utilidades.time(2000);
        clear(txtPalmaA);
        Utilidades.time(500);
        writeText(txtPalmaA, PalmaA);
        Utilidades.time(1000);
        clear(txtPalmaB);
        Utilidades.time(500);
        writeText(txtPalmaB, PalmaB);
        Utilidades.time(1000);
        clear(txtPalmaC);
        Utilidades.time(500);
        writeText(txtPalmaC, PalmaC);
        Utilidades.time(1000);
        clear(txtPalmaD);
        Utilidades.time(500);
        writeText(txtPalmaD, PalmaD);
        Utilidades.time(800);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Aceite Palma o Palmiste Crudo")
    public InventariosEdicionPage AceitePalmaOPalmiste(String PalmaoPalmiste, String PalmaoPalmisteA, String PalmaoPalmisteB, String PalmaoPalmisteC, String PalmaoPalmisteD) {
        
        Utilidades.time(1000);
        clear(txtPalmaoPalmiste);
        Utilidades.time(500);
        writeText(txtPalmaoPalmiste, PalmaoPalmiste);
        Utilidades.time(1000);
        clear(txtPalmaoPalmisteA);
        Utilidades.time(500);
        writeText(txtPalmaoPalmisteA, PalmaoPalmisteA);
        Utilidades.time(1000);
        clear(txtPalmaoPalmisteB);
        Utilidades.time(500);
        writeText(txtPalmaoPalmisteB, PalmaoPalmisteB);
        Utilidades.time(1000);
        clear(txtPalmaoPalmisteC);
        Utilidades.time(500);
        writeText(txtPalmaoPalmisteC, PalmaoPalmisteC);
        Utilidades.time(1000);
        clear(txtPalmaoPalmisteD);
        Utilidades.time(500);
        writeText(txtPalmaoPalmisteD, PalmaoPalmisteD);
        Utilidades.time(800);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Aceite Palmiste Crudo")
    public InventariosEdicionPage AceitePalmiste(String Palmiste, String PalmisteA, String PalmisteB, String PalmisteC, String PalmisteD) {
        
        Utilidades.time(1000);
        clear(txtPalmiste);
        Utilidades.time(500);
        writeText(txtPalmiste, Palmiste);
        Utilidades.time(1000);
        clear(txtPalmisteA);
        Utilidades.time(500);
        writeText(txtPalmisteA, PalmisteA);
        Utilidades.time(1000);
        clear(txtPalmisteB);
        Utilidades.time(500);
        writeText(txtPalmisteB, PalmisteB);
        Utilidades.time(1000);
        clear(txtPalmisteC);
        Utilidades.time(500);
        writeText(txtPalmisteC, PalmisteC);
        Utilidades.time(1000);
        clear(txtPalmisteD);
        Utilidades.time(500);
        writeText(txtPalmisteD, PalmisteD);
        Utilidades.time(800);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Presentar Declaracion")
    public InventariosEdicionPage PresentarDeclaracion() {
        
        Utilidades.time(1000);
        click(btnPresentar);
        Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(3500);
        click(btnOk);
        Utilidades.time(3000);
        
        return this;
    }
	
	@Step("Total Plama Crudo")
    public InventariosEdicionPage GuardarEdicion() {
        
        Utilidades.time(1000);
        click(btnGuardar);
        Utilidades.time(4500);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnOk);
        Utilidades.time(3000);
        click(btnOK);
        Utilidades.time(8000);
        
        return this;
    }
}
