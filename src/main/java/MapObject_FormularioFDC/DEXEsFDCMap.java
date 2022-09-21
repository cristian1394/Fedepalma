package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DEXEsFDCMap extends BasePage {
	
	protected By btnCrear=By.xpath("//*[@id=\"btnCrear\"]");
	protected By txtDEX=By.xpath("//*[@id=\"numeroDEX\"]");
	protected By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	protected By btnseleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[2]/input");
	protected By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By lblTotals=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[7]/label");
	protected By txtasociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[2]/td[9]/input");
	protected By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");
	protected By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	public DEXEsFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
        
  

}
