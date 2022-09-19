package MapObject_AdministracionSolicitudesNuevas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PagObject_demoautomatizacion.BasePage;


public class CreacionSolicitudMaps extends BasePage {
	
	public CreacionSolicitudMaps(WebDriver driver) {
		super(driver);
		
	}

	protected By Seguridad=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[1]/a");
	protected By SUsuariosN=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[1]/ul/li[4]/a");
	
	protected By btnCrear=By.id("btnCrearSolicitudes");
	protected By txtID=By.id("identificacion");//60351917
	protected By Nombre=By.id("nombre");
	protected By btnSi=By.xpath("/html/body/div[6]/div[7]/div/button");
	protected By btnNo=By.xpath("/html/body/div[6]/div[7]/button");
	protected By txtObservacion=By.id("inputValue");//prueba
	//btnSi
	
	protected By lblResultadoSolicitud=By.xpath("//div[6]/p");
	protected By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	protected By Eliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[3]/div/div/table/tbody/tr[1]/td[2]/div/i");
	protected By btnEliminar=By.xpath("//div[7]/div/button");
	
	
	
	
}