package PagObject_AdministracionFiniquitos;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.qameta.allure.Step;

public class ConsultaFCPPage extends MapObject_AdministracionFiniquitos.ConsultaFCPMap {
	
	
	public ConsultaFCPPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@Step("Evidencia")
	public ConsultaFCPPage Evidencia() throws InterruptedException {

		time(3);
		//screenshot();
		time(3);

		return this;
	}
	
	@Step("Ver FDC")
    public ConsultaFCPPage VerFDC(File folderPath) throws Exception {
       
		time(2);
		click(btnVer, folderPath, "texto prueba");
        time(23);
        //screenshot();
        time(2);
        scrollElementV(folderPath, btnBajar,"scroll hacia btn bajar");
	    time(1);
        //screenshot();
        time(2);
        return this;
    }
	
	@Step("Historial")
    public ConsultaFCPPage Historial(File folderPath) throws Exception {
		
        time(1);
		click(btnHistorial, folderPath, "texto prueba");
        time(2);
        
        time(1);
		click(btnCerrar, folderPath, "texto prueba");
        time(2);
        
        time(2);
        
        return this;
    }
	
	@Step("Editar")
    public ConsultaFCPPage Editar(File folderPath) throws Exception {
		
        time(1);
		click(btnEditar, folderPath, "texto prueba");
        time(4);
        
        time(1);
        return this;
    }
	
	@Step("Seleccionar Causales")
    public ConsultaFCPPage SeleccionarCausales(File folderPath) throws Exception {
		
        time(10);
        scrollElementV(folderPath, btnBarra,"scroll hacia barra");
        time(3);
        click(btnCasual, folderPath, "texto prueba");
        time(5);
        
        time(1);
        click(btnOk, folderPath, "texto prueba");
        time(1);
        
        return this;
    }
	
	@Step("Observar FCP")
    public ConsultaFCPPage Observar(File folderPath) throws Exception {
		
        time(1);
        click(btnObservar, folderPath, "texto prueba");
        time(5);
        
        time(1);
        click(btnOK, folderPath, "texto prueba");
        time(1);
        
        return this;
    }
	
	@Step("Lupa")
    public ConsultaFCPPage Lupa(File folderPath) throws Exception {
       
		time(1);
        click(btnLupa, folderPath, "texto prueba");
        time(5);
        
        time(1);
        click(btnCerrar1, folderPath, "texto prueba");
        time(1);
		
		time(3);
        
        return this;
    }
	
	@Step("Salir")
    public ConsultaFCPPage Salir(File folderPath) throws Exception {
       
		time(3);
		ByPixel();
		time(1);
        click(btnSalir, folderPath, "texto prueba");
        time(3);
        
        time(2);
        
        return this;
    }
	
	@Step("Eliminar")
    public ConsultaFCPPage Eliminar(File folderPath,String Resultado) throws Exception {
       
		time(8);
		click(btnEliminar, folderPath, "texto prueba");
        
        time(5);
        click(btnOk1, folderPath, Resultado);
        time(1);
		Assert.assertEquals(getElement(lblResultadoBorrar).getText(), Resultado);
		//screenshot();
        time(6);
        click(btnOK1, folderPath, "texto prueba");
        
        time(2);
        
        return this;
    }
	
	@Step("Revisar")
    public ConsultaFCPPage Revisar(File folderPath) throws Exception {
       
		time(3);
        click(btnRevisar, folderPath, "texto prueba");
        time(3);
        
        time(2);
        
        return this;
    }
	
	@Step("Seleccionar correo")
    public ConsultaFCPPage SCorreo(File folderPath) throws Exception {
       
		time(3);
        click(btnCorreo, folderPath, "texto prueba");
        time(2);
        
        time(2);
        
        return this;
    }
	
	@Step("Agregar Correo")
    public ConsultaFCPPage ACorreo(File folderPath,String Correo) throws Exception {
       
		time(2);
        writeText(txtCorreo, Correo, folderPath, "texto prueba");
        time(1);
        
        time(2);
        click(btnAgregarCorreo, folderPath, "texto prueba");
        time(1);
        
        time(2);
        click(btnCerrarCorreo, folderPath, "texto prueba");
        time(2);
        
        return this;
    }
	
	@Step("Ingresar Accion validacion en Incompleto")
    public ConsultaFCPPage IngresarAVIncompleto(File folderPath) throws Exception {
       
		time(2);
        click(btnAV, folderPath, "texto prueba");
        time(1);
        
        time(2);
        click(btnAVIncompleto, folderPath, "texto prueba");
        time(2);
        
        return this;
    }
	
	@Step("Ver Causales")
    public ConsultaFCPPage VerCausales(File folderPath) throws Exception {
		
        time(10);
        scrollElementV(folderPath, btnBarra,"scroll hacia barra");
        
         time(3);
        click(btnCasual, folderPath, "texto prueba");
        time(3);
        
        time(1);

        return this;
    }
	@Step("Seleccionar Causal")
    public ConsultaFCPPage SeleccionarCausal(File folderPath) throws Exception {
		
        time(1);
        click(btnSCausal, folderPath, "texto prueba");
        time(1);
        
        time(1);
        click(btnOk, folderPath, "texto prueba");
        time(1);
        
        return this;
    }
	
	@Step("Observar FCP")
    public ConsultaFCPPage Observar(File folderPath,String Observacion) throws Exception {
		
        time(1);
        click(btnObservar, folderPath, "texto prueba");
        time(1);
        clear(txtObservacion, folderPath, "texto prueba");   // revisar clear
        time(2);
        writeText(txtObservacion, Observacion, folderPath, "texto prueba");
        time(5);
        
        time(1);
        click(btnOK, folderPath, "texto prueba");
        time(1);
        
        return this;
    }
	
