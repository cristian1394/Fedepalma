package PagObject_FormularioNuevoFFP;

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

public class FiltrarFFPPage extends BasePage {
	
	By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[3]/a");
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	By btnFMes=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[2]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	By btnTermina=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[6]");
	By txtMes=By.xpath("/html/body/div[6]/form/div[1]/input");//l
	By btnFiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnPalmero=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[3]/a[1]/span");
	By btnfiltro=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[5]");
	By txtPalmero=By.xpath("/html/body/div[7]/form/div[1]/input");//E
	By btnfiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnTipo=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	By txtTipo=By.xpath("/html/body/div[8]/form/div[1]/input");//inicial
	By btnFiltrarA=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	public FiltrarFFPPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Filtros FFP")
    public FiltrarFFPPage FiltrarFFP(String Termine, String Inicia, String Igual) {
        
        Utilidades.time(5000);
        click(btnFFP);
         Utilidades.time(3000);
        click(btnNuevoFFP);
        Utilidades.time(1000);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(200);
        Utilidades.screenshot();
		Utilidades.time(800);
		click(btnBuscar);
        Utilidades.time(15000);
        
        click(btnExportar);
        
        Utilidades.time(2500);
        click(btnFMes);
        Utilidades.time(2500);
        click(btnFiltro);
        Utilidades.time(1000);
        click(btnTermina);
        Utilidades.time(1000);
        writeText(txtMes, Termine);
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1300);
        click(btnPalmero);
        Utilidades.time(1000);
        click(btnfiltro);
        Utilidades.time(1000);
        click(btnComienza);
        Utilidades.time(1000);
        writeText(txtPalmero, Inicia);
        Utilidades.time(1000);
        click(btnfiltrar);
        Utilidades.time(1300);
        click(btnTipo);
        Utilidades.time(1000);
        writeText(txtTipo, Igual);
        Utilidades.time(1000);
        click(btnFiltrarA);
        Utilidades.time(1000);
        click(btnExportar);
        Utilidades.time(5000);
        Utilidades.screenshot();
        
        return this;
    }
	
}
