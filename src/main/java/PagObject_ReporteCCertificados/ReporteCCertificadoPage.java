package PagObject_ReporteCCertificados;

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

public class ReporteCCertificadoPage extends BasePage {
	
	By btnReportes=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[6]/a");
	By btnReporteCC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[6]/ul/li[13]/a");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[1]/a");
	//Paginacion
	
	By btnPagFinal=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[4]/a[4]");
	By btnPagInicial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[4]/a[1]");
	
	//Scroll
	
	By btnSAP=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[11]/a[1]");
	By btnFondo=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[16]/a[1]");
	
	//Filtro
	
	By FiltroPalmeros=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[1]/a[1]");
	By btnFiltrarPalmeros=By.xpath("/html/body/div[4]/form/div[1]/span/span");
	By btnEmpieza=By.xpath("/html/body/div[4]/form/div[2]/div/div[2]/ul/li[5]");
	By txtPalmeros=By.xpath("/html/body/div[4]/form/div[1]/input");
	By btnFiltroPalmeros=By.xpath("/html/body/div[4]/form/div[1]/div[2]/button[1]");
	
	By FiltroNit=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[2]/a[1]");
	By btnFiltrarNit=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	By txtNIT=By.xpath("/html/body/div[5]/form/div[1]/input");
	By btnFiltroNit=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By FiltroSCPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[4]/a[1]");
	By btnFiltrarVPalma=By.xpath("/html/body/div[6]/form/div[1]/span/span");
	By btnContiene=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[3]");
	By txtSCPalma=By.xpath("/html/body/div[6]/form/div[1]/input");
	By btnFiltroSCPalma=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By FiltroSCPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[6]/a[1]");
	By btnFiltrarVPalmaA=By.xpath("/html/body/div[7]/form/div[1]/span/span");
	By btnNoContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[4]");
	By txtSCPalmiste=By.xpath("/html/body/div[7]/form/div[1]/input");
	By btnFiltroSCPPalmiste=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");

	
	//FILTRO NIT
	
	By txtNIT1=By.xpath("/html/body/div[4]/form/div[1]/input");
	By btnFiltroNit1=By.xpath("/html/body/div[4]/form/div[1]/div[2]/button[1]");
	
	
	public ReporteCCertificadoPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Scroll vertibal abajo")
	public ReporteCCertificadoPage ScrollAbajo() {

		Utilidades.time(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Utilidades.time(1000);

		return this;
	}
	
	@Step("Scroll vertibal abajo")
	public ReporteCCertificadoPage ScrollAbajo1() {

		Utilidades.time(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Utilidades.time(1000);

		return this;
	}
	
	@Step("Deslizar Horizontal a la derecha")
	public ReporteCCertificadoPage ScrollDerecha() {
		Utilidades.time(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(btnSAP);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Utilidades.time(1000);
		
		return this;
	}
	
	@Step("Deslizar Horizontal a la derecha")
	public ReporteCCertificadoPage ScrollDerecha1() {
		Utilidades.time(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(btnFondo);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Utilidades.time(1000);
		
		return this;
	}
	
	@Step("Evidencia")
	public ReporteCCertificadoPage Evidencia() {

		Utilidades.time(3000);
		Utilidades.screenshot();
		Utilidades.time(3000);

		return this;
	}
	
	@Step("Iniciar Menu RYP")
    public ReporteCCertificadoPage MenuRCCertificado() {
		
        Utilidades.time(5000);
         click(btnReportes);
         Utilidades.time(2000);
         WebElement Elements = driver.findElement(btnReporteCC);
         JavascriptExecutor Js = (JavascriptExecutor) driver;
         Js.executeScript("arguments[0].scrollIntoView();", Elements);
          Utilidades.time(1000);
          Utilidades.screenshot();
          Utilidades.time(1000);
         click(btnReporteCC);
         Utilidades.time(800);
 		Utilidades.screenshot();
         Utilidades.time(3000);
         
        return this;
    }
	
	@Step("Exportar")
    public ReporteCCertificadoPage Exportar() {
       
		Utilidades.time(1000);
        click(btnExportar);
        Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        
        return this;
    }
	
	@Step("Filtro Palmeros")
    public ReporteCCertificadoPage FP(String Declarante)  {
       
		Utilidades.time(2000);
        click(FiltroPalmeros);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltrarPalmeros);
		Utilidades.time(1000);
        click(btnEmpieza);
        Utilidades.time(1000);
        writeText(txtPalmeros, Declarante);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroPalmeros);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro NIT")
    public ReporteCCertificadoPage FNIT(String Kg)  {
       
		Utilidades.time(1000);
        click(FiltroNit);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltrarNit);
        Utilidades.time(1000);
        click(btnTermina);
        Utilidades.time(1000);
        writeText(txtNIT, Kg);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroNit);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro Secuencia Cuota Palma")
    public ReporteCCertificadoPage FSCPalma(String Producto)  {
       
		Utilidades.time(1000);
        click(FiltroSCPalma);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltrarVPalma);
        Utilidades.time(1000);
        click(btnContiene);
        Utilidades.time(1000);
        writeText(txtSCPalma, Producto);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroSCPalma);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro Secuencia Cuota Palmiste")
    public ReporteCCertificadoPage FSCPalmiste(String pais)  {
       
		Utilidades.time(1000);
        click(FiltroSCPalmiste);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltrarVPalmaA);
        Utilidades.time(1000);
        click(btnNoContiene);
        Utilidades.time(1000);
        writeText(txtSCPalmiste, pais);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroSCPPalmiste);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Filtro NIT")
    public ReporteCCertificadoPage FNIT1(String Kg)  {
       
		Utilidades.time(1000);
        click(FiltroNit);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
        writeText(txtNIT, Kg);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnFiltroNit);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
	@Step("Paginacion")
    public ReporteCCertificadoPage Paginacion()  {
       
		Utilidades.time(1000);
        click(btnPagFinal);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnPagInicial);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1500);
        
        return this;
    }
	
}
