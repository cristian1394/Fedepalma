package PagObject_ConsultaDCD;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class Editar_DCDPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]");
	By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnMesN=By.xpath("//*[@id=\"idMes\"]");
	By btnFebrero=By.xpath("//*[@id=\"idMes\"]/option[3]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnEditar=By.xpath("//*[@id=\"GridDCDComprador\"]/table/tbody/tr/td[3]/div/i");
	By btnProductoA=By.xpath("//*[@id=\"idProducto\"]");
	By btnPalmiste=By.xpath("//*[@id=\"idProducto\"]/option[3]");
	By btnMercado=By.xpath("//*[@id=\"idMercado\"]");
	By btnPais=By.xpath("//*[@id=\"idMercado\"]/option[3]");
	By btnBorrar=By.xpath("//*[@id=\"idKgT\"]");
	By txtKilos=By.xpath("//*[@id=\"idKgT\"]");
	By btnCP=By.xpath("//*[@id=\"CodigoCP\"]");
	By txtCP=By.xpath("//*[@id=\"CodigoCP\"]");//56
	By btnKg=By.xpath("//*[@id=\"KgCP\"]");
	By txtKg=By.xpath("//*[@id=\"KgCP\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaCP_div\"]/span/span/span/span");
	By btnSelMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[1]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	By btnAdicionar=By.xpath("//*[@id=\"AdicionarCP\"]");
	By btnOk=By.xpath("/html/body/div[9]/div[7]/div/button");
	By btnDescargar=By.xpath("//*[@id=\"DecargarFormatoCP\"]");
	By btnCargaM=By.id("AdicionarMasivoCP");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By btnGuardar=By.xpath("//*[@id=\"btnGuardar\"]");
	By btnOkay=By.xpath("/html/body/div[5]/div[7]/div/button");
	By lblResultadoAdicion=By.xpath("//div[9]/p");
	By lblResultadoCarga=By.xpath("//div[8]/p");
	By lblResultadoGuardar=By.xpath("//div[5]/p");
	
	public Editar_DCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Rellenar Formulario DCD")
    public Editar_DCDPage RellenarDCD() {
        
        Utilidades.time(1000);
        click(btnDemostracion);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnDCD);
        Utilidades.time(3000);
        click(btnEstado);
        Utilidades.time(800);
        click(btnBorrador);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(1000);
        click(btnMesN);
        Utilidades.time(800);
        click(btnFebrero);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
		Utilidades.time(6500);
        Utilidades.screenshot();
        
        return this;
    }
	
	@Step("Editar DCD")
    public Editar_DCDPage EditarDCD(String kg, String CP, String kilos) {
        Utilidades.time(25500);
		click(btnEditar);
		Utilidades.time(1000);
		click(btnProductoA);
		Utilidades.time(800);
		click(btnPalmiste);
		Utilidades.time(1000);
		click(btnMercado);
		Utilidades.time(800);
		click(btnPais);
		Utilidades.time(1000);
		click(btnBorrar);
		Utilidades.time(800);
		clear(btnBorrar);
		Utilidades.time(800);
		writeText(txtKilos, kg);
		Utilidades.time(1000);
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnCP);
		Utilidades.time(1000);
		writeText(txtCP, CP);
		Utilidades.time(1000);
		click(btnKg);
		Utilidades.time(1000);
		writeText(txtKg, kilos);
        Utilidades.time(2500);
		click(btnCalendario);
		Utilidades.time(1000);
		click(btnSelMes);
		Utilidades.time(1000);
		click(btnMes);
		Utilidades.time(1000);
		click(btnDia);
		Utilidades.time(1000);
		click(btnAdicionar);
		Utilidades.screenshot();
		
        return this;
    }
	
	@Step("Validar Adicion CD")
    public Editar_DCDPage ValidarAdicionCD(String resultado) {
		
		Utilidades.time(10000);
		Assert.assertEquals(getElement(lblResultadoAdicion).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(6000);
		click(btnOk);
		Utilidades.screenshot();
		//Certificado Guardado Correctamente.
		
		return this;
	}
	
	public Editar_DCDPage CargaCD(String EXC) {
		
		Utilidades.time(8000);
		 File file = new File(EXC);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(btnCargaM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);

       return this;
	}
	
	@Step("Validar Carga CD")
    public Editar_DCDPage ValidarCargaCD(String resultado) {
		
		Utilidades.time(9000);
		Assert.assertEquals(getElement(lblResultadoCarga).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnOkey);
		Utilidades.ByPixel();
		Utilidades.time(2000);
		click(btnGuardar);
		//Certificados Guardados Correctamente.
		
		return this;
	}
	
	@Step("Validar Guardar CD")
    public Editar_DCDPage ValidarGuardarDCD(String resultado) {
		
		Utilidades.time(9000);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(),resultado);
		Utilidades.time(3000);
		click(btnOkay);
		Utilidades.time(5000);
       Utilidades.screenshot();
		//Proceso realizado con éxito
		
		return this;
	}
	
}
	

