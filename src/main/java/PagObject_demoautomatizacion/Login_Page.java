package PagObject_demoautomatizacion;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class Login_Page extends BasePage {
	
	By txtNit=By.xpath("//*[@id='Nit']");
	By txtUsuario=By.id("Usuario");
	By txtContrase_a=By.xpath("//*[@id='Contrase_a']");
	By btnLogin=By.xpath("//*[@id='btnSave']");
	
	
	
	public Login_Page(WebDriver driver) {
		super(driver);
		
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
