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
	public ConsultaReporteUDDPage ScrollAbajo(File folderPath, String Evidencia) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		time(1);

		return this;
	}

	@Step("Scroll vertibal abajo")
	public ConsultaReporteUDDPage ScrollAbajo1(File folderPath, String Evidencia) throws InterruptedException {

		time(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		time(1);

		return this;
	}

	@Step("Evidencia")
	public ConsultaReporteUDDPage Evidencia(File folderPath, String Evidencia) throws Exception {

		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Iniciar Menu RYP")
	public ConsultaReporteUDDPage MenuRUDD(File folderPath, String Evidencia) throws Exception {
		time(5);
		scrollElementV(folderPath, btnDemostracionC, "scroll " , Evidencia);
		time(1);
		click(btnDemostracionC,folderPath, "click xpath" , Evidencia);
		time(2);
		scrollElementV(folderPath, btnReporteUDD, "scroll " , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnReporteUDD,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Seleccionar Tipo de demostracion")
	public ConsultaReporteUDDPage TD(File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnTipoD,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Seleccionar FMM")
	public ConsultaReporteUDDPage FMM(File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnFMM,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Seleccionar Poliza")
	public ConsultaReporteUDDPage Poliza(File folderPath, String Evidencia) throws Exception {

		time(2);
		click(btnPoliza,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Calendario")
	public ConsultaReporteUDDPage Calendario(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnCalendario,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		return this;
	}

	@Step("Seleccionar Mes")
	public ConsultaReporteUDDPage SeleccionarMes(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Seleccionar Dia")
	public ConsultaReporteUDDPage SeleccionarDia(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnDia,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Calendario")
	public ConsultaReporteUDDPage Calendario1(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnCalendario1,folderPath, "click xpath" , Evidencia);
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		return this;
	}

	@Step("Seleccionar Mes")
	public ConsultaReporteUDDPage SeleccionarMes1(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnSMes1,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnMes1,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Seleccionar Dia")
	public ConsultaReporteUDDPage SeleccionarDia1(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnDia1,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Buscar")
	public ConsultaReporteUDDPage Buscar(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Filtro Entidad")
	public ConsultaReporteUDDPage FE(String Declarante,File folderPath,String Evidencia ) throws Exception {

		time(2);
		click(btnFiltrarEntidad,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(FiltroEntidad,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnEmpieza,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtEntidad, Declarante, null, Declarante, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroEntidad,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro DCD")
	public ConsultaReporteUDDPage FDCD(String Kg, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnFiltrarDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(FiltroDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnNoContiene,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtDCD, Kg, folderPath, Kg, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroDCD,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro Producto")
	public ConsultaReporteUDDPage FProducto(String Producto, File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnFiltrarProducto,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(FiltroProducto,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnContiene,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtProducto, Producto, null, Producto, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroProducto,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Filtro Pais")
	public ConsultaReporteUDDPage FPais(String pais,File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnFiltrarPais,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(FiltroPais,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtPais, pais, null, pais, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltroPais,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);

		return this;
	}

	@Step("Exportar")
	public ConsultaReporteUDDPage Exportar(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
