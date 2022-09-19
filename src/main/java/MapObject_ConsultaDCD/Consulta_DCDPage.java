package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class Consulta_DCDPage extends BasePage {
	
	public Consulta_DCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By btnProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");
	protected By txtProveedor=By.id("idNitProveedor");//C.i. Tequendama S.A.S.
	protected By btnCI=By.xpath("//*[@id=\"idNitProveedor_listbox\"]/li");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	protected By btnProducto=By.xpath("//*[@id=\"idProductos\"]");
	protected By btnPalma=By.xpath("//*[@id=\"idProductos\"]/option[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
}