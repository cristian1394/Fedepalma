package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ValidacionesFiltrosMap extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnFormulario=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[12]/label");
	By btnSalir=By.id("Productos");
	By btnDespliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[1]/a");
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[3]");
	By txtDeclarante=By.xpath("/html/body/div[5]/form/div[1]/input");//Agropecuaria
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	By Despliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	
	By lblResultadoFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[5]");
	
	 
	public ValidacionesFiltrosMap(WebDriver driver) {
		super(driver);
		
	}
	

}
