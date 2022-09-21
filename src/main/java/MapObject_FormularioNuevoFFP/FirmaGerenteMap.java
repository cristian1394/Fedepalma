package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FirmaGerenteMap extends BasePage {
	
	protected By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[3]/a");
	protected By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[3]/ul/li[3]/a");
	protected By btnSAno=By.xpath("//*[@id=\"Year\"]");
	protected By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	protected By btnSMes=By.xpath("//*[@id=\"Month\"]");
	protected By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	protected By txtFrutoBaja=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");//RPFH
	protected By txtPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[2]/input");//PalmisteE
	protected By txtPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//PPalmaIngresada
	
	protected By btnGuardar=By.id("btnSaveDeclaration");
	protected By btnsi=By.xpath("/html/body/div[23]/div[7]/div/button");
	protected By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	protected By btnDeclarar=By.xpath("//*[@id=\"btnPresentarDeclaracion\"]"); 
	protected By btnok=By.xpath("//div[7]/div/button");  
                              
	
	protected By btnFirma=By.id("pass5");
	protected By txtFirma=By.id("pass5");
	protected By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	protected By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By btnOk=By.xpath("/html/body/div[4]/div[7]/div/button");
	protected By lblResultadoFirma=By.xpath("//div[5]/p");
	protected By lblResultadoGenerar=By.xpath("//div[7]/p");
	
	
	
	public FirmaGerenteMap(WebDriver driver) {
		super(driver);
	}
	
	
}
