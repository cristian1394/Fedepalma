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

public class CrearFDCPage extends BasePage {
	
	By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	By btnDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	By btnSMes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	By btnAño=By.xpath("/html/body/div[9]/div/div/div[1]/a[1]");
	By btnMes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	By btnPais=By.xpath("//*[@id=\"PaisDEX\"]");
	By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");
	By btnTipoPro=By.xpath("//*[@id=\"idProducto\"]");
	By btnSPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	
	By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	By btnPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	By btnKilos=By.xpath("//*[@id=\"kgExportados\"]");
	By txtKilos=By.xpath("//*[@id=\"kgExportados\"]");
	By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");

	
	public CrearFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Crear FDC")
    public CrearFDCPage CrearFDC(String Pais, String Producto) throws Exception {
        Utilidades.time(2000);
        
        click(btnCrear);
        Utilidades.time(3000);
        click(btnDEX);
        Utilidades.time(1000);
        numeroAleatorio();
        Utilidades.time(1000);
        click(btnCalendario);
        Utilidades.time(1000);
        click(btnSMes);
        Utilidades.time(1000);
        click(btnAño);
        Utilidades.time(1000);
        click(btnMes);
        Utilidades.time(500);
        click(btnDia);
        Utilidades.time(1500);
        click(btnPais);
        Utilidades.time(1000);
        writeText(txtPais, Pais);
        Utilidades.time(1000);
        click(btnTipoPro);
        Utilidades.time(4000);
        click(btnSPalma);
        Utilidades.time(1000);
        click(btnConsultar);
        Utilidades.time(2000);
        click(btnDemostrados);
        Utilidades.time(1000);
        String Total = getElement(lblTotal).getText();
        
        click(btnPExpo);
        Utilidades.time(1000);
        click(btnProducto);
        Utilidades.time(1000);
        writeText(txtProducto, Producto);
        Utilidades.time(1000);
        click(btnPalma);
        Utilidades.time(1000);
        click(btnKilos);
        Utilidades.time(1000);
        writeText(txtKilos, Total);
        Utilidades.time(1000);
        click(btnAdicionar);
        Utilidades.time(800);
        click(btnGuardar);
        Utilidades.screenshot();
       
        
        Utilidades.screenshot();
        Utilidades.time(3500);
        
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
