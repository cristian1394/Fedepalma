package MapObject_RevisionesRYP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RevicionesRYPMap extends BasePage {

	By btnFiltro=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/thead/tr/th[9]/a[1]/span");
	By btnSelect=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	By btnDiferente=By.xpath("//div[2]/div/div[2]/ul/li[2]");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By txtFiltra=By.xpath("/html/body/div[5]/form/div[1]/input");
	By btnFiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[2]/td[21]/div/i");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnCerrar=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[7]/p");
	By lblResultadoGuardar1=By.xpath("//p");
	By lblResultadoGuardar2=By.xpath("//h2");
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By btnOK=By.xpath("//div[7]/div/button");
	 
	public RevicionesRYPMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	}
