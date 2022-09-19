package com.demoautomatizacion.test;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.utils.Listeners.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

@Listeners({ TestListener.class })
@Epic("Home")
@Feature("Home Tests")

public class HomeTest extends BaseTest {
	public Properties fileprops = new Properties();

    public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
/*
    @Test(priority=0, description="Validar Opciones DashBoard Almaviva")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar Opciones")
    @Story("Home")
    @TmsLink("XRPRJ-1")
    public void ingresarPortalAlmaviva () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
        login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"));
        home.validarOpciones(getProperties().getProperty("crearTitulo"),
        		             getProperties().getProperty("reportes"),
        		             getProperties().getProperty("visitas"));
        
    }
    */

}
