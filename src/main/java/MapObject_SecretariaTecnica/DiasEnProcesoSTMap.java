package MapObject_SecretariaTecnica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DiasEnProcesoSTMap extends BasePage {

	protected By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[3]/td[21]/div/i");
	protected By btnDias=By.xpath("//th[15]/a[2]");
	protected By btnSalir=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	protected By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[2]/td[21]/div/i");
	
	
	public DiasEnProcesoSTMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
