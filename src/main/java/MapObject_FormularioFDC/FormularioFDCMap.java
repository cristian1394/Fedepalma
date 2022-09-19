package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FormularioFDCMap extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDemostracionA=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[3]/a/span");
	By btnDemostracionB=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[4]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	By btnFDCA=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[3]/ul/li[2]/a");
	By btnFDCc=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[2]/a");
	By btnFDCB=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[4]/ul/li[2]/a");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMesA=By.xpath("//*[@id=\"idMes\"]/option[9]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public FormularioFDCMap(WebDriver driver) {
		super(driver);
	}
	
	
}
