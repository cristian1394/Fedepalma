package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RadicarDEXMap extends BasePage {

	protected By btnRadicar = By.xpath("//*[@id=\"btnRadicarFdc\"]");
	protected By btnOk = By.xpath("/html/body/div[18]/div[7]/div/button");
	protected By btnCerrar = By.xpath("/html/body/div[1]/main/div/div/div[5]/div[1]/div/div[1]/div/button");
	protected By btnFirma = By.xpath("//*[@id=\"pass5\"]");
	protected By txtFirma = By.xpath("//*[@id=\"pass5\"]");
	protected By btnEnviar = By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	protected By btnSeguir = By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By btnOK = By.xpath("/html/body/div[16]/div[7]/div/button");
	protected By btnSalir = By.xpath("//*[@id=\"btnSalirFdc\"]");

	public RadicarDEXMap(WebDriver driver) {
		super(driver);

	}

}
