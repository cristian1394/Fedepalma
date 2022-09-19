package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class GenerarDCDPage extends BasePage {

	public GenerarDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By btnProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");
	protected By txtProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");//C.i. Tequendama S.A.S.
	protected By btnCI=By.xpath("//*[@id=\"idNitProveedor-list\"]/div[2]");
	protected By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	protected By btnRevisado= By.xpath("//*[@id=\"IdEstado\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[3]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	protected By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/input[1]");
	protected By btnGenerar=By.xpath("//*[@id=\"btnGenerar\"]");
	protected By btnFirmar=By.xpath("//*[@id=\"btnGenerarMasivo\"]");
	protected By btnFirma=By.xpath("//*[@id=\"pass5\"]");
	protected By txtFirma=By.xpath("//*[@id=\"pass5\"]");
	protected By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	protected By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By lblResultadoFirma=By.xpath("//div[5]/p");
	protected By lblResultadoGenerar=By.xpath("//div[7]/p");
}