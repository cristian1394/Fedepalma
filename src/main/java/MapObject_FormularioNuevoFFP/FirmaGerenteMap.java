package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FirmaGerenteMap extends BasePage {
	
	By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[3]/a");
	By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[3]/ul/li[3]/a");
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	By txtFrutoBaja=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");//RPFH
	By txtPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[2]/input");//PalmisteE
	By txtPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//PPalmaIngresada
	
	By btnGuardar=By.id("btnSaveDeclaration");
	By btnsi=By.xpath("/html/body/div[23]/div[7]/div/button");
	By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	By btnDeclarar=By.xpath("//*[@id=\"btnPresentarDeclaracion\"]"); 
	By btnok=By.xpath("//div[7]/div/button");  
                              
	
	By btnFirma=By.id("pass5");
	By txtFirma=By.id("pass5");
	By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	By btnOk=By.xpath("/html/body/div[4]/div[7]/div/button");
	By lblResultadoFirma=By.xpath("//div[5]/p");
	By lblResultadoGenerar=By.xpath("//div[7]/p");
	
	
	
	public FirmaGerenteMap(WebDriver driver) {
		super(driver);
	}
	
	
}
