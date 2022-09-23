package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class EditarFFPMap extends BasePage {
	
	protected By btnEditar=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[7]/div/i");
	protected By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	protected By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	protected By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	protected By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	
	protected By btnCompraIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[3]/input");
	protected By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[2]/div[4]/div[1]/div[2]/div/table/thead/tr/th[2]/input");
	protected By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[2]/div[4]/div[2]/button");
	protected By btnSi=By.xpath("/html/body/div[22]/div[7]/div/button");
	protected By txtNitE=By.xpath("//*[@id=\"NitRPA\"]");
	protected By txtkg=By.xpath("//*[@id=\"FruitRPA\"]");
	protected By btnAdicionarRPA=By.xpath("//*[@id=\"btnFrmRPA\"]");
	protected By btnCargaRPA=By.id("file4");
	protected By btnGuardarRPA=By.id("btnRPA");
	
	protected By btnRecibidaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div/input");
	protected By btnSelector=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[11]/div/div/div/div[2]/div[4]/div[1]/div[2]/div/table/thead/tr/th[2]/input");
	protected By btnEliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[11]/div/div/div/div[2]/div[4]/div[2]/button");
	protected By btnConfirmar=By.xpath("/html/body/div[21]/div[7]/div/button");
	protected By txtNitF=By.xpath("//*[@id=\"NitARPM\"]");
	protected By txtKg=By.xpath("//*[@id=\"FruitARPM\"]");//345.678
	protected By btnAdicionarARPM=By.xpath("//*[@id=\"btnFrmARPM\"]");
	protected By btnCargaARPM=By.id("file5");
	protected By btnGuardarARPM=By.id("btnARPM");
	//
	
	protected By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public EditarFFPMap(WebDriver driver) {
		super(driver);
	}
	
	
}
