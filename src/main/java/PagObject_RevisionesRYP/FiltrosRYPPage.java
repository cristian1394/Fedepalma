package PagObject_RevisionesRYP;

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

public class FiltrosRYPPage extends BasePage {
	
	By btnAño=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[2]/a[1]/span");
	By txtAño=By.xpath("/html/body/div[5]/form/div[1]/input");//2021
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By lblMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[3]");
	By btnMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[3]");
	By txtMes=By.xpath("/html/body/div[6]/form/div[1]/input");//Mes
	By btnfiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[5]");
	By txtInicial=By.xpath("/html/body/div[7]/form/div[1]/input");//a
	By btnFiltrarD=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnNoContiene=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[4]");
	By txtProducto=By.xpath("/html/body/div[8]/form/div[1]/input");//Palmiste
	By btnFiltrarP=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By lblGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[9]");
	By btnGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[9]/a[1]/span");
	By txtTexto=By.xpath("/html/body/div[9]/form/div[1]/input");//Texto
	By btnfiltro=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/a");
	
	public FiltrosRYPPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Verificacion de Filtros RYP")
    public FiltrosRYPPage ValidarFiltrosRYP(String Año, String inicial, String producto, String Grupo) {
		
        Utilidades.time(2000);
        click(btnAño);
        Utilidades.time(900);
        writeText(txtAño, Año);
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        String Mes = getElement(lblMes).getText();
        Utilidades.time(800);
        click(btnMes);
        Utilidades.time(1000);
        click(btnFiltra);
        Utilidades.time(1000);
        click(btnContiene);
        Utilidades.time(900);
        writeText(txtMes, Mes);
        Utilidades.time(1000);
        click(btnfiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
		
        click(btnDeclarante);
        Utilidades.time(1000);
        click(btnFiltro);
        Utilidades.time(1000);
        click(btnComienza);
        Utilidades.time(800);
        writeText(txtInicial, inicial);
        Utilidades.time(1000);
        click(btnFiltrarD);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        click(btnProducto);
        Utilidades.time(1000);
        click(btnLista);
        Utilidades.time(1000);
        click(btnNoContiene);
        Utilidades.time(800);
        writeText(txtProducto, producto);
        Utilidades.time(1000);
        click(btnFiltrarP);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        
        Utilidades.time(800);
        click(btnGrupoMercado);
        Utilidades.time(1000);
        writeText(txtTexto, Grupo);
        Utilidades.time(1000);
        click(btnfiltro);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Verificacion de Exportacion")
    public FiltrosRYPPage ExportacionExcel() {
        
		Utilidades.time(1000);
		click(btnExportar);
		Utilidades.time(500);
		Utilidades.screenshot();
		Utilidades.time(3000);
		
        return this;
    }
	
}
