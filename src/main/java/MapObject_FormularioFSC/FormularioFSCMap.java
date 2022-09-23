package MapObject_FormularioFSC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class FormularioFSCMap extends BasePage {
	
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	protected By btnDemostracion1=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	protected By btnFSC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[6]/a");
	protected By btnFSC1=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[6]/a");
	
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[2]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[3]");
	protected By btnMesA=By.xpath("//*[@id=\"idMes\"]/option[4]");
	protected By btnMesB=By.xpath("//*[@id=\"idMes\"]/option[5]");
	protected By btnMesC=By.xpath("//*[@id=\"idMes\"]/option[6]");
	protected By btnMesD=By.xpath("//*[@id=\"idMes\"]/option[7]");
	protected By btnMesE=By.xpath("//*[@id=\"idMes\"]/option[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	protected By Historial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	protected By ExportarH=By.xpath("//*[@id=\"GridFDCHistorico\"]/div[1]/a");
	protected By CerrarH=By.xpath("/html/body/div[1]/main/div/div/section[1]/div/div/div/div[1]/div/button");
	
	protected By Lupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	protected By Scape=By.xpath("/html/body/div[1]/main/div/div/section[4]/div/div/div/div/div[1]/section[8]/div/div[2]/div/div[1]/a");
	
	protected By Editar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	
	protected By Eliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[4]");
	protected By btnOK=By.xpath("//div[7]/div[7]/div/button");
	//btnOk
	

	protected By btnCrear=By.id("btnCrear");
	protected By TipoDocumento=By.id("ddlTipoDemostracion");
	protected By CertificadoFMI=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	protected By CertificadoIP=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	protected By CertificadoCM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[4]");
	protected By btnConsultarDMI=By.id("IdConsultarDMI");
	protected By DMI=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[2]/input");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[5]/label");
	protected By Asociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[7]/input");
	protected By btnAdicionar=By.id("InsertarFormulario");
	protected By lblAdicionar=By.xpath("//div[11]/p");//El formulario se guardo correctamente.
	//btnOk
	
	protected By CargaFMI=By.id("fileElementCargarFMI");
	protected By CargaCCM=By.id("fileElementCargarCCM");
	protected By CargaCIP=By.id("fileElementCargarCIP");
	protected By CargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	protected By lblResultadoCargas=By.xpath("//div[11]/p");//Se cargo el archivo correctamente
	//Solo se pueden cargar archivos con formato .pdf
	protected By btnOk=By.xpath("//div[7]/div/button");
	
	protected By btnRevisar=By.id("btnRevisarFdc");
	protected By lblResultadoError=By.xpath("//div[11]/p");//No ha asociado todos los kilogramos a un tipo de DCD
	//El formulario no tiene asociado documento de incumplimiento. Por favor verifique.
	
	protected By btnRadicar= By.id("btnRadicarFsc");
	protected By btnSalir=By.id("btnSalirFdc");
	protected By btnSalir1=By.id("btnSalirFdcValidacion");
	
	
	public FormularioFSCMap(WebDriver driver) {
		super(driver);
	}
	
	
}