	@Step("Guardar FCP")
	public ConsultaFCPPage GuardarFCP(File folderPath) throws Exception {
		
		time(1);
		//screenshot();
		time(2);
		click(btnGuardar, folderPath, "texto prueba");
		time(1);
		//screenshot();
		time(2);
		click(btnOK1, folderPath, "texto prueba");
		time(2);
		
		return this;
	}
	
	@Step("Validacion del guarde del FCP")
	public ConsultaFCPPage VGuardarFCP(File folderPath,String nit, String usr, String pwd) throws Exception {
		
		time(2);
	    String Numero = getElement(lblNoFormulario).getText();
	    time(2);
	    click(btnSalir, folderPath, "texto prueba");
		time(2);
		click(btnSalirSesion, folderPath, "texto prueba");
		time(2);
		click(btnCerrarSesion, folderPath, "texto prueba");
		time(3);
		writeText(txtNit, nit, folderPath, "texto prueba");
        time(1);
        writeText(txtUsuario, usr, folderPath, "texto prueba");
        time(1);
        writeText(txtContrase_a, pwd, folderPath, "texto prueba");
		
		time(1);
		click(btnLogin, folderPath, "texto prueba");
        time(5);
        time(2);
        scrollElementV(folderPath, btnAdminFiniquitos,"scroll boton finiquitos");
        time(1);
        click(btnAdminFiniquitos, folderPath, "texto prueba");
        time(1);
        scrollElementV(folderPath, btnFormularioFCP,"scroll boton finiquitos");
        time(1);
        click(btnFormularioFCP, folderPath, "texto prueba");
        time(1);
 		
 		time(1);
		click(btnBuscar, folderPath, "texto prueba");
        time(3);
        
        time(1);
		click(btnFiltrarN, folderPath, "texto prueba");
        time(2);
	    writeText(txtFiltroN, Numero, folderPath, "texto prueba");
	    time(2);
	    click(btnFiltroN, folderPath, "texto prueba");
        time(2);
		
		return this;
	}
	
	@Step("Editar FCP")
	public ConsultaFCPPage EditarFCP(File folderPath) throws Exception {
		
		time(1);
		//screenshot();
		time(2);
		click(btnEditar2, folderPath, "texto prueba");
		time(5);
		
		time(1);
		
		return this;
	}
	
	@Step("Enviar documentos de la accion de validacion")
	public ConsultaFCPPage AVEnviar(File folderPath) throws Exception {
		
		time(1);
		click(btnAV1, folderPath, "texto prueba");
		time(1);
		click(btnAVEnviar, folderPath, "texto prueba");
		time(1);
		
		time(1);
		
		return this;
	}
	
	@Step("Cagar otros Archivos")
	public ConsultaFCPPage CargaOtros(File folderPath,String doc, String resultado) throws Exception {
		
		
		 scrollElementV(folderPath, btnCargas,"scroll a boton cargas");
	     time(8);
		 File file = new File(doc);
		 time(3);
		 WebElement ruta = driver.findElement(btnCargaOtros);
		 ruta.sendKeys(file.getAbsolutePath()); 
		 time(7);
		 Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		 //screenshot();
		 time(3);
		click(btnOkCargas, folderPath, "texto prueba");
		
		time(2500);
			
		return this;
	
	}
	
	@Step("Ingresar Accion validacion en Rechazado")
    public ConsultaFCPPage IngresarAVRechazar(File folderPath) throws Exception {
       
		time(2);
        click(btnAV, folderPath, "texto prueba");
        time(1);
        
        time(2);
        click(btnAVRechazar, folderPath, "texto prueba");
        time(2);
        
        time(2);
        click(btnAceptar, folderPath, "texto prueba");
        time(1);
        
        return this;
    }
	
	@Step("Validacion del guarde del FCP")
	public ConsultaFCPPage VGuardarFCP1(File folderPath,String nit, String usr, String pwd) throws Exception {
		
		time(2);
	    String Numero = getElement(lblNoDCD).getText();
	    time(2);
	    click(btnSalir, folderPath, "texto prueba");
		time(2);
		click(btnSalirSesion, folderPath, "texto prueba");
		time(2);
		click(btnCerrarSesion, folderPath, "texto prueba");
		time(3);
		writeText(txtNit, nit, folderPath, "texto prueba");
        time(1);
        writeText(txtUsuario, usr, folderPath, "texto prueba");
        time(1);
        writeText(txtContrase_a, pwd, folderPath, "texto prueba");
		
		time(1);
		click(btnLogin, folderPath, "texto prueba");
        time(5);
        time(2);
  	   	WebElement Element = driver.findElement(btnAdminFiniquitos);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        time(1);
        click(btnAdminFiniquitos, folderPath, "texto prueba");
        time(1);
        WebElement Elements = driver.findElement(btnFormularioFCP);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView();", Elements);
        time(1);
        click(btnFormularioFCP, folderPath, "texto prueba");
        time(1);
		click(btnAno, folderPath, "texto prueba");
        time(2);
        click(btnMes, folderPath, "texto prueba");
        time(1);
 		
 		time(1);
		click(btnBuscar, folderPath, "texto prueba");
        time(2500);
        
        time(1);
        click(btnCrear, folderPath, "texto prueba");
        time(1);
        String [] DCD = {"12345678",  "123456",  "1234567"};
        Random aleatorio = new Random();            
        int DCD2 = aleatorio.nextInt(DCD.length);
        System.out.println(DCD[DCD2]);
        String txtDCD = String.valueOf(DCD[DCD2]);
        time(1);
        writeText(txtDEX, txtDCD, folderPath, "texto prueba");
        time(1);
        writeText(txtNoDCD, Numero, folderPath, "texto prueba");
        time(1);
 		
 		time(1);
		
		return this;
	}
	

	
}
