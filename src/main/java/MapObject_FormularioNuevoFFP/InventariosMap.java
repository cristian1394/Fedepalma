package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class InventariosMap extends BasePage {
	
	protected By txtPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[2]/input");//937.375
	protected By txtPalmaA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[2]/input");//67.890.987
	protected By txtPalmaB=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[2]/input");//65.456.789
	protected By txtPalmaC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[2]/input");//45.678.987
	protected By txtPalmaD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[2]/input");//232.022
	
	protected By txtPalmaoPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[3]/input");//95.509
	protected By txtPalmaoPalmisteA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[3]/input");//12.345.654
	protected By txtPalmaoPalmisteB=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[3]/input");//123.432
	protected By txtPalmaoPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[3]/input");//145.432
	protected By txtPalmaoPalmisteD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[3]/input");//2.345.432
	
	protected By txtPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[2]/div[4]/input");//465.544
	protected By txtPalmisteA=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[3]/div[4]/input");//39.999
	protected By txtPalmisteB=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[4]/div[4]/input");//234.321
	protected By txtPalmisteC=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[5]/div[4]/input");//9.000
	protected By txtPalmisteD=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[6]/div/div/div[6]/div[4]/input");//3.234
	
	protected By txtTotalPlama=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[8]/div/div[1]/div[2]/div[2]/input");//84.567.898
	protected By btnGuardar=By.id("btnSaveDeclaration");
	protected By btnCancelar=By.id("btnCancelDeclaration");
	
	protected By btnSi=By.xpath("/html/body/div[25]/div[7]/div/button");
	protected By btnSi1=By.xpath("/html/body/div[22]/div[7]/div/button");
	protected By btnsi=By.xpath("/html/body/div[23]/div[7]/div/button");
	protected By btnOK=By.xpath("/html/body/div[4]/div[7]/div/button");
	
	public InventariosMap(WebDriver driver) {
		super(driver);
	}
	
	
}
