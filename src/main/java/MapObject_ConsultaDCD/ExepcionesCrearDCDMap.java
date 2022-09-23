package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class ExepcionesCrearDCDMap extends BasePage {
	
	public ExepcionesCrearDCDMap(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	protected By btnNit=By.xpath("//*[@id=\"proveedorNit_div\"]/span");
	protected By txtNit=By.xpath("//*[@id=\"nitProveedor\"]");
	protected By btnDV=By.xpath("//*[@id=\"dvProveedor\"]");
	protected By btnSMes=By.xpath("//*[@id=\"idMonth\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMonth\"]/option[12]");
	protected By btnSAno=By.xpath("//*[@id=\"idYear\"]");
	protected By btnAno=By.xpath("//*[@id=\"idYear\"]/option[3]");
	protected By btnProducto=By.xpath("//*[@id=\"idProducto\"]");
	protected By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	protected By btnMercado=By.xpath("//*[@id=\"idMercado\"]");
	protected By btnMCI=By.xpath("//*[@id=\"idMercado\"]/option[6]");
	protected By btnKilos=By.xpath("//*[@id=\"idKgT\"]");
	protected By txtKilos=By.xpath("//*[@id=\"idKgT\"]");
	protected By btnExportar=By.xpath("//*[@id=\"option1\"]");
	protected By btnGuardar=By.xpath("//*[@id=\"btnGuardar\"]");
	protected By btnOk=By.xpath("//div[7]/div/button");
	protected By lblResultadoCrear=By.xpath("//div[8]/p");
	
}