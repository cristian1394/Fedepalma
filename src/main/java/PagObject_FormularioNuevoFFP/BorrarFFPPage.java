package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import MapObject_FormularioNuevoFFP.BorrarFFPMap;
import PagObject_ConsultaDCD.GenerarDCDPage;
import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class BorrarFFPPage extends BorrarFFPMap {
	

	
	public BorrarFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Declaracion gerente FFP")
    public BorrarFFPPage BorrarFFP(File folderPath,String NoProcesadoH, String PalmisteE, String KGH, String TPalma) throws Exception {
        
		time(5);
        click(btnFFP, folderPath, "click ffp");
        time(3);
        click(btnNuevoFFP, folderPath, "click nuevo ffp");
        time(2);
        click(btnSMes, folderPath, "click s mes");
        time(1);
        click(btnMes, folderPath, "click mes");
        time(1);
        click(btnSAno, folderPath, "click S año");
        time(1);
        click(btnAno, folderPath, "click año");
        time(1);
        captureScreen(folderPath, "captura Screen");
		time(1);
		click(btnBuscar, folderPath, "click buscar");
		time(2);
		captureScreen(folderPath, "captura Screen");
        time(3);
        click(btnEditar, folderPath, "click editar");
        time(6);
        clear(txtInicialFruto, folderPath, "clear inicial fruto ");
        time(1);
        writeText(txtInicialFruto, NoProcesadoH, folderPath, "escribe inicial fruto");
        time(3);
        clear(txtFrutoNoProcesado, folderPath, "clear fruto no procesado");
        time(1);
        writeText(txtFrutoNoProcesado, PalmisteE, folderPath, "escribe fruto no procesado");
        time(1);
        clear(txtPalmaIngresada, folderPath, "clear palma ingresada ");
        time(1);
        writeText(txtPalmaIngresada, KGH, folderPath, "escribe palma ingresada");
        time(1);
        clear(txtTotalPalma, folderPath, "click total palma");
        time(1);
        writeText(txtTotalPalma, TPalma, folderPath, "escribe total palma");
        time(1);
        click(btnGuardar, folderPath, "click guardar");
        time(5);
        captureScreen(folderPath, "captura Screen");
        time(1);
        click(btnOk, folderPath, "click ok");
        time(1);
        click(btnOk, folderPath, "click ok");
        time(15);
        click(btnSMes, folderPath, "click S mes");
        time(1);
        click(btnMes, folderPath, "click mes");
        time(1);
        click(btnSAno, folderPath, "click S año");
        time(1);
        click(btnAno, folderPath, "click año");
        time(1);
        captureScreen(folderPath, "captura Screen");
		time(1);
		click(btnBuscar, folderPath, "click buscar");
		time(2);
		captureScreen(folderPath, "captura Screen");
        time(3);
        click(btnBorrar, folderPath, "click borrar");
        time(3);
        click(btnoK, folderPath, "click ok");
        time(2);
        captureScreen(folderPath, "captura Screen");
        time(5);
        
        return this;
    }
	

}
