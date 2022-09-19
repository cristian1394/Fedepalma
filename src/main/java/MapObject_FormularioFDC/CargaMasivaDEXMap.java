package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaDEXMap extends BasePage {

	By btnCarga=By.xpath("//*[@id=\"btnCargaMasivaDex\"]");
	By btnArchivo=By.id("fileCargueMasivoDex");
	By btnOk=By.xpath("//*[@id=\"CargaMasivaDex\"]");
	By lblResultadoBorrar=By.xpath("/html/body/div[8]/p");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By btnCancelar=By.xpath("//*[@id=\"CargueMasivoDEX\"]/div/div/div[4]/button");
	 
	public CargaMasivaDEXMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
