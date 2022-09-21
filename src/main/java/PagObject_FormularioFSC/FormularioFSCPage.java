package PagObject_FormularioFSC;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_FormularioFSC.FormularioFSCMap;
import io.qameta.allure.Step;

public class FormularioFSCPage extends FormularioFSCMap  {
	
	
	
	public FormularioFSCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar al formulario FSC")
    public FormularioFSCPage FormularioFSC1(File folderPath) throws Exception { 
        time(2000);
        scrollElementV(folderPath, btnDemostracion, "scroll ");
        time(1000);
        click(btnDemostracion,folderPath, "click xpath");
        time(2000);
        scrollElementV(folderPath, btnFSC, "scroll ");
        click(btnFSC,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Ingresar al formulario FSC")
    public FormularioFSCPage FormularioFSC(File folderPath) throws Exception { 
        time(2000);
        click(btnDemostracion1,folderPath, "click xpath");
        time(1000);
        click(btnFSC1,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC(File folderPath) throws Exception { 
		
		time(800);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMes,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC1(File folderPath) throws Exception { 
		
		time(800);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMesA,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC2(File folderPath) throws Exception { 
		
		time(800);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMesB,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC3(File folderPath) throws Exception { 
		
		time(800);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMesC,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC4(File folderPath) throws Exception {
		
		time(800);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMesD,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage EConsultarFSC(File folderPath) throws Exception {
		
		time(800);
        click(btnSAno,folderPath, "click xpath");
        time(800);
        click(btnAno,folderPath, "click xpath");
        time(800);
        click(btnSMes,folderPath, "click xpath");
        time(800);
        click(btnMesE,folderPath, "click xpath");
		captureScreen(folderPath, "Capture screen");
		time(1000);
		
        return this;
    }
	
	@Step("Buscar Formularios")
    public FormularioFSCPage BuscarFSC(File folderPath) throws Exception { 
		
		time(4000);
		click(btnBuscar,folderPath, "click xpath");
        time(5000);
        captureScreen(folderPath, "Capture screen");
		
        return this;
    }
	
	@Step("Crear FSC")
    public FormularioFSCPage CrearFSC(File folderPath) throws Exception { 
		
        time(3000);
		click(btnCrear,folderPath, "click xpath");
		time(2500);
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
	@Step("Seleccionar el tipo de Documento")
    public FormularioFSCPage TD(File folderPath) throws Exception { 
		
        time(2000);
		click(TipoDocumento,folderPath, "click xpath");
		time(500);
        captureScreen(folderPath, "Capture screen");
        time(500);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado de Facturacion al Mercado Interno")
    public FormularioFSCPage CFMI(File folderPath) throws Exception { 
		
        time(500);
		click(CertificadoFMI,folderPath, "click xpath");
		time(1500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado Incorporacion Propia")
    public FormularioFSCPage CIP(File folderPath) throws Exception { 
		
        time(500);
		click(CertificadoIP,folderPath, "click xpath");
		time(1500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado Contrato de Mandato")
    public FormularioFSCPage CCM(File folderPath) throws Exception { 
		
        time(500);
		click(CertificadoCM,folderPath, "click xpath");
		time(1500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Consultar DMI")
    public FormularioFSCPage ConsultarDMI(File folderPath) throws Exception { 
        time(8000);
		click(btnConsultarDMI,folderPath, "click xpath");
		time(1500);
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
	@Step("Muestre Alerta DMI")
    public FormularioFSCPage AlertaDMI(String resultado, File folderPath) throws Exception { 
        
		time(2000);
		Assert.assertEquals(getElement(lblAdicionar).getText(),resultado);
		time(1000);
        captureScreen(folderPath, "Capture screen");
        time(500);
        click(btnOk,folderPath, "click xpath");
		time(3500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Seleccionar el DMI")
    public FormularioFSCPage SeleccionarDMI(File folderPath) throws Exception { 
        time(8000);
		click(DMI,folderPath, "click xpath");
		time(1000);
	    String Total = getElement(lblTotal).getText();
	    time(1000);
	    writeText(Asociar, Total, folderPath, Total);
		time(1500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Adiciona un DMI")
    public FormularioFSCPage AdicionarDMI(String resultado,File folderPath) throws Exception { 
        time(3000);
		click(btnAdicionar,folderPath, "click xpath");
		time(10000);
		Assert.assertEquals(getElement(lblAdicionar).getText(),resultado);
		time(1000);
        captureScreen(folderPath, "Capture screen");
        time(500);
        click(btnOk,folderPath, "click xpath");
		time(3500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Cagar FMI")
    public FormularioFSCPage CargaFMI(String doc, String resultado, File folderPath) throws Exception {
		
        time(2000);
		ByPixel();
		time(1000);
		scrollElementV(folderPath, CargaFMI, "scroll ");
        time(8000);
		 File file = new File(doc);
		 time(3000);
		 WebElement ruta = driver.findElement(CargaFMI);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(5000);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2500);
        
        return this;
    }
	
	@Step("Cagar CCM")
    public FormularioFSCPage CargaCCM(String doc, String resultado,File folderPath) throws Exception { 
		
        time(2000);
        ByPixel();
		time(1000);
		scrollElementV(folderPath, CargaCCM, "scroll ");
        time(8000);
		 File file = new File(doc);
		 time(3000);
		 WebElement ruta = driver.findElement(CargaCCM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(5000);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2500);
        
        return this;
    }
	
	@Step("Cagar CIP")
    public FormularioFSCPage CargaCIP(String doc, String resultado, File folderPath) throws Exception { 
		
        time(2000);
        ByPixel();
		time(1000);
		scrollElementV(folderPath, CargaCIP, "scroll ");
        time(8000);
		 File file = new File(doc);
		 time(3000);
		 WebElement ruta = driver.findElement(CargaCIP);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(5000);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2500);
        
        return this;
    }
	
	@Step("Cagar Incumplimento")
    public FormularioFSCPage CargaIncumplimiento(String doc, String resultado, File folderPath) throws Exception { 
		
        time(2000);
        ByPixel();
		time(1000);
		scrollElementV(folderPath, CargaIncumplimiento, "scroll ");
        time(8000);
		 File file = new File(doc);
		 time(3000);
		 WebElement ruta = driver.findElement(CargaIncumplimiento);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1000);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen");
		time(5000);
		click(btnOk,folderPath, "click xpath");
        captureScreen(folderPath, "Capture screen");
        time(2500);
        
        return this;
    }
	
	@Step("Revisar FSC")
    public FormularioFSCPage RevisarFSC(File folderPath) throws Exception { 
        time(8000);
		click(btnRevisar,folderPath, "click xpath");
		time(1500);
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
	@Step("Validar Excepcion de Revisar")
    public FormularioFSCPage ERevisarFSC(String resultado, File folderPath) throws Exception { 
		
        time(2000);
		Assert.assertEquals(getElement(lblResultadoError).getText(),resultado);
		time(1000);
        captureScreen(folderPath, "Capture screen");
        time(500);
        click(btnOk,folderPath, "click xpath");
		time(3500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Validar Excepcion de Revisar")
    public FormularioFSCPage ERevisarFSC1(File folderPath) throws Exception { 
		
		time(2000);
        click(btnOk,folderPath, "click xpath");
		time(3500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Salir FSC")
    public FormularioFSCPage SalirFSC(File folderPath) throws Exception { 
        time(5000);
        ByPixel();
        ByPixel();
        time(1000);
		click(btnSalir,folderPath, "click xpath");
		time(2500);
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
	@Step("Salir FSC")
    public FormularioFSCPage SalirFSC1(File folderPath) throws Exception { 
        time(5000);
        ByPixel();
        ByPixel();
        time(1000);
		click(btnSalir1,folderPath, "click xpath");
		time(2500);
        captureScreen(folderPath, "Capture screen");
        time(2000);
        
        return this;
    }
	
	@Step("Ver Historial")
    public FormularioFSCPage Historial(File folderPath) throws Exception { 
        time(2000);
		click(Historial,folderPath, "click xpath");
		time(3000);
        captureScreen(folderPath, "Capture screen");
        time(4000);
        
        return this;
    }
	
	@Step("Exportar a Excel el Historial")
    public FormularioFSCPage ExportarHistorial(File folderPath) throws Exception { 
        time(2000);
		click(ExportarH,folderPath, "click xpath");
		time(3000);
        captureScreen(folderPath, "Capture screen");
        time(4000);
        
        return this;
    }
	
	@Step("Cerrar Historial")
    public FormularioFSCPage CerrarHistorial(File folderPath) throws Exception { 
        time(2000);
		click(CerrarH,folderPath, "click xpath");
		time(3000);
        captureScreen(folderPath, "Capture screen");
        time(4000);
        
        return this;
    }
	
	@Step("Ver el FSC Creado")
    public FormularioFSCPage VerFSC(File folderPath) throws Exception { 
        time(2000);
		click(Lupa,folderPath, "click xpath");
		time(5000);
		captureScreen(folderPath, "Capture screen");
		time(1000);
		ByPixel();
		time(1000);
        captureScreen(folderPath, "Capture screen");
        time(3000);
        driver.findElement(Scape).sendKeys(Keys.ESCAPE); 
        time(1500);
        captureScreen(folderPath, "Capture screen");
        time(1000);
        
        return this;
    }
	
	@Step("Editar FSC")
    public FormularioFSCPage EditarFSC(File folderPath) throws Exception { 
        time(2000);
		click(Editar,folderPath, "click xpath");
		time(5000);
		captureScreen(folderPath, "Capture screen");
		time(1000);
        
        return this;
    }
	
	@Step("Eliminar FSC")
    public FormularioFSCPage EliminarFSC(File folderPath) throws Exception {
        time(2000);
		click(Eliminar,folderPath, "click xpath");
		time(5000);
		captureScreen(folderPath, "Capture screen");
		time(1000);
        
        return this;
    }
	
	@Step("Aceptar Eliminacion FSC")
    public FormularioFSCPage AceptarEliminarFSC(File folderPath) throws Exception { 
        time(2000);
		click(btnOK,folderPath, "click xpath");
		time(3000);
		captureScreen(folderPath, "Capture screen");
		time(1000);
        
        return this;
    }
	
	@Step("Resumen de Demostracion del formulario FSC")
    public FormularioFSCPage ResumenDemostracion(File folderPath) throws Exception  {
        time(2000);
		captureScreen(folderPath, "Capture screen");
		time(1000);
        
        return this;
    }
}
