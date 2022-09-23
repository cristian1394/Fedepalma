package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DEXFDCMap extends BasePage {
	

	protected By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");

	protected By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By btnSAS=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//kg
	protected By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	protected By btnDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	protected By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	protected By btnSMes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	protected By btnAño=By.xpath("/html/body/div[9]/div/div/div[1]/a[1]");
	protected By btnMes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[2]/a");
	protected By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	protected By btnPais=By.xpath("//*[@id=\"PaisDEX\"]");
	protected By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");//Pais
	protected By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	protected By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	protected By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//producto
	protected By btnPalmiste=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[2]");
	protected By btnKg=By.xpath("//*[@id=\"kgExportados\"]");
	protected By txtKg=By.xpath("//*[@id=\"kgExportados\"]");//kg
	protected By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	protected By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	
	protected By btnTipoProd=By.xpath("//*[@id=\"idProducto\"]");
	protected By btnpalmiste=By.xpath("//*[@id=\"idProducto\"]/option[3]");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");


	
	public DEXFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	

}
