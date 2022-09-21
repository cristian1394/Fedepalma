package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class IncumplimientoFDCMap extends BasePage {
	
	protected By btnCrear=By.id("btnCrear");
	
	protected By btnTDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnIncumplimiento=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[4]");
	protected By btnConsulta=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	protected By btnSeleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	protected By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	protected By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");//Asocia
	protected By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By btnOkey=By.xpath("/html/body/div[17]/div[7]/div/button");

	
	public IncumplimientoFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
   
}
