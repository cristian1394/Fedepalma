package MapObject_FormularioFDC;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class DEXFDCPage extends BasePage {
	

	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");

	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSAS=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//kg
	By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	By btnSMes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	By btnAño=By.xpath("/html/body/div[9]/div/div/div[1]/a[1]");
	By btnMes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	By btnPais=By.xpath("//*[@id=\"PaisDEX\"]");
	By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");//Pais
	By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//producto
	By btnPalmiste=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[2]");
	By btnKg=By.xpath("//*[@id=\"kgExportados\"]");
	By txtKg=By.xpath("//*[@id=\"kgExportados\"]");//kg
	By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	
	By btnTipoProd=By.xpath("//*[@id=\"idProducto\"]");
	By btnpalmiste=By.xpath("//*[@id=\"idProducto\"]/option[3]");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");


	
	public DEXFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ingresar DEX Palma")
    public DEXFDCPage IngresarDEXPalma() {
        Utilidades.time(2000);
        
        click(btnSAS);
        Utilidades.time(1000);
        click(btnAsociar);
        Utilidades.time(1000);
        
        String Total = getElement(lblTotal).getText();
        Utilidades.time(1000);
        click(btnAsociar);
        writeText(txtAsociar, Total);
        Utilidades.time(1000);
        click(btnAdi);
        Utilidades.time(20000);
        click(btnOk);
        Utilidades.time(2000);
        
        return this;
    }
        
        
    @Step("Crear DEX Palmiste")
    public DEXFDCPage CrearDEXPalmiste(String Pais, String Producto) throws Exception {
        
    	Utilidades.time(5000);
    	click(btnDEX);
    	Utilidades.time(2000);
        numeroAleatorio();
        Utilidades.time(2000);
        click(btnCalendario);
        Utilidades.time(1000);
        click(btnSMes);
        Utilidades.time(1000);
        click(btnAño);
        Utilidades.time(1000);
        click(btnMes);
        Utilidades.time(1000);
        click(btnDia);
        Utilidades.time(1000);
        click(btnPais);
        Utilidades.time(1000);
        writeText(txtPais, Pais);
        Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnTipoProd);
        Utilidades.time(1000);
        click(btnpalmiste);
        Utilidades.time(1000);
        click(btnConsultar);
        Utilidades.time(5000);
        click(btnDemostrados);
        Utilidades.time(1000);
        String Totales = getElement(lblTotal).getText();
        
        Utilidades.time(1000);
        click(btnPExpo);
        Utilidades.time(1000);
        click(btnProducto);
        Utilidades.time(1000);
        writeText(txtProducto, Producto);
        Utilidades.time(1000);
        click(btnPalmiste);
        Utilidades.time(1000);
        click(btnKg);
        Utilidades.time(1000);
        writeText(txtKg, Totales);
        Utilidades.time(1000);
        click(btnAdicionar);
        Utilidades.time(800);
        click(btnGuardar);
        
        Utilidades.screenshot();
        Utilidades.time(3500);
        
        return this;
    }
	
	@Step("Ingresar DEX Palmiste")
    public DEXFDCPage IngresarDEXPalmiste(String resultado) {
		
        Utilidades.time(4000);
        click(btnSAS);
        Utilidades.time(1000);
        String Totals = getElement(lblTotal).getText();
        Utilidades.time(1000);
        click(btnAsociar);
        writeText(txtAsociar, Totals);
        Utilidades.time(1000);
        click(btnAdi);
        Utilidades.time(20000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(5000);
        click(btnOk);
        
        return this;
	}
	
public void numeroAleatorio()throws Exception {
		
		Random aleatorio = new Random();           
    	
   	 int min = 1000;
        int max = 99999;
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        int random_int2 = (int)(Math.random() * (max - min + 1) + min);
        
        driver.findElement(btnDEX).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}

}
