package MapObject_FormularioNuevoFFP;

import java.io.File;
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

public class NuevaDeclaracionEPage extends BasePage {
	
	By btnNuevo=By.xpath("//*[@id=\"btnDeclarar\"]");
	By txtCultivosG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[2]/input");
	By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	By btnComprado=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[2]/div[2]/input");
	By btnTipoPersona=By.xpath("//*[@id=\"tipoPersona\"]");
	By btnNatural=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[5]/div/div/div/div[2]/div[1]/div[2]/select/option[2]");
	By txtNitA=By.xpath("//*[@id=\"NitRPF\"]");
	By btnPredio=By.xpath("//*[@id=\"Predios\"]");
	By btnOpcionA=By.xpath("//div[22]/div/div[2]/ul/li");
	By btnOpcionA1=By.xpath("/html/body/div[24]/div/div[2]/ul/li");
	By txtCompradorG=By.xpath("//*[@id=\"FruitGuineensisRPF\"]");//RPFG
	By txtCompradorH=By.xpath("//*[@id=\"FruitHibridoRPF\"]");//RPFH
	By btnAdicionarRPF=By.xpath("//*[@id=\"btnFrmRPF\"]");
	By btnArchivo=By.id("file");
	By btnGuardarRPF=By.id("btnRPF");
	
	By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	By txtBajaFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[3]/input");
	
	By txtFrutoNoProcesadoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[8]/div[3]/input");
	
	By txtPPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[1]/input");
	//btnOk
	By txtRPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[2]/input");
	//By btnOk=By.xpath("/html/body/div[23]/div[7]/div/button");
	
	By btnCompraIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[3]/input");
	By txtNitE=By.xpath("//*[@id=\"NitRPA\"]");
	By txtkg=By.xpath("//*[@id=\"FruitRPA\"]");
	By btnAdicionarRPA=By.xpath("//*[@id=\"btnFrmRPA\"]");
	By btnCargaRPA=By.id("file4");
	By btnGuardarRPA=By.id("btnRPA");
	
	By btnRecibidaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div/input");
	By txtNitF=By.xpath("//*[@id=\"NitARPM\"]");
	By txtKg=By.xpath("//*[@id=\"FruitARPM\"]");//345.678
	By btnAdicionarARPM=By.xpath("//*[@id=\"btnFrmARPM\"]");
	By btnCargaARPM=By.id("file5");
	By btnGuardarARPM=By.id("btnARPM");
	//
	
	By txtPalmaProcesada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[3]/input");//456.554
	By txtRecibidaProcesada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[3]/input");//121.826
	
	By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public NuevaDeclaracionEPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Nueva Declaracion FFP")
    public NuevaDeclaracionEPage NuevaDeclaracionFFP(String DocRPF, String PropiosG, String PropiosH, String RPFG, String RPFH) {
        
        Utilidades.time(5000);
        click(btnNuevo);
        Utilidades.time(8000);
        writeText(txtCultivosG, PropiosG);
        Utilidades.time(1000);
        writeText(txtCultivosH, PropiosH);
        Utilidades.time(1000);
        click(btnComprado);
        Utilidades.time(1000);
        click(btnTipoPersona);
        Utilidades.time(1000);
        click(btnNatural);
        
        Utilidades.time(500);
        String [] Nit = {"12641866", "57280085", "30929115", "36932674", "13842995"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtNitA, txtNit);
        Utilidades.time(1000);
        click(btnPredio);
        Utilidades.time(1200);
        click(btnOpcionA);
        Utilidades.time(800);
        Utilidades.time(1000);
        writeText(txtCompradorG, RPFG);
        Utilidades.time(1000);
        writeText(txtCompradorH, RPFH);
        Utilidades.time(1000);
        click(btnAdicionarRPF);
        Utilidades.time(2500);
		 File file = new File(DocRPF);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnArchivo);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        click(btnGuardarRPF);
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Nueva Declaracion FFP")
    public NuevaDeclaracionEPage NuevaDeclaracionFFP1(String DocRPF, String PropiosG, String PropiosH, String RPFG, String RPFH) {
        
        Utilidades.time(5000);
        click(btnNuevo);
        Utilidades.time(8000);
        writeText(txtCultivosG, PropiosG);
        Utilidades.time(1000);
        writeText(txtCultivosH, PropiosH);
        Utilidades.time(1000);
        click(btnComprado);
        Utilidades.time(1000);
        click(btnTipoPersona);
        Utilidades.time(1000);
        click(btnNatural);
        
        Utilidades.time(500);
        String [] Nit = {"12641866", "57280085", "30929115", "36932674", "13842995"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtNitA, txtNit);
        Utilidades.time(1000);
        click(btnPredio);
        Utilidades.time(1200);
        click(btnOpcionA1);
        Utilidades.time(800);
        Utilidades.time(1000);
        writeText(txtCompradorG, RPFG);
        Utilidades.time(1000);
        writeText(txtCompradorH, RPFH);
        Utilidades.time(1000);
        click(btnAdicionarRPF);
        Utilidades.time(2500);
		 File file = new File(DocRPF);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnArchivo);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        click(btnGuardarRPF);
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Fruto Vendido FFP")
    public NuevaDeclaracionEPage FrutoVendidoFFP (String InicialFrutoG, String InicialFrutoH) {
		
		Utilidades.time(1000);
		writeText(txtInicialFrutoG, InicialFrutoG);
        Utilidades.time(1000);
        writeText(txtInicialFrutoH, InicialFrutoH);
        Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        
        
        return this;
    }
	
