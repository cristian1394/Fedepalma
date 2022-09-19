package MapObject_SecretariaTecnica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ObservarSTecnicaMap extends BasePage {

	By btnDesplegar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[8]/td[21]/div/i");
	By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	By btnSalir=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	By btnGuardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("//div[6]/p");
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	//By btnSalir=By.id("btnSalirFdcValidacion");
	 
	public ObservarSTecnicaMap(WebDriver driver) {
		super(driver);
		
	}
	
	
	
}
