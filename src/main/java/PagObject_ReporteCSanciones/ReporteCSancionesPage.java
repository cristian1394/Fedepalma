package PagObject_ReporteCSanciones;

import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.itextpdf.text.DocumentException;

import MapObject_ReporteCSanciones.ReporteCSancionesMap;
import io.qameta.allure.Step;

public class ReporteCSancionesPage extends ReporteCSancionesMap {

	public ReporteCSancionesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Scroll vertibal abajo")
	public ReporteCSancionesPage ScrollAbajo(File folderPath, String Evidencia) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		time(1);

		return this;
	}

	@Step("Scroll vertibal abajo")
	public ReporteCSancionesPage ScrollAbajo1(File folderPath, String Evidencia) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)" );
		time(1);

		return this;
	}

	@Step("Deslizar Horizontal a la derecha")
	public ReporteCSancionesPage ScrollDerecha(File folderPath, String Evidencia) throws DocumentException, InterruptedException {
		time(3);
		scrollElementV(folderPath, btnSAP, "scroll " , Evidencia);
		time(1);

		return this;
	}

	@Step("Deslizar Horizontal a la derecha")
	public ReporteCSancionesPage ScrollDerecha1(File folderPath, String Evidencia) throws DocumentException, InterruptedException {
		time(3);
		scrollElementV(folderPath, btnFondo, "scroll " , Evidencia);
		time(1);

		return this;
	}

	@Step("Evidencia")
	public ReporteCSancionesPage Evidencia(File folderPath, String Evidencia) throws Exception {

		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Iniciar Menu RYP")
	public ReporteCSancionesPage MenuRCCertificado(File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnReportes,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnReporteCC, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnReporteCC,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Exportar")
	public ReporteCSancionesPage Exportar( File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Filtro Palmeros")
	public ReporteCSancionesPage FP(String Declarante, File folderPath, String Evidencia) throws Exception {

		time(2);
		click(FiltroPalmeros,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrarPalmeros,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnEmpieza,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtPalmeros, Declarante, folderPath, Declarante, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroPalmeros,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro NIT")
	public ReporteCSancionesPage FNIT(String Kg,File folderPath, String Evidencia) throws Exception {

		time(1);
		click(FiltroNit,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrarNit,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnTermina,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtNIT, Kg, folderPath, Kg, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroNit,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro Secuencia Cuota Palma")
	public ReporteCSancionesPage FSCPalma(String Producto,File folderPath, String Evidencia) throws Exception {

		time(1);
		click(FiltroSCPalma,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrarVPalma,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnContiene,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtSCPalma, Producto, folderPath, Producto, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroSCPalma,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro Secuencia Cuota Palmiste")
	public ReporteCSancionesPage FSCPalmiste(String pais,File folderPath, String Evidencia) throws Exception {

		time(1);
		click(FiltroSCPalmiste,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrarVPalmaA,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnNoContiene,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtSCPalmiste, pais, folderPath, pais, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroSCPPalmiste,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro NIT")
	public ReporteCSancionesPage FNIT1(String Kg,File folderPath, String Evidencia) throws Exception {

		time(1);
		click(FiltroNit,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		writeText(txtNIT, Kg, folderPath, Kg, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroNit,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Paginacion")
	public ReporteCSancionesPage Paginacion(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnPagFinal,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnPagInicial,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

}
