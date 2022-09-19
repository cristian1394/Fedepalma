package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class ExepcionesGenerarDCDPage extends BasePage {
	
	public ExepcionesGenerarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnGenerar=By.id("btnGenerar");
	protected By btnOk=By.xpath("//div[7]/div/button");
	protected By lblResultadoGenerar=By.xpath("//div[8]/p");
}