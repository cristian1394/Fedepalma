package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FMMEsFDCMap extends BasePage {
	
	protected By btnCrear=By.id("btnCrear");
	
	protected By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	protected By txtFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	protected By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//Asocia
	protected By btnSeleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	protected By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	protected By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");
	
	protected By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");
	protected By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");

	
	public FMMEsFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
  
	
}
