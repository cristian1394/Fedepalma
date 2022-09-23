package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.RechazarDCDMap;
import io.qameta.allure.Step;

public class RechazarDCDPage extends RechazarDCDMap {

	public RechazarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar a FDC")
	public RechazarDCDPage IngresarFDC(File folderPath, String Evidencia) throws Exception {
		time(2);
		scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);

		time(1);
		click(btnDemostracion,folderPath, "click xpath" , Evidencia);
		time(1);
		scrollElementV(folderPath, btnFDC, "scroll " , Evidencia);

		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFDC,folderPath, "click xpath" ,Evidencia);
		time(1);
		return this;
	}

	@Step("Consultar FDC")
	public RechazarDCDPage ConsultarFDC(String NitB, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(Comprador, NitB, folderPath, NitB, Evidencia);
		time(2);
		click(Comprador,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnComprador,folderPath, "click xpath" , Evidencia);
		time(1);
		click(Estado,folderPath, "click xpath" , Evidencia);
		time(1);
		click(Radicado,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

	@Step("Revisar FDC")
	public RechazarDCDPage RevisarFDC(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(NumeroFDC,folderPath, "click xpath" , Evidencia);
		time(1);
		click(NumeroFDC,folderPath, "click xpath" , Evidencia);
		time(1);
		click(Revisar,folderPath, "click xpath" , Evidencia);
		time(4);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

	@Step("Rechazar FDC")
	public RechazarDCDPage RechazarFDC(String Obs, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(Seleccionar,folderPath, "click xpath" , Evidencia);
		time(2);
		click(Rechazar,folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(Aceptar,folderPath, "click xpath" , Evidencia);
		time(1);
		click(Casuales,folderPath, "click xpath" , Evidencia);
		time(1);
//        click(Causal);
//        Utilidades.waitInMs(1);
		click(Causal,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(Ok,folderPath, "click xpath" , Evidencia);
		time(1);
		click(Observacion,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtObservacion, Obs, folderPath, Obs, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(OK,folderPath, "click xpath" , Evidencia);
		time(1);

		return this;
	}

	@Step("Guardar FDC")
	public RechazarDCDPage GuardarFDC(String resultado, File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		click(Guardar,folderPath, "click xpath" , Evidencia);
		time(28);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		return this;
	}

	@Step("Numero DCD")
	public RechazarDCDPage NumeroDCD(String nit, String usr, String pwd, File folderPath, String Evidencia) throws Exception {

		time(2);
		scrollElementV(folderPath, Desplegar, "scroll " , Evidencia);

		time(1);
		String DCD = getElement(lblDCD).getText();
		time(2);
		ByPixel();
		time(1);
		click(Salir,folderPath, "click xpath" , Evidencia);
		time(1);
		click(usuario,folderPath, "click xpath" , Evidencia);
		time(1);
		click(CerrarSesion,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		writeText(txtNit, nit, folderPath, DCD, Evidencia);
		time(1);
		writeText(txtUsuario, usr, folderPath, DCD, Evidencia);
		time(1);
		writeText(txtContrase_a, pwd, folderPath, DCD, Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnLogin,folderPath, "click xpath" , Evidencia);
		time(6);
		click(btnDemostracionA,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnFDCa,folderPath, "click xpath" , Evidencia);
		//por confirmar tiempo
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(Crear,folderPath, "click xpath" , Evidencia);
		time(5);
		String[] Dex = { "12345678", "181900157", "92929", "92001" };
		Random aleatorio = new Random();
		int Dex2 = aleatorio.nextInt(Dex.length);
		System.out.println(Dex[Dex2]);
		String txtDex = String.valueOf(Dex[Dex2]);
		time(1);
		writeText(txtDEX, txtDex, folderPath, txtDex, Evidencia);
		time(1);
		writeText(txtNumeroDCD, DCD, folderPath, txtDex, Evidencia);
		time(1);
		click(Consultar,folderPath, "click xpath" , Evidencia);
		time(1);

		return this;
	}

	@Step("Seleccionar un DCD")
	public RechazarDCDPage SeleccionarDCD(String resultado, File folderPath, String Evidencia) throws Exception {

		time(3);
		click(Select,folderPath, "click xpath" , Evidencia);
		time(2);
		String Total = getElement(lblTotal).getText();
		time(2);
		writeText(Asociar, Total, folderPath, Total, Evidencia);
		time(3);
		click(btnAdicionar,folderPath, "click xpath" , Evidencia);
		time(18);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(4);
		return this;
	}
}