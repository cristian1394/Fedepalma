package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RechazarDCDMap extends BasePage {
	
	protected By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	protected By btnDemostracionA=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	protected By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[3]/a");
	protected By btnFDCa=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	protected By Comprador=By.id("idNitComprador");//NitB
	protected By btnComprador=By.xpath("//*[@id=\"idNitComprador_listbox\"]/li");
	protected By Estado=By.id("idEstado");
	protected By Radicado=By.xpath("//*[@id=\"idEstado\"]/option[4]");
	protected By btnSAno=By.id("idAnio");
	protected By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[2]");
	protected By btnSMes=By.id("idMes");
	protected By btnMes=By.xpath("//*[@id=\"idMes\"]/option[7]");
	protected By btnBuscar=By.id("btnSearch");
	protected By NumeroFDC=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[2]");
	protected By Revisar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/div/i");
	protected By Seleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/select[1]");
	protected By Rechazar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/select[1]/option[4]");
	protected By Aceptar=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By Casuales=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/button");
	protected By Causal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[2]/select/option[4]");
	protected By Ok=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[3]/button");
	protected By Observacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/button");
	protected By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[2]/textarea");
	protected By OK=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[3]/button");
	protected By Desplegar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a");
	protected By lblDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/label");
	protected By Guardar=By.id("btnGuardarCompesanciones");
	protected By lblResultadoGuardar=By.xpath("/html/body/div[7]/p");//El proceso se realizo correctamente.
	protected By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	protected By Salir=By.id("btnSalirFdcValidacion");
	
	protected By usuario=By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/button/span[3]");
	protected By CerrarSesion=By.id("btnCerrarSesion");
	protected By txtNit=By.id("Nit");
	protected By txtUsuario=By.id("Usuario");
	protected By txtContrase_a=By.id("Contrase_a");
	protected By btnLogin=By.id("btnSave");
	
	protected By Crear=By.id("btnCrear");
	protected By txtDEX=By.id("numeroDEX");
	protected By txtNumeroDCD=By.id("idNumeroDcd");
	protected By Consultar=By.id("idconsultardcd");
	
	protected By Select=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[2]/input");
	protected By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[7]/label");
	protected By Asociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[9]/input");
	protected By btnAdicionar=By.id("InsertarFormulario");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");//El formulario se guardo correctamente.
	protected By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	public RechazarDCDMap(WebDriver driver) {
		super(driver);
	}
	
	
}