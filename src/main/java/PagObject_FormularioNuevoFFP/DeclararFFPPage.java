package PagObject_FormularioNuevoFFP;

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

import PagObject_ConsultaDCD.GenerarDCDPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class DeclararFFPPage extends BasePage {
	
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	By btnDeclarar=By.xpath("//*[@id=\"btnPresentarDeclaracion\"]"); 
	By btnok=By.xpath("//div[7]/div/button");  
                              
	
	By btnFirma=By.id("pass5");
	By txtFirma=By.id("pass5");
	By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	By btnOk=By.xpath("/html/body/div[4]/div[7]/div/button");
	By lblResultadoFirma=By.xpath("//div[5]/p");
	By lblResultadoGenerar=By.xpath("//div[7]/p");
	
	
	
	public DeclararFFPPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Declaracion Fiscal FFP")
    public DeclararFFPPage DeclararFFP() {
        
        Utilidades.time(5000);
        Utilidades.time(1800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(200);
        Utilidades.screenshot();
		Utilidades.time(800);
		click(btnBuscar);
		Utilidades.time(1200);
		Utilidades.screenshot();
        Utilidades.time(2500);
        click(btnEditar);
        Utilidades.time(3500);
        click(btnDeclarar);
        Utilidades.time(3000);
        click(btnok);
        Utilidades.time(1200);
        click(btnok);
        Utilidades.screenshot();
		
        return this;
    }
	
	@Step("Firma FFP")
	public DeclararFFPPage Firma(String Firma, String Resultado) {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		Utilidades.time(15000);
		click(btnFirma);
		Utilidades.time(1000);
		writeText(txtFirma, Firma);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnEnviar);
		Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(2000);
		click(btnSeguir);
		driver.switchTo().window((String) ventana.get(0));
        
		return this;
	}
	
	@Step("Salto de Pagina DCD")
	public DeclararFFPPage confirmar(String Resultado) {
		
		Utilidades.time(9000);
		Utilidades.screenshot();
		Utilidades.time(9000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
		return this;
	}
}
