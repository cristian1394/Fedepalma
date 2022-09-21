package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FMMFDCMap extends BasePage {
	
	protected By btnCrear=By.id("btnCrear");
	
	protected By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	protected By btnFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	protected By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueFMM_div\"]/span/span/span/span");
	protected By btnSMes=By.xpath("/html/body/div[10]/div/div/div[1]/a[2]");
	protected By btnMes=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[2]/td[2]/a");
	protected By btnDia=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[3]/td[4]/a");
	protected By btnPais=By.xpath("//*[@id=\"PaisFMM\"]");
	protected By txtPais=By.xpath("//*[@id=\"PaisFMM\"]");//Pais
	protected By btnPRela=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div[3]/div/div[4]/div/button");
	protected By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	protected By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	protected By btnpPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	protected By btnKg=By.xpath("//*[@id=\"kgExportados\"]");
	protected By txtKg=By.xpath("//*[@id=\"kgExportados\"]");//kg
	protected By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	protected By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	
	protected By btnTipoPro=By.xpath("//*[@id=\"idProducto\"]");
	protected By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	protected By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	protected By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By btnSAS=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//kg
	protected By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");

	
	public FMMFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
  

}
