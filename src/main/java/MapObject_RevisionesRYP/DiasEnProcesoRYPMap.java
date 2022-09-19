package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DiasEnProcesoRYPMap extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnDiasP=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[15]/a[2]");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnSalir=By.xpath("/html/body/div[1]/main/div/div/section[4]/div/div/div/div[1]/div/button");
	
	By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public DiasEnProcesoRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	

}
