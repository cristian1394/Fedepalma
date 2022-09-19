package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class InventariosCorreccionMap extends BasePage {
	
	By txtPalmaD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[2]/input");//232.022
	
	By txtPalmaoPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[3]/input");//95.509
	By txtPalmaoPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[3]/input");//145.432
	
	By txtPalmisteA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//39.999
	By txtPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[4]/input");//9.000
	By txtPalmisteD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[4]/input");//3.234
	
	By txtTotalPlama=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[8]/div/div[1]/div[2]/div[2]/input");//84.567.898
	By btnOk=By.xpath("/html/body/div[24]/div[7]/div/button");
	By btnGuardar=By.id("btnSaveDeclaration");
	By btnSi=By.xpath("/html/body/div[24]/div[7]/div/button");
	By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	
	By lblResultadoCorreccion=By.xpath("//p");
	
	public InventariosCorreccionMap(WebDriver driver) {
		super(driver);
	}
	
	
}
