package PagObject_FormularioNuevoFFP;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.ConsultaFFPMap;
import io.qameta.allure.Step;

public class ConsultaFFPPage extends ConsultaFFPMap {

	public ConsultaFFPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Consulta FFP")
	public ConsultaFFPPage ConsultaFFP(File folderPath) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath");
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath");
		time(1);
		click(btnDeclarante,folderPath, "click xpath");
		time(1);

		String[] Nit = { "900012984", "800148119", "900012728", "900551700", "860003628", "860029414", "890211902",
				"802005075" };
		Random aleatorio = new Random();
		int Nit2 = aleatorio.nextInt(Nit.length);
		System.out.println(Nit[Nit2]);
		String txtNit = String.valueOf(Nit[Nit2]);

		time(1);
		writeText(txtDeclarante, txtNit, folderPath, txtNit);
		time(2);
		click(btnSMes,folderPath, "click xpath");
		time(1);
		click(btnMes,folderPath, "click xpath");
		time(1);
		click(btnSAno,folderPath, "click xpath");
		time(1);
		click(btnAno,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}

	@Step("Consulta FFP")
	public ConsultaFFPPage Consulta_FFP(String NitFFP, File folderPath) throws Exception {

		time(5);
		click(btnFFP,folderPath, "click xpath");
		time(3);
		click(btnNuevoFFP,folderPath, "click xpath");
		time(1);
		click(btnDeclarante,folderPath, "click xpath");
		time(1);
		writeText(txtDeclarante, NitFFP, folderPath, NitFFP);
		time(2);
		click(btnSMes,folderPath, "click xpath");
		time(1);
		click(btnMes,folderPath, "click xpath");
		time(1);
		click(btnSAno,folderPath, "click xpath");
		time(1);
		click(btnAno,folderPath, "click xpath");
		time(1);
		captureScreen(folderPath, "Capture screen");
		time(1);
		click(btnBuscar,folderPath, "click xpath");
		time(2);
		captureScreen(folderPath, "Capture screen");
		time(3);

		return this;
	}
}
