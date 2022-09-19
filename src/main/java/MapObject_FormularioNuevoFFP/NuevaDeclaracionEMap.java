package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class NuevaDeclaracionEMap extends BasePage {
	
	By btnNuevo=By.xpath("//*[@id=\"btnDeclarar\"]");
	By txtCultivosG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[2]/input");
	By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	By btnComprado=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[2]/div[2]/input");
	By btnTipoPersona=By.xpath("//*[@id=\"tipoPersona\"]");
	By btnNatural=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[5]/div/div/div/div[2]/div[1]/div[2]/select/option[2]");
	By txtNitA=By.xpath("//*[@id=\"NitRPF\"]");
	By btnPredio=By.xpath("//*[@id=\"Predios\"]");
	By btnOpcionA=By.xpath("//div[22]/div/div[2]/ul/li");
	By btnOpcionA1=By.xpath("/html/body/div[24]/div/div[2]/ul/li");
	By txtCompradorG=By.xpath("//*[@id=\"FruitGuineensisRPF\"]");//RPFG
	By txtCompradorH=By.xpath("//*[@id=\"FruitHibridoRPF\"]");//RPFH
	By btnAdicionarRPF=By.xpath("//*[@id=\"btnFrmRPF\"]");
	By btnArchivo=By.id("file");
	By btnGuardarRPF=By.id("btnRPF");
	
	By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	By txtBajaFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[3]/input");
	
	By txtFrutoNoProcesadoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[8]/div[3]/input");
	
	By txtPPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[1]/input");
	//btnOk
	By txtRPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[2]/input");
	//By btnOk=By.xpath("/html/body/div[23]/div[7]/div/button");
	
	By btnCompraIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[3]/input");
	By txtNitE=By.xpath("//*[@id=\"NitRPA\"]");
	By txtkg=By.xpath("//*[@id=\"FruitRPA\"]");
	By btnAdicionarRPA=By.xpath("//*[@id=\"btnFrmRPA\"]");
	By btnCargaRPA=By.id("file4");
	By btnGuardarRPA=By.id("btnRPA");
	
	By btnRecibidaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div/input");
	By txtNitF=By.xpath("//*[@id=\"NitARPM\"]");
	By txtKg=By.xpath("//*[@id=\"FruitARPM\"]");//345.678
	By btnAdicionarARPM=By.xpath("//*[@id=\"btnFrmARPM\"]");
	By btnCargaARPM=By.id("file5");
	By btnGuardarARPM=By.id("btnARPM");
	//
	
	By txtPalmaProcesada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[3]/input");//456.554
	By txtRecibidaProcesada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[3]/input");//121.826
	
	By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public NuevaDeclaracionEMap(WebDriver driver) {
		super(driver);
	}
	
	
}
