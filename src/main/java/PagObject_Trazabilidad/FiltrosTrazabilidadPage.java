package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.FiltrosTrazabilidadMap;
import io.qameta.allure.Step;

public class FiltrosTrazabilidadPage extends FiltrosTrazabilidadMap {
	
	
	public FiltrosTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Verificacion de Filtros Trazabilidad")
    public FiltrosTrazabilidadPage ValidarFiltrosTrazabilidad(String Inicia, String Declarante, String Contiene, String Dcd, String Grupo, File folderPath) throws Exception {
		
		time(1);
        click(btnNoTramitados,folderPath, "click xpath");
        time(1);
        click(btnConsultar,folderPath, "click xpath");
        time(1);
        time(1500);
        click(btnMes,folderPath, "click xpath");
        time(1);
        click(btnFiltra,folderPath, "click xpath");
        time(1);
        click(btnTermina,folderPath, "click xpath");
        time(1);
        writeText(txtMes, Inicia, folderPath, Grupo);
        time(1);
        click(btnfiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
		
        click(btnDeclarante,folderPath, "click xpath");
        time(1);
        click(btnFiltro,folderPath, "click xpath");
        time(1);
        click(btnComienza,folderPath, "click xpath");
        time(1);
        writeText(txtInicial, Declarante, folderPath, Grupo);
        time(1);
        click(btnFiltrarD,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        click(btnComprador,folderPath, "click xpath");
        time(1);
        click(btnlista,folderPath, "click xpath");
        time(1);
        click(btnContiene,folderPath, "click xpath");
        time(1);
        writeText(txtContiene, Contiene, folderPath, Grupo);
        time(1);
        click(btnFiltrarC,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        time(1);
        click(btnDCD,folderPath, "click xpath");
        time(1);
        click(btnfiltra,folderPath, "click xpath");
        time(1);
        click(btnDiferente,folderPath, "click xpath");
        time(1);
        writeText(txtDCD, Dcd, folderPath, Grupo);
        time(1);
        click(btnFiltrar,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto,folderPath, "click xpath");
        time(1);
        writeText(txtProducto, Producto, folderPath, Producto);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath");
        time(1);
        captureScreen(folderPath, "Capture screen");
        
        time(1);
        click(btnGrupoMercado,folderPath, "click xpath");
        time(1);
        click(btnLista,folderPath, "click xpath");
        time(1);
        click(btnNoContiene,folderPath, "click xpath");
        time(1);
        writeText(txtGrupo, Grupo, folderPath, Producto);
        time(1);
        click(btnFiltrarG,folderPath, "click xpath");
        time(8);
        captureScreen(folderPath, "Capture screen");
        
        return this;
    }
	
	
}
