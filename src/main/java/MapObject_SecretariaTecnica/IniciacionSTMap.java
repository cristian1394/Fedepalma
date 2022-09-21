package MapObject_SecretariaTecnica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class IniciacionSTMap extends BasePage {

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	protected By btnSTecnica=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[7]/a");
	 
	public IniciacionSTMap(WebDriver driver) {
		super(driver);
		
	}
	
}
