package PagObject_demoautomatizacion;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import MapObject_demoautomatizacion.LoginMap;
import io.qameta.allure.Step;

public class LoginPage extends LoginMap  {
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar Credenciales de Acceso")
    public LoginPage ingresarCredenciales(String usuario, String password, File folderPath, String Evidencia) throws Exception {
        time(2);
        
        writeText(txtUsuario, usuario, folderPath, " escribe usuario", Evidencia);
        time(1);
        writeText(txtContrase_a, password, folderPath, " escribe contrase_a", Evidencia);
		screenshot();
		time(1);
		click(btnLogin, folderPath, " click login" , Evidencia);
        time(5);
        return this;
    }
	
}
