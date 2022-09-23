package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class EditarFDCMap extends BasePage {

	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	protected By btnEstado=By.xpath("//*[@id=\"idEstado\"]");
	protected By btnBorrador=By.xpath("//*[@id=\"idEstado\"]/option[4]");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	protected By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	protected By btnBarra=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]");
	protected By btnCasuales=By.xpath("//tr[2]/td[15]/button");
	protected By btnCasual=By.xpath("//td[15]/button");
	protected By btnOk=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[3]/button");
	protected By btnObservar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/button");
	protected By btnOK=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[3]/button");
	protected By btnLupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[17]/div/i");
	protected By btnCerrar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/div/button");
	protected By btnCargar=By.id("fileElementCargarDex");
	protected By btnSalir=By.xpath("//*[@id=\"btnSalirFdcValidacion\"]");
	 
	public EditarFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
}
