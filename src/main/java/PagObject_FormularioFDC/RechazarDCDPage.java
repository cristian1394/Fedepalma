package PagObject_FormularioFDC;

import java.util.Random;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class RechazarDCDPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnDemostracionA=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[3]/a");
	By btnFDCa=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By Comprador=By.id("idNitComprador");//NitB
	By btnComprador=By.xpath("//*[@id=\"idNitComprador_listbox\"]/li");
	By Estado=By.id("idEstado");
	By Radicado=By.xpath("//*[@id=\"idEstado\"]/option[4]");
	By btnSAno=By.id("idAnio");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[2]");
	By btnSMes=By.id("idMes");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[7]");
	By btnBuscar=By.id("btnSearch");
	By NumeroFDC=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[2]");
	By Revisar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/div/i");
	By Seleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/select[1]");
	By Rechazar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/select[1]/option[4]");
	By Aceptar=By.xpath("/html/body/div[7]/div[7]/div/button");
	By Casuales=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/button");
	By Causal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[2]/select/option[4]");
	By Ok=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[3]/button");
	By Observacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/button");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[2]/textarea");
	By OK=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[3]/button");
	By Desplegar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a");
	By lblDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/label");
	By Guardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("/html/body/div[7]/p");//El proceso se realizo correctamente.
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By Salir=By.id("btnSalirFdcValidacion");
	
	By usuario=By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/button/span[3]");
	By CerrarSesion=By.id("btnCerrarSesion");
	By txtNit=By.id("Nit");
	By txtUsuario=By.id("Usuario");
	By txtContrase_a=By.id("Contrase_a");
	By btnLogin=By.id("btnSave");
	
	By Crear=By.id("btnCrear");
	By txtDEX=By.id("numeroDEX");
	By txtNumeroDCD=By.id("idNumeroDcd");
	By Consultar=By.id("idconsultardcd");
	
	By Select=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[7]/label");
	By Asociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[9]/input");
	By btnAdicionar=By.id("InsertarFormulario");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");//El formulario se guardo correctamente.
	By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	public RechazarDCDPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Ingresar a FDC")
    public RechazarDCDPage IngresarFDC() {
        Utilidades.time(2000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracion);
        Utilidades.time(1000);
        WebElement Elements = driver.findElement(btnFDC);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView();", Elements);
         Utilidades.time(1000);
         Utilidades.screenshot();
 		Utilidades.time(400);
        click(btnFDC); 
        Utilidades.time(1000);
        return this;
    }
        
        
	@Step("Consultar FDC")
    public RechazarDCDPage ConsultarFDC(String NitB) {   
		
		Utilidades.time(1000);
		writeText(Comprador, NitB);
        Utilidades.time(1200);
        click(Comprador);
		Utilidades.time(2800);
        click(btnComprador);
        Utilidades.time(800);
        click(Estado);
        Utilidades.time(800);
        click(Radicado);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnBuscar);
        Utilidades.time(3500);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Revisar FDC")
    public RechazarDCDPage RevisarFDC() {   
		
        Utilidades.time(500);
        click(NumeroFDC);
        Utilidades.time(500);
        click(NumeroFDC);
        Utilidades.time(500);
        click(Revisar);
        Utilidades.time(3500);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Rechazar FDC")
    public RechazarDCDPage RechazarFDC(String Obs) {   
		
        Utilidades.time(500);
        click(Seleccionar);
        Utilidades.time(2000);
        click(Rechazar);
        Utilidades.time(3000);
        Utilidades.screenshot();
        Utilidades.time(2000);
        click(Aceptar);
        Utilidades.time(1000);
        click(Casuales);
        Utilidades.time(1000);
//        click(Causal);
//        Utilidades.waitInMs(1000);
        click(Causal);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(Ok);
        Utilidades.time(1000);
        click(Observacion);
        Utilidades.time(1000);
        writeText(txtObservacion, Obs);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(OK);
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Guardar FDC")
    public RechazarDCDPage GuardarFDC(String resultado) {   
		
        Utilidades.time(500);
        Utilidades.ByPixel();
        Utilidades.time(500);
        click(Guardar);
        Utilidades.time(28000);
        Assert.assertEquals(getElement(lblResultadoGuardar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(2000);
        click(btnOk);
        Utilidades.time(2500);
        Utilidades.screenshot();
        return this;
    }
	
	@Step("Numero DCD")
    public RechazarDCDPage NumeroDCD(String nit, String usr, String pwd) {   
		
		Utilidades.time(1500);
        WebElement Elements = driver.findElement(Desplegar);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView();", Elements);
         Utilidades.time(1000);
        String DCD = getElement(lblDCD).getText();
        Utilidades.time(2000);
        Utilidades.ByPixel();
        Utilidades.time(300);
        click(Salir);
        Utilidades.time(1000);
        click(usuario);
        Utilidades.time(1000);
        click(CerrarSesion);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        writeText(txtNit, nit);
        Utilidades.time(1000);
        writeText(txtUsuario, usr);
        Utilidades.time(1000);
        writeText(txtContrase_a, pwd);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnLogin);
        Utilidades.time(6000);
        click(btnDemostracionA);
        Utilidades.time(1000);
        click(btnFDCa);
        Utilidades.time(00);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
		Utilidades.screenshot();
		Utilidades.time(1000);
        click(Crear);
        Utilidades.time(5000);
        String [] Dex = {"12345678", "181900157",  "92929", "92001"};
        Random aleatorio = new Random();            
        int Dex2 = aleatorio.nextInt(Dex.length);
        System.out.println(Dex[Dex2]);
        String txtDex = String.valueOf(Dex[Dex2]);
        Utilidades.time(1000);
        writeText(txtDEX, txtDex);
        Utilidades.time(1000);
        writeText(txtNumeroDCD, DCD);
        Utilidades.time(1000);
        click(Consultar);
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Seleccionar un DCD")
    public RechazarDCDPage SeleccionarDCD(String resultado) {   
		
		Utilidades.time(2200);
        click(Select);
		Utilidades.time(1500);
	    String Total = getElement(lblTotal).getText();
	    Utilidades.time(2000);
	    writeText(Asociar, Total);
	    Utilidades.time(2200);
	    click(btnAdicionar);
        Utilidades.time(18000);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		Utilidades.screenshot();
        Utilidades.time(800);
        click(btnOK);
        Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3500);
        return this;
    }
}