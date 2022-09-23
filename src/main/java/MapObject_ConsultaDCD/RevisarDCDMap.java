package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RevisarDCDMap extends BasePage {

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By btnProveedor=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div/div[2]/div/span");
	protected By txtProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");//C.i. Tequendama S.A.S.
	protected By btnCI=By.xpath("//*[@id=\"idNitProveedor-list\"]/div[2]");
	protected By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	protected By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	protected By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/input[1]");
	protected By btnRevisar=By.xpath("//*[@id=\"btnRevisar\"]");
	protected By btnSRevisar=By.xpath("//*[@id=\"btnRevisarMasivo\"]");
	protected By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By lblResultadoRevicion=By.xpath("//div[7]/p");
	
	public RevisarDCDMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
