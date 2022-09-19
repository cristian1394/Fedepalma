package PagObject_ConsultaDCD;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class GenerarDCDPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");
	By txtProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");//C.i. Tequendama S.A.S.
	By btnCI=By.xpath("//*[@id=\"idNitProveedor-list\"]/div[2]");
	By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	By btnRevisado= By.xpath("//*[@id=\"IdEstado\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[3]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/input[1]");
	By btnGenerar=By.xpath("//*[@id=\"btnGenerar\"]");
	By btnFirmar=By.xpath("//*[@id=\"btnGenerarMasivo\"]");
	By btnFirma=By.xpath("//*[@id=\"pass5\"]");
	By txtFirma=By.xpath("//*[@id=\"pass5\"]");
	By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By lblResultadoFirma=By.xpath("//div[5]/p");
	By lblResultadoGenerar=By.xpath("//div[7]/p");
	
	public GenerarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Generar DCD")
    public GenerarDCDPage GenerarDCD() {
        Utilidades.time(1000);
        
         click(btnDemostracion);
         Utilidades.screenshot();
          Utilidades.time(1000);
         click(btnDCD);
         Utilidades.time(800);
		click(btnEstado);
		Utilidades.time(1000);
		click(btnRevisado);
		Utilidades.screenshot();
		Utilidades.time(1000);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
		click(btnBuscar);
		Utilidades.time(8000);
		click(btnSeleccion);
		Utilidades.screenshot();
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnGenerar);
		Utilidades.screenshot();
		Utilidades.time(1500);
		click(btnFirmar);
		Utilidades.screenshot();
		
		
        return this;
    }
	
	@Step("Firma DCD")
	public GenerarDCDPage Firma(String Firma, String Resultado) {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		Utilidades.time(20000);
		click(btnFirma);
		Utilidades.time(1000);
		writeText(txtFirma, Firma);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnEnviar);
		Utilidades.time(5000);
		Assert.assertEquals(getElement(lblResultadoFirma).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(3000);
		click(btnSeguir);
		driver.switchTo().window((String) ventana.get(0));
        
		return this;
	}
	
	@Step("Salto de Pagina DCD")
	public GenerarDCDPage confirmar(String Resultado) {
		
		Utilidades.time(9000);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(2000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
		return this;
	}

}

