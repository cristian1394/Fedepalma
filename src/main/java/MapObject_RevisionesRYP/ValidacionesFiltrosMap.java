package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ValidacionesFiltrosMap extends BasePage {

	protected By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	protected By btnFormulario=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[12]/label");
	protected By btnSalir=By.id("Productos");
	protected By btnDespliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[1]/a");
	protected By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	protected By btnFiltro=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	protected By btnContiene=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[3]");
	protected By txtDeclarante=By.xpath("/html/body/div[5]/form/div[1]/input");//Agropecuaria
	protected By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	protected By Despliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	
	protected By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public ValidacionesFiltrosMap(WebDriver driver) {
		super(driver);
		
	}
	

}
