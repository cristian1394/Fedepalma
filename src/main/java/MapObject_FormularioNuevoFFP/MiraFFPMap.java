package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class MiraFFPMap extends BasePage {
	
	By btnConsultar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[9]/div/i");
	By btnLiquidacionFP=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[7]/div/div[1]/label");
	By btnRProveedorFruto=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div/div[1]/div");
	By btnACM=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div/div/div[1]/div");
	By btnRFV=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[1]/div");
	By btnRFEM=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div/div/div/div[1]/div");
	By btnRPA=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[14]/div/div/div/div[1]/div");
	By btnARM=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[16]/div/div/div/div[1]/div");
	By btnGenerarPDF=By.xpath("//*[@id=\"btnPdfDeclaration\"]");
	By btnSalir=By.xpath("//*[@id=\"btnCancelDeclaration\"]");
	
	By btnSi=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public MiraFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
