package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class ExepcionCMDCDPage extends BasePage {

	public ExepcionCMDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnCarga=By.xpath("//*[@id=\"btnCargueMasivo\"]");
	protected By btnArchivo=By.id("fileElement");
	protected By btnOk=By.id("acceptLoadFile");
	protected By btnOkey=By.xpath("//div[7]/div/button");
	protected By lblResultadoCargaArchivo=By.xpath("//div[9]/p");
	
}