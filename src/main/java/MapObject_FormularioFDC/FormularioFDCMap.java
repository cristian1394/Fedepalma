package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FormularioFDCMap extends BasePage {
	
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnDemostracionA=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[3]/a/span");
	protected By btnDemostracionB=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[4]/a/span");
	protected By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	protected By btnFDCA=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[3]/ul/li[2]/a");
	protected By btnFDCc=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[2]/a");
	protected By btnFDCB=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[4]/ul/li[2]/a");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMesA=By.xpath("//*[@id=\"idMes\"]/option[9]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public FormularioFDCMap(WebDriver driver) {
		super(driver);
	}
	
	
}
