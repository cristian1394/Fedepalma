package MapObject_AdministracionSolicitudesNuevas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;


public class BloqueantesMaps extends BasePage {

	public BloqueantesMaps(WebDriver driver) {
		super(driver);
		
	}
	protected By Seguridad=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	protected By PUsuarios=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[5]");
	protected By Formulario=By.id("codigoFormularioM");
	protected By SIFF=By.xpath("//*[@id=\"codigoFormularioM\"]/option[2]");
	protected By Perfil=By.id("codigoPerfilM");
	protected By Administrador=By.xpath("//*[@id=\"codigoPerfilM\"]/option[4]");
	
	protected By Bloqueados=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div[5]/div/button");
	protected By btnBloquearEmail=By.id("725");
	protected By btnBloquearFirma=By.id("724");
	protected By btnBloquearUsuario=By.id("723");
	protected By btnBloquearPerfil=By.id("726");
	protected By btnBloquearEliminar=By.id("741");
	protected By btnMenu=By.id("botonMenu");
	protected By SUsuariosN=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[4]/a");
	protected By btnEnviar=By.xpath("//*[@id=\"GridSolicitudUsuarios\"]/table/tbody/tr/td[12]/input");
	protected By btnFirmar=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[11]/div/input");
	protected By btnDesasociar = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[3]/td[16]/input");
	protected By btnPerfil=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[9]/span/span");
	protected By btnlista=By.xpath("/html/body/div[4]/div/div[2]/ul/li[4]");
	protected By btnlista1=By.xpath("/html/body/div[4]/div/div[2]/ul/li[6]");
	protected By btnBloqueo=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[2]/td[1]/div/i");
	protected By btnBloqueo1=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[1]/div/i");
	protected By btnAceptar=By.xpath("//div[7]/div/button");
	protected By btnAceptar1=By.xpath("//div[7]/div/button");
	
	protected By lblResultadoSolicitud=By.xpath("//div[24]/p");
	protected By btnOk=By.xpath("//div[7]/div/button");
	

	
	

}