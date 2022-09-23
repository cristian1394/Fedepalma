package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaDEXMap extends BasePage {

	protected By btnCarga=By.xpath("//*[@id=\"btnCargaMasivaDex\"]");
	protected By btnArchivo=By.id("fileCargueMasivoDex");
	protected By btnOk=By.xpath("//*[@id=\"CargaMasivaDex\"]");
	protected By lblResultadoBorrar=By.xpath("/html/body/div[8]/p");
	protected By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	protected By btnCancelar=By.xpath("//*[@id=\"CargueMasivoDEX\"]/div/div/div[4]/button");
	 
	public CargaMasivaDEXMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
