package MapObject_FormularioNuevoFFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class NuevaDeclaracionMap extends BasePage {
	
	protected By btnNuevo=By.xpath("//*[@id=\"btnDeclarar\"]");
	protected By txtCultivosG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[2]/input");
	protected By txtCultivosH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[1]/div[3]/input");
	
	protected By btnComprado=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[2]/div[2]/input");
	protected By btnTipoPersona=By.xpath("//*[@id=\"tipoPersona\"]");
	protected By btnNatural=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[5]/div/div/div/div[2]/div[1]/div[2]/select/option[2]");
	protected By txtNitA=By.xpath("//*[@id=\"NitRPF\"]");
	protected By btnPredio=By.xpath("//*[@id=\"Predios\"]");
	protected By btnOpcionA=By.xpath("/html/body/div[24]/div/div[2]/ul/li");
	protected By txtCompradorG=By.xpath("//*[@id=\"FruitGuineensisRPF\"]");//RPFG
	protected By txtCompradorH=By.xpath("//*[@id=\"FruitHibridoRPF\"]");//RPFH
	protected By btnAdicionarRPF=By.xpath("//*[@id=\"btnFrmRPF\"]");
	protected By btnArchivo=By.id("file");
	protected By btnGuardarRPF=By.id("btnRPF");
	
	
	protected By btnACM=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[3]/div[2]/input");
	protected By txtNitB=By.xpath("//*[@id=\"NitACM\"]");
	protected By txtFrutoG=By.xpath("//*[@id=\"ReceivedFruitGuin\"]");
	protected By txtPalmisteP=By.xpath("//*[@id=\"PalmisteProduced\"]");
	protected By txtFrutoH=By.xpath("//*[@id=\"ReceivedFruitHib\"]");
	protected By txtPalmisteE=By.xpath("//*[@id=\"PalmisteDelivered\"]");
	protected By txtPalmaP=By.xpath("//*[@id=\"OilProduced\"]");
	protected By txtPalmaE=By.xpath("//*[@id=\"CrudeOilDelivered\"]");
	protected By btnAdicionarACM=By.xpath("//*[@id=\"btnFrmACM\"]");
	protected By btnCargaACM=By.id("file1");
	protected By btnGuardarACM=By.id("btnACM");
	protected By btnOK=By.xpath("/html/body/div[25]/div[7]/div/button");
	
	protected By txtInicialFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[2]/input");
	protected By txtInicialFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[4]/div[3]/input");
	
	protected By btnFrutoVendido=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[5]/div[2]/input");
	protected By txtNitC=By.xpath("//*[@id=\"NitRFV\"]");
	protected By txtKgG=By.xpath("//*[@id=\"FruitGuiRFV\"]");
	protected By txtKgH=By.xpath("//*[@id=\"FruitHibRFV\"]");
	protected By btnAdicionarRFV=By.xpath("//*[@id=\"btnFrmRFV\"]");
	protected By btnCargaRFV=By.id("file2");
	protected By btnGuardarRFV=By.id("btnRFV");
	
	protected By txtBajaFrutoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[2]/input");
	protected By txtBajaFrutoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[6]/div[3]/input");
	
	protected By btnFrutoEnviado=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[7]/div[2]/input");
	protected By txtNitD=By.xpath("//*[@id=\"NitRFEM\"]");
	protected By txtKGG=By.xpath("//*[@id=\"FruitGuiRFEM\"]");
	protected By txtKGH=By.xpath("//*[@id=\"FruitHibRFEM\"]");
	protected By btnAdicionarRFEM=By.xpath("//*[@id=\"btnFrmRFEM\"]");
	protected By btnCargaRFEM=By.id("file3");
	protected By btnGuardarRFEM=By.id("btnRFEM");
	
	protected By txtFrutoNoProcesadoG=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[8]/div[2]/input");
	protected By txtFrutoNoProcesadoH=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[1]/div[8]/div[3]/input");
	
	protected By txtPPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[1]/input");
	//btnOk
	protected By txtRPalmaIngresada=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[2]/div[2]/input");
	protected By btnOk=By.xpath("/html/body/div[25]/div[7]/div/button");
	
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
	
	protected By txtPalmisteProducido=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[1]/div[4]/input");//188.312
	protected By txtProducidaRecibida=By.xpath("/html/body/div[1]/main/div/div/div[2]/form/section[4]/div/div[2]/section/div/div/div[2]/div[2]/div[4]/input");//56.934
	
	public NuevaDeclaracionMap(WebDriver driver) {
		super(driver);
	}
	
	
}
