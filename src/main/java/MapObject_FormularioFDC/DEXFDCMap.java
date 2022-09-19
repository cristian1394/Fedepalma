package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DEXFDCMap extends BasePage {
	

	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");

	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSAS=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//kg
	By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	By btnSMes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	By btnAño=By.xpath("/html/body/div[9]/div/div/div[1]/a[1]");
	By btnMes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	By btnPais=By.xpath("//*[@id=\"PaisDEX\"]");
	By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");//Pais
	By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//producto
	By btnPalmiste=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[2]");
	By btnKg=By.xpath("//*[@id=\"kgExportados\"]");
	By txtKg=By.xpath("//*[@id=\"kgExportados\"]");//kg
	By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	
	By btnTipoProd=By.xpath("//*[@id=\"idProducto\"]");
	By btnpalmiste=By.xpath("//*[@id=\"idProducto\"]/option[3]");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");


	
	public DEXFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	

}
