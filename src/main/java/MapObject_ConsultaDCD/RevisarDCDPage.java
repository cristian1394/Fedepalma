package MapObject_ConsultaDCD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demoautomatizacion.utils.Utilidades;

import PagObject_demoautomatizacion.BasePage;
import io.qameta.allure.Step;

public class RevisarDCDPage extends BasePage {

	By btnDemostracion=By.xpath("//*[@id=\"stacked-menu\"]/ul/li[5]/a/span");
	By btnDCD=By.xpath("/html/body/div[1]/aside/div/section/nav/ul/li[5]/ul/li[4]/a");
	By btnProveedor=By.xpath("//*[@id=\"InfoBasicaComprador\"]/div/div/div[2]/div/span");
	By txtProveedor=By.xpath("//*[@id=\"idNitProveedor\"]");//C.i. Tequendama S.A.S.
	By btnCI=By.xpath("//*[@id=\"idNitProveedor-list\"]/div[2]");
	By btnEstado=By.xpath("//*[@id=\"IdEstado\"]");
	By btnBorrador= By.xpath("//*[@id=\"IdEstado\"]/option[2]");
	By btnBuscar=By.xpath("//*[@id=\"btnSearch\"]");
	By btnSeleccion=By.xpath("/html/body/div[1]/main/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[5]/input[1]");
	By btnRevisar=By.xpath("//*[@id=\"btnRevisar\"]");
	By btnSRevisar=By.xpath("//*[@id=\"btnRevisarMasivo\"]");
	By btnOk=By.xpath("/html/body/div[7]/div[7]/div/button");
	By lblResultadoRevicion=By.xpath("//div[7]/p");
	
	public RevisarDCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Revisar DCD")
    public RevisarDCDPage RevisarDCD(String Proveedor) {
//        Utilidades.waitInMs(1000);
//        
//        WebElement Element = driver.findElement(btnDemostracion);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", Element);
        Utilidades.time(2000);
        click(btnDemostracion);
//         Utilidades.waitInMs(1000);
//         WebElement Elements = driver.findElement(btnDCD);
//         JavascriptExecutor Js = (JavascriptExecutor) driver;
//         Js.executeScript("arguments[0].scrollIntoView();", Elements);
        Utilidades.time(2000);
        click(btnDCD);
        Utilidades.time(3000);
		click(btnEstado);
		Utilidades.time(1000);
		click(btnBorrador);
		Utilidades.time(1000);
		click(btnBuscar);
		Utilidades.time(5000);
		click(btnSeleccion);
		Utilidades.ByPixel();
		Utilidades.time(1000);
		click(btnRevisar);
		Utilidades.time(1000);
		click(btnSRevisar);
		Utilidades.time(4000);
        
        return this;
    }
	
	@Step("Validar Revicion DCD")
    public RevisarDCDPage ValidarRevicionDCD(String Resultado) {
		
		Utilidades.time(15000);
		Assert.assertEquals(getElement(lblResultadoRevicion).getText(),Resultado);
		Utilidades.screenshot();
		Utilidades.time(1000);
		click(btnOk);
        Utilidades.time(2000);
        Utilidades.screenshot();
		//Se ha realizado el cambio de estado
		
		return this;
	}
}
