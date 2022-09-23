package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class EditarDCDMap extends BasePage {
	
	public EditarDCDMap(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnProveedor=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div/div[2]/div/span");
	protected By txtProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");//C.i. Tequendama S.A.S.
	protected By btnCI=By.xpath("//*[@id=\"idNitProveedor-list\"]/div[2]");
	protected By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	protected By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[1]");
	protected By btnProducto=By.xpath("//*[@id=\"idProductos\"]");
	protected By btnPalma=By.xpath("//*[@id=\"idProductos\"]/option[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	protected By btnEditar=By.xpath("//*[@id=\"GridDCDComprador\"]/table/tbody/tr/td[3]/div/i");
	protected By btnCP=By.xpath("//*[@id=\"CodigoCP\"]");
	protected By txtCP=By.xpath("//*[@id=\"CodigoCP\"]");//56
	protected By btnKg=By.xpath("//*[@id=\"KgCP\"]");
	protected By txtKg=By.xpath("//*[@id=\"KgCP\"]");
	protected By btnCalendario=By.xpath("//*[@id=\"FechaCP_div\"]/span/span/span/span");
	protected By btnSelMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	protected By btnSelAno=By.xpath("/html/body/div[5]/div/div/div[1]/a[1]/span");
	protected By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[3]/td[3]/a");
	protected By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[4]/td[4]/a");
	protected By btnAdicionar=By.xpath("//*[@id=\"AdicionarCP\"]");
	protected By btnOk=By.xpath("/html/body/div[9]/div[7]/div/button");
	protected By btnRevisar=By.xpath("//*[@id=\"btnRevisar\"]");
	protected By btnOkey=By.xpath("/html/body/div[9]/div[7]/div/button");
	protected By btnGenerar=By.xpath("//*[@id=\"btnGenerar\"]");
	protected By btnFirma=By.xpath("//*[@id=\"pass5\"]");
	protected By txtFirma=By.xpath("//*[@id=\"pass5\"]");
	protected By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	protected By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By btnOks=By.xpath("/html/body/div[9]/div[7]/div/button");
	protected By btnCancelar=By.id("btnCancelar");
	protected By lblResultadoAdicion=By.xpath("//div[9]/p");
	protected By lblResultadoRevicion=By.xpath("//div[9]/p");
	protected By lblResultadoGenerar=By.xpath("//div[9]/p");
	protected By lblResultadoFirma=By.xpath("//div[5]/p");
	
}