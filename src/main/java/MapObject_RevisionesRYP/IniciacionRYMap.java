package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class IniciacionRYMap extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a/span");
	By btnRYP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[4]/a");
	 
	public IniciacionRYMap(WebDriver driver) {
		super(driver);
		
	}
	
}
