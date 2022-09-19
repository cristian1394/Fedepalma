package PagObject_ConsultaDCD;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class EditarDCDPage extends BasePage {
	
	By btnProveedor=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div/div[2]/div/span");
	By txtProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");//C.i. Tequendama S.A.S.
	By btnCI=By.xpath("//*[@id=\"idNitProveedor-list\"]/div[2]");
	By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[1]");
	By btnProducto=By.xpath("//*[@id=\"idProductos\"]");
	By btnPalma=By.xpath("//*[@id=\"idProductos\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	By btnEditar=By.xpath("//*[@id=\"GridDCDComprador\"]/table/tbody/tr/td[3]/div/i");
	By btnCP=By.xpath("//*[@id=\"CodigoCP\"]");
	By txtCP=By.xpath("//*[@id=\"CodigoCP\"]");//56
	By btnKg=By.xpath("//*[@id=\"KgCP\"]");
	By txtKg=By.xpath("//*[@id=\"KgCP\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaCP_div\"]/span/span/span/span");
	By btnSelMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	By btnSelAno=By.xpath("/html/body/div[5]/div/div/div[1]/a[1]/span");
	By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[3]/td[3]/a");
	By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[4]/td[4]/a");
	By btnAdicionar=By.xpath("//*[@id=\"AdicionarCP\"]");
	By btnOk=By.xpath("/html/body/div[9]/div[7]/div/button");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisar\"]");
	By btnOkey=By.xpath("/html/body/div[9]/div[7]/div/button");
	By btnGenerar=By.xpath("//*[@id=\"btnGenerar\"]");
	By btnFirma=By.xpath("//*[@id=\"pass5\"]");
	By txtFirma=By.xpath("//*[@id=\"pass5\"]");
	By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	By btnOks=By.xpath("/html/body/div[9]/div[7]/div/button");
	By btnCancelar=By.id("btnCancelar");
	By lblResultadoAdicion=By.xpath("//div[9]/p");
	By lblResultadoRevicion=By.xpath("//div[9]/p");
	By lblResultadoGenerar=By.xpath("//div[9]/p");
	By lblResultadoFirma=By.xpath("//div[5]/p");
	
	public EditarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Editar DCD")
    public EditarDCDPage EditarDCD(String Proveedor, String CP, String kilos) {
        Utilidades.time(1000);
        
        click(btnProveedor);
        Utilidades.time(500);
        writeText(txtProveedor, Proveedor);
        Utilidades.time(1000);
        click(btnCI);
        Utilidades.time(800);
        click(btnEstado);
        Utilidades.time(800);
        click(btnBorrador);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(1000);
        click(btnProducto);
        Utilidades.time(800);
        click(btnPalma);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
		Utilidades.time(9500);
		Utilidades.screenshot();
		Utilidades.time(2000);
		click(btnEditar);
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
		click(btnSelAno);
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
    public EditarDCDPage ValidarAdicionCD(String resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoAdicion).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(6000);
		click(btnOk);
		Utilidades.screenshot();
		//Certificado Guardado Correctamente.
		
		return this;
	}
	
	@Step("Revisar DCD")
    public EditarDCDPage RevisarDCD() {
		
		Utilidades.time(3000);
		click(btnRevisar);
		Utilidades.screenshot();
		Utilidades.time(1000);

		
		return this;
	}
	
	@Step("Validar Revicion DCD")
    public EditarDCDPage ValidarRevicionDCD(String Resultado) {
		
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(6000);
		click(btnOkey);
		Utilidades.time(2000);
		Utilidades.ByPixel();
		//Proceso realizado exitosamente!
		
		return this;
	}
	
	@Step("Generar DCD")
    public EditarDCDPage FirmarDCD(String Firma, String Resultado) {
		
		Utilidades.time(800);
		click(btnGenerar);
		Utilidades.time(900);
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		Utilidades.time(13000);
		Utilidades.screenshot();
		click(btnFirma);
		Utilidades.time(1000);
		writeText(txtFirma, Firma);
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
	
	@Step("Validar la generacion del DCD")
	public EditarDCDPage ValidarGenerarDCD(String Resultado) {
		
		Utilidades.time(9000);
		Assert.assertEquals(getElement(lblResultadoGenerar).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(2000);
		click(btnOks);
        Utilidades.time(2000);
        Utilidades.ByPixel();
        Utilidades.screenshot();
        Utilidades.time(1000);
        click(btnCancelar);
        Utilidades.time(8000);
        //Proceso realizado exitosamente!
        
		return this;
	}
}
