package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaFMMMap extends BasePage {
	
	protected By btnCargaFmm=By.xpath("//*[@id=\"btnCargaMasivaFmm\"]");
	protected By btnArchivoFmm=By.id("fileCargueMasivoFmm");
	protected By btnCargar=By.xpath("//*[@id=\"CargaMasivaFmm\"]");
	protected By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	protected By lblResultadoCarga=By.xpath("/html/body/div[8]/p");
	protected By btnCancela=By.xpath("//*[@id=\"CargueMasivoFMM\"]/div/div/div[4]/button");
	 
	public CargaMasivaFMMMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
}
