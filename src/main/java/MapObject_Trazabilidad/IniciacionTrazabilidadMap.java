package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class IniciacionTrazabilidadMap extends BasePage {

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	protected By btnTrazabilidad=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[9]/a");
	 
	public IniciacionTrazabilidadMap(WebDriver driver) {
		super(driver);
		
	}
	

}
