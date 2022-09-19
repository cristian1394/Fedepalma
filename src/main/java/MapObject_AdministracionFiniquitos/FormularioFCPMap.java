package MapObject_AdministracionFiniquitos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class FormularioFCPMap extends BasePage {

	public FormularioFCPMap(WebDriver driver) {
		super(driver);
		
	}
	
	protected By btnAdminFiniquitos=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[29]/a");
	protected By btnFormularioFCP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[29]/ul/li[2]/a");
	protected By txtComprador = By.id("idNitComprador");
	protected By btnComprador = By.id("idNitComprador_listbox");
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[2]");
	protected By btnEstado=By.xpath("//*[@id=\"idEstado\"]/option[3]");
	protected By btnFiltroN=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[2]");
	protected By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	protected By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By btnCrear=By.id("btnCrear");
	protected By btnDEX=By.id("numeroDEX");
	protected By btnTipoDemo=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnFMM=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[2]");
	protected By btnFmm=By.xpath("//*[@id=\"numeroFMM\"]");
	protected By btnTipoDemo1=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnPoliza=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	protected By btnPoli=By.xpath("//*[@id=\"numeroPoliza\"]");
	protected By txtAseguradora=By.xpath("//*[@id=\"Aseguradora\"]");//Aseguradora
	protected By txtFecha=By.xpath("//*[@id=\"fecVigenciaFin\"]");//Fecha
	protected By txtValor=By.xpath("//*[@id=\"valorAsegurado\"]");//valor
	protected By btnTipoDemo2=By.xpath("//*[@id=\"ddlTipoDemostracion\"]");
	protected By btnIncumplimiento=By.xpath("//*[@id=\"ddlTipoDemostracion\"]/option[3]");
	protected By btnCalendario=By.xpath("//*[@id=\"FechaEmbarqueDEX_div\"]/span/span/span/span");
	protected By btnCalendario1=By.xpath("//*[@id=\"FechaEmbarqueFMM_div\"]/span/span/span/span");
	protected By btnSmes=By.xpath("/html/body/div[9]/div/div/div[1]/a[2]");
	protected By btnmes=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[1]/td[2]/a");
	protected By btnDia=By.xpath("/html/body/div[9]/div/div/div[2]/table/tbody/tr[3]/td[5]/a");
	protected By btnSmes1=By.xpath("/html/body/div[10]/div/div/div[1]/a[2]");
	protected By btnmes1=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[1]/td[1]/a");
	protected By btnDia1=By.xpath("/html/body/div[10]/div/div/div[2]/table/tbody/tr[3]/td[4]/a");
	protected By txtPais=By.xpath("//*[@id=\"PaisDEX\"]");
	protected By txtPais1=By.xpath("//*[@id=\"PaisFMM\"]");
	protected By btnPExpo=By.xpath("//*[@id=\"Productos\"]");
	protected By btnPRela=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div[3]/div/div[4]/div/button");
	protected By btnProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");
	protected By txtProducto=By.xpath("//*[@id=\"ProductoProveedor\"]");//Producto
	protected By btnPalma=By.xpath("//*[@id=\"ProductoProveedor_listbox\"]/li[1]");
	protected By btnKilos=By.xpath("//*[@id=\"kgExportados\"]");
	protected By txtKilos=By.xpath("//*[@id=\"kgExportados\"]");
	protected By btnAdicionar=By.xpath("//*[@id=\"btnAdicionar\"]");
	protected By btnGuardar=By.xpath("//*[@id=\"btnAceptarProExp\"]");
	protected By btnConsultar=By.xpath("//*[@id=\"idconsultardcd\"]");
	protected By btnFiltroD=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By btnCheck=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[2]/input");
	protected By btnDemostrados=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/thead/tr/th[8]/a[2]");
	protected By lblTotales=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[7]/label");
	protected By txtAsociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr[1]/td[9]/input");
	protected By btnAdi=By.xpath("//*[@id=\"InsertarFormulario\"]");
	protected By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	protected By btnCargas=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div");
	protected By btnCargaDEX=By.id("fileElementCargarDex");
	protected By btnOk1=By.xpath("/html/body/div[17]/div[7]/div/button");
	protected By btnCargaFMM=By.id("fileElementCargarFmm");
	protected By btnCargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	
	protected By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	protected By btnSalir=By.id("btnSalirFdc");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");
	
	protected By btnRadicar=By.xpath("//*[@id=\"btnRadicarFdc\"]");
	protected By btnOk2=By.xpath("/html/body/div[18]/div[7]/div/button");
	protected By btnCerrar=By.xpath("/html/body/div[1]/main/div/div/div[5]/div[1]/div/div[1]/div/button");
	protected By btnFirma=By.xpath("//*[@id=\"pass5\"]");
	protected By txtFirma=By.xpath("//*[@id=\"pass5\"]");
	protected By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	protected By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	protected By btnOK1=By.xpath("/html/body/div[16]/div[7]/div/button");
	//btnSalir

}
