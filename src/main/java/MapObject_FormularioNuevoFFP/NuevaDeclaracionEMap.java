package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class NuevaDeclaracionEMap extends BasePage {
	
	protected By btnNuevo=By.xpath("//*[@id=\"btnDeclarar\"]");
	protected By txtCultivosG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[2]/input");
	protected By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	protected By btnComprado=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[2]/div[2]/input");
	protected By btnTipoPersona=By.xpath("//*[@id=\"tipoPersona\"]");
	protected By btnNatural=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[5]/div/div/div/div[2]/div[1]/div[2]/select/option[2]");
	protected By txtNitA=By.xpath("//*[@id=\"NitRPF\"]");
	protected By btnPredio=By.xpath("//*[@id=\"Predios\"]");
	protected By btnOpcionA=By.xpath("//div[22]/div/div[2]/ul/li");
	protected By btnOpcionA1=By.xpath("/html/body/div[24]/div/div[2]/ul/li");
	protected By txtCompradorG=By.xpath("//*[@id=\"FruitGuineensisRPF\"]");//RPFG
	protected By txtCompradorH=By.xpath("//*[@id=\"FruitHibridoRPF\"]");//RPFH
	protected By btnAdicionarRPF=By.xpath("//*[@id=\"btnFrmRPF\"]");
	protected By btnArchivo=By.id("file");
	protected By btnGuardarRPF=By.id("btnRPF");
	
	protected By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	protected By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	protected By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	protected By txtBajaFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[3]/input");
	
	protected By txtFrutoNoProcesadoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[8]/div[3]/input");
	
	protected By txtPPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[1]/input");
	//btnOk
	protected By txtRPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[2]/input");
	//protected By btnOk=By.xpath("/html/body/div[23]/div[7]/div/button");
	
	protected By btnCompraIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[3]/input");
	protected By txtNitE=By.xpath("//*[@id=\"NitRPA\"]");
	protected By txtkg=By.xpath("//*[@id=\"FruitRPA\"]");
	protected By btnAdicionarRPA=By.xpath("//*[@id=\"btnFrmRPA\"]");
	protected By btnCargaRPA=By.id("file4");
	protected By btnGuardarRPA=By.id("btnRPA");
	
	protected By btnRecibidaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[2]/div/input");
	protected By txtNitF=By.xpath("//*[@id=\"NitARPM\"]");
	protected By txtKg=By.xpath("//*[@id=\"FruitARPM\"]");//345.678
	protected By btnAdicionarARPM=By.xpath("//*[@id=\"btnFrmARPM\"]");
	protected By btnCargaARPM=By.id("file5");
	protected By btnGuardarARPM=By.id("btnARPM");
	//
	
	protected By txtPalmaProcesada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[3]/input");//456.554
	protected By txtRecibidaProcesada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[3]/input");//121.826
	
	protected By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public NuevaDeclaracionEMap(WebDriver driver) {
		super(driver);
	}
	
	
}
