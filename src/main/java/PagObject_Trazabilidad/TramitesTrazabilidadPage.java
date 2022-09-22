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
    public TramitesTrazabilidadPage EnTramiteTrazabilidad(String Termina, String Declarante, String Contiene, String Dcd, String Grupo,File folderPath, String Evidencia) throws Exception {
		
		time(1);
        click(btnEnTramite,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnConsultar,folderPath, "click xpath" , Evidencia);
        time(1);
        
        time(2);
        click(btnMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFiltra,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnTermina,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtMes, Termina, folderPath, Grupo, Evidencia);
        time(1);
        click(btnfiltrar,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		
        click(btnDeclarante,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFiltro,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnComienza,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtInicial, Declarante, folderPath, Grupo, Evidencia);
        time(1);
        click(btnFiltrarD,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnComprador,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnlista,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnContiene,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtContiene, Contiene, folderPath, Grupo, Evidencia);
        time(1);
        click(btnFiltrarC,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        time(1);
        click(btnDCD,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnfiltra,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnDiferente,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtDCD, Dcd, folderPath, Grupo, Evidencia);
        time(1);
        click(btnFiltrar,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        String Producto = getElement(lblProducto).getText();
        click(btnProducto,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtProducto, Producto, folderPath, Producto, Evidencia);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        time(1);
        click(btnGrupoMercado,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnLista,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnNoContiene,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtGrupo, Grupo, folderPath, Producto, Evidencia);
        time(1);
        click(btnFiltrarG,folderPath, "click xpath" , Evidencia);
        time(8);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        return this;
    }
	
	@Step("Observar Trazabilidad")
    public TramitesTrazabilidadPage VerTrazabilidad(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnVer,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(10);
        
        return this;
    }
}
