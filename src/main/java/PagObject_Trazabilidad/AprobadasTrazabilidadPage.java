package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class AprobadasTrazabilidadPage extends BasePage {
	
	By btnAprobadas=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/input");
	By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/div[1]/a");
	
	/*By btnMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	By txtMes=By.xpath("/html/body/div[5]/form/div[1]/input");//e
	By btnfiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[4]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	By txtInicial=By.xpath("/html/body/div[6]/form/div[1]/input");//c
	By btnFiltrarD=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnComprador=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnlista=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[3]");
	By txtContiene=By.xpath("/html/body/div[7]/form/div[1]/input");//t
	By btnFiltrarC=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[6]/a[1]/span");
	By btnfiltra=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	By txtDCD=By.xpath("/html/body/div[8]/form/div[1]/input");//50
	By btnFiltrar=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By lblProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[7]");
	By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[7]/a[1]/span");
	By txtProducto=By.xpath("/html/body/div[9]/form/div[1]/input");
	By btnFiltrarP=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[10]/form/div[1]/span/span/span[2]/span");
	By btnNoContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[4]");
	By txtGrupo=By.xpath("/html/body/div[10]/form/div[1]/input");//colombia
	By btnFiltrarG=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	*/
	By btnVer=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/i");
	
	public AprobadasTrazabilidadPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("compensaciones Aprobadas en trámite")
    public AprobadasTrazabilidadPage AprobadasTrazabilidad() {
		
		Utilidades.time(300);
        click(btnAprobadas);
        Utilidades.time(1000);
        click(btnConsultar);
        Utilidades.time(1000);
        
        Utilidades.time(1500);
        click(btnExportar);
        
        /*Utilidades.waitInMs(1000);
        click(btnFiltra);
        Utilidades.waitInMs(1000);
        click(btnTermina);
        Utilidades.waitInMs(900);
        writeText(txtMes, Inicia);
        Utilidades.waitInMs(1000);
        click(btnfiltrar);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		
        click(btnDeclarante);
        Utilidades.waitInMs(1000);
        click(btnFiltro);
        Utilidades.waitInMs(1000);
        click(btnComienza);
        Utilidades.waitInMs(800);
        writeText(txtInicial, Declarante);
        Utilidades.waitInMs(1000);
        click(btnFiltrarD);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        
        click(btnComprador);
        Utilidades.waitInMs(900);
        click(btnlista);
        Utilidades.waitInMs(1000);
        click(btnContiene);
        Utilidades.waitInMs(800);
        writeText(txtContiene, Contiene);
        Utilidades.waitInMs(1000);
        click(btnFiltrarC);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        
        Utilidades.waitInMs(800);
        click(btnDCD);
        Utilidades.waitInMs(1000);
        click(btnfiltra);
        Utilidades.waitInMs(1000);
        click(btnDiferente);
        Utilidades.waitInMs(900);
        writeText(txtDCD, Dcd);
        Utilidades.waitInMs(1000);
        click(btnFiltrar);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto);
        Utilidades.waitInMs(1000);
        writeText(txtProducto, Producto);
        Utilidades.waitInMs(1000);
        click(btnFiltrarP);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        
        Utilidades.waitInMs(800);
        click(btnGrupoMercado);
        Utilidades.waitInMs(1000);
        click(btnLista);
        Utilidades.waitInMs(1000);
        click(btnNoContiene);
        Utilidades.waitInMs(900);
        writeText(txtGrupo, Grupo);
        Utilidades.waitInMs(1000);
        click(btnFiltrarG);
        */
        Utilidades.time(6000);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Observar Trazabilidad")
    public AprobadasTrazabilidadPage VerTrazabilidad() {

		Utilidades.time(800);
		click(btnVer);
		Utilidades.time(500);
		Utilidades.screenshot();
        Utilidades.time(10000);
        
        return this;
    }
}
