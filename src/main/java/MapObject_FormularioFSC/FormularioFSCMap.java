package MapObject_FormularioFSC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FormularioFSCMap extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnDemostracion1=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnFSC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[6]/a");
	By btnFSC1=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[6]/a");
	
	By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[3]");
	By btnMesA=By.xpath("//*[@id=\"idMes\"]/option[4]");
	By btnMesB=By.xpath("//*[@id=\"idMes\"]/option[5]");
	By btnMesC=By.xpath("//*[@id=\"idMes\"]/option[6]");
	By btnMesD=By.xpath("//*[@id=\"idMes\"]/option[7]");
	By btnMesE=By.xpath("//*[@id=\"idMes\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By Historial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	By ExportarH=By.xpath("//*[@id=\"GridFDCHistorico\"]/div[1]/a");
	By CerrarH=By.xpath("/html/body/div[1]/main/div/div/section[1]/div/div/div/div[1]/div/button");
	
	By Lupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	By Scape=By.xpath("/html/body/div[1]/main/div/div/section[4]/div/div/div/div/div[1]/section[8]/div/div[2]/div/div[1]/a");
	
	By Editar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	
	By Eliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]");
	By btnOK=By.xpath("//div[7]/div[7]/div/button");
	//btnOk
	

	By btnCrear=By.id("btnCrear");
	By TipoDocumento=By.id("ddlTipoDemostracion");
	By CertificadoFMI=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	By CertificadoIP=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	By CertificadoCM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[4]");
	By btnConsultarDMI=By.id("IdConsultarDMI");
	By DMI=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[5]/label");
	By Asociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[7]/input");
	By btnAdicionar=By.id("InsertarFormulario");
	By lblAdicionar=By.xpath("//div[11]/p");//El formulario se guardo correctamente.
	//btnOk
	
	By CargaFMI=By.id("fileElementCargarFMI");
	By CargaCCM=By.id("fileElementCargarCCM");
	By CargaCIP=By.id("fileElementCargarCIP");
	By CargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	By lblResultadoCargas=By.xpath("//div[11]/p");//Se cargo el archivo correctamente
	//Solo se pueden cargar archivos con formato .pdf
	By btnOk=By.xpath("//div[7]/div/button");
	
	By btnRevisar=By.id("btnRevisarFdc");
	By lblResultadoError=By.xpath("//div[11]/p");//No ha asociado todos los kilogramos a un tipo de DCD
	//El formulario no tiene asociado documento de incumplimiento. Por favor verifique.
	
	By btnRadicar= By.id("btnRadicarFsc");
	By btnSalir=By.id("btnSalirFdc");
	By btnSalir1=By.id("btnSalirFdcValidacion");
	
	
	public FormularioFSCMap(WebDriver driver) {
		super(driver);
	}
	
	
}
