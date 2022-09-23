package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class TrazabilidadMap extends BasePage {
	
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a/span");
	protected By btnTrazabilidad=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[9]/a");
	protected By btnSMes=By.xpath("//*[@id=\"IdMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"IdMes\"]/option[2]");
	protected By btnSAno=By.xpath("//*[@id=\"IdAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"IdAnio\"]/option[2]");
	
	protected By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	protected By btnExportar=By.xpath("//*[@id=\"GridTrazabilidad\"]/div[1]/a");
	
	public TrazabilidadMap(WebDriver driver) {
		super(driver);
	}
	
	
}
