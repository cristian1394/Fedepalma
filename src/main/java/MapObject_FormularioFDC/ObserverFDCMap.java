package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ObserverFDCMap extends BasePage {

	By btnVer=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	By btnCerrar=By.xpath("//*[@id=\"btnSalirFdc\"]");
	 
	public ObserverFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
