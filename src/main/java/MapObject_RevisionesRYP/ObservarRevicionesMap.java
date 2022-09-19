package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ObservarRevicionesMap extends BasePage {

	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[2]/div/table/thead/tr/th[9]/a[1]/span");
	By btnSelect=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	By btnDiferente=By.xpath("//div[2]/div/div[2]/ul/li[2]");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By txtFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	By btnDesplegar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[6]/p");
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public ObservarRevicionesMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
