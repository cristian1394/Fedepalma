package MapObject_demoautomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMap extends BasePage {
	
	By txtUsuario=By.id("Usuario");
	By txtContrase_a=By.xpath("//*[@id=\"Contrase_a\"]");
	By btnLogin=By.xpath("//*[@id=\"btnSave\"]");
	
	
	
	public LoginMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
