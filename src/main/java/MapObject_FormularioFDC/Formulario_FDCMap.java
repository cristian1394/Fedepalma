package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class Formulario_FDCMap extends BasePage {
	
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	protected By btnEstado=By.xpath("//*[@id=\"idEstado\"]");
	protected By btnBorrador=By.xpath("//*[@id=\"idEstado\"]/option[3]");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public Formulario_FDCMap(WebDriver driver) {
		super(driver);
	}
	
	
}
