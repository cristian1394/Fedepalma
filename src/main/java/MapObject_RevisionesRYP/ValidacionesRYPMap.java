package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ValidacionesRYPMap extends BasePage {

	protected By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	protected By btnFormulario=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[12]/label");
	protected By btnSalir=By.id("Productos");
	protected By btnDespliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[7]/td[1]/a");
	protected By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[7]/a[2]");
	protected By btnNDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[7]/label");
	protected By btnCancelar=By.id("btnCancelar");
	protected By btnBajar=By.xpath("//*[@id=\"InfoFirma\"]/div/div/div[2]/div/div/div/label");
	
	public ValidacionesRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
