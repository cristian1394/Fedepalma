package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ObservarTrazabilidadMap extends BasePage {

	protected By btnVer=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/i");
	
	public ObservarTrazabilidadMap(WebDriver driver) {
		super(driver);
		
	}
	

}
