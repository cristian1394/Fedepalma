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

public class FMMFDCPage extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	By btnFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueFMM_div\"]/span/span/span/span");
	By btnSMes=By.xpath("/html/body/div[10]/div/div/div[1]/a[2]");
	By btnMes=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[2]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[3]/td[4]/a");
	By btnPais=By.xpath("//*[@id=\"PaisFMM\"]");
	By txtPais=By.xpath("//*[@id=\"PaisFMM\"]");//Pais
	By btnPRela=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div[3]/div/div[4]/div/button");
	By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	By btnpPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	By btnKg=By.xpath("//*[@id=\"kgExportados\"]");
	By txtKg=By.xpath("//*[@id=\"kgExportados\"]");//kg
	By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	
	By btnTipoPro=By.xpath("//*[@id=\"idProducto\"]");
	By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSAS=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//kg
	By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");

	
	public FMMFDCPage(WebDriver driver) {
		super(driver);
		
	}
	
   	@Step("Ingresar a creacion FDC")
    public FMMFDCPage CrearFDC() throws Exception {
	
	Utilidades.time(2000);
    click(btnCrear);
    Utilidades.time(1000);
    Utilidades.screenshot();
    Utilidades.time(3500);
    
    return this;
}
	
	@Step("Crear FMM")
    public FMMFDCPage CrearFMM(String Pais, String producto) throws Exception {
        Utilidades.time(2000);
        
        click(btnTipoDemo);
        Utilidades.time(1000);
        click(btnFMM);
        Utilidades.time(2000);
        click(btnFmm);
		Utilidades.time(2000);
        numeroAleatorio();
        Utilidades.time(3000);
        click(btnCalendario);
        Utilidades.time(1000);
        click(btnSMes);
        Utilidades.time(1000);
        click(btnMes);
        Utilidades.time(1000);
        click(btnDia);
        Utilidades.time(1000);
        click(btnPais);
        Utilidades.time(1000);
        writeText(txtPais, Pais);
        Utilidades.time(1000);
        click(btnTipoPro);
        Utilidades.time(1000);
        click(btnPalma);
        Utilidades.time(1000);
        click(btnConsultar);
        Utilidades.time(5000);
        click(btnDemostrados);
        Utilidades.time(3000);
        String Totals = getElement(lblTotal).getText();
        Utilidades.time(4000);
        click(btnPRela);
        Utilidades.time(1000);
        click(btnProducto);
        Utilidades.time(1000);
        writeText(txtProducto, producto);
        Utilidades.time(1000);
        click(btnpPalma);
        Utilidades.time(1000);
        click(btnKg);
        Utilidades.time(1000);
        writeText(txtKg, Totals);
        Utilidades.time(1000);
        click(btnAdicionar);
        Utilidades.time(800);
        click(btnGuardar);
        
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
        
    	@Step("Ingresar FMM Palma")
        public FMMFDCPage IngresarFMMPalma(String resultado) throws Exception {
    	
    	Utilidades.time(2000);
        click(btnSAS);
        Utilidades.time(1000);
        String Totales = getElement(lblTotal).getText();
        Utilidades.time(1000);
        click(btnAsociar);
        Utilidades.time(1000);
        writeText(txtAsociar, Totales);
        Utilidades.time(1000);
        click(btnAdi);
        Utilidades.time(20000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(5000);
        click(btnOk);
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
        
        driver.findElement(btnFmm).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
	}

}
