package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CrearFDCMap extends BasePage {
	
	By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	By btnDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	By btnSMes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	By btnAño=By.xpath("/html/body/div[9]/div/div/div[1]/a[1]");
	By btnMes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	By btnPais=By.xpath("//*[@id=\"PaisDEX\"]");
	By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");
	By btnTipoPro=By.xpath("//*[@id=\"idProducto\"]");
	By btnSPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	
	By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	By btnPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	By btnKilos=By.xpath("//*[@id=\"kgExportados\"]");
	By txtKilos=By.xpath("//*[@id=\"kgExportados\"]");
	By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");

	
	public CrearFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	

}
