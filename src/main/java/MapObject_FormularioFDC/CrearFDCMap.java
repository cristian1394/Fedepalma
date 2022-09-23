package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CrearFDCMap extends BasePage {
	
	protected By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	protected By btnDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	protected By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	protected By btnSMes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	protected By btnAño=By.xpath("/html/body/div[9]/div/div/div[1]/a[1]");
	protected By btnMes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[2]/a");
	protected By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	protected By btnPais=By.xpath("//*[@id=\"PaisDEX\"]");
	protected By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");
	protected By btnTipoPro=By.xpath("//*[@id=\"idProducto\"]");
	protected By btnSPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	protected By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	
	protected By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	protected By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	protected By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	protected By btnPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	protected By btnKilos=By.xpath("//*[@id=\"kgExportados\"]");
	protected By txtKilos=By.xpath("//*[@id=\"kgExportados\"]");
	protected By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	protected By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");

	
	public CrearFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	

}
