package PagObject_ReporteCCertificados;

import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.itextpdf.text.DocumentException;

import MapObject_ReporteCCertificados.ReporteCCertificadoMap;
import io.qameta.allure.Step;

public class ReporteCCertificadoPage extends ReporteCCertificadoMap {

	public ReporteCCertificadoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Scroll vertibal abajo")
	public ReporteCCertificadoPage ScrollAbajo(File folderPath) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		time(1);

		return this;
	}

	@Step("Scroll vertibal abajo")
	public ReporteCCertificadoPage ScrollAbajo1(File folderPath) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		time(1);

		return this;
	}

	@Step("Deslizar Horizontal a la derecha")
	public ReporteCCertificadoPage ScrollDerecha(File folderPath) throws DocumentException, InterruptedException {
		time(3);
		scrollElementV(folderPath, btnSAP, "scroll ");
		time(1);

		return this;
	}

	@Step("Deslizar Horizontal a la derecha")
	public ReporteCCertificadoPage ScrollDerecha1(File folderPath) throws DocumentException, InterruptedException {
		time(3);
		scrollElementV(folderPath, btnFondo, "scroll ");
		time(1);

		return this;
	}

	@Step("Evidencia")
	public ReporteCCertificadoPage Evidencia(File folderPath) throws Exception {

		time(3);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Iniciar Menu RYP")
	public ReporteCCertificadoPage MenuRCCertificado(File folderPath) throws Exception {

		time(5);
		click(btnReportes,folderPath, "click xpath");
		time(2);
		scrollElementV(folderPath, btnReporteCC, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnReporteCC,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Exportar")
	public ReporteCCertificadoPage Exportar(File folderPath) throws Exception {

		time(1);
		click(btnExportar, folderPath, "click xpath");
		time(5);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Filtro Palmeros")
	public ReporteCCertificadoPage FP(String Declarante, File folderPath) throws Exception {

		time(2);
		click(FiltroPalmeros, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltrarPalmeros, folderPath, "click xpath");
		time(1);
		click(btnEmpieza, folderPath, "click xpath");
		time(1);
		writeText(txtPalmeros, Declarante, folderPath, Declarante);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroPalmeros, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro NIT")
	public ReporteCCertificadoPage FNIT(String Kg, File folderPath) throws Exception {

		time(1);
		click(FiltroNit, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltrarNit, folderPath, Kg);
		time(1);
		click(btnTermina, folderPath, "click xpath");
		time(1);
		writeText(txtNIT, Kg, folderPath, Kg);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroNit, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro Secuencia Cuota Palma")
	public ReporteCCertificadoPage FSCPalma(String Producto, File folderPath) throws Exception {

		time(1);
		click(FiltroSCPalma, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltrarVPalma, folderPath, "click xpath");
		time(1);
		click(btnContiene, folderPath, "click xpath");
		time(1);
		writeText(txtSCPalma, Producto, folderPath, Producto);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroSCPalma, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro Secuencia Cuota Palmiste")
	public ReporteCCertificadoPage FSCPalmiste(String pais, File folderPath) throws Exception {

		time(1);
		click(FiltroSCPalmiste, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltrarVPalmaA, folderPath, "click xpath");
		time(1);
		click(btnNoContiene, folderPath, "click xpath");
		time(1);
		writeText(txtSCPalmiste, pais, folderPath, pais);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroSCPPalmiste, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro NIT")
	public ReporteCCertificadoPage FNIT1(String Kg, File folderPath) throws Exception {

		time(1);
		click(FiltroNit, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		writeText(txtNIT, Kg, folderPath, Kg);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroNit, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Paginacion")
	public ReporteCCertificadoPage Paginacion(File folderPath) throws Exception {

		time(1);
		click(btnPagFinal, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnPagInicial, folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

}
