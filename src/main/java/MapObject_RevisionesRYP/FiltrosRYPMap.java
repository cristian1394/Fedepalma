package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosRYPMap extends BasePage {
	
	By btnAño=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[2]/a[1]/span");
	By txtAño=By.xpath("/html/body/div[5]/form/div[1]/input");//2021
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By lblMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[3]");
	By btnMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[3]");
	By txtMes=By.xpath("/html/body/div[6]/form/div[1]/input");//Mes
	By btnfiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[5]");
	By txtInicial=By.xpath("/html/body/div[7]/form/div[1]/input");//a
	By btnFiltrarD=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnNoContiene=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[4]");
	By txtProducto=By.xpath("/html/body/div[8]/form/div[1]/input");//Palmiste
	By btnFiltrarP=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By lblGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[9]");
	By btnGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[9]/a[1]/span");
	By txtTexto=By.xpath("/html/body/div[9]/form/div[1]/input");//Texto
	By btnfiltro=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/a");
	
	public FiltrosRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
