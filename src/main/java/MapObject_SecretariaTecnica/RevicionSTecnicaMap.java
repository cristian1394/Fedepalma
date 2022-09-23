package MapObject_SecretariaTecnica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RevicionSTecnicaMap extends BasePage {

	protected By btnlupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[7]/td[21]/div/i");
	protected By btnDevolver=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[19]/label/input");
	protected By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[18]/label/input");
	protected By btnObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	protected By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[20]/textarea");
	protected By btnLupa=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/table/tbody/tr[1]/td[21]/div/i");
	protected By btnSalir=By.xpath("//*[@id=\"HistoricoTrazabilidad\"]/div/div/div[1]/div/button");
	protected By btnGuardar=By.id("btnGuardarCompesanciones");
	protected By lblResultadoGuardar=By.xpath("//div[6]/p");
	protected By lblResultadoGuardar1=By.xpath("//h2");
	protected By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	//protected By btnSalir=By.id("btnSalirFdcValidacion");
	 
	public RevicionSTecnicaMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
