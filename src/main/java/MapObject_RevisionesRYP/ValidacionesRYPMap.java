package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ValidacionesRYPMap extends BasePage {

	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnFormulario=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[12]/label");
	By btnSalir=By.id("Productos");
	By btnDespliege=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[7]/td[1]/a");
	By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[7]/a[2]");
	By btnNDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[7]/label");
	By btnCancelar=By.id("btnCancelar");
	By btnBajar=By.xpath("//*[@id=\"InfoFirma\"]/div/div/div[2]/div/div/div/label");
	
	public ValidacionesRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
