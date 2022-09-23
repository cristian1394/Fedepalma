package PagObject_FormularioFDC;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioFDC.IncumplimientoFDCMap;
import io.qameta.allure.Step;

public class IncumplimientoFDCPage extends IncumplimientoFDCMap{
	

	
   	public IncumplimientoFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar a creacion FDC")
    public IncumplimientoFDCPage CrearFDC(File folderPath, String Evidencia) throws Exception {
	
	time(2);
    click(btnCrear,folderPath, "click xpath" , Evidencia);
    time(1);
    captureScreen(folderPath, "Capture screen" , Evidencia);
    time(4);
    
    return this;
}
	
	@Step("Generar Incumplimiento")
    public IncumplimientoFDCPage GenerarIncumplimiento(File folderPath, String Evidencia) throws Exception{
        time(2);
        
        click(btnTDemo,folderPath, "click xpath" , Evidencia);
        time(3);
        click(btnIncumplimiento,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnConsulta,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFiltro,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSelect,folderPath, "click xpath" , Evidencia);
        time(1);
        String Total = getElement(lblTotal).getText();
        time(2);
        writeText(txtAsociar, Total, folderPath, Total, Evidencia);
        time(1);
        click(btnSeleccionar,folderPath, "click xpath" , Evidencia);
        time(1);
        String Totals = getElement(lblTotals).getText();
        time(2);
        writeText(txtasociar, Totals, folderPath, Totals, Evidencia);
        time(1);
        click(btnAdicionar,folderPath, "click xpath" , Evidencia);
        time(20);
        click(btnOkey,folderPath, "click xpath" , Evidencia);
        time(2);
    	ByPixel();
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }
	
}
