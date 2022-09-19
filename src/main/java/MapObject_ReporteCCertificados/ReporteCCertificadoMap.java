package MapObject_ReporteCCertificados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ReporteCCertificadoMap extends BasePage {
	
	By btnReportes=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[6]/a");
	By btnReporteCC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[6]/ul/li[13]/a");
	
	By btnExportar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[1]/a");
	//Paginacion
	
	By btnPagFinal=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[4]/a[4]");
	By btnPagInicial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[4]/a[1]");
	
	//Scroll
	
	By btnSAP=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[11]/a[1]");
	By btnFondo=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[16]/a[1]");
	
	//Filtro
	
	By FiltroPalmeros=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[1]/a[1]");
	By btnFiltrarPalmeros=By.xpath("/html/body/div[4]/form/div[1]/span/span");
	By btnEmpieza=By.xpath("/html/body/div[4]/form/div[2]/div/div[2]/ul/li[5]");
	By txtPalmeros=By.xpath("/html/body/div[4]/form/div[1]/input");
	By btnFiltroPalmeros=By.xpath("/html/body/div[4]/form/div[1]/div[2]/button[1]");
	
	By FiltroNit=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[2]/a[1]");
	By btnFiltrarNit=By.xpath("/html/body/div[5]/form/div[1]/span/span");
	By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	By txtNIT=By.xpath("/html/body/div[5]/form/div[1]/input");
	By btnFiltroNit=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By FiltroSCPalma=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[4]/a[1]");
	By btnFiltrarVPalma=By.xpath("/html/body/div[6]/form/div[1]/span/span");
	By btnContiene=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[3]");
	By txtSCPalma=By.xpath("/html/body/div[6]/form/div[1]/input");
	By btnFiltroSCPalma=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By FiltroSCPalmiste=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[3]/div/div[2]/div/table/thead/tr/th[6]/a[1]");
	By btnFiltrarVPalmaA=By.xpath("/html/body/div[7]/form/div[1]/span/span");
	By btnNoContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[4]");
	By txtSCPalmiste=By.xpath("/html/body/div[7]/form/div[1]/input");
	By btnFiltroSCPPalmiste=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");

	
	//FILTRO NIT
	
	By txtNIT1=By.xpath("/html/body/div[4]/form/div[1]/input");
	By btnFiltroNit1=By.xpath("/html/body/div[4]/form/div[1]/div[2]/button[1]");
	
	
	public ReporteCCertificadoMap(WebDriver driver) {
		super(driver);
	}
	
	
}
