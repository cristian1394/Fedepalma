package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargeFDCMap extends BasePage {

	protected By btnCargaDEX=By.id("CargarDex");
	protected By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	protected By btnCargaFMM=By.id("CargarDex");
	protected By btnOkey=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	protected By btnCargaCD=By.id("CargarDex");
	protected By btnOkay=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	protected By btnCargaPoliza=By.id("CargarDex");
	protected By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	protected By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	
	public CargeFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
