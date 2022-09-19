package MapObject_FormularioFSC;

import java.io.File;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_FormularioFDC.Cargar_DEXPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class FormularioFSCPage extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnDemostracion1=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnFSC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[6]/a");
	By btnFSC1=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[6]/a");
	
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[3]");
	By btnMesA=By.xpath("//*[@id=\"idMes\"]/option[4]");
	By btnMesB=By.xpath("//*[@id=\"idMes\"]/option[5]");
	By btnMesC=By.xpath("//*[@id=\"idMes\"]/option[6]");
	By btnMesD=By.xpath("//*[@id=\"idMes\"]/option[7]");
	By btnMesE=By.xpath("//*[@id=\"idMes\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By Historial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	By ExportarH=By.xpath("//*[@id=\"GridFDCHistorico\"]/div[1]/a");
	By CerrarH=By.xpath("/html/body/div[1]/main/div/div/section[1]/div/div/div/div[1]/div/button");
	
	By Lupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	By Scape=By.xpath("/html/body/div[1]/main/div/div/section[4]/div/div/div/div/div[1]/section[8]/div/div[2]/div/div[1]/a");
	
	By Editar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	
	By Eliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]");
	By btnOK=By.xpath("//div[7]/div[7]/div/button");
	//btnOk
	

	By btnCrear=By.id("btnCrear");
	By TipoDocumento=By.id("ddlTipoDemostracion");
	By CertificadoFMI=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	By CertificadoIP=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	By CertificadoCM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[4]");
	By btnConsultarDMI=By.id("IdConsultarDMI");
	By DMI=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[5]/label");
	By Asociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[7]/input");
	By btnAdicionar=By.id("InsertarFormulario");
	By lblAdicionar=By.xpath("//div[11]/p");//El formulario se guardo correctamente.
	//btnOk
	
	By CargaFMI=By.id("fileElementCargarFMI");
	By CargaCCM=By.id("fileElementCargarCCM");
	By CargaCIP=By.id("fileElementCargarCIP");
	By CargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	By lblResultadoCargas=By.xpath("//div[11]/p");//Se cargo el archivo correctamente
	//Solo se pueden cargar archivos con formato .pdf
	By btnOk=By.xpath("//div[7]/div/button");
	
	By btnRevisar=By.id("btnRevisarFdc");
	By lblResultadoError=By.xpath("//div[11]/p");//No ha asociado todos los kilogramos a un tipo de DCD
	//El formulario no tiene asociado documento de incumplimiento. Por favor verifique.
	
	By btnRadicar= By.id("btnRadicarFsc");
	By btnSalir=By.id("btnSalirFdc");
	By btnSalir1=By.id("btnSalirFdcValidacion");
	
	
	public FormularioFSCPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Ingresar al formulario FSC")
    public FormularioFSCPage FormularioFSC1() {
        Utilidades.time(2000);
 	   WebElement Element = driver.findElement(btnDemostracion);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(1000);
        click(btnDemostracion);
        Utilidades.time(2000);
  	   WebElement Elements = driver.findElement(btnFSC);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView();", Elements);
        click(btnFSC);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Ingresar al formulario FSC")
    public FormularioFSCPage FormularioFSC() {
        Utilidades.time(2000);
        click(btnDemostracion1);
        Utilidades.time(1000);
        click(btnFSC1);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC() {
		
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
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC1() {
		
		Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesA);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC2() {
		
		Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesB);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC3() {
		
		Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesC);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC4() {
		
		Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesD);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage EConsultarFSC() {
		
		Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMesE);
		Utilidades.screenshot();
		Utilidades.time(1000);
		
        return this;
    }
	
	@Step("Buscar Formularios")
    public FormularioFSCPage BuscarFSC() {
		
		Utilidades.time(4000);
		click(btnBuscar);
        Utilidades.time(5000);
        Utilidades.screenshot();
		
        return this;
    }
	
	@Step("Crear FSC")
    public FormularioFSCPage CrearFSC() {
		
        Utilidades.time(3000);
		click(btnCrear);
		Utilidades.time(2500);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Seleccionar el tipo de Documento")
    public FormularioFSCPage TD() {
		
        Utilidades.time(2000);
		click(TipoDocumento);
		Utilidades.time(500);
        Utilidades.screenshot();
        Utilidades.time(500);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado de Facturacion al Mercado Interno")
    public FormularioFSCPage CFMI() {
		
        Utilidades.time(500);
		click(CertificadoFMI);
		Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado Incorporacion Propia")
    public FormularioFSCPage CIP() {
		
        Utilidades.time(500);
		click(CertificadoIP);
		Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado Contrato de Mandato")
    public FormularioFSCPage CCM() {
		
        Utilidades.time(500);
		click(CertificadoCM);
		Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Consultar DMI")
    public FormularioFSCPage ConsultarDMI() {
        Utilidades.time(8000);
		click(btnConsultarDMI);
		Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Muestre Alerta DMI")
    public FormularioFSCPage AlertaDMI(String resultado) {
        
		Utilidades.time(2000);
		Assert.assertEquals(getElement(lblAdicionar).getText(),resultado);
		Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnOk);
		Utilidades.time(3500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Seleccionar el DMI")
    public FormularioFSCPage SeleccionarDMI() {
        Utilidades.time(8000);
		click(DMI);
		Utilidades.time(1000);
	    String Total = getElement(lblTotal).getText();
	    Utilidades.time(1000);
	    writeText(Asociar, Total);
		Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Adiciona un DMI")
    public FormularioFSCPage AdicionarDMI(String resultado) {
        Utilidades.time(3000);
		click(btnAdicionar);
		Utilidades.time(10000);
		Assert.assertEquals(getElement(lblAdicionar).getText(),resultado);
		Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnOk);
		Utilidades.time(3500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Cagar FMI")
    public FormularioFSCPage CargaFMI(String doc, String resultado) throws Exception {
		
        Utilidades.time(2000);
		Utilidades.ByPixel();
		Utilidades.time(1000);
        WebElement Element = driver.findElement(CargaFMI);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(8000);
		 File file = new File(doc);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(CargaFMI);
		 ruta.sendKeys(file.getAbsolutePath()); 
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(5000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Cagar CCM")
    public FormularioFSCPage CargaCCM(String doc, String resultado) throws Exception {
		
        Utilidades.time(2000);
        Utilidades.ByPixel();
		Utilidades.time(1000);
        WebElement Element = driver.findElement(CargaCCM);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(8000);
		 File file = new File(doc);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(CargaCCM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(5000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Cagar CIP")
    public FormularioFSCPage CargaCIP(String doc, String resultado) throws Exception {
		
        Utilidades.time(2000);
        Utilidades.ByPixel();
		Utilidades.time(1000);
        WebElement Element = driver.findElement(CargaCIP);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(8000);
		 File file = new File(doc);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(CargaCIP);
		 ruta.sendKeys(file.getAbsolutePath()); 
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(5000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Cagar Incumplimento")
    public FormularioFSCPage CargaIncumplimiento(String doc, String resultado) throws Exception {
		
        Utilidades.time(2000);
        Utilidades.ByPixel();
		Utilidades.time(1000);
        WebElement Element = driver.findElement(CargaIncumplimiento);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(8000);
		 File file = new File(doc);
		 Utilidades.time(3000);
		 WebElement ruta = driver.findElement(CargaIncumplimiento);
		 ruta.sendKeys(file.getAbsolutePath()); 
		Utilidades.time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		Utilidades.screenshot();
		Utilidades.time(5000);
		click(btnOk);
        Utilidades.screenshot();
        Utilidades.time(2500);
        
        return this;
    }
	
	@Step("Revisar FSC")
    public FormularioFSCPage RevisarFSC() {
        Utilidades.time(8000);
		click(btnRevisar);
		Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Validar Excepcion de Revisar")
    public FormularioFSCPage ERevisarFSC(String resultado) {
		
        Utilidades.time(2000);
		Assert.assertEquals(getElement(lblResultadoError).getText(),resultado);
		Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(500);
        click(btnOk);
		Utilidades.time(3500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Validar Excepcion de Revisar")
    public FormularioFSCPage ERevisarFSC1() {
		
		Utilidades.time(2000);
        click(btnOk);
		Utilidades.time(3500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Salir FSC")
    public FormularioFSCPage SalirFSC() {
        Utilidades.time(5000);
        Utilidades.ByPixel();
        Utilidades.ByPixel();
        Utilidades.time(1000);
		click(btnSalir);
		Utilidades.time(2500);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Salir FSC")
    public FormularioFSCPage SalirFSC1() {
        Utilidades.time(5000);
        Utilidades.ByPixel();
        Utilidades.ByPixel();
        Utilidades.time(1000);
		click(btnSalir1);
		Utilidades.time(2500);
        Utilidades.screenshot();
        Utilidades.time(2000);
        
        return this;
    }
	
	@Step("Ver Historial")
    public FormularioFSCPage Historial() {
        Utilidades.time(2000);
		click(Historial);
		Utilidades.time(3000);
        Utilidades.screenshot();
        Utilidades.time(4000);
        
        return this;
    }
	
	@Step("Exportar a Excel el Historial")
    public FormularioFSCPage ExportarHistorial() {
        Utilidades.time(2000);
		click(ExportarH);
		Utilidades.time(3000);
        Utilidades.screenshot();
        Utilidades.time(4000);
        
        return this;
    }
	
	@Step("Cerrar Historial")
    public FormularioFSCPage CerrarHistorial() {
        Utilidades.time(2000);
		click(CerrarH);
		Utilidades.time(3000);
        Utilidades.screenshot();
        Utilidades.time(4000);
        
        return this;
    }
	
	@Step("Ver el FSC Creado")
    public FormularioFSCPage VerFSC() {
        Utilidades.time(2000);
		click(Lupa);
		Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(1000);
		Utilidades.ByPixel();
		Utilidades.time(1000);
        Utilidades.screenshot();
        Utilidades.time(3000);
        driver.findElement(Scape).sendKeys(Keys.ESCAPE); 
        Utilidades.time(1500);
        Utilidades.screenshot();
        Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Editar FSC")
    public FormularioFSCPage EditarFSC() {
        Utilidades.time(2000);
		click(Editar);
		Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Eliminar FSC")
    public FormularioFSCPage EliminarFSC() {
        Utilidades.time(2000);
		click(Eliminar);
		Utilidades.time(5000);
		Utilidades.screenshot();
		Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Aceptar Eliminacion FSC")
    public FormularioFSCPage AceptarEliminarFSC() {
        Utilidades.time(2000);
		click(btnOK);
		Utilidades.time(3000);
		Utilidades.screenshot();
		Utilidades.time(1000);
        
        return this;
    }
	
	@Step("Resumen de Demostracion del formulario FSC")
    public FormularioFSCPage ResumenDemostracion() {
        Utilidades.time(2000);
		Utilidades.screenshot();
		Utilidades.time(1000);
        
        return this;
    }
}
