package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DiasEnProcesosTrazabilidadMap extends BasePage {

	protected By btnConsultar=By.id("ConsultaTrazabilidad");
	protected By btnDiasP=By.xpath("//th[18]/a[2]");
	protected By btnDias=By.xpath("//tr[10]/td[18]");
	 
	public DiasEnProcesosTrazabilidadMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
