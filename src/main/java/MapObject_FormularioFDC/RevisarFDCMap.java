package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RevisarFDCMap extends BasePage {

	By btnCrear=By.id("btnCrear");
	By btnRevisar=By.id("btnRevisarFdc");
	By btnSalir=By.id("btnSalirFdc");
	By lblResultadoRevisar=By.xpath("//div[17]/p");
	By btnOk=By.xpath("//div[7]/div/button");
	
	public RevisarFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
