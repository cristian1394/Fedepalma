package MapObject_Trazabilidad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FiltrosTrazabilidadMap extends BasePage {
	
	By btnNoTramitados=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[1]/div/div/div[1]/div[2]/div[1]/div[1]/input");
	By btnConsultar=By.xpath("//*[@id=\"ConsultaTrazabilidad\"]");
	
	By btnMes=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[3]/a[1]/span");
	By btnFiltra=By.xpath("/html/body/div[5]/form/div[1]/span/span/span[2]/span");
	By btnTermina=By.xpath("/html/body/div[5]/form/div[2]/div/div[2]/ul/li[6]");
	By txtMes=By.xpath("/html/body/div[5]/form/div[1]/input");//e
	By btnfiltrar=By.xpath("/html/body/div[5]/form/div[1]/div[2]/button[1]");
	
	By btnDeclarante=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[4]/a[1]/span");
	By btnFiltro=By.xpath("/html/body/div[6]/form/div[1]/span/span/span[2]/span");
	By btnComienza=By.xpath("/html/body/div[6]/form/div[2]/div/div[2]/ul/li[5]");
	By txtInicial=By.xpath("/html/body/div[6]/form/div[1]/input");//c
	By btnFiltrarD=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	By btnComprador=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[5]/a[1]/span");
	By btnlista=By.xpath("/html/body/div[7]/form/div[1]/span/span/span[2]/span");
	By btnContiene=By.xpath("/html/body/div[7]/form/div[2]/div/div[2]/ul/li[3]");
	By txtContiene=By.xpath("/html/body/div[7]/form/div[1]/input");//t
	By btnFiltrarC=By.xpath("/html/body/div[7]/form/div[1]/div[2]/button[1]");
	
	By btnDCD=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[6]/a[1]/span");
	By btnfiltra=By.xpath("/html/body/div[8]/form/div[1]/span/span/span[2]/span");
	By btnDiferente=By.xpath("/html/body/div[8]/form/div[2]/div/div[2]/ul/li[2]");
	By txtDCD=By.xpath("/html/body/div[8]/form/div[1]/span[2]/span/input[1]");//50
	By btnFiltrar=By.xpath("/html/body/div[8]/form/div[1]/div[2]/button[1]");
	
	By lblProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/tbody/tr[1]/td[7]");
	By btnProducto=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[7]/a[1]/span");
	By txtProducto=By.xpath("/html/body/div[9]/form/div[1]/input");
	By btnFiltrarP=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button[1]");
	
	By btnGrupoMercado=By.xpath("/html/body/div[1]/main/div/div/section[2]/div[2]/div/div/div/table/thead/tr/th[8]/a[1]/span");
	By btnLista=By.xpath("/html/body/div[10]/form/div[1]/span/span/span[2]/span");
	By btnNoContiene=By.xpath("/html/body/div[10]/form/div[2]/div/div[2]/ul/li[4]");
	By txtGrupo=By.xpath("/html/body/div[10]/form/div[1]/input");//colombia
	By btnFiltrarG=By.xpath("/html/body/div[10]/form/div[1]/div[2]/button[1]");
	
	public FiltrosTrazabilidadMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
