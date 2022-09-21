package PagObject_demoautomatizacion;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import MapObject_demoautomatizacion.Login_Map;
import io.qameta.allure.Step;

public class Login_Page extends Login_Map {
	

	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar Credenciales de Acceso")
    public Login_Page ingresarCredencialesConNit(String nit, String usr, String pwd, File folderPath) throws Exception {

		
		time(2); 
        writeText(txtNit, nit, folderPath, " Se ingresa nit");
        time(1);
        writeText(txtUsuario, usr, folderPath, "Se ingresa usuario");
        time(1);
        writeText(txtContrase_a, pwd, folderPath, "Se ingresa contraseña");
		time(2);
		click(btnLogin, folderPath, "click login");
		time(6);

        //waitInMs(5000);
        return this;
    }
	
}
