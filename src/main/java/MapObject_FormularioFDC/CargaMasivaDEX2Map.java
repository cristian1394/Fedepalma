package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaDEX2Map extends BasePage {

	By btnCarga=By.id("btnCargaMasivaDex");
	By btnArchivo=By.id("fileCargueMasivoDex");
	By btnOk=By.id("CargaMasivaDex");
	By lblResultadoCarga=By.xpath("/html/body/div[8]/p");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By btnCancelar=By.xpath("//*[@id=\"CargueMasivoDEX\"]/div/div/div[4]/button");
	 
	public CargaMasivaDEX2Map(WebDriver driver) {
		super(driver);
		
	}
	
	
}
