package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class EditarFDCMap extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	By btnEstado=By.xpath("//*[@id=\"idEstado\"]");
	By btnBorrador=By.xpath("//*[@id=\"idEstado\"]/option[4]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	By btnBarra=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]");
	By btnCasuales=By.xpath("//tr[2]/td[15]/button");
	By btnCasual=By.xpath("//td[15]/button");
	By btnOk=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[3]/button");
	By btnObservar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/button");
	By btnOK=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[3]/button");
	By btnLupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[7]/div/div/div[1]/div/table/tbody/tr[1]/td[17]/div/i");
	By btnCerrar=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/div/button");
	By btnCargar=By.id("fileElementCargarDex");
	By btnSalir=By.xpath("//*[@id=\"btnSalirFdcValidacion\"]");
	 
	public EditarFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
}
