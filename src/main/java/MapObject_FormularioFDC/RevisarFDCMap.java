package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RevisarFDCMap extends BasePage {

	protected By btnCrear=By.id("btnCrear");
	protected By btnRevisar=By.id("btnRevisarFdc");
	protected By btnSalir=By.id("btnSalirFdc");
	protected By lblResultadoRevisar=By.xpath("//div[17]/p");
	protected By btnOk=By.xpath("//div[7]/div/button");
	
	public RevisarFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
