package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrarFFPMap extends BasePage {
	
	protected By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	protected By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[3]/a");
	protected By btnSAno=By.xpath("//*[@id=\"Year\"]");
	protected By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	protected By btnFMes=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[2]/a[1]/span");
	protected By btnFiltro=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	protected By btnTermina=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[6]");
	protected By txtMes=By.xpath("/html/body/div[6]/form/div[1]/input");//l
	protected By btnFiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	protected By btnPalmero=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[3]/a[1]/span");
	protected By btnfiltro=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	protected By btnComienza=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtPalmero=By.xpath("/html/body/div[7]/form/div[1]/input");//E
	protected By btnfiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	protected By btnTipo=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	protected By txtTipo=By.xpath("/html/body/div[8]/form/div[1]/input");//inicial
	protected By btnFiltrarA=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	public FiltrarFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
