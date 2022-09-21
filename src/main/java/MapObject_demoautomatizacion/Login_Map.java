package MapObject_demoautomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Map extends BasePage {
	
	protected By txtNit=By.xpath("//*[@id='Nit']");
	protected By txtUsuario=By.id("Usuario");
	protected By txtContrase_a=By.xpath("//*[@id='Contrase_a']");
	protected By btnLogin=By.xpath("//*[@id='btnSave']");
	
	
	
	public Login_Map(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
