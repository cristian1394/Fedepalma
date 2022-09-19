package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosDiasEnProcesoMap extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnDiasP=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[15]/a[1]/span");
	By btnDespliege=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[5]");
	By txtDiasP=By.xpath("/html/body/div[5]/form/div[1]/input");//1
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public FiltrosDiasEnProcesoMap(WebDriver driver) {
		super(driver);
		
	}
	
	

}
