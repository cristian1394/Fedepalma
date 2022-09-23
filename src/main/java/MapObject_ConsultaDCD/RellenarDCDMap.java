package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RellenarDCDMap extends BasePage {

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]");
	protected By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	protected By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnMesN=By.xpath("//*[@id=\"idMes\"]");
	protected By btnFebrero=By.xpath("//*[@id=\"idMes\"]/option[11]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public RellenarDCDMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
