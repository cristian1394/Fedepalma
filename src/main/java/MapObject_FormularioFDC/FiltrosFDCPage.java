package MapObject_FormularioFDC;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_ConsultaDCD.FiltrosDCDPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class FiltrosFDCPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnNumero=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[1]");
	By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	By txtNumero=By.xpath("/html/body/div[6]/form/div[1]/input");//2
	By btnFiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnKgPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[1]/span");
	By txtKG=By.xpath("/html/body/div[7]/form/div[1]/input");//0
	By btnfiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnKgPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	By txtKg=By.xpath("/html/body/div[8]/form/div[1]/input");//0
	By btnFiltrarP=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By btnCreacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[10]/a[1]/span");
	By btnlista=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	By btnTermina=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[6]");
	By txtTermina=By.xpath("/html/body/div[9]/form/div[1]/input");//1
	By btnFiltrarC=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnEstado=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[12]/a[1]/span");
	By btnfiltra=By.xpath("/html/body/div[10]/form/div[1]/span/span/span[2]/span");
	By btnNoContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[4]");
	By txtBorrador=By.xpath("/html/body/div[10]/form/div[1]/input");//Texto
	By btnfiltro=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public FiltrosFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Validar Filtros FDC")
    public FiltrosFDCPage ValidarFiltrosFDC(String numero, String Kg, String Creacion, String Estado) {
        
        Utilidades.time(5000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(2000);
        click(btnDemostracion);
        Utilidades.time(1000);
        WebElement Elements = driver.findElement(btnFDC);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView();", Elements);
        Utilidades.time(1000);
        click(btnFDC);
         Utilidades.time(800);
		Utilidades.screenshot();
		Utilidades.time(10000);
		click(btnBuscar);
		Utilidades.time(1500);
        Utilidades.screenshot();
        
        click(btnNumero);
        Utilidades.time(1000);
        click(btnFiltra);
        Utilidades.time(1000);
        click(btnComienza);
        Utilidades.time(800);
        writeText(txtNumero, numero);
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        click(btnKgPalma);
        Utilidades.time(900);
        writeText(txtKG, Kg);
        Utilidades.time(1000);
        click(btnfiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        click(btnKgPalmiste);
        Utilidades.time(1000);
        click(btnLista);
        Utilidades.time(1000);
        click(btnDiferente);
        Utilidades.time(800);
        writeText(txtKg, Kg);
        Utilidades.time(1000);
        click(btnFiltrarP);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        click(btnCreacion);
        Utilidades.time(1000);
        click(btnlista);
        Utilidades.time(1000);
        click(btnTermina);
        Utilidades.time(800);
        writeText(txtTermina, Creacion);
        Utilidades.time(1000);
        click(btnFiltrarC);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        click(btnEstado);
        Utilidades.time(1000);
        click(btnfiltra);
        Utilidades.time(1000);
        click(btnNoContiene);
        Utilidades.time(900);
        writeText(txtBorrador, Estado);
        Utilidades.time(1000);
        click(btnfiltro);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        
        return this;
    }
	
	@Step("Verificacion de Exportacion FDC")
    public FiltrosFDCPage ExportacionExcel() {
        
		Utilidades.time(1000);
		click(btnExportar);
		Utilidades.time(500);
		Utilidades.screenshot();
		Utilidades.time(3000);
		
        return this;
    }
	
}
