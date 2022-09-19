package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class PolizaFDCMap extends BasePage {
	
	By btnCrear=By.id("btnCrear");
	
	By btnTDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	By btnPoliza=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	By btnPoli=By.xpath("//*[@id=\"numeroPoliza\"]");
	By btnAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");
	By txtAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");//Aseguradora
	By btnCalendario=By.xpath("//*[@id=\"fecVigenciaFin\"]");
	By txtFecha=By.xpath("//*[@id=\"fecVigenciaFin\"]");//Fecha
	By btnValor=By.xpath("//*[@id=\"valorAsegurado\"]");
	By txtValor=By.xpath("//*[@id=\"valorAsegurado\"]");//valor
	By btnProducto=By.xpath("//*[@id=\"idProducto\"]");
	By btnPalma=By.xpath("//*[@id=\"idProducto\"]/option[2]");
	By btnConsulta=By.xpath("//*[@id=\"idconsultardcd\"]");
	By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	By btnDemo=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[8]");
	By lblAsegurado=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[10]/label[2]");
	By btnSelect=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	By btnAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");//Asociar
	By btnValorDispo=By.xpath("//*[@id=\"valorDisponible\"]");
	By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	By btnAdicionar=By.xpath("//*[@id=\"InsertarFormulario\"]");
	By btnOkey=By.xpath("/html/body/div[21]/div[7]/div/button");
	By lblResultadoAdicionar=By.xpath("//div[21]/p");

	
	public PolizaFDCMap(WebDriver driver) {
		super(driver);
		
	}
	
   	
	
}
