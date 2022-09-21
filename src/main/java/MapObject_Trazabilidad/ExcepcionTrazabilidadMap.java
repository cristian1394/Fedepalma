package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ExcepcionTrazabilidadMap extends BasePage {
	
	protected By btnSMes=By.xpath("//*[@id=\"IdMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"IdMes\"]/option[2]");
	protected By btnSAno=By.xpath("//*[@id=\"IdAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"IdAnio\"]/option[3]");
	
	protected By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	protected By lblResultadoTrazabilidad=By.xpath("//p");
	protected By btnOk=By.xpath("//div[7]/div/button");
	
	public ExcepcionTrazabilidadMap(WebDriver driver) {
		super(driver);
	}
	
	
}
