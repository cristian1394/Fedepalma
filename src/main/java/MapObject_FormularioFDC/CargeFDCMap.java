package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargeFDCMap extends BasePage {

	By btnCargaDEX=By.id("CargarDex");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaFMM=By.id("CargarDex");
	By btnOkey=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaCD=By.id("CargarDex");
	By btnOkay=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaPoliza=By.id("CargarDex");
	By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	
	public CargeFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
