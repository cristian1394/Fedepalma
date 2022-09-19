package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class CorregirFFPMap extends BasePage {
	
	By btnCorreccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr/td[8]/div/i");
	By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	
	By txtRPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[2]/input");
	
	By btnCompraIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[3]/input");
	By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[9]/div/div/div/div[2]/div[4]/div[1]/div[2]/div/table/thead/tr/th[2]/input");
	By btnBorrar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[9]/div/div/div/div[2]/div[4]/div[2]/button");
	By btnSi=By.xpath("/html/body/div[25]/div[7]/div/button");
	By txtNitE=By.xpath("//*[@id=\"NitRPA\"]");
	By txtkg=By.xpath("//*[@id=\"FruitRPA\"]");
	By btnAdicionarRPA=By.xpath("//*[@id=\"btnFrmRPA\"]");
	By btnCargaRPA=By.id("file4");
	By btnGuardarRPA=By.id("btnRPA");
	
	By btnRecibidaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div/input");
	By btnSelector=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[2]/div[4]/div[1]/div[2]/div/table/thead/tr/th[2]/input");
	By btnEliminar=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[10]/div/div/div/div[2]/div[4]/div[2]/button");
	By btnConfirmar=By.xpath("/html/body/div[24]/div[7]/div/button");
	By txtNitF=By.xpath("//*[@id=\"NitARPM\"]");
	By txtKg=By.xpath("//*[@id=\"FruitARPM\"]");//345.678
	By btnAdicionarARPM=By.xpath("//*[@id=\"btnFrmARPM\"]");
	By btnCargaARPM=By.id("file5");
	By btnGuardarARPM=By.id("btnARPM");
	//
	
	By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public CorregirFFPMap(WebDriver driver) {
		super(driver);
	}
	

}
