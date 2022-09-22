package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.Consulta_FFPMap;
import io.qameta.allure.Step;

public class Consulta_FFPPage extends Consulta_FFPMap {

	public Consulta_FFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FFP")
	public Consulta_FFPPage ConsultaFFP(File folderPath, String Evidencia) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnDeclarante,folderPath, "click xpath" , Evidencia);
		time(1);

		String[] Nit = { "860055557", "37875899", "16488358", "17328717", "57438591", "800135956", "800012375",
				"800016505" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtDeclarante, txtNit, folderPath, txtNit, Evidencia);
		time(2);
		click(btnSMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnMes,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnSAno,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnAno,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
		time(4);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

}
