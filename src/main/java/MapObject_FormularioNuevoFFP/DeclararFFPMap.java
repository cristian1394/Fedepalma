package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class DeclararFFPMap extends BasePage {
	
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	By btnDeclarar=By.xpath("//*[@id=\"btnPresentarDeclaracion\"]"); 
	By btnok=By.xpath("//div[7]/div/button");  
                              
	
	By btnFirma=By.id("pass5");
	By txtFirma=By.id("pass5");
	By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	By btnOk=By.xpath("/html/body/div[4]/div[7]/div/button");
	By lblResultadoFirma=By.xpath("//div[5]/p");
	By lblResultadoGenerar=By.xpath("//div[7]/p");
	
	
	
	public DeclararFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
