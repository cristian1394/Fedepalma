package MapObject_ReporteCCuotas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ReporteCCuotasMap extends BasePage {
	
	protected By btnReportes=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[6]/a");
	protected By btnReporteCC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[6]/ul/li[12]/a");
	
	protected By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[1]/a");
	
	//Paginacion
	
	protected By btnPagFinal=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[4]/a[4]");
	protected By btnPagInicial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[4]/a[1]");
	
	//Scroll
	
	protected By btnSAP=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[11]/a[1]");
	protected By btnFondo=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[16]/a[1]");
	
	//Filtro
	
	protected By FiltroPalmeros=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[1]/a[1]");
	protected By btnFiltrarPalmeros=By.xpath("/html/body/div[4]/form/div[1]/span/span");
	protected By btnEmpieza=By.xpath("/html/body/div[4]/form/div[2]/div/div[2]/ul/li[5]");
	protected By txtPalmeros=By.xpath("/html/body/div[4]/form/div[1]/input");
	protected By btnFiltroPalmeros=By.xpath("/html/body/div[4]/form/div[1]/div[2]/button[1]");
	
	protected By FiltroNit=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[2]/a[1]");
	protected By btnFiltrarNit=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	protected By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	protected By txtNIT=By.xpath("/html/body/div[5]/form/div[1]/input");
	protected By btnFiltroNit=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	protected By FiltroSCPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[4]/a[1]");
	protected By btnFiltrarSCPalma=By.xpath("/html/body/div[6]/form/div[1]/span/span");
	protected By btnContiene=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[3]");
	protected By txtSCPalma=By.xpath("/html/body/div[6]/form/div[1]/input");
	protected By btnFiltroSCPalma=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	protected By FiltroSCPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[6]/a[1]");
	protected By btnFiltrarSCPalmiste=By.xpath("/html/body/div[7]/form/div[1]/span/span");
	protected By btnNoContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[4]");
	protected By txtSCPalmiste=By.xpath("/html/body/div[7]/form/div[1]/input");
	protected By btnFiltroSCPPalmiste=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");

	
	//FILTRO NIT
	
	protected By txtNIT1=By.xpath("/html/body/div[4]/form/div[1]/input");
	protected By btnFiltroNit1=By.xpath("/html/body/div[4]/form/div[1]/div[2]/button[1]");
	
	
	public ReporteCCuotasMap(WebDriver driver) {
		super(driver);
	}
	
	
	
}
