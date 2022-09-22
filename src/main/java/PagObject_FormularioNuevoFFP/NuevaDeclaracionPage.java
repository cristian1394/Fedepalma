package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import MapObject_FormularioNuevoFFP.NuevaDeclaracionMap;
import io.qameta.allure.Step;

public class NuevaDeclaracionPage extends NuevaDeclaracionMap {

	public NuevaDeclaracionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Nueva Declaracion FFP")
	public NuevaDeclaracionPage NuevaDeclaracionFFP(String DocRPF, String PropiosG, String PropiosH, String RPFG,
			String RPFH, File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnNuevo,folderPath, "click xpath" , Evidencia);
		time(5);
		writeText(txtCultivosG, PropiosG, null, RPFH, Evidencia);
		time(1);
		writeText(txtCultivosH, PropiosH, null, RPFH, Evidencia);
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
		writeText(txtNitA, txtNit, null, txtNit, Evidencia);
		time(1);
		click(btnPredio,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnOpcionA,folderPath, "click xpath" , Evidencia);
		time(1);
		time(1);
		writeText(txtCompradorG, RPFG, null, txtNit, Evidencia);
		time(1);
		writeText(txtCompradorH, RPFH, null, txtNit, Evidencia);
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

	@Step("Contratantes de Maquila FFP")
	public NuevaDeclaracionPage ContratanteMaquilaFFP(String DocACM, String FrutoG, String PalmisteP, String FrutoH,
			String PalmisteE, String PalmaP, String PalmaE, File folderPath, String Evidencia) throws Exception {

		click(btnACM,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "63345677", "12456082", "800136458", "891904233", "59674890" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitB, txtNit, null, txtNit, Evidencia);
		time(1);
		writeText(txtFrutoG, FrutoG, null, txtNit, Evidencia);
		time(1);
		writeText(txtPalmisteP, PalmisteP, null, txtNit, Evidencia);
		time(1);
		writeText(txtFrutoH, FrutoH, null, txtNit, Evidencia);
		time(1);
		writeText(txtPalmisteE, PalmisteE, null, txtNit, Evidencia);
		time(1);
		writeText(txtPalmaP, PalmaP, null, txtNit, Evidencia);
		time(1);
		writeText(txtPalmaE, PalmaE, null, txtNit, Evidencia);
		time(1);
		click(btnAdicionarACM,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocACM);
		time(2);
		WebElement ruta = driver.findElement(btnCargaACM);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarACM,folderPath, "click xpath" , Evidencia);
		time(8);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Fruto Vendido FFP")
	public NuevaDeclaracionPage FrutoVendidoFFP(String DocRFV, String InicialFrutoG, String InicialFrutoH, String KgG,
			String KgH, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtInicialFrutoG, InicialFrutoG, null, KgH, Evidencia);
		time(1);
		writeText(txtInicialFrutoH, InicialFrutoH, null, KgH, Evidencia);
		time(1);
		click(btnFrutoVendido,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "860067745", "13056475", "1556130", "98085006", "13385166" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitC, txtNit, null, txtNit, Evidencia);
		time(1);
		writeText(txtKgG, KgG, null, txtNit, Evidencia);
		time(1);
		writeText(txtKgH, KgH, null, txtNit, Evidencia);
		time(1);
		click(btnAdicionarRFV,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocRFV);
		time(2);
		WebElement ruta = driver.findElement(btnCargaRFV);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarRFV,folderPath, "click xpath" , Evidencia);
		time(2);

		return this;
	}

	@Step("Fruto Enviado a Maquilar FFP")
	public NuevaDeclaracionPage FrutoEnviadoFFP(String DocRFEM, String BajaFrutoG, String BajaFrutoH, String KGG,
			String KGH, String NoProcesadoG, String NoProcesadoH, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtBajaFrutoG, BajaFrutoG, null, NoProcesadoH, Evidencia);
		time(1);
		writeText(txtBajaFrutoH, BajaFrutoH, null, NoProcesadoH, Evidencia);
		time(1);
		click(btnFrutoEnviado,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "1090378064", "900067407", "98429004", "40370072", "12900142" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitD, txtNit, null, txtNit, Evidencia);
		time(1);
		writeText(txtKGG, KGG, null, txtNit, Evidencia);
		time(1);
		writeText(txtKGH, KGH, null, txtNit, Evidencia);
		time(1);
		click(btnAdicionarRFEM,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocRFEM);
		time(2);
		WebElement ruta = driver.findElement(btnCargaRFEM);
		ruta.sendKeys(file.getAbsolutePath());
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		click(btnGuardarRFEM,folderPath, "click xpath" , Evidencia);
		time(2);

		time(1);
		writeText(txtFrutoNoProcesadoG, NoProcesadoG, file, txtNit, Evidencia);
		time(1);
		writeText(txtFrutoNoProcesadoH, NoProcesadoH, file, txtNit, Evidencia);
		time(1);

		return this;
	}

	@Step("Proveedores de Almendra FFP")
	public NuevaDeclaracionPage ProveedoresAlmendra(String DocRPA, String PPalmaIngresada, String RPalmaIngresada,
			String KG, File folderPath, String Evidencia) throws Exception {

		time(1);
		writeText(txtPPalmaIngresada, PPalmaIngresada, null, KG, Evidencia);
		// Utilidades.waitInMs(4);
		// click(btnOk);
		time(2);
		writeText(txtRPalmaIngresada, RPalmaIngresada, null, KG, Evidencia);
		time(3);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnCompraIngresada,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "10050467882", "6088235", "860002527", "2155004", "32005286" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitE, txtNit, null, txtNit, Evidencia);
		time(1);
		writeText(txtkg, KG, null, txtNit, Evidencia);
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
	public NuevaDeclaracionPage AlmendraRecibida(String DocARPM, String KG, String PalmaProcesada, String PalmaRecibida,
			String PlamisteProducida, String PalmisteRecibida, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnRecibidaIngresada,folderPath, "click xpath" , Evidencia);

		time(1);
		String[] Nit = { "12457001", "12516054", "816004403", "1093911400", "900754604" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtNitF, txtNit, null, txtNit, Evidencia);
		time(1);
		writeText(txtKg, KG, null, txtNit, Evidencia);
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

		time(1);
		writeText(txtPalmisteProducido, PlamisteProducida, file, txtNit, Evidencia);
		time(1);
		writeText(txtProducidaRecibida, PalmisteRecibida, file, txtNit, Evidencia);
		time(1);

		return this;
	}
}
