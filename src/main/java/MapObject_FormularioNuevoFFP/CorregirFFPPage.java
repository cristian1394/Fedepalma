package MapObject_FormularioNuevoFFP;

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

public class CorregirFFPPage extends BasePage {
	
	By btnCorreccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[8]/div/i");
	By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	
	By txtRPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[2]/input");
	
	By btnCompraIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[3]/input");
	By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[9]/div/div/div/div[2]/div[4]/div[1]/div[2]/div/table/thead/tr/th[2]/input");
	By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[9]/div/div/div/div[2]/div[4]/div[2]/button");
	By btnSi=By.xpath("/html/body/div[25]/div[7]/div/button");
	By txtNitE=By.xpath("//*[@id=\"NitRPA\"]");
	By txtkg=By.xpath("//*[@id=\"FruitRPA\"]");
	By btnAdicionarRPA=By.xpath("//*[@id=\"btnFrmRPA\"]");
	By btnCargaRPA=By.id("file4");
	By btnGuardarRPA=By.id("btnRPA");
	
	By btnRecibidaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div/input");
	By btnSelector=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[2]/div[4]/div[1]/div[2]/div/table/thead/tr/th[2]/input");
	By btnEliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[2]/div[4]/div[2]/button");
	By btnConfirmar=By.xpath("/html/body/div[24]/div[7]/div/button");
	By txtNitF=By.xpath("//*[@id=\"NitARPM\"]");
	By txtKg=By.xpath("//*[@id=\"FruitARPM\"]");//345.678
	By btnAdicionarARPM=By.xpath("//*[@id=\"btnFrmARPM\"]");
	By btnCargaARPM=By.id("file5");
	By btnGuardarARPM=By.id("btnARPM");
	//
	
	By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public CorregirFFPPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Correccion FFP")
    public CorregirFFPPage CorreccionFFP(String PropiosH, String InicialFrutoG, String InicialFrutoH, String BajaFrutoG) {
        
        Utilidades.time(2000);
        click(btnCorreccion);
        Utilidades.time(15000);
        clear(txtCultivosH);
        Utilidades.time(500);
        writeText(txtCultivosH, PropiosH);
        Utilidades.time(2000);
        clear(txtInicialFrutoG);
        Utilidades.time(500);
		writeText(txtInicialFrutoG, InicialFrutoG);
        Utilidades.time(1000);
        clear(txtInicialFrutoH);
        Utilidades.time(500);
        writeText(txtInicialFrutoH, InicialFrutoH);
        Utilidades.time(2000);
        clear(txtBajaFrutoG);
        Utilidades.time(500);
        writeText(txtBajaFrutoG, BajaFrutoG);
        Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Proveedores de Almendra FFP")
    public CorregirFFPPage ProveedoresAlmendra(String RPalmaIngresada, String DocRPA, String KG) {
		
		Utilidades.time(1500);
        writeText(txtRPalmaIngresada, RPalmaIngresada);
        Utilidades.time(1500);
        click(btnCompraIngresada);
        Utilidades.time(1500);
        click(btnSeleccion);
        Utilidades.time(1500);
        WebElement Element = driver.findElement(btnBorrar);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
         Utilidades.time(1000);
         click(btnBorrar);
         Utilidades.time(2000);
        click(btnSi);
        Utilidades.time(2000);
        String [] Nit = {"10050467882", "6088235", "860002527", "2155004", "32005286"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtNitE, txtNit);
        Utilidades.time(1000);
        writeText(txtkg, KG);
        Utilidades.time(1000);
        click(btnAdicionarRPA);
        Utilidades.time(2500);
		 File file = new File(DocRPA);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnCargaRPA);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(10000);
		Utilidades.screenshot();
		Utilidades.time(8000);
        click(btnGuardarRPA);
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Almendra Recibida FFP")
    public CorregirFFPPage AlmendraRecibida (String DocARPM, String KG, String PalmisteRecibida ) {
		
		
        Utilidades.time(1000);
        click(btnRecibidaIngresada);
        Utilidades.time(1500);
        click(btnSelector);
        Utilidades.time(1500);
        WebElement Element = driver.findElement(btnEliminar);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
         Utilidades.time(1000);
         click(btnEliminar);
         Utilidades.time(2000);
        click(btnConfirmar);
        Utilidades.time(1000);
        String [] Nit = {"12457001", "12516054", "816004403", "1093911400", "900754604"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtNitF, txtNit);
        Utilidades.time(1000);
        writeText(txtKg, KG);
        Utilidades.time(1000);
        click(btnAdicionarARPM);
        Utilidades.time(2500);
		 File file = new File(DocARPM);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnCargaARPM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(5000);
        click(btnGuardarARPM);
        Utilidades.time(2000);
        clear(txtProducidaRecibida);
        Utilidades.time(1000);
        writeText(txtProducidaRecibida, PalmisteRecibida);
        Utilidades.time(1000);
        
        
        return this;
    }
}
