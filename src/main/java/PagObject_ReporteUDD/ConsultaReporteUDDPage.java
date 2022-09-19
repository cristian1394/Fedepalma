package PagObject_ReporteUDD;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_FormularioFDC.CargarDEXPage;
import PagObject_FormularioFDC.CrearFDCPage;
import PagObject_FormularioFDC.ObserverFDCPage;
import PagObject_FormularioFDC.RadicarDEXPage;
import PagObject_FormularioNuevoFFP.NuevaDeclaracionPage;
import PagObject_RevisionesRYP.IniciacionRYPPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class ConsultaReporteUDDPage extends BasePage {
	
	By btnDemostracionC=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnReporteUDD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[5]/a");
	
	By btnTipoD=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[1]/div[2]/div[2]/span");
	By btnFMM=By.xpath("//*[@id=\"TipoDemostracion_listbox\"]/li[2]");
	By btnPoliza=By.xpath("//*[@id=\"TipoDemostracion_listbox\"]/li[3]");
	
	By btnCalendario=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[2]/div[2]/div[2]/span/span/span[2]");
	By btnSMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[1]/td[1]/a");
	By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[4]/td[4]/a");
	By btnCalendario1=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[2]/div[2]/div[4]/span/span/span[2]");
	By btnSMes1=By.xpath("/html/body/div[6]/div/div/div[1]/a[2]");
	By btnMes1=By.xpath("/html/body/div[6]/div/div/div[2]/table/tbody/tr[3]/td[1]/a");
	By btnDia1=By.xpath("/html/body/div[6]/div/div/div[2]/table/tbody/tr[5]/td[5]/a");
	By btnBuscar=By.id("btnSearch");
	
	//Filtro
	
	By FiltroEntidad=By.xpath("/html/body/div[8]/form/div[1]/span/span");
	By btnFiltrarEntidad=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[1]/a[1]");
	By btnEmpieza=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[5]");
	By txtEntidad=By.xpath("/html/body/div[8]/form/div[1]/input");
	By btnFiltroEntidad=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By FiltroDCD=By.xpath("/html/body/div[9]/form/div[1]/span/span");
	By btnFiltrarDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[4]/a[1]");
	By btnNoContiene=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[4]");
	By txtDCD=By.xpath("/html/body/div[9]/form/div[1]/input");
	By btnFiltroDCD=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By FiltroProducto=By.xpath("/html/body/div[10]/form/div[1]/span/span");
	By btnFiltrarProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]");
	By btnContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[3]");
	By txtProducto=By.xpath("/html/body/div[10]/form/div[1]/input");
	By btnFiltroProducto=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	By FiltroPais=By.xpath("/html/body/div[11]/form/div[1]/span/span");
	By btnFiltrarPais=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[8]/a[1]");
	By txtPais=By.xpath("/html/body/div[11]/form/div[1]/input");
	By btnFiltroPais=By.xpath("/html/body/div[11]/form/div[1]/div[2]/button[1]");

	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public ConsultaReporteUDDPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Scroll vertibal abajo")
	public ConsultaReporteUDDPage ScrollAbajo() {

		Utilidades.time(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Utilidades.time(1000);

		return this;
	}
	
	@Step("Scroll vertibal abajo")
	public ConsultaReporteUDDPage ScrollAbajo1() {

		Utilidades.time(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Utilidades.time(1000);

		return this;
	}
	
	@Step("Evidencia")
	public ConsultaReporteUDDPage Evidencia() {

		Utilidades.time(3000);
		Utilidades.screenshot();
		Utilidades.time(3000);

		return this;
	}
	
	@Step("Iniciar Menu RYP")
    public ConsultaReporteUDDPage MenuRUDD() {
        Utilidades.time(5000);
        
  	   WebElement Element = driver.findElement(btnDemostracionC);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
         Utilidades.time(1000);
         click(btnDemostracionC);
         Utilidades.time(2000);
         WebElement Elements = driver.findElement(btnReporteUDD);
         JavascriptExecutor Js = (JavascriptExecutor) driver;
         Js.executeScript("arguments[0].scrollIntoView();", Elements);
          Utilidades.time(1000);
          Utilidades.screenshot();
          Utilidades.time(1000);
         click(btnReporteUDD);
         Utilidades.time(800);
 		Utilidades.screenshot();
         Utilidades.time(3000);
         
        return this;
    }
	
	@Step("Seleccionar Tipo de demostracion")
    public ConsultaReporteUDDPage TD() {
       
		Utilidades.time(2000);
		click(btnTipoD);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Seleccionar FMM")
    public ConsultaReporteUDDPage FMM() {
       
		Utilidades.time(2000);
		click(btnFMM);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Seleccionar Poliza")
    public ConsultaReporteUDDPage Poliza() {
		
		Utilidades.time(2000);
		click(btnPoliza);
        Utilidades.time(2000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Calendario")
    public ConsultaReporteUDDPage Calendario() {
		
        Utilidades.time(1000);
		click(btnCalendario);
        Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        return this;
    }
	
	@Step("Seleccionar Mes")
    public ConsultaReporteUDDPage SeleccionarMes() {
		
        Utilidades.time(500);
        click(btnSMes);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(200);
        click(btnMes);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(200);
        
        return this;
    }
	
	@Step("Seleccionar Dia")
    public ConsultaReporteUDDPage SeleccionarDia() {
		
        Utilidades.time(1000);
        click(btnDia);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        
        return this;
    }
	
	@Step("Calendario")
    public ConsultaReporteUDDPage Calendario1() {
		
        Utilidades.time(1000);
		click(btnCalendario1);
        Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        return this;
    }
	
	@Step("Seleccionar Mes")
    public ConsultaReporteUDDPage SeleccionarMes1() {
		
        Utilidades.time(500);
        click(btnSMes1);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(200);
        click(btnMes1);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(200);
        
        return this;
    }
	
	@Step("Seleccionar Dia")
    public ConsultaReporteUDDPage SeleccionarDia1() {
		
        Utilidades.time(1000);
        click(btnDia1);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        
        return this;
    }
	
	@Step("Buscar")
    public ConsultaReporteUDDPage Buscar() {
       
		Utilidades.time(1000);
        click(btnBuscar);
        Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        
        
        return this;
    }
	
	@Step("Filtro Entidad")
    public ConsultaReporteUDDPage FE(String Declarante)  {
       
		Utilidades.time(2000);
        click(btnFiltrarEntidad);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(FiltroEntidad);
		Utilidades.time(1000);
        click(btnEmpieza);
        Utilidades.time(1000);
        writeText(txtEntidad, Declarante);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroEntidad);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro DCD")
    public ConsultaReporteUDDPage FDCD(String Kg)  {
       
		Utilidades.time(1000);
        click(btnFiltrarDCD);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(FiltroDCD);
        Utilidades.time(1000);
        click(btnNoContiene);
        Utilidades.time(1000);
        writeText(txtDCD, Kg);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroDCD);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro Producto")
    public ConsultaReporteUDDPage FProducto(String Producto)  {
       
		Utilidades.time(1000);
        click(btnFiltrarProducto);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(FiltroProducto);
        Utilidades.time(1000);
        click(btnContiene);
        Utilidades.time(1000);
        writeText(txtProducto, Producto);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroProducto);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro Pais")
    public ConsultaReporteUDDPage FPais(String pais)  {
       
		Utilidades.time(1000);
        click(btnFiltrarPais);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(FiltroPais);
        Utilidades.time(1000);
        writeText(txtPais, pais);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroPais);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Exportar")
    public ConsultaReporteUDDPage Exportar() {
       
		Utilidades.time(1000);
        click(btnExportar);
        Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        
        
        return this;
    }
	
}
