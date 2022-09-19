package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class TrazabilidadMap extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a/span");
	By btnTrazabilidad=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[9]/a");
	By btnSMes=By.xpath("//*[@id=\"IdMes\"]");
	By btnMes=By.xpath("//*[@id=\"IdMes\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"IdAnio\"]");
	By btnAno=By.xpath("//*[@id=\"IdAnio\"]/option[2]");
	
	By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	By btnExportar=By.xpath("//*[@id=\"GridTrazabilidad\"]/div[1]/a");
	
	public TrazabilidadMap(WebDriver driver) {
		super(driver);
	}
	
	
}
