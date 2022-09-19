package PagObject_SecretariaTecnica;

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

public class FiltrosSecretariaTPage extends BasePage {
	
	By btnMes=By.xpath("//html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	By txtMes=By.xpath("/html/body/div[5]/form/div[1]/input");//o
	By btnfiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	By txtInicial=By.xpath("/html/body/div[6]/form/div[1]/input");//e
	By btnFiltrarD=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By lblComprador=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[6]");
	By btnComprador=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[6]/a[1]/span");
	By txtComprador=By.xpath("/html/body/div[7]/form/div[1]/input");//2021
	By btnFiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[7]/a[1]/span");
	By btnfiltra=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	By txtDCD=By.xpath("/html/body/div[8]/form/div[1]/input");//2
	By btnfiltro=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By lblProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[8]");
	By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[3]");
	By txtProducto=By.xpath("/html/body/div[9]/form/div[1]/input");//Producto
	By btnFiltrarP=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/a");
	
	public FiltrosSecretariaTPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Verificacion de Filtros")
    public FiltrosSecretariaTPage ValidarFiltrosST(String Termina, String Inicia, String DCD) {

        Utilidades.time(800);
        click(btnMes);
        Utilidades.time(1000);
        click(btnFiltra);
        Utilidades.time(1000);
        click(btnTermina);
        Utilidades.time(900);
        writeText(txtMes, Termina);
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
        writeText(txtInicial, Inicia);
        Utilidades.time(1000);
        click(btnFiltrarD);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        String Comprador = getElement(lblComprador).getText();
        click(btnComprador);
        Utilidades.time(900);
        writeText(txtComprador, Comprador);
        Utilidades.time(1000);
        click(btnFiltrar);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        Utilidades.time(800);
        click(btnDCD);
        Utilidades.time(1000);
        click(btnfiltra);
        Utilidades.time(1000);
        click(btnDiferente);
        Utilidades.time(900);
        writeText(txtDCD, DCD);
        Utilidades.time(1000);
        click(btnfiltro);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto);
        Utilidades.time(1000);
        click(btnLista);
        Utilidades.time(1000);
        click(btnContiene);
        Utilidades.time(800);
        writeText(txtProducto, Producto);
        Utilidades.time(1000);
        click(btnFiltrarP);
        Utilidades.time(1000);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Verificacion de Exportacion")
    public FiltrosSecretariaTPage ExportacionExcel() {
        
		Utilidades.time(1000);
		click(btnExportar);
		Utilidades.time(500);
		Utilidades.screenshot();
		Utilidades.time(3000);
		
        return this;
    }
	
}
