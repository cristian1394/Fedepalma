package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaFMMMap extends BasePage {
	
	By btnCargaFmm=By.xpath("//*[@id=\"btnCargaMasivaFmm\"]");
	By btnArchivoFmm=By.id("fileCargueMasivoFmm");
	By btnCargar=By.xpath("//*[@id=\"CargaMasivaFmm\"]");
	By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	By lblResultadoCarga=By.xpath("/html/body/div[8]/p");
	By btnCancela=By.xpath("//*[@id=\"CargueMasivoFMM\"]/div/div/div[4]/button");
	 
	public CargaMasivaFMMMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
}
