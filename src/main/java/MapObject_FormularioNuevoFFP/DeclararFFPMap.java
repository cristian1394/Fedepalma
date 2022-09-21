package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DeclararFFPMap extends BasePage {
	
	protected By btnSAno=By.xpath("//*[@id=\"Year\"]");
	protected By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	protected By btnSMes=By.xpath("//*[@id=\"Month\"]");
	protected By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	protected By btnDeclarar=By.xpath("//*[@id=\"btnPresentarDeclaracion\"]"); 
	protected By btnok=By.xpath("//div[7]/div/button");  
                              
	
	protected By btnFirma=By.id("pass5");
	protected By txtFirma=By.id("pass5");
	protected By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	protected By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By btnOk=By.xpath("/html/body/div[4]/div[7]/div/button");
	protected By lblResultadoFirma=By.xpath("//div[5]/p");
	protected By lblResultadoGenerar=By.xpath("//div[7]/p");
	
	
	
	public DeclararFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
