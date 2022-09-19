package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class BorrarDCDPage extends BasePage {

	public BorrarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	protected By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]/div/i");
	protected By btnOk=By.xpath("/html/body/div[8]/div[7]/div/button");
	protected By btnObs=By.xpath("//*[@id=\"observaciones\"]");
	protected By txtObs=By.xpath("//*[@id=\"observaciones\"]");
	protected By btnGuardar=By.xpath("//*[@id=\"btnAnularConObs\"]");
	protected By btnOkey=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By lblResultadoBorrar=By.xpath("/html/body/div[7]/p");
	
}