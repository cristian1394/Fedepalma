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
    public AprobadasTrazabilidadPage AprobadasTrazabilidad(File folderPath, String Evidencia) throws Exception {
		
		time(1);
        click(btnAprobadas,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnConsultar,folderPath, "click xpath" , Evidencia);
        time(1);
        
        time(2);
        click(btnExportar,folderPath, "click xpath" , Evidencia);
        
        /*Utilidades.waitInMs(1);
        click(btnFiltra);
        Utilidades.waitInMs(1);
        click(btnTermina);
        Utilidades.waitInMs(900);
        writeText(txtMes, Inicia);
        Utilidades.waitInMs(1);
        click(btnfiltrar);
        Utilidades.waitInMs(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		
        click(btnDeclarante);
        Utilidades.waitInMs(1);
        click(btnFiltro);
        Utilidades.waitInMs(1);
        click(btnComienza);
        Utilidades.waitInMs(800);
        writeText(txtInicial, Declarante);
        Utilidades.waitInMs(1);
        click(btnFiltrarD);
        Utilidades.waitInMs(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnComprador);
        Utilidades.waitInMs(900);
        click(btnlista);
        Utilidades.waitInMs(1);
        click(btnContiene);
        Utilidades.waitInMs(800);
        writeText(txtContiene, Contiene);
        Utilidades.waitInMs(1);
        click(btnFiltrarC);
        Utilidades.waitInMs(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        Utilidades.waitInMs(800);
        click(btnDCD);
        Utilidades.waitInMs(1);
        click(btnfiltra);
        Utilidades.waitInMs(1);
        click(btnDiferente);
        Utilidades.waitInMs(900);
        writeText(txtDCD, Dcd);
        Utilidades.waitInMs(1);
        click(btnFiltrar);
        Utilidades.waitInMs(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto);
        Utilidades.waitInMs(1);
        writeText(txtProducto, Producto);
        Utilidades.waitInMs(1);
        click(btnFiltrarP);
        Utilidades.waitInMs(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        Utilidades.waitInMs(800);
        click(btnGrupoMercado);
        Utilidades.waitInMs(1);
        click(btnLista);
        Utilidades.waitInMs(1);
        click(btnNoContiene);
        Utilidades.waitInMs(900);
        writeText(txtGrupo, Grupo);
        Utilidades.waitInMs(1);
        click(btnFiltrarG);
        */
        time(6);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        return this;
    }
	
	@Step("Observar Trazabilidad")
    public AprobadasTrazabilidadPage VerTrazabilidad(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnVer,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(10);
        
        return this;
    }
}
