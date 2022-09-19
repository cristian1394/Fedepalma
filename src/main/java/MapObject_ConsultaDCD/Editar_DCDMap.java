package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class Editar_DCDMap extends BasePage {

	public Editar_DCDMap(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]");
	protected By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]");
	protected By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	protected By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnMesN=By.xpath("//*[@id=\"idMes\"]");
	protected By btnFebrero=By.xpath("//*[@id=\"idMes\"]/option[3]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By btnEditar=By.xpath("//*[@id=\"GridDCDComprador\"]/table/tbody/tr/td[3]/div/i");
	protected By btnProductoA=By.xpath("//*[@id=\"idProducto\"]");
	protected By btnPalmiste=By.xpath("//*[@id=\"idProducto\"]/option[3]");
	protected By btnMercado=By.xpath("//*[@id=\"idMercado\"]");
	protected By btnPais=By.xpath("//*[@id=\"idMercado\"]/option[3]");
	protected By btnBorrar=By.xpath("//*[@id=\"idKgT\"]");
	protected By txtKilos=By.xpath("//*[@id=\"idKgT\"]");
	protected By btnCP=By.xpath("//*[@id=\"CodigoCP\"]");
	protected By txtCP=By.xpath("//*[@id=\"CodigoCP\"]");//56
	protected By btnKg=By.xpath("//*[@id=\"KgCP\"]");
	protected By txtKg=By.xpath("//*[@id=\"KgCP\"]");
	protected By btnCalendario=By.xpath("//*[@id=\"FechaCP_div\"]/span/span/span/span");
	protected By btnSelMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	protected By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[1]/td[2]/a");
	protected By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	protected By btnAdicionar=By.xpath("//*[@id=\"AdicionarCP\"]");
	protected By btnOk=By.xpath("/html/body/div[9]/div[7]/div/button");
	protected By btnDescargar=By.xpath("//*[@id=\"DecargarFormatoCP\"]");
	protected By btnCargaM=By.id("AdicionarMasivoCP");
	protected By btnOkey=By.xpath("/html/body/div[8]/div[7]/div/button");
	protected By btnGuardar=By.xpath("//*[@id=\"btnGuardar\"]");
	protected By btnOkay=By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By lblResultadoAdicion=By.xpath("//div[9]/p");
	protected By lblResultadoCarga=By.xpath("//div[8]/p");
	protected By lblResultadoGuardar=By.xpath("//div[5]/p");
	
}