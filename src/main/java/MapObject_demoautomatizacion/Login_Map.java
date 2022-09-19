package MapObject_demoautomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Map extends BasePage {
	
	By txtNit=By.xpath("//*[@id='Nit']");
	By txtUsuario=By.id("Usuario");
	By txtContrase_a=By.xpath("//*[@id='Contrase_a']");
	By btnLogin=By.xpath("//*[@id='btnSave']");
	
	
	
	public Login_Map(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
