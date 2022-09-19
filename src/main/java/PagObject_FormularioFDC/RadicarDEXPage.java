package PagObject_FormularioFDC;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class RadicarDEXPage extends BasePage {
	
	By btnRadicar=By.xpath("//*[@id=\"btnRadicarFdc\"]");
	By btnOk=By.xpath("/html/body/div[18]/div[7]/div/button");
	By btnCerrar=By.xpath("/html/body/div[1]/main/div/div/div[5]/div[1]/div/div[1]/div/button");
	By btnFirma=By.xpath("//*[@id=\"pass5\"]");
	By txtFirma=By.xpath("//*[@id=\"pass5\"]");
	By btnEnviar=By.xpath("//*[@id=\"MediaCard\"]/div[3]/form/div[2]/button");
	By btnSeguir=By.xpath("/html/body/div[5]/div[7]/div/button");
	By btnOK=By.xpath("/html/body/div[16]/div[7]/div/button");
	By btnSalir=By.xpath("//*[@id=\"btnSalirFdc\"]");
	
	public RadicarDEXPage(WebDriver driver) {
		super(driver);
		
	}

@Step("Radicar FDC")
public RadicarDEXPage RadicarFDC() {

	Utilidades.time(3000);
	click(btnRadicar);
	Utilidades.time(1000);
	click(btnOk);
	Utilidades.time(1000);
	click(btnCerrar);
	Utilidades.time(1000);
		
	return this;
}

@Step("Firmar FDC")
public RadicarDEXPage FirmarFDC(String Firma) {
	
	ArrayList<String> ventana = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window((String) ventana.get(1));
	Utilidades.time(25000);
	click(btnFirma);
	Utilidades.time(1000);
	writeText(txtFirma, Firma);
	Utilidades.screenshot();
	Utilidades.time(1000);
	click(btnEnviar);
	Utilidades.time(3000);
	Utilidades.screenshot();
	click(btnSeguir);
	driver.switchTo().window((String) ventana.get(0));
	
	return this;
}

@Step("Salir FDC")
public RadicarDEXPage SalirFDC() {
	
	Utilidades.time(9000);
    Utilidades.screenshot();
    click(btnSalir);
    Utilidades.time(5000);
    Utilidades.screenshot();
	
	return this;
}
	
}
