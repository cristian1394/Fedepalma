package PagObject_ReporteUDD;

import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import MapObject_ReporteUDD.ConsultaReporteUDDMap;
import io.qameta.allure.Step;

public class ConsultaReporteUDDPage extends ConsultaReporteUDDMap {

	public ConsultaReporteUDDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Scroll vertibal abajo")
	public ConsultaReporteUDDPage ScrollAbajo(File folderPath) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		time(1);

		return this;
	}

	@Step("Scroll vertibal abajo")
	public ConsultaReporteUDDPage ScrollAbajo1(File folderPath) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		time(1);

		return this;
	}

	@Step("Evidencia")
	public ConsultaReporteUDDPage Evidencia(File folderPath) throws Exception {

		time(3);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Iniciar Menu RYP")
	public ConsultaReporteUDDPage MenuRUDD(File folderPath) throws Exception {
		time(5);
		scrollElementV(folderPath, btnDemostracionC, "scroll ");
		time(1);
		click(btnDemostracionC,folderPath, "click xpath");
		time(2);
		scrollElementV(folderPath, btnReporteUDD, "scroll ");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnReporteUDD,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Seleccionar Tipo de demostracion")
	public ConsultaReporteUDDPage TD(File folderPath) throws Exception {

		time(2);
		click(btnTipoD,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Seleccionar FMM")
	public ConsultaReporteUDDPage FMM(File folderPath) throws Exception {

		time(2);
		click(btnFMM,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Seleccionar Poliza")
	public ConsultaReporteUDDPage Poliza(File folderPath) throws Exception {

		time(2);
		click(btnPoliza,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Calendario")
	public ConsultaReporteUDDPage Calendario(File folderPath) throws Exception {

		time(1);
		click(btnCalendario,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(1);
		return this;
	}

	@Step("Seleccionar Mes")
	public ConsultaReporteUDDPage SeleccionarMes(File folderPath) throws Exception {

		time(1);
		click(btnSMes,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnMes,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Seleccionar Dia")
	public ConsultaReporteUDDPage SeleccionarDia(File folderPath) throws Exception {

		time(1);
		click(btnDia,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Calendario")
	public ConsultaReporteUDDPage Calendario1(File folderPath) throws Exception {

		time(1);
		click(btnCalendario1,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(1);
		return this;
	}

	@Step("Seleccionar Mes")
	public ConsultaReporteUDDPage SeleccionarMes1(File folderPath) throws Exception {

		time(1);
		click(btnSMes1,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnMes1,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Seleccionar Dia")
	public ConsultaReporteUDDPage SeleccionarDia1(File folderPath) throws Exception {

		time(1);
		click(btnDia1,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);

		return this;
	}

	@Step("Buscar")
	public ConsultaReporteUDDPage Buscar(File folderPath) throws Exception {

		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(5);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Filtro Entidad")
	public ConsultaReporteUDDPage FE(String Declarante,File folderPath ) throws Exception {

		time(2);
		click(btnFiltrarEntidad,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(FiltroEntidad, null, Declarante);
		time(1);
		click(btnEmpieza, null, Declarante);
		time(1);
		writeText(txtEntidad, Declarante, null, Declarante);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroEntidad,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro DCD")
	public ConsultaReporteUDDPage FDCD(String Kg, File folderPath) throws Exception {

		time(1);
		click(btnFiltrarDCD,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(FiltroDCD,folderPath, "click xpath");
		time(1);
		click(btnNoContiene,folderPath, "click xpath");
		time(1);
		writeText(txtDCD, Kg, folderPath, Kg);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroDCD,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro Producto")
	public ConsultaReporteUDDPage FProducto(String Producto, File folderPath) throws Exception {

		time(1);
		click(btnFiltrarProducto,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(FiltroProducto,folderPath, "click xpath");
		time(1);
		click(btnContiene,folderPath, "click xpath");
		time(1);
		writeText(txtProducto, Producto, null, Producto);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroProducto,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Filtro Pais")
	public ConsultaReporteUDDPage FPais(String pais,File folderPath) throws Exception {

		time(1);
		click(btnFiltrarPais,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(FiltroPais,folderPath, "click xpath");
		time(1);
		writeText(txtPais, pais, null, pais);
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnFiltroPais,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(2);

		return this;
	}

	@Step("Exportar")
	public ConsultaReporteUDDPage Exportar(File folderPath) throws Exception {

		time(1);
		click(btnExportar,folderPath, "click xpath");
		time(5);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

}
