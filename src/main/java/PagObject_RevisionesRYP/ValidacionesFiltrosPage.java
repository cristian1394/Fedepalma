package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.ValidacionesFiltrosMap;
import io.qameta.allure.Step;

public class ValidacionesFiltrosPage extends ValidacionesFiltrosMap {

	public ValidacionesFiltrosPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Filtro RYP")
	public ValidacionesFiltrosPage ValidarFiltros(String Decla,File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnDeclarante, folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnFiltro,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnContiene, folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtDeclarante, Decla, folderPath, Decla, Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Observar Validaciones Formulario")
	public ValidacionesFiltrosPage ValidarFormulario(File folderPath, String Evidencia) throws Exception {

		time(2);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(4);
		ByPixelA();
		time(4);
		click(btnFormulario,folderPath, "click xpath" , Evidencia);
		time(19);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		driver.findElement(btnSalir).sendKeys(Keys.ESCAPE);
		time(3);

		return this;
	}

	@Step("Observar Validaciones Filtro")
	public ValidacionesFiltrosPage ValidarFiltro(String Decla1,File folderPath, String Evidencia) throws Exception {

		time(1);
		scrollElementV(folderPath, btnDespliege, "scroll " , Evidencia);
		time(2);
		ByPixelA();
		time(2);
		click(btnDeclarante,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		clear(txtDeclarante);
		time(1);
		writeText(txtDeclarante, Decla1, folderPath, Decla1, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Desplegar RYP")
	public ValidacionesFiltrosPage DeplegarRYP(File folderPath, String Evidencia) throws Exception {

		time(3);
		click(Despliege,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);

		return this;
	}

}
