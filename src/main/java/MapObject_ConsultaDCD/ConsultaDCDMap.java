package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class ConsultaDCDMap extends BasePage {
	
	public ConsultaDCDMap(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By btnRevisar=By.xpath("//*[@id=\"btnRevisar\"]");
	protected By btnOk=By.xpath("//div[7]/div/button");
	protected By lblResultadoRevicion=By.xpath("//div[8]/p");
	
}