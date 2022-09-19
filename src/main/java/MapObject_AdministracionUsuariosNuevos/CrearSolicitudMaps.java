package MapObject_AdministracionUsuariosNuevos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;


public class CrearSolicitudMaps extends BasePage {
	
	public CrearSolicitudMaps(WebDriver driver) {
		super(driver);
	}
	protected By Seguridad=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	protected By AUsuariosN=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[11]/a");
	
	protected By btnCrear=By.id("btnCrearSolicitudes");
	protected By txtID=By.id("identificacion");//60351917
	protected By Nombre=By.id("nombre");
	protected By Apellido=By.id("apellido");
	protected By Correo=By.id("eMail");
	protected By Tusuario=By.id("tipoUsuarioCodigo");
	protected By Contacto=By.xpath("//*[@id=\"tipoUsuarioCodigo\"]/option[2]");
	protected By Adicionar=By.id("btnAdicionar");
	protected By EnviarS=By.id("btnEnviarSolicitud");
	protected By btnSi=By.xpath("/html/body/div[6]/div[7]/div/button");
	protected By btnNo=By.xpath("/html/body/div[6]/div[7]/button");
	protected By txtObservacion=By.id("inputValue");//prueba
	//btnSi
	
	protected By lblResultadoSolicitud=By.xpath("//div[6]/p");
	protected By lblResultadoEnviar=By.xpath("//div[5]/p");//La soliciud fue envíada con éxito
	protected By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	protected By btnAceptar=By.xpath("/html/body/div[5]/div[7]/div/button");
	
	protected By Notificacion=By.id("liNotification");
	protected By MNotificaciones=By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[1]/ul/li/div/div[2]/a[1]");
	
	protected By Eliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[2]/div/i");
	protected By btnEliminar=By.xpath("//div[7]/div/button");
	//html/body/div[11]/div[7]/div/button
	
	
		
	}
	
	
	