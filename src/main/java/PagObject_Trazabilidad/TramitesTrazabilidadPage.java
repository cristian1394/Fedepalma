package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.TramitesTrazabilidadMap;
import io.qameta.allure.Step;

public class TramitesTrazabilidadPage extends TramitesTrazabilidadMap {
	
	
	public TramitesTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("compensaciones en trámite")
    public TramitesTrazabilidadPage EnTramiteTrazabilidad(String Termina, String Declarante, String Contiene, String Dcd, String Grupo,File folderPath) throws Exception {
		
		time(300);
        click(btnEnTramite,folderPath, "click xpath");
        time(1000);
        click(btnConsultar,folderPath, "click xpath");
        time(1000);
        
        time(1500);
        click(btnMes,folderPath, "click xpath");
        time(1000);
        click(btnFiltra,folderPath, "click xpath");
        time(1000);
        click(btnTermina,folderPath, "click xpath");
        time(900);
        writeText(txtMes, Termina, folderPath, Grupo);
        time(1000);
        click(btnfiltrar,folderPath, "click xpath");
        time(1000);
        captureScreen(folderPath, "Capture screen");
		
        click(btnDeclarante,folderPath, "click xpath");
        time(1000);
        click(btnFiltro,folderPath, "click xpath");
        time(1000);
        click(btnComienza,folderPath, "click xpath");
        time(800);
        writeText(txtInicial, Declarante, folderPath, Grupo);
        time(1000);
        click(btnFiltrarD,folderPath, "click xpath");
        time(1000);
        captureScreen(folderPath, "Capture screen");
        
        click(btnComprador,folderPath, "click xpath");
        time(900);
        click(btnlista,folderPath, "click xpath");
        time(1000);
        click(btnContiene,folderPath, "click xpath");
        time(800);
        writeText(txtContiene, Contiene, folderPath, Grupo);
        time(1000);
        click(btnFiltrarC,folderPath, "click xpath");
        time(1000);
        captureScreen(folderPath, "Capture screen");
        
        time(800);
        click(btnDCD,folderPath, "click xpath");
        time(1000);
        click(btnfiltra,folderPath, "click xpath");
        time(1000);
        click(btnDiferente,folderPath, "click xpath");
        time(900);
        writeText(txtDCD, Dcd, folderPath, Grupo);
        time(1000);
        click(btnFiltrar,folderPath, "click xpath");
        time(1000);
        captureScreen(folderPath, "Capture screen");
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto,folderPath, "click xpath");
        time(1000);
        writeText(txtProducto, Producto, folderPath, Producto);
        time(1000);
        click(btnFiltrarP,folderPath, "click xpath");
        time(1000);
        captureScreen(folderPath, "Capture screen");
        
        time(800);
        click(btnGrupoMercado,folderPath, "click xpath");
        time(1000);
        click(btnLista,folderPath, "click xpath");
        time(1000);
        click(btnNoContiene,folderPath, "click xpath");
        time(900);
        writeText(txtGrupo, Grupo, folderPath, Producto);
        time(1000);
        click(btnFiltrarG,folderPath, "click xpath");
        time(8000);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Observar Trazabilidad")
    public TramitesTrazabilidadPage VerTrazabilidad(File folderPath) throws Exception {

		time(800);
		click(btnVer,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
        time(10000);
        
        return this;
    }
}
