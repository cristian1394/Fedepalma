package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ConsultaFFPMap extends BasePage {
	
	By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[3]/a");
	By btnDeclarante=By.xpath("//*[@id=\"Nit\"]");
	By txtDeclarante=By.id("Nit");
	By btnOpcionB=By.xpath("/html/body/div[4]/div/div[2]/ul/li[2]");
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[3]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public ConsultaFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
