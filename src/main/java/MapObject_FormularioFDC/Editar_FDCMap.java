package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class Editar_FDCMap extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	By btnEstado=By.id("idEstado");
	By btnBorrador=By.xpath("//*[@id=\"idEstado\"]/option[2]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	By btnBarra=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]");
	By btnCP=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div[1]/div/table/tbody/tr[1]/td[16]/a");
	
	 
	public Editar_FDCMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
