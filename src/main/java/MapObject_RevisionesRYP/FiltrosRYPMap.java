package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosRYPMap extends BasePage {
	
	protected By btnAño=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[2]/a[1]/span");
	protected By txtAño=By.xpath("/html/body/div[5]/form/div[1]/input");//2021
	protected By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	protected By lblMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[3]");
	protected By btnMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	protected By btnFiltra=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	protected By btnContiene=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[3]");
	protected By txtMes=By.xpath("/html/body/div[6]/form/div[1]/input");//Mes
	protected By btnfiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	protected By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	protected By btnFiltro=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	protected By btnComienza=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtInicial=By.xpath("/html/body/div[7]/form/div[1]/input");//a
	protected By btnFiltrarD=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	protected By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	protected By btnLista=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	protected By btnNoContiene=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[4]");
	protected By txtProducto=By.xpath("/html/body/div[8]/form/div[1]/input");//Palmiste
	protected By btnFiltrarP=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	protected By lblGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[9]");
	protected By btnGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[9]/a[1]/span");
	protected By txtTexto=By.xpath("/html/body/div[9]/form/div[1]/input");//Texto
	protected By btnfiltro=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/a");
	
	public FiltrosRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
