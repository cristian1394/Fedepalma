package MapObject_demoautomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class LoginMap extends BasePage {
	
	protected By txtUsuario=By.id("Usuario");
	protected By txtContrase_a=By.xpath("//*[@id=\"Contrase_a\"]");
	protected By btnLogin=By.xpath("//*[@id=\"btnSave\"]");
	
	
	
	public LoginMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
