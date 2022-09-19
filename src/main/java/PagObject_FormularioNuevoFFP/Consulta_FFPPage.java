package PagObject_FormularioNuevoFFP;

import java.util.Random;

import javax.swing.JScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class Consulta_FFPPage extends BasePage {
	
	By btnFFP=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a");
	By btnNuevoFFP=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[3]/a");
	By btnDeclarante=By.xpath("//*[@id=\"Nit\"]");
	By txtDeclarante=By.id("Nit");
	By btnOpcionB=By.xpath("/html/body/div[4]/div/div[2]/ul/li[2]");
	By btnSAno=By.xpath("//*[@id=\"Year\"]");
	By btnAno=By.xpath("//*[@id=\"Year\"]/option[2]");
	By btnSMes=By.xpath("//*[@id=\"Month\"]");
	By btnMes=By.xpath("//*[@id=\"Month\"]/option[7]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	
	By btnOk=By.xpath("/html/body/div[6]/div[7]/div/button");
	
	public Consulta_FFPPage(WebDriver driver) {
		super(driver);
	}
	
	@Step("Consulta FFP")
    public Consulta_FFPPage ConsultaFFP() {
        
        Utilidades.time(5000);
        click(btnFFP);
         Utilidades.time(3000);
        click(btnNuevoFFP);
        Utilidades.time(1000);
        click(btnDeclarante);
        Utilidades.time(500);
        
        String [] Nit = {"860055557", "37875899", "16488358", "17328717", "57438591", "800135956", "800012375", "800016505"};
        Random aleatorio = new Random();            
        int Nit2 = aleatorio.nextInt(Nit.length);
        System.out.println(Nit[Nit2]);
        String txtNit = String.valueOf(Nit[Nit2]);
        
        Utilidades.time(1000);
        writeText(txtDeclarante, txtNit);
        Utilidades.time(1800);
        click(btnSMes);
        Utilidades.time(800);
        click(btnMes);
        Utilidades.time(800);
        click(btnSAno);
        Utilidades.time(800);
        click(btnAno);
        Utilidades.time(200);
        Utilidades.screenshot();
		Utilidades.time(800);
		click(btnBuscar);
        Utilidades.time(3500);
        click(btnOk);
        Utilidades.time(800);
        Utilidades.screenshot();
        
        return this;
    }
	
}
