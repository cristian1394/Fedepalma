package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class RechazarDCDMap extends BasePage {
	
	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[25]/a");
	By btnDemostracionA=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnFDC=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[25]/ul/li[3]/a");
	By btnFDCa=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By Comprador=By.id("idNitComprador");//NitB
	By btnComprador=By.xpath("//*[@id=\"idNitComprador_listbox\"]/li");
	By Estado=By.id("idEstado");
	By Radicado=By.xpath("//*[@id=\"idEstado\"]/option[4]");
	By btnSAno=By.id("idAnio");
	By btnAno=By.xpath("//*[@id=\"idAnio\"]/option[2]");
	By btnSMes=By.id("idMes");
	By btnMes=By.xpath("//*[@id=\"idMes\"]/option[7]");
	By btnBuscar=By.id("btnSearch");
	By NumeroFDC=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/thead/tr/th[7]/a[2]");
	By Revisar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/div/i");
	By Seleccionar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/select[1]");
	By Rechazar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[14]/select[1]/option[4]");
	By Aceptar=By.xpath("/html/body/div[7]/div[7]/div/button");
	By Casuales=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/button");
	By Causal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[2]/select/option[4]");
	By Ok=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/div/div/div[3]/button");
	By Observacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/button");
	By txtObservacion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[2]/textarea");
	By OK=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/div/div/div[3]/button");
	By Desplegar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a");
	By lblDCD=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/label");
	By Guardar=By.id("btnGuardarCompesanciones");
	By lblResultadoGuardar=By.xpath("/html/body/div[7]/p");//El proceso se realizo correctamente.
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By Salir=By.id("btnSalirFdcValidacion");
	
	By usuario=By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/button/span[3]");
	By CerrarSesion=By.id("btnCerrarSesion");
	By txtNit=By.id("Nit");
	By txtUsuario=By.id("Usuario");
	By txtContrase_a=By.id("Contrase_a");
	By btnLogin=By.id("btnSave");
	
	By Crear=By.id("btnCrear");
	By txtDEX=By.id("numeroDEX");
	By txtNumeroDCD=By.id("idNumeroDcd");
	By Consultar=By.id("idconsultardcd");
	
	By Select=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[2]/input");
	By lblTotal=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[7]/label");
	By Asociar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[8]/div/div[2]/div/table/tbody/tr/td[9]/input");
	By btnAdicionar=By.id("InsertarFormulario");
	By lblResultadoAdicionar=By.xpath("//div[17]/p");//El formulario se guardo correctamente.
	By btnOK=By.xpath("/html/body/div[17]/div[7]/div/button");
	
	public RechazarDCDMap(WebDriver driver) {
		super(driver);
	}
	
	
}