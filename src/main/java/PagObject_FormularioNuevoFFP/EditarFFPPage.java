package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import MapObject_FormularioNuevoFFP.EditarFFPMap;
import io.qameta.allure.Step;

public class EditarFFPPage extends EditarFFPMap {

	public EditarFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Edicion FFP")
	public EditarFFPPage EditarFFP(String PropiosH, String InicialFrutoG, String InicialFrutoH, String BajaFrutoG, File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnEditar,folderPath, "click xpath" , Evidencia);
		time(15);
		clear(txtCultivosH);
		time(1);
		writeText(txtCultivosH, PropiosH, folderPath, BajaFrutoG, Evidencia);
		time(2);
		clear(txtInicialFrutoG);
		time(1);
		writeText(txtInicialFrutoG, InicialFrutoG, folderPath, BajaFrutoG, Evidencia);
		time(1);
		clear(txtInicialFrutoH);
		time(1);
		writeText(txtInicialFrutoH, InicialFrutoH, folderPath, BajaFrutoG, Evidencia);
		time(2);
		clear(txtBajaFrutoG);
		time(1);
		writeText(txtBajaFrutoG, BajaFrutoG, folderPath, BajaFrutoG, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Proveedores de Almendra FFP")
	public EditarFFPPage ProveedoresAlmendra(String DocRPA, String KG, File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnCompraIngresada,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSeleccion,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnEliminar, "scroll " , Evidencia);
		time(1);
		click(btnBorrar,folderPath, "click xpath" , Evidencia);
		time(2);
		click(btnSi,folderPath, "click xpath" , Evidencia);
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
	public EditarFFPPage AlmendraRecibida(String DocARPM, String KG, String PalmisteRecibida,File folderPath, String Evidencia) throws Exception {

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
		clear(txtProducidaRecibida,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtProducidaRecibida, PalmisteRecibida, file, txtNit, Evidencia);
		time(1);

		return this;
	}
}
