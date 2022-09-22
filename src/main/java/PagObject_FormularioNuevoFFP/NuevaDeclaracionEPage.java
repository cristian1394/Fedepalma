package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import MapObject_FormularioNuevoFFP.NuevaDeclaracionEMap;
import io.qameta.allure.Step;

public class NuevaDeclaracionEPage extends NuevaDeclaracionEMap {

	public NuevaDeclaracionEPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Nueva Declaracion FFP")
	public NuevaDeclaracionEPage NuevaDeclaracionFFP(String DocRPF, String PropiosG, String PropiosH, String RPFG,
			String RPFH,  File folderPath, String Evidencia ) throws Exception {

		time(5);
		click(btnNuevo,folderPath, "click xpath" , Evidencia);
		time(8);
		writeText(txtCultivosG, PropiosG, folderPath, RPFH, Evidencia);
		time(1);
		writeText(txtCultivosH, PropiosH, folderPath, RPFH, Evidencia);
		time(1);
		click(btnComprado,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnTipoPersona,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnNatural,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "12641866", "57280085", "30929115", "36932674", "13842995" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitA, txtNit, folderPath, txtNit, Evidencia);
		time(1);
		click(btnPredio,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnOpcionA,folderPath, "click xpath" , Evidencia);
		time(1);
		time(1);
		writeText(txtCompradorG, RPFG, folderPath, txtNit, Evidencia);
		time(1);
		writeText(txtCompradorH, RPFH, folderPath, txtNit, Evidencia);
		time(1);
		click(btnAdicionarRPF,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocRPF);
		time(2);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarRPF,folderPath, "click xpath" , Evidencia);
		time(2);

		return this;
	}

	@Step("Nueva Declaracion FFP")
	public NuevaDeclaracionEPage NuevaDeclaracionFFP1(String DocRPF, String PropiosG, String PropiosH, String RPFG,
			String RPFH,  File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnNuevo,folderPath, "click xpath" , Evidencia);
		time(8);
		writeText(txtCultivosG, PropiosG, folderPath, RPFH, Evidencia);
		time(1);
		writeText(txtCultivosH, PropiosH, folderPath, RPFH, Evidencia);
		time(1);
		click(btnComprado,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnTipoPersona,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnNatural,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "12641866", "57280085", "30929115", "36932674", "13842995" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitA, txtNit, folderPath, txtNit, Evidencia);
		time(1);
		click(btnPredio,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnOpcionA1,folderPath, "click xpath" , Evidencia);
		time(1);
		time(1);
		writeText(txtCompradorG, RPFG, folderPath, txtNit, Evidencia);
		time(1);
		writeText(txtCompradorH, RPFH, folderPath, txtNit, Evidencia);
		time(1);
		click(btnAdicionarRPF,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocRPF);
		time(2);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarRPF,folderPath, "click xpath" , Evidencia);
		time(2);

		return this;
	}

	@Step("Fruto Vendido FFP")
	public NuevaDeclaracionEPage FrutoVendidoFFP(String InicialFrutoG, String InicialFrutoH ,File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtInicialFrutoG, InicialFrutoG, folderPath, InicialFrutoH, Evidencia);
		time(1);
		writeText(txtInicialFrutoH, InicialFrutoH, folderPath, InicialFrutoH, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Fruto Enviado a Maquilar FFP")
	public NuevaDeclaracionEPage FrutoEnviadoFFP(String BajaFrutoG, String BajaFrutoH, String NoProcesadoH, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtBajaFrutoG, BajaFrutoG, folderPath, NoProcesadoH, Evidencia);
		time(1);
		writeText(txtBajaFrutoH, BajaFrutoH, folderPath, NoProcesadoH, Evidencia);
		time(2);
		writeText(txtFrutoNoProcesadoH, NoProcesadoH, folderPath, NoProcesadoH, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Proveedores de Almendra FFP")
	public NuevaDeclaracionEPage ProveedoresAlmendra(String DocRPA, String PPalmaIngresada, String RPalmaIngresada,
			String KG, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtPPalmaIngresada, PPalmaIngresada, folderPath, KG, Evidencia);
		time(2);
		writeText(txtRPalmaIngresada, RPalmaIngresada, folderPath, KG, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnCompraIngresada,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "10050467882", "6088235", "860002527", "2155004", "32005286" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitE, txtNit, folderPath, txtNit, Evidencia);
		time(1);
		writeText(txtkg, KG, folderPath, txtNit, Evidencia);
		time(1);
		click(btnAdicionarRPA,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocRPA);
		time(2);
		WebElement ruta = driver.findElement(btnCargaRPA);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarRPA,folderPath, "click xpath" , Evidencia);
		time(2);

		return this;
	}

	@Step("Almendra Recibida FFP")
	public NuevaDeclaracionEPage AlmendraRecibida(String DocARPM, String KG, String PalmaProcesada,
			String PalmaRecibida, String PalmisteRecibida, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnRecibidaIngresada,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "12457001", "12516054", "816004403", "1093911400", "900754604" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitF, txtNit, folderPath, txtNit, Evidencia);
		time(1);
		writeText(txtKg, KG, folderPath, txtNit, Evidencia);
		time(1);
		click(btnAdicionarARPM,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocARPM);
		time(2);
		WebElement ruta = driver.findElement(btnCargaARPM);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarARPM,folderPath, "click xpath" , Evidencia);
		time(2);

		time(1);
		writeText(txtPalmaProcesada, PalmaProcesada, file, txtNit, Evidencia);
		time(1);
		writeText(txtRecibidaProcesada, PalmaRecibida, file, txtNit, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		writeText(txtProducidaRecibida, PalmisteRecibida, file, txtNit, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}
}
