package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargaMasivaFMM2Map extends BasePage {

	protected By btnCarga=By.id("btnCargaMasivaFmm");
	protected By btnArchivo=By.id("fileCargueMasivoFmm");
	protected By btnOk=By.id("CargaMasivaFmm");
	protected By lblResultadoCarga=By.xpath("/html/body/div[8]/p");
	protected By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	protected By btnCancelar=By.xpath("//*[@id=\"CargueMasivoFMM\"]/div/div/div[4]/button");
	 
	public CargaMasivaFMM2Map(WebDriver driver) {
		super(driver);
		
	}
	
	
}
