package MapObject_ReporteUDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ConsultaReporteUDDMap extends BasePage {
	
	protected By btnDemostracionC=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	protected By btnReporteUDD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[5]/a");
	
	protected By btnTipoD=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[1]/div[2]/div[2]/span");
	protected By btnFMM=By.xpath("//*[@id=\"TipoDemostracion_listbox\"]/li[2]");
	protected By btnPoliza=By.xpath("//*[@id=\"TipoDemostracion_listbox\"]/li[3]");
	
	protected By btnCalendario=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[2]/div[2]/div[2]/span/span/span[2]");
	protected By btnSMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	protected By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[1]/td[1]/a");
	protected By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[4]/td[4]/a");
	protected By btnCalendario1=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[2]/div[2]/div[4]/span/span/span[2]");
	protected By btnSMes1=By.xpath("/html/body/div[6]/div/div/div[1]/a[2]");
	protected By btnMes1=By.xpath("/html/body/div[6]/div/div/div[2]/table/tbody/tr[3]/td[1]/a");
	protected By btnDia1=By.xpath("/html/body/div[6]/div/div/div[2]/table/tbody/tr[5]/td[5]/a");
	protected By btnBuscar=By.id("btnSearch");
	
	//Filtro
	
	protected By FiltroEntidad=By.xpath("/html/body/div[8]/form/div[1]/span/span");
	protected By btnFiltrarEntidad=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[1]/a[1]");
	protected By btnEmpieza=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtEntidad=By.xpath("/html/body/div[8]/form/div[1]/input");
	protected By btnFiltroEntidad=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	protected By FiltroDCD=By.xpath("/html/body/div[9]/form/div[1]/span/span");
	protected By btnFiltrarDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[4]/a[1]");
	protected By btnNoContiene=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[4]");
	protected By txtDCD=By.xpath("/html/body/div[9]/form/div[1]/input");
	protected By btnFiltroDCD=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	protected By FiltroProducto=By.xpath("/html/body/div[10]/form/div[1]/span/span");
	protected By btnFiltrarProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]");
	protected By btnContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[3]");
	protected By txtProducto=By.xpath("/html/body/div[10]/form/div[1]/input");
	protected By btnFiltroProducto=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	protected By FiltroPais=By.xpath("/html/body/div[11]/form/div[1]/span/span");
	protected By btnFiltrarPais=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[8]/a[1]");
	protected By txtPais=By.xpath("/html/body/div[11]/form/div[1]/input");
	protected By btnFiltroPais=By.xpath("/html/body/div[11]/form/div[1]/div[2]/button[1]");

	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public ConsultaReporteUDDMap(WebDriver driver) {
		super(driver);
	}
	
	
	
}
