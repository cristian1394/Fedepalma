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

public class PolizaFDCPage extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnPoliza=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	By btnPoli=By.xpath("//*[@id=\"numeroPoliza\"]");
	By btnAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");
	By txtAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");//Aseguradora
	By btnCalendario=By.xpath("//*[@id=\"fecVigenciaFin\"]");
	By txtFecha=By.xpath("//*[@id=\"fecVigenciaFin\"]");//Fecha
	By btnValor=By.xpath("//*[@id=\"valorAsegurado\"]");
	By txtValor=By.xpath("//*[@id=\"valorAsegurado\"]");//valor
	By btnProducto=By.xpath("//*[@id=\"idProducto\"]");
	By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnConsulta=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By btnDemo=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[8]");
	By lblAsegurado=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[10]/label[2]");
	By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//Asociar
	By btnValorDispo=By.xpath("//*[@id=\"valorDisponible\"]");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By btnOkey=By.xpath("/html/body/div[21]/div[7]/div/button");
	By lblResultadoAdicionar=By.xpath("//div[21]/p");

	
	public PolizaFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
   	@Step("Ingresar a creacion FDC")
    public PolizaFDCPage CrearFDC() {
	
	Utilidades.time(2000);
    click(btnCrear);
    Utilidades.time(1000);
    Utilidades.screenshot();
    Utilidades.time(3500);
    
    return this;
}
	
	@Step("Crear poliza")
    public PolizaFDCPage CrearPoliza(String Aseguradora, String Fecha, String valor) throws Exception {
		
        Utilidades.time(4000);
        Utilidades.ByPixelA();
        Utilidades.time(1000);
        click(btnTDemo);
        Utilidades.time(3000);
        click(btnPoliza);
        Utilidades.time(1000);
        numeroAleatorio();
        Utilidades.time(1000);
        click(btnAseguradora);
        Utilidades.time(1000);
        writeText(txtAseguradora, Aseguradora);
        Utilidades.time(4000);
        click(btnCalendario);
        Utilidades.time(2000);
        writeText(txtFecha, Fecha);
        Utilidades.time(1000);
        click(btnValor);
        Utilidades.time(1000);
        writeText(txtValor, valor);
        Utilidades.time(1000);
        
        Utilidades.screenshot();
        Utilidades.time(3500);
        
        return this;
    }
        
    @Step("Ingresar poliza")
    public PolizaFDCPage IngresarPoliza(String Asociar, String resultado) {       
        
        
        click(btnProducto);
        Utilidades.time(1000);
        click(btnPalma);
        Utilidades.time(1000);
        click(btnConsulta);
        Utilidades.time(1000);
        click(btnSelect);
        Utilidades.time(1000);
        String Total = getElement(lblTotal).getText();
        Utilidades.time(1000);
        click(btnAsociar);
        Utilidades.time(1000);
        writeText(txtAsociar, Total);
        Utilidades.time(1000);
        click(btnDemo);
        Utilidades.time(1000);
        String Asegurado = getElement(lblAsegurado).getText();
        Utilidades.time(1000);
        click(btnValor);
        Utilidades.time(1000);
        clear(btnValor);
        Utilidades.time(1000);
        writeText(txtValor, Asegurado);
        Utilidades.time(1000);
        click(btnValorDispo);
        Utilidades.time(1000);
        click(btnAdicionar);
        Utilidades.time(20000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(5000);
        click(btnOkey);
        Utilidades.time(2000);
    	Utilidades.ByPixel();
        Utilidades.time(1000);
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
        
        driver.findElement(btnPoli).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}
	
}
