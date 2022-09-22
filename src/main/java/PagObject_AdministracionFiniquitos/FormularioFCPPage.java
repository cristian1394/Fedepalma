package PagObject_AdministracionFiniquitos;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_AdministracionFiniquitos.FormularioFCPMap;
import io.qameta.allure.Step;

public class FormularioFCPPage extends FormularioFCPMap {
	
	
	
	public FormularioFCPPage(WebDriver driver) {
		super(driver);
	}
	

	@Step("Evidencia")
	public FormularioFCPPage Evidencia(File folderPath, String Evidencia) throws Exception {

		time(3);
		captureScreen(folderPath, "captura Evidencia",Evidencia);
		time(3);

		return this;
	}
	
	@Step("Consulta FDC")
    public FormularioFCPPage FormularioFCP(File folderPath, String Evidencia) throws Exception {
        time(2);
        scrollElementV(folderPath, btnAdminFiniquitos,"scroll hacia btn bajar",Evidencia);
        time(1);
        click(btnAdminFiniquitos, folderPath, "click admin finiquitos",Evidencia);
        time(1);
        scrollElementV(folderPath, btnFormularioFCP,"scroll hacia btn bajar",Evidencia);
        time(1);
        click(btnFormularioFCP, folderPath, "click formulario fcp",Evidencia);
        time(1);
		time(1);
        
        return this;
    }
	
	@Step("Digitar Comprador")
    public FormularioFCPPage Comprador(File folderPath,String Comprador, String Evidencia) throws Exception {
       
		time(2);
        writeText(txtComprador, Comprador, folderPath, "Escribe comprador",Evidencia);
        time(1);
        time(2);
        
        return this;
    }
	
	@Step("Seleccionar Comprador")
    public FormularioFCPPage SComprador(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnComprador, folderPath, "click comprador",Evidencia);
        time(2);
        
