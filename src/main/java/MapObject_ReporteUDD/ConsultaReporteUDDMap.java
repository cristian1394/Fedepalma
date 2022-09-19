package MapObject_ReporteUDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ConsultaReporteUDDMap extends BasePage {
	
	By btnDemostracionC=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnReporteUDD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[5]/a");
	
	By btnTipoD=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[1]/div[2]/div[2]/span");
	By btnFMM=By.xpath("//*[@id=\"TipoDemostracion_listbox\"]/li[2]");
	By btnPoliza=By.xpath("//*[@id=\"TipoDemostracion_listbox\"]/li[3]");
	
	By btnCalendario=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[2]/div[2]/div[2]/span/span/span[2]");
	By btnSMes=By.xpath("/html/body/div[5]/div/div/div[1]/a[2]");
	By btnMes=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[1]/td[1]/a");
	By btnDia=By.xpath("/html/body/div[5]/div/div/div[2]/table/tbody/tr[4]/td[4]/a");
	By btnCalendario1=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div[2]/div[2]/div[4]/span/span/span[2]");
	By btnSMes1=By.xpath("/html/body/div[6]/div/div/div[1]/a[2]");
	By btnMes1=By.xpath("/html/body/div[6]/div/div/div[2]/table/tbody/tr[3]/td[1]/a");
	By btnDia1=By.xpath("/html/body/div[6]/div/div/div[2]/table/tbody/tr[5]/td[5]/a");
	By btnBuscar=By.id("btnSearch");
	
	//Filtro
	
	By FiltroEntidad=By.xpath("/html/body/div[8]/form/div[1]/span/span");
	By btnFiltrarEntidad=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[1]/a[1]");
	By btnEmpieza=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[5]");
	By txtEntidad=By.xpath("/html/body/div[8]/form/div[1]/input");
	By btnFiltroEntidad=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By FiltroDCD=By.xpath("/html/body/div[9]/form/div[1]/span/span");
	By btnFiltrarDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[4]/a[1]");
	By btnNoContiene=By.xpath("/html/body/div[9]/form/div[2]/div/div[2]/ul/li[4]");
	By txtDCD=By.xpath("/html/body/div[9]/form/div[1]/input");
	By btnFiltroDCD=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By FiltroProducto=By.xpath("/html/body/div[10]/form/div[1]/span/span");
	By btnFiltrarProducto=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]");
	By btnContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[3]");
	By txtProducto=By.xpath("/html/body/div[10]/form/div[1]/input");
	By btnFiltroProducto=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	By FiltroPais=By.xpath("/html/body/div[11]/form/div[1]/span/span");
	By btnFiltrarPais=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[8]/a[1]");
	By txtPais=By.xpath("/html/body/div[11]/form/div[1]/input");
	By btnFiltroPais=By.xpath("/html/body/div[11]/form/div[1]/div[2]/button[1]");

	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/div[1]/a");
	
	public ConsultaReporteUDDMap(WebDriver driver) {
		super(driver);
	}
	
	
	
}
