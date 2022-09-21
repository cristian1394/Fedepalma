package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ConsultarFFPMap extends BasePage {
	
	protected By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	protected By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[8]/a");
	protected By btnSAno=By.xpath("//*[@id=\"Year\"]");
	protected By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	protected By btnSMes=By.xpath("//*[@id=\"Month\"]");
	protected By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnOk=By.xpath("//div[7]/div/button");
	
	public ConsultarFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
	
}
