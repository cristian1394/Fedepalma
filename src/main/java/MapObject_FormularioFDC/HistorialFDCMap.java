package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class HistorialFDCMap extends BasePage {

	protected By btnHistorial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	protected  By btnCerrar=By.xpath("//*[@id=\"FormFDC\"]/div/div/div[2]/div[2]/button");
	 
	public HistorialFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
