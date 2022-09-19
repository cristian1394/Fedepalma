package PagObject_FormularioFDC;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class DEXEsFDCPage extends BasePage {
	
	By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	By txtDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	By btnseleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");
	By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	public DEXEsFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
        
        
    @Step("Crear DEX")
    public DEXEsFDCPage CrearDEX(String resultado) throws Exception {
        
    	Utilidades.time(3000);
        click(btnCrear);
        Utilidades.time(5000);
        String [] Dex = {"1234567", "18190015",  "292929", "920012"};
        Random aleatorio = new Random();            
        int Dex2 = aleatorio.nextInt(Dex.length);
        System.out.println(Dex[Dex2]);
        String txtDex = String.valueOf(Dex[Dex2]);
        
        Utilidades.time(1000);
        writeText(txtDEX, txtDex);
        Utilidades.time(1000);
        click(btnConsultar);
        Utilidades.time(2300);
        click(btnFiltro);
        Utilidades.time(1500);
        click(btnSeleccion);
        Utilidades.time(1500);
        click(btnseleccion);
        Utilidades.time(1500);
        String Total = getElement(lblTotal).getText();
        Utilidades.time(2000);
        writeText(txtAsociar, Total);
        Utilidades.time(2200);
        String Totals = getElement(lblTotals).getText();
        Utilidades.time(2000);
        writeText(txtasociar, Totals);
        Utilidades.time(1000);
        click(btnAdicionar);
        Utilidades.time(18000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(5000);
        click(btnOk);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3500);
        
        return this;
    }

}
