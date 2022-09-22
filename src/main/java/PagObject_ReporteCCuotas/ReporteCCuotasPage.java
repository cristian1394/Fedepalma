package PagObject_ReporteCCuotas;

import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.itextpdf.text.DocumentException;

import MapObject_ReporteCCuotas.ReporteCCuotasMap;
import io.qameta.allure.Step;

public class ReporteCCuotasPage extends ReporteCCuotasMap {

	public ReporteCCuotasPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Scroll vertibal abajo")
	public ReporteCCuotasPage ScrollAbajo() throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		time(1);

		return this;
	}

	@Step("Scroll vertibal abajo")
	public ReporteCCuotasPage ScrollAbajo1() throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		time(1);

		return this;
	}

	@Step("Deslizar Horizontal a la derecha")
	public ReporteCCuotasPage ScrollDerecha(File folderPath, String Evidencia) throws DocumentException, InterruptedException {
		time(3);
		scrollElementV(folderPath, btnSAP, "scroll " , Evidencia);
		time(1);

		return this;
	}

	@Step("Deslizar Horizontal a la derecha")
	public ReporteCCuotasPage ScrollDerecha1(File folderPath, String Evidencia) throws DocumentException, InterruptedException {
		time(3);
		scrollElementV(folderPath, btnFondo, "scroll " , Evidencia);
		time(1);

		return this;
	}

	@Step("Evidencia")
	public ReporteCCuotasPage Evidencia(File folderPath, String Evidencia) throws Exception {

		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Iniciar Menu RYP")
	public ReporteCCuotasPage MenuRCCuotas(File folderPath, String Evidencia) throws Exception {

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
	public ReporteCCuotasPage Exportar(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Filtro Palmeros")
	public ReporteCCuotasPage FP(String Declarante, File folderPath, String Evidencia) throws Exception {

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
	public ReporteCCuotasPage FNIT(String Kg, File folderPath, String Evidencia) throws Exception {

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
	public ReporteCCuotasPage FSCPalma(String Producto, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(FiltroSCPalma,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrarSCPalma,folderPath, "click xpath" , Evidencia);
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
	public ReporteCCuotasPage FSCPalmiste(String pais, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(FiltroSCPalmiste,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrarSCPalmiste,folderPath, "click xpath" , Evidencia);
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
	public ReporteCCuotasPage FNIT1(String Kg, File folderPath, String Evidencia) throws Exception {

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
	public ReporteCCuotasPage Paginacion(File folderPath, String Evidencia) throws Exception {

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
