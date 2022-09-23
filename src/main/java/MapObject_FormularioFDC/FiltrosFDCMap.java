package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosFDCMap extends BasePage {

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnNumero=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	protected By btnFiltra=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[1]");
	protected By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtNumero=By.xpath("/html/body/div[6]/form/div[1]/input");//2
	protected By btnFiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	protected By btnKgPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[1]/span");
	protected By txtKG=By.xpath("/html/body/div[7]/form/div[1]/input");//0
	protected By btnfiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	protected By btnKgPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[8]/a[1]/span");
	protected By btnLista=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	protected By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	protected By txtKg=By.xpath("/html/body/div[8]/form/div[1]/input");//0
	protected By btnFiltrarP=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	protected By btnCreacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[10]/a[1]/span");
	protected By btnlista=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	protected By btnTermina=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[6]");
	protected By txtTermina=By.xpath("/html/body/div[9]/form/div[1]/input");//1
	protected By btnFiltrarC=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	protected By btnEstado=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[12]/a[1]/span");
	protected By btnfiltra=By.xpath("/html/body/div[10]/form/div[1]/span/span/span[2]/span");
	protected By btnNoContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[4]");
	protected By txtBorrador=By.xpath("/html/body/div[10]/form/div[1]/input");//Texto
	protected By btnfiltro=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public FiltrosFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
