package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class BorrarFDCMap extends BasePage {

	protected By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]/div/i");
	protected By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By btnOK=By.xpath("/html/body/div[6]/div[7]/div/button");
	protected By lblResultadoBorrar=By.xpath("//div[6]/h2");
	 
	public BorrarFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
