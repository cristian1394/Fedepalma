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

public class PolizaEsFDCPage extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnPoliza=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	By txtPoli=By.xpath("//*[@id=\"numeroPoliza\"]");
	By btnConsulta=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	By btnSeleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");//Asocia
	By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By lblResultadoAdicionar=By.xpath("//div[21]/p");
	By btnOkey=By.xpath("/html/body/div[21]/div[7]/div/button");

	
	public PolizaEsFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ingresar a creacion FDC")
    public PolizaEsFDCPage CrearFDC() throws Exception {
	
	Utilidades.time(2000);
    click(btnCrear);
    Utilidades.time(1000);
    Utilidades.screenshot();
    Utilidades.time(3500);
    
    return this;
}
	
	@Step("Crear poliza")
    public PolizaEsFDCPage CrearPoliza(String resultado) throws Exception {
        Utilidades.time(1000);
        Utilidades.ByPixelA();
        Utilidades.time(1000);
        click(btnTDemo);
        Utilidades.time(3000);
        click(btnPoliza);
        Utilidades.time(2000);
        String [] Poliza = {"18190013",  "123456789",  "181900167", "181900491"};
        Random aleatorio = new Random();            
        int Poliza2 = aleatorio.nextInt(Poliza.length);
        System.out.println(Poliza[Poliza2]);
        String txtPoliza = String.valueOf(Poliza[Poliza2]);
        
        Utilidades.time(1000);
        writeText(txtPoli, txtPoliza);
        Utilidades.time(2000);
        click(btnConsulta);
        Utilidades.time(2000);
        click(btnFiltro);
        Utilidades.time(3000);
        click(btnSelect);
        Utilidades.time(1000);
        String Total = getElement(lblTotal).getText();
        Utilidades.time(2000);
        writeText(txtAsociar, Total);
//        Utilidades.waitInMs(1000);
//        click(btnSeleccionar);
//        Utilidades.waitInMs(1000);
//        String Totals = getElement(lblTotals).getText();
//        Utilidades.waitInMs(2000);
//        writeText(txtasociar, Totals);
        Utilidades.time(2500);
        click(btnAdicionar);
        Utilidades.time(18000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOkey);
        Utilidades.time(2000);
    	Utilidades.ByPixel();
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3500);
        
        return this;
    }
	
}