        time(1);
        return this;
    }
	
	@Step("Seleccionar Año")
    public FormularioFCPPage SeleccionarAño(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnAno, folderPath, "click año",Evidencia);
        time(2);
        
        time(1);
        return this;
    }
	
	@Step("Seleccionar Mes")
    public FormularioFCPPage SeleccionarMes(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnMes, folderPath, "click mes",Evidencia);
        time(2);
        
        time(1);
        return this;
    }
	
	@Step("Seleccionar Estado")
    public FormularioFCPPage SeleccionarEstado(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnEstado, folderPath, "click estado",Evidencia);
        time(2);
        
        time(1);
        return this;
    }
	
	@Step("Filtro Numero DCD")
    public FormularioFCPPage FNumeroDCD(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnFiltroN, folderPath, "click filtro",Evidencia);
        time(1);
        
        time(1);
        return this;
    }
	
	@Step("Buscar")
    public FormularioFCPPage Buscar(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnBuscar, folderPath, "click buscar",Evidencia);
        time(1);
        
        time(1);
        return this;
    }
	
	@Step("Seleccionar Ok")
    public FormularioFCPPage SeleccionarOk(File folderPath, String Evidencia) throws Exception {
		
        time(1);
		click(btnOk, folderPath, "click ok",Evidencia);
        time(1);
        
        time(1);
        return this;
    }
	
	@Step("Crear FCP")
    public FormularioFCPPage CrearFCP(File folderPath, String Evidencia) throws Exception {
		
        time(2);
        click(btnCrear, folderPath, "click crear",Evidencia);
        time(1);
        
        time(1);
        
        return this;
    }
	
	@Step("Digitar DEX")
    public FormularioFCPPage DigitarDex(File folderPath, String Evidencia) throws Exception {
       
        time(3);
        click(btnDEX, folderPath, "click Dex",Evidencia);
        time(1);
        numeroAleatorio();
        time(1);
        captureScreen(folderPath, "captura Screen",Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Digitar FMM")
    public FormularioFCPPage DigitarFmm(File folderPath, String Evidencia) throws Exception {
       
        time(3);
        click(btnTipoDemo, folderPath, "click tipodemo",Evidencia);
        time(1);
        click(btnFMM, folderPath, "click fmm",Evidencia);
        time(1);
        numeroAleatorio1();
        time(1);
        captureScreen(folderPath, "captura Screen",Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Digitar Incumplimiento")
    public FormularioFCPPage DigitarIncumplimiento(File folderPath, String Evidencia) throws Exception {
       
        time(3);
        click(btnTipoDemo2, folderPath, "click tipodemo2",Evidencia);
        time(1);
        click(btnIncumplimiento, folderPath, "click incumplimiento",Evidencia);
        time(1);
        
        time(1);
        
        return this;
    }
	
	@Step("Calendario")
    public FormularioFCPPage Calendario(File folderPath, String Evidencia) throws Exception{
       
		time(4);
        click(btnCalendario, folderPath, "click calendario",Evidencia);
        time(1);
        click(btnSmes, folderPath, "click smes",Evidencia);
        time(1);
        click(btnmes, folderPath, "click mes",Evidencia);
        time(1);
        click(btnDia, folderPath, "click dia",Evidencia);
        time(1);
       
        time(2);
        
        return this;
    }
	
	@Step("Calendario")
    public FormularioFCPPage Calendario1(File folderPath, String Evidencia) throws Exception{
       
		time(4);
        click(btnCalendario1, folderPath, "click calendario1",Evidencia);
        time(1);
        click(btnSmes1, folderPath, "click smes1 ",Evidencia);
        time(1);
        click(btnmes1, folderPath, "click mes1",Evidencia);
        time(1);
        click(btnDia1, folderPath, "click dia1",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Digitar Pais")
    public FormularioFCPPage Pais(File folderPath,String Pais, String Evidencia) throws Exception {
       
		time(2);
        writeText(txtPais, Pais, folderPath, "escribir pais",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Digitar Pais")
    public FormularioFCPPage Pais1(File folderPath,String Pais, String Evidencia) throws Exception {
       
		time(2);
        writeText(txtPais1, Pais, folderPath, "escribir pais1",Evidencia);
        time(1);
       
        time(2);
        
        return this;
    }
	
	@Step("Productos Exportados")
    public FormularioFCPPage ProductosExportados(File folderPath, String Evidencia) throws Exception {
       
        time(2);
        click(btnPExpo, folderPath, "click peexpo",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Productos Relacionados")
    public FormularioFCPPage ProductosRelacionados(File folderPath, String Evidencia) throws Exception {
       
        time(2);
        click(btnPRela, folderPath, "click prela",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Productos Exportados")
    public FormularioFCPPage DigitarProducto(File folderPath,String Producto, String Evidencia) throws Exception {
       
		time(1);
	    writeText(txtProducto, Producto, folderPath, "escribe producto",Evidencia);
	    time(1);
	    click(btnPalma, folderPath, "click palma",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Kilos Exportados")
    public FormularioFCPPage KilosExportados(File folderPath,String KilosExpo, String Evidencia) throws Exception {
       
		time(1);
        writeText(txtKilos, KilosExpo, folderPath, "escribe kilos",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Adicionar")
    public FormularioFCPPage Adicionar(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnAdicionar, folderPath, "click adicionar",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Guardar")
    public FormularioFCPPage Guardar(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnGuardar, folderPath, "click guardar",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Consultar DCD")
    public FormularioFCPPage ConsultarDCD(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnConsultar, folderPath, "click consultar",Evidencia);
        time(2);
        
        time(1);
        
        return this;
    }
	
	@Step("Filtro Demostracion")
    public FormularioFCPPage FiltroD(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnFiltroD, folderPath, "click filtro",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Check para Asociar")
    public FormularioFCPPage Check(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnCheck, folderPath, "click check",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Filtro Demostrados")
    public FormularioFCPPage FDemostrados(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnDemostrados, folderPath, "click demostrados",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }

	@Step("Asociar DCD a FCP")
    public FormularioFCPPage Asociar(File folderPath, String Evidencia) throws Exception {
       
		time(1);
        String Totales = getElement(lblTotales).getText();
        time(1);
        writeText(txtAsociar, Totales, folderPath, "escribe asociar",Evidencia);
        time(1);
        
        time(2);
        
        return this;
    }
	
	@Step("Adicionar FCP")
    public FormularioFCPPage AdicionarFCP(File folderPath, String Evidencia) throws Exception {
       
		time(1);
		click(btnAdi, folderPath, "click adi",Evidencia);
        time(1);
        
        time(2);
        click(btnOK, folderPath, "click ok",Evidencia);
        time(1);
        
        return this;
    }
	
	
	@Step("Cagar DEX")
    public FormularioFCPPage CargaDEX(File folderPath,String doc, String resultado, String Evidencia) throws Exception {
        
		time(2);
		scrollElementV(folderPath, btnCargas,"scroll hacia btn bajar",Evidencia);
        time(8);
		File file = new File(doc);
		time(3);
		//pendiente por definir metodo
		WebElement ruta = driver.findElement(btnCargaDEX);
		ruta.sendKeys(file.getAbsolutePath()); 
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "captura Screen",Evidencia);
	    time(3);
		click(btnOk1, folderPath, "click ok1",Evidencia);
        
        time(1);
        
        return this;
    }
	
	@Step("Cagar FMM")
	public FormularioFCPPage CargaFMM(File folderPath,String doc, String resultado, String Evidencia) throws Exception {
		
		scrollElementV(folderPath, btnCargas,"scroll hacia btn bajar",Evidencia);
	    time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaFMM);
		ruta.sendKeys(file.getAbsolutePath()); 
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "captura Screen",Evidencia);
		time(3);
		click(btnOk1, folderPath, "click ok1",Evidencia);
		time(1);
			
		return this;
	
	}
	
	@Step("Cagar Incumplimiento")
	public FormularioFCPPage CargaIncumplimiento(File folderPath,String doc, String resultado, String Evidencia) throws Exception {
		
	    time(8);
		File file = new File(doc);
		time(3);
		WebElement ruta = driver.findElement(btnCargaIncumplimiento);
		ruta.sendKeys(file.getAbsolutePath()); 
		time(7);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "captura Screen",Evidencia);
		time(3);
		click(btnOk1, folderPath, "click ok1",Evidencia);
		time(1);
			
		return this;
	}
	
	@Step("Revisar FCP")
	public FormularioFCPPage RevisarFCP(File folderPath, String Evidencia) throws Exception {
		
		time(1);
		click(btnRevisar, folderPath, "click revisar",Evidencia);
		time(1);
		time(1);
		click(btnOk1, folderPath, "click ok1",Evidencia);
		time(1);
		
		time(1);
		
		return this;
	}

	@Step("Salir FCP")
	public FormularioFCPPage SalirFCP(File folderPath, String Evidencia) throws Exception {
		
		time(1);
		captureScreen(folderPath, "captura Screen",Evidencia);
		time(2);
		click(btnSalir, folderPath, "click salir",Evidencia);
		time(8);
		
		return this;
	}
	
	@Step("Radicar FCP")
	public FormularioFCPPage RadicarFCP(File folderPath, String Evidencia) throws Exception {

		time(3);
		click(btnRadicar, folderPath, "click redicar",Evidencia);
		time(1);
			
		return this;
	}

	@Step("Firmar FCP")
	public FormularioFCPPage FirmarFCP(File folderPath,String Firma, String Evidencia) throws Exception {
		
		ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) ventana.get(1));
		time(1);
		click(btnFirma, folderPath, "click firma",Evidencia);
		time(1);
		writeText(txtFirma, Firma, folderPath, "escribe firma",Evidencia);
		captureScreen(folderPath, "captura Screen",Evidencia);
		time(1);
		click(btnEnviar, folderPath, "click enviar",Evidencia);
		time(3);
		captureScreen(folderPath, "captura Screen",Evidencia);
		click(btnSeguir, folderPath, "click seguir",Evidencia);
		driver.switchTo().window((String) ventana.get(0));
		
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

public void numeroAleatorio1()throws Exception {
	
	Random aleatorio = new Random();           
	
	 int min = 1000;
    int max = 99999;
    int random_int = (int)(Math.random() * (max - min + 1) + min);
    int random_int2 = (int)(Math.random() * (max - min + 1) + min);
    
    driver.findElement(btnFmm).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}

public void numeroAleatorio2()throws Exception {
	
	Random aleatorio = new Random();           
	
	 int min = 1000;
    int max = 99999;
    int random_int = (int)(Math.random() * (max - min + 1) + min);
    int random_int2 = (int)(Math.random() * (max - min + 1) + min);
    
    driver.findElement(btnPoli).sendKeys(Integer.toString(random_int)+Integer.toString(random_int2));
}
	
}
