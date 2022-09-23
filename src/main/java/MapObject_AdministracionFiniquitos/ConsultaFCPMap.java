package MapObject_AdministracionFiniquitos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class ConsultaFCPMap extends BasePage {

	public ConsultaFCPMap(WebDriver driver) {
		super(driver);
	
	}
	// com
	protected By btnVer=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]/div/i");
	protected By btnBajar=By.xpath("/html/body/div[1]/main/div/div/section[3]/div/div/div/div/div[1]/section[15]/div/div/div[2]/div/div/div/label");
	
	protected By btnHistorial=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]/div/i");
	protected By btnCerrar=By.xpath("//*[@id=\"FormFCP\"]/div/div/div[2]/div[2]/button");
	
	protected By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/div/i");
	protected By btnBarra=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]");
//	By btnCasuales=By.xpath("//tr[2]/td[14]/button");
	protected By btnCasual=By.xpath("//td[14]/button");
	protected By btnOk=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/div/div/div/div[3]/button");
	protected By btnObservar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/button");
	protected By btnOK=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[3]/button");
	protected By btnLupa=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/i");
	protected By btnCerrar1=By.xpath("/html/body/div[1]/main/div/div/section[2]/div/div/div/div[1]/div/button");
	protected By btnSalir=By.id("btnSalirFdcValidacion");
	
	protected By btnEliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[4]/div/i");
	protected By btnOk1=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By btnOK1=By.xpath("/html/body/div[6]/div[7]/div/button");
	protected By lblResultadoBorrar=By.xpath("//div[6]/h2");
	
	//Usuario Interno
	
	protected By btnRevisar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/div/i");
	protected By btnCorreo=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[11]/div/i");
	protected By txtCorreo= By.id("newEmail");
	protected By btnAgregarCorreo= By.id("saveNewEmail");
	protected By btnCerrarCorreo= By.xpath("/html/body/div[1]/main/div/div/section[3]/div/div/div/div[1]/div/button");
	protected By btnAV=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[13]/select[1]");
	protected By btnAVIncompleto=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[13]/select[1]/option[3]");
	protected By btnSCausal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/div/div/div/div[2]/select/option[1]");
	protected By txtObservacion= By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[2]/textarea");
	
	protected By btnGuardar=By.id("btnGuardarCompesanciones");
	//btnOK1
	protected By lblNoFormulario=By.id("txtFormularioRadicado");
	//btnSalir
	protected By btnSalirSesion= By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/button");
	protected By btnCerrarSesion= By.id("btnCerrarSesion");
	
	protected By btnAVRechazar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[13]/select[1]/option[4]");
	protected By btnAceptar=By.xpath("/html/body/div[8]/div[7]/div/button");
	//btnGuardar
	//btnOK1
	protected By lblNoDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/label");
	//btnSalir

	//Usuario Externo
	
	protected By txtNit=By.id("Nit");
	protected By txtUsuario=By.id("Usuario");
	protected By txtContrase_a=By.id("Contrase_a");
	protected By btnLogin=By.id("btnSave");
	
	protected By btnAdminFiniquitos=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[29]/a");
	protected By btnFormularioFCP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[29]/ul/li[2]/a");
	
	protected By btnSAno=By.xpath("//*[@id=\"idAnio\"]");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[3]");
	protected By btnSMes=By.xpath("//*[@id=\"idMes\"]");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[2]");
	
	protected By btnCrear=By.id("btnCrear");
	protected By txtDEX=By.id("numeroDEX");
	protected By txtNoDCD=By.id("idNumeroDcd");
	
	protected By btnBuscar=By.id("btnSearch");
	protected By btnFiltroN=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[6]/a[1]/span");
	protected By txtFiltroN=By.xpath("/html/body/div[6]/form/div[1]/input");
	protected By btnFiltrarN=By.xpath("/html/body/div[6]/form/div[1]/div[2]/button[1]");
	
	protected By btnEditar2=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[3]/div/i");
	protected By btnAV1=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[13]/select[1]");
	protected By btnAVEnviar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[13]/select[1]/option[2]");
	protected By btnCargas=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div");
	protected By btnCargaOtros=By.id("fileElementOtrosSS");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");
	protected By btnOkCargas=By.xpath("/html/body/div[17]/div[7]/div/button");
	//btnGuardar
	//btnOK1
	//btnSalir

}
