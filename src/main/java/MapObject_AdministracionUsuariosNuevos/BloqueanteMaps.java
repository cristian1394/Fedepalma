package MapObject_AdministracionUsuariosNuevos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;

public class BloqueanteMaps extends BasePage {

	public BloqueanteMaps(WebDriver driver) {
		super(driver);

	}

	protected By Seguridad = By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	protected By PUsuarios = By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[5]");
	protected By Formulario = By.id("codigoFormularioM");
	protected By SIFF = By.xpath("//*[@id=\"codigoFormularioM\"]/option[3]");
	protected By Perfil = By.id("codigoPerfilM");
	protected By Administrador = By.xpath("//*[@id=\"codigoPerfilM\"]/option[4]");

	protected By Bloqueados = By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div[5]/div/button");
	protected By btnBloquearEmail = By.id("729");
	protected By btnBloquearFirma = By.id("728");
	protected By btnBloquearUsuario = By.id("727");
	protected By btnBloquearPerfil = By.id("730");
	protected By btnMenu = By.id("botonMenu");
	protected By AUsuariosN = By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[11]/a");
	protected By btnEnviar = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[2]/td[11]/input");
	protected By btnFirmar = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[2]/td[10]/div/input");
	protected By btnDesasociar = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[3]/td[16]/input");
	protected By btnPerfil = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[9]/span/span");
	protected By btnlista = By.xpath("/html/body/div[5]/div/div[2]/ul/li[37]");
	protected By btnlista1 = By.xpath("/html/body/div[5]/div/div[2]/ul/li[40]");
	protected By btnBloqueo = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[1]/i");
	protected By btnBloqueo1 = By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/div/table/tbody/tr[1]/td[1]/div/i");
	protected By btnAceptar = By.xpath("//div[7]/div/button");
	protected By lblResultadoSolicitud = By.xpath("//div[24]/p");
	protected By lblResultadoDesasociar = By.xpath("//div[10]/p");
																	
	protected By btnOk = By.xpath("//div[7]/div/button");

}
