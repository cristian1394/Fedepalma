package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.AprobadasTrazabilidadMap;
import io.qameta.allure.Step;

public class AprobadasTrazabilidadPage extends AprobadasTrazabilidadMap {
	
	
	
	public AprobadasTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("compensaciones Aprobadas en trámite")
    public AprobadasTrazabilidadPage AprobadasTrazabilidad(File folderPath) throws Exception {
		
		time(300);
        click(btnAprobadas,folderPath, "click xpath");
        time(1000);
        click(btnConsultar,folderPath, "click xpath");
        time(1000);
        
        time(1500);
        click(btnExportar,folderPath, "click xpath");
        
        /*Utilidades.waitInMs(1000);
        click(btnFiltra);
        Utilidades.waitInMs(1000);
        click(btnTermina);
        Utilidades.waitInMs(900);
        writeText(txtMes, Inicia);
        Utilidades.waitInMs(1000);
        click(btnfiltrar);
        Utilidades.waitInMs(1000);
        captureScreen(folderPath, "Capture screen");
		
        click(btnDeclarante);
        Utilidades.waitInMs(1000);
        click(btnFiltro);
        Utilidades.waitInMs(1000);
        click(btnComienza);
        Utilidades.waitInMs(800);
        writeText(txtInicial, Declarante);
        Utilidades.waitInMs(1000);
        click(btnFiltrarD);
        Utilidades.waitInMs(1000);
        captureScreen(folderPath, "Capture screen");
        
        click(btnComprador);
        Utilidades.waitInMs(900);
        click(btnlista);
        Utilidades.waitInMs(1000);
        click(btnContiene);
        Utilidades.waitInMs(800);
        writeText(txtContiene, Contiene);
        Utilidades.waitInMs(1000);
        click(btnFiltrarC);
        Utilidades.waitInMs(1000);
        captureScreen(folderPath, "Capture screen");
        
        Utilidades.waitInMs(800);
        click(btnDCD);
        Utilidades.waitInMs(1000);
        click(btnfiltra);
        Utilidades.waitInMs(1000);
        click(btnDiferente);
        Utilidades.waitInMs(900);
        writeText(txtDCD, Dcd);
        Utilidades.waitInMs(1000);
        click(btnFiltrar);
        Utilidades.waitInMs(1000);
        captureScreen(folderPath, "Capture screen");
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto);
        Utilidades.waitInMs(1000);
        writeText(txtProducto, Producto);
        Utilidades.waitInMs(1000);
        click(btnFiltrarP);
        Utilidades.waitInMs(1000);
        captureScreen(folderPath, "Capture screen");
        
        Utilidades.waitInMs(800);
        click(btnGrupoMercado);
        Utilidades.waitInMs(1000);
        click(btnLista);
        Utilidades.waitInMs(1000);
        click(btnNoContiene);
        Utilidades.waitInMs(900);
        writeText(txtGrupo, Grupo);
        Utilidades.waitInMs(1000);
        click(btnFiltrarG);
        */
        time(6000);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	@Step("Observar Trazabilidad")
    public AprobadasTrazabilidadPage VerTrazabilidad(File folderPath) throws Exception {

		time(800);
		click(btnVer,folderPath, "click xpath");
		time(500);
		captureScreen(folderPath, "Capture screen");
        time(10000);
        
        return this;
    }
}
