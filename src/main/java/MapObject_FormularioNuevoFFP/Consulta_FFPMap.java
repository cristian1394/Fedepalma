package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class Consulta_FFPMap extends BasePage {
	
	protected By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	protected By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[3]/a");
	protected By btnDeclarante=By.xpath("//*[@id=\"Nit\"]");
	protected By txtDeclarante=By.id("Nit");
	protected By btnOpcionB=By.xpath("/html/body/div[4]/div/div[2]/ul/li[2]");
	protected By btnSAno=By.xpath("//*[@id=\"Year\"]");
	protected By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	protected By btnSMes=By.xpath("//*[@id=\"Month\"]");
	protected By btnMes=By.xpath("//*[@id=\"Month\"]/option[7]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public Consulta_FFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
