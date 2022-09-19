package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FMMEsFDCMap extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	By txtFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//Asocia
	By btnSeleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");
	
	By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");

	
	public FMMEsFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
  
	
}
