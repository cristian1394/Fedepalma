package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RevicionesRYPMap extends BasePage {

	protected By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[9]/a[1]/span");
	protected By btnSelect=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	protected By btnDiferente=By.xpath("//div[2]/div/div[2]/ul/li[2]");
	protected By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	protected By txtFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	protected By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	protected By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[2]/td[21]/div/i");
	protected By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	protected By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	protected By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	protected By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	protected By btnCerrar=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	protected By btnGuardar=By.id("btnGuardarCompesanciones");
	protected By lblResultadoGuardar=By.xpath("//div[7]/p");
	protected By lblResultadoGuardar1=By.xpath("//p");
	protected By lblResultadoGuardar2=By.xpath("//h2");
	protected By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By btnOK=By.xpath("//div[7]/div/button");
	 
	public RevicionesRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	}
