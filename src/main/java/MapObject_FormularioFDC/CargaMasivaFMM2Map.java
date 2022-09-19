package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaFMM2Map extends BasePage {

	By btnCarga=By.id("btnCargaMasivaFmm");
	By btnArchivo=By.id("fileCargueMasivoFmm");
	By btnOk=By.id("CargaMasivaFmm");
	By lblResultadoCarga=By.xpath("/html/body/div[8]/p");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By btnCancelar=By.xpath("//*[@id=\"CargueMasivoFMM\"]/div/div/div[4]/button");
	 
	public CargaMasivaFMM2Map(WebDriver driver) {
		super(driver);
		
	}
	
	
}
