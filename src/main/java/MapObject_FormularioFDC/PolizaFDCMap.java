package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class PolizaFDCMap extends BasePage {
	
	protected By btnCrear=By.id("btnCrear");
	
	protected By btnTDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnPoliza=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	protected By btnPoli=By.xpath("//*[@id=\"numeroPoliza\"]");
	protected By btnAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");
	protected By txtAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");//Aseguradora
	protected By btnCalendario=By.xpath("//*[@id=\"fecVigenciaFin\"]");
	protected By txtFecha=By.xpath("//*[@id=\"fecVigenciaFin\"]");//Fecha
	protected By btnValor=By.xpath("//*[@id=\"valorAsegurado\"]");
	protected By txtValor=By.xpath("//*[@id=\"valorAsegurado\"]");//valor
	protected By btnProducto=By.xpath("//*[@id=\"idProducto\"]");
	protected By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	protected By btnConsulta=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	protected By btnDemo=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[8]");
	protected By lblAsegurado=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[10]/label[2]");
	protected By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//Asociar
	protected By btnValorDispo=By.xpath("//*[@id=\"valorDisponible\"]");
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	protected By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By btnOkey=By.xpath("/html/body/div[21]/div[7]/div/button");
	protected By lblResultadoAdicionar=By.xpath("//div[21]/p");

	
	public PolizaFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
   	
	
}
