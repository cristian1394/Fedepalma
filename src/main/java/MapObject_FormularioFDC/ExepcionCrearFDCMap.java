package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ExepcionCrearFDCMap extends BasePage {

	By btnCrear=By.id("btnCrear");
	By btnOK=By.xpath("//div[7]/div[7]/div/button");
	By lblResultadoCrear=By.xpath("/html/body/div[7]/p");
	 
	public ExepcionCrearFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
