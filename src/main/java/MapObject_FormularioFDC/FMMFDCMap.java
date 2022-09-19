package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FMMFDCMap extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	By btnFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueFMM_div\"]/span/span/span/span");
	By btnSMes=By.xpath("/html/body/div[10]/div/div/div[1]/a[2]");
	By btnMes=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[2]/td[2]/a");
	By btnDia=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[3]/td[4]/a");
	By btnPais=By.xpath("//*[@id=\"PaisFMM\"]");
	By txtPais=By.xpath("//*[@id=\"PaisFMM\"]");//Pais
	By btnPRela=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div[3]/div/div[4]/div/button");
	By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	By btnpPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	By btnKg=By.xpath("//*[@id=\"kgExportados\"]");
	By txtKg=By.xpath("//*[@id=\"kgExportados\"]");//kg
	By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	
	By btnTipoPro=By.xpath("//*[@id=\"idProducto\"]");
	By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSAS=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//kg
	By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");

	
	public FMMFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
  

}
