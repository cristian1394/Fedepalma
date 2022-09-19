package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class Formulario_FDCMap extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[5]/a");
	By btnEstado=By.xpath("//*[@id=\"idEstado\"]");
	By btnBorrador=By.xpath("//*[@id=\"idEstado\"]/option[3]");
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[11]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	public Formulario_FDCMap(WebDriver driver) {
		super(driver);
	}
	
	
}
