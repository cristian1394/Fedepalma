package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ConsultarFFPMap extends BasePage {
	
	By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[8]/a");
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnOk=By.xpath("//div[7]/div/button");
	
	public ConsultarFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
	
}
