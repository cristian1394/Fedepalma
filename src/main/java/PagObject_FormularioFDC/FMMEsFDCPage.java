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

public class FMMEsFDCPage extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	By txtFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//Asocia
	By btnSeleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");
	
	By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");

	
	public FMMEsFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
   	@Step("Ingresar a creacion FDC")
    public FMMEsFDCPage CrearFDC() throws Exception {
	
	Utilidades.time(2000);
    click(btnCrear);
    Utilidades.time(1000);
    Utilidades.screenshot();
    Utilidades.time(3500);
    
    return this;
}
	
	@Step("Crear FMM")
    public FMMEsFDCPage CrearFMM(String resultado) throws Exception {
        
        click(btnTipoDemo);
        Utilidades.time(1000);
        click(btnFMM);
        Utilidades.time(2000);
        String [] FMM = {"733012",  "2037413",  "1234567",  "18000200"};
        Random aleatorio = new Random();            
        int FMM2 = aleatorio.nextInt(FMM.length);
        System.out.println(FMM[FMM2]);
        String txtFMM = String.valueOf(FMM[FMM2]);
        
        Utilidades.time(1000);
        writeText(txtFmm, txtFMM);
        Utilidades.time(2000);
        click(btnConsultar);
        Utilidades.time(2000);
        click(btnFiltro);
        Utilidades.time(5000);
        click(btnSelect);
        Utilidades.time(1000);
        String Total = getElement(lblTotal).getText();
        Utilidades.time(2000);
        writeText(txtAsociar, Total);
        Utilidades.time(1500);
        click(btnSeleccionar);
        Utilidades.time(1000);
        String Totals = getElement(lblTotals).getText();
        Utilidades.time(2000);
        writeText(txtasociar, Totals);
        Utilidades.time(3000);
        click(btnAdi);
        Utilidades.time(18000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOk);
        Utilidades.time(2000);
    	Utilidades.ByPixel();
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3500);
        
        return this;
    }

	
}
