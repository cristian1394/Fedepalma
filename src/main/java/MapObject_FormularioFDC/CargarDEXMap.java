package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CargarDEXMap extends BasePage {

	By btnCargas=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div");
	
	By btnCargaDEX=By.id("fileElementCargarDex");
	By btnOk=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	By btnCargaFMM=By.id("fileElementCargarFmm");
	
	By btnCargaCD=By.id("fileElementCargarCP");
	
	By btnCargaPoliza=By.id("fileElementCargarPoliza");
	
	By btnCargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	By btnSalir=By.id("btnSalirFdc");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");
	
	
	
	public CargarDEXMap(WebDriver driver) {
		super(driver);
		
	}
	
	

	
}
