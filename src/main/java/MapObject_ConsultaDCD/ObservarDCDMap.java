package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ObservarDCDMap extends BasePage {

	protected By btnLupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	protected By btnCancelar=By.xpath("//*[@id=\"btnCancelar\"]");
	
	public ObservarDCDMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
