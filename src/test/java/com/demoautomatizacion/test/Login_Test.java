package com.demoautomatizacion.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.utils.Listeners.TestListener;



@Listeners({ TestListener.class })
@Epic("Login")
@Feature("Login Tests")

public class Login_Test extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Login Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ingresar Portal Fedepalma")
    @Story("Login")
    @TmsLink("XRPRJ-1")
    public void ingresarPortalFedepalma () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        Login.ingresarCredencialesConNit(getProperties().getProperty("nit"),getProperties().getProperty("usr"),
        		getProperties().getProperty("pwd"));
        
        
    }
	
}