	@Step("Fruto Enviado a Maquilar FFP")
    public NuevaDeclaracionEPage FrutoEnviadoFFP (String BajaFrutoG, String BajaFrutoH, String NoProcesadoH) {
		
		Utilidades.time(1000);
		writeText(txtBajaFrutoG, BajaFrutoG);
        Utilidades.time(1000);
        writeText(txtBajaFrutoH, BajaFrutoH);
        Utilidades.time(2000);
        writeText(txtFrutoNoProcesadoH, NoProcesadoH);
        Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Proveedores de Almendra FFP")
    public NuevaDeclaracionEPage ProveedoresAlmendra(String DocRPA, String PPalmaIngresada, String RPalmaIngresada, String KG) {
		
		Utilidades.time(1000);
		writeText(txtPPalmaIngresada, PPalmaIngresada);
        Utilidades.time(1500);
        writeText(txtRPalmaIngresada, RPalmaIngresada);
        Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(2500);
        click(btnCompraIngresada);
        
        Utilidades.time(500);
        String [] Nit = {"10050467882", "6088235", "860002527", "2155004", "32005286"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtNitE, txtNit);
        Utilidades.time(1000);
        writeText(txtkg, KG);
        Utilidades.time(1000);
        click(btnAdicionarRPA);
        Utilidades.time(2500);
		 File file = new File(DocRPA);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnCargaRPA);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        click(btnGuardarRPA);
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Almendra Recibida FFP")
    public NuevaDeclaracionEPage AlmendraRecibida (String DocARPM, String KG, String PalmaProcesada, String PalmaRecibida, String PalmisteRecibida ) {
		
		
        Utilidades.time(1000);
        click(btnRecibidaIngresada);
        
        Utilidades.time(500);
        String [] Nit = {"12457001", "12516054", "816004403", "1093911400", "900754604"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtNitF, txtNit);
        Utilidades.time(1000);
        writeText(txtKg, KG);
        Utilidades.time(1000);
        click(btnAdicionarARPM);
        Utilidades.time(2500);
		 File file = new File(DocARPM);
		 Utilidades.time(1200);
		 WebElement ruta = driver.findElement(btnCargaARPM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        click(btnGuardarARPM);
        Utilidades.time(2000);
        
        Utilidades.time(1000);
		writeText(txtPalmaProcesada, PalmaProcesada);
        Utilidades.time(1000);
        writeText(txtRecibidaProcesada, PalmaRecibida);
        Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        
        writeText(txtProducidaRecibida, PalmisteRecibida);
        Utilidades.time(1000);
		Utilidades.screenshot();
		Utilidades.time(3000);
        
        
        return this;
    }
}
