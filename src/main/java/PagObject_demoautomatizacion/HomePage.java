package PagObject_demoautomatizacion;

import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Abrir Portal Fedepalma. Url {0}")
    public HomePage irPortal(String url) throws InterruptedException  {
        driver.get(url);
        time(1);
        return new HomePage(driver);
    }

}
