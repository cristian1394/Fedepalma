package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import MapObject_FormularioNuevoFFP.CorregirFFPMap;
import io.qameta.allure.Step;

public class CorregirFFPPage extends CorregirFFPMap {

	public CorregirFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Correccion FFP")
	public CorregirFFPPage CorreccionFFP(String PropiosH, String InicialFrutoG, String InicialFrutoH,
			String BajaFrutoG, File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnCorreccion,folderPath, "click xpath" , Evidencia);
		time(15);
		clear(txtCultivosH);
		time(1);
		writeText(txtCultivosH, PropiosH, null, BajaFrutoG, Evidencia);
		time(2);
		clear(txtInicialFrutoG);
		time(1);
		writeText(txtInicialFrutoG, InicialFrutoG, null, BajaFrutoG, Evidencia);
		time(1);
		clear(txtInicialFrutoH);
		time(1);
		writeText(txtInicialFrutoH, InicialFrutoH, null, BajaFrutoG, Evidencia);
		time(2);
		clear(txtBajaFrutoG);
		time(1);
		writeText(txtBajaFrutoG, BajaFrutoG, null, BajaFrutoG, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Proveedores de Almendra FFP")
	public CorregirFFPPage ProveedoresAlmendra(String RPalmaIngresada, String DocRPA, String KG, File folderPath, String Evidencia) throws Exception {

		time(2);
		writeText(txtRPalmaIngresada, RPalmaIngresada, null, KG, Evidencia);
		time(2);
		click(btnCompraIngresada,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSeleccion,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnBorrar, "scroll " , Evidencia);
		time(1);
		click(btnBorrar,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSi,folderPath, "click xpath" , Evidencia);
		time(2);
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
		time(10);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(8);
		click(btnGuardarRPA,folderPath, "click xpath" , Evidencia);
		time(2);

		return this;
	}

	@Step("Almendra Recibida FFP")
	public CorregirFFPPage AlmendraRecibida(String DocARPM, String KG, String PalmisteRecibida, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnRecibidaIngresada,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSelector,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnEliminar, "scroll " , Evidencia);
		time(1);
		click(btnEliminar,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnConfirmar,folderPath, "click xpath" , Evidencia);
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
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);
		click(btnGuardarARPM,folderPath, "click xpath" , Evidencia);
		time(2);
		clear(txtProducidaRecibida);
		time(1);
		writeText(txtProducidaRecibida, PalmisteRecibida, file, txtNit, Evidencia);
		time(1);

		return this;
	}
}
