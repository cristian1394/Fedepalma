package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ExcepcionTrazabilidadMap extends BasePage {
	
	By btnSMes=By.xpath("//*[@id=\"IdMes\"]");
	By btnMes=By.xpath("//*[@id=\"IdMes\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"IdAnio\"]");
	By btnAno=By.xpath("//*[@id=\"IdAnio\"]/option[3]");
	
	By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	By lblResultadoTrazabilidad=By.xpath("//p");
	By btnOk=By.xpath("//div[7]/div/button");
	
	public ExcepcionTrazabilidadMap(WebDriver driver) {
		super(driver);
	}
	
	
}
