package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class FiltrosDCDMap extends BasePage {

	public FiltrosDCDMap(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By btnBuscar=By.id("btnSearch");
	protected By btnProveedor=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	protected By btnFiltra=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	protected By btnContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[3]");
	protected By txtPalma=By.xpath("/html/body/div[7]/form/div[1]/input");//Palma
	protected By btnFiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");

	protected By lblProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[10]");
	protected By btnProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[10]/a[1]/span");
	protected By txtAceite=By.xpath("/html/body/div[8]/form/div[1]/input");//Aceite
	protected By btnfiltrar=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	protected By lblEstadoDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[12]");
	protected By btnEstadoDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[12]/a[1]/span");
	protected By btnfiltra=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	protected By btnComienza=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtTexto=By.xpath("/html/body/div[9]/form/div[1]/input");//Texto
	protected By btnfiltro=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
}