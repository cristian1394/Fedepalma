package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosFDCMap extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnNumero=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[1]");
	By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	By txtNumero=By.xpath("/html/body/div[6]/form/div[1]/input");//2
	By btnFiltrar=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnKgPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[1]/span");
	By txtKG=By.xpath("/html/body/div[7]/form/div[1]/input");//0
	By btnfiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnKgPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	By txtKg=By.xpath("/html/body/div[8]/form/div[1]/input");//0
	By btnFiltrarP=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By btnCreacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[10]/a[1]/span");
	By btnlista=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	By btnTermina=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[6]");
	By txtTermina=By.xpath("/html/body/div[9]/form/div[1]/input");//1
	By btnFiltrarC=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnEstado=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[12]/a[1]/span");
	By btnfiltra=By.xpath("/html/body/div[10]/form/div[1]/span/span/span[2]/span");
	By btnNoContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[4]");
	By txtBorrador=By.xpath("/html/body/div[10]/form/div[1]/input");//Texto
	By btnfiltro=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public FiltrosFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
