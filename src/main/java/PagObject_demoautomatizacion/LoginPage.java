package PagObject_demoautomatizacion;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.qameta.allure.Step;

public class LoginPage extends BasePage {
	
	By txtUsuario=By.id("Usuario");
	By txtContrase_a=By.xpath("//*[@id=\"Contrase_a\"]");
	By btnLogin=By.xpath("//*[@id=\"btnSave\"]");
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ingresar Credenciales de Acceso")
    public LoginPage ingresarCredenciales(String usuario, String password, File folderPath) throws Exception {
        time(2);
        
        writeText(txtUsuario, usuario, folderPath, " escribe usuario");
        time(1);
        writeText(txtContrase_a, password, folderPath, " escribe contrase_a");
		screenshot();
		time(1);
		click(btnLogin, folderPath, " click login");
        time(5);
        return this;
    }
	
}
