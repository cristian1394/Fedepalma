package MapObject_SecretariaTecnica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosSecretariaTMap extends BasePage {
	
	protected By btnMes=By.xpath("//html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	protected By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	protected By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	protected By txtMes=By.xpath("/html/body/div[5]/form/div[1]/input");//o
	protected By btnfiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	protected By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	protected By btnFiltro=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	protected By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtInicial=By.xpath("/html/body/div[6]/form/div[1]/input");//e
	protected By btnFiltrarD=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	protected By lblComprador=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[6]");
	protected By btnComprador=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[6]/a[1]/span");
	protected By txtComprador=By.xpath("/html/body/div[7]/form/div[1]/input");//2021
	protected By btnFiltrar=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	protected By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[7]/a[1]/span");
	protected By btnfiltra=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	protected By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	protected By txtDCD=By.xpath("/html/body/div[8]/form/div[1]/input");//2
	protected By btnfiltro=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	protected By lblProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[8]");
	protected By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	protected By btnLista=By.xpath("/html/body/div[9]/form/div[1]/span/span/span[2]/span");
	protected By btnContiene=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[3]");
	protected By txtProducto=By.xpath("/html/body/div[9]/form/div[1]/input");//Producto
	protected By btnFiltrarP=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/a");
	
	public FiltrosSecretariaTMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
