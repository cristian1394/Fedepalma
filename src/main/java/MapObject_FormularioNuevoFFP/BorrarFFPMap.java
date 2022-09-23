package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class BorrarFFPMap extends BasePage {
	
	public BorrarFFPMap(WebDriver driver) {
		super(driver);
		
	}
	
	protected By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[3]/a");
	protected By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[3]/ul/li[3]/a");
	protected By btnSAno=By.xpath("//*[@id=\"Year\"]");
	protected By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	protected By btnSMes=By.xpath("//*[@id=\"Month\"]");
	protected By btnMes=By.xpath("//*[@id=\"Month\"]/option[8]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	protected By txtInicialFruto=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");//NoProcesadoH
	protected By btnOk=By.xpath("//div[7]/div/button");
	protected By txtFrutoNoProcesado=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[2]/input");//PalmisteE
	protected By txtPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//KGH
	protected By txtTotalPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[8]/div/div[1]/div[2]/div[2]/input");//TPalma
	
	protected By btnGuardar=By.id("btnSaveDeclaration");
	protected By btnsi=By.xpath("/html/body/div[23]/div[7]/div/button");
	protected By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	protected By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[11]/div/i");
	protected By btnoK=By.xpath("/html/body/div[7]/div[7]/div/button");
}
