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

public class InventariosCorreccionPage extends BasePage {
	
	By txtPalmaD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[2]/input");//232.022
	
	By txtPalmaoPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[3]/input");//95.509
	By txtPalmaoPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[3]/input");//145.432
	
	By txtPalmisteA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//39.999
	By txtPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[4]/input");//9.000
	By txtPalmisteD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[4]/input");//3.234
	
	By txtTotalPlama=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[8]/div/div[1]/div[2]/div[2]/input");//84.567.898
	By btnOk=By.xpath("/html/body/div[24]/div[7]/div/button");
	By btnGuardar=By.id("btnSaveDeclaration");
	By btnSi=By.xpath("/html/body/div[24]/div[7]/div/button");
	By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	
	By lblResultadoCorreccion=By.xpath("//p");
	
	public InventariosCorreccionPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Aceite Palma Crudo")
    public InventariosCorreccionPage AceitePalma(String PalmaD) {
        
		Utilidades.time(2000);
	  	   WebElement Element = driver.findElement(txtPalmaD);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        clear(txtPalmaD);
        Utilidades.time(500);
        writeText(txtPalmaD, PalmaD);
        Utilidades.time(800);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Aceite Palma o Palmiste Crudo")
    public InventariosCorreccionPage AceitePalmaOPalmiste(String PalmaoPalmiste, String PalmisteD) {
        
        Utilidades.time(1000);
        clear(txtPalmaoPalmiste);
        Utilidades.time(500);
        writeText(txtPalmaoPalmiste, PalmaoPalmiste);
        Utilidades.time(1000);
        clear(txtPalmaoPalmisteC);
        Utilidades.time(500);
        writeText(txtPalmaoPalmisteC, PalmisteD);
        Utilidades.time(800);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Aceite Palmiste Crudo")
    public InventariosCorreccionPage AceitePalmiste(String PalmisteA, String PalmisteC, String PalmisteD) {
        
        Utilidades.time(1000);
        clear(txtPalmisteA);
        Utilidades.time(500);
        writeText(txtPalmisteA, PalmisteA);
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
	
	@Step("Guardar Edicion")
    public InventariosCorreccionPage GuardarEdicion(String TotalPalma, String resultado) {
        
		Utilidades.time(1000);
        Utilidades.ByPixel();
        Utilidades.time(1000);
        clear(txtTotalPlama);
        Utilidades.time(500);
        writeText(txtTotalPlama, TotalPalma);
        Utilidades.time(800);
        Utilidades.screenshot();
        Utilidades.time(1000);
        Utilidades.time(1000);
        click(btnOk);
        Utilidades.time(1000);
	    click(btnGuardar);
        Utilidades.time(4500);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnOk);
        Utilidades.time(800);
        click(btnSi);
        Utilidades.time(4500);
        Assert.assertEquals(getElement(lblResultadoCorreccion).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnOK);
        Utilidades.time(8000);
        
        return this;
    }
}
