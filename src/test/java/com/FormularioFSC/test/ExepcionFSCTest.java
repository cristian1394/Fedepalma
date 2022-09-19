package com.FormularioFSC.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;
import com.demoautomatizacion.utils.Utilidades;

import PagObject_FormularioFSC.ExepcionCrearFSCPage;


@Listeners({ TestListener.class })
@Epic("Formulario FSC")
@Feature("Formulario FSC")

public class ExepcionFSCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Validar que no debe dejar crear un FSC si no tiene Año y Mes")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no debe dejar crear un FSC si no tiene Año y Mes")
    @Story("Validar que no debe dejar crear un FSC si no tiene Año y Mes")
    @TmsLink("XRPRJ-1")
    public void ExepcionCrear () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC();
        ECrearFSC.CrearFSC("Seleccione el año y el mes");
    }
	
	@Test(priority=1, description="Validar que no debe dejar revisar si no se ha ingresado un DMI")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no debe dejar revisar si no se ha ingresado un DMI")
    @Story("Validar que no debe dejar revisar si no se ha ingresado un DMI")
    @TmsLink("XRPRJ-1")
    public void BuscarI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().RevisarFSC().ERevisarFSC("No ha asociado todos los kilogramos a un tipo de DCD");     
    }
	
	@Test(priority=2, description="Validar que no debe dejar revisar si no se ha Cargado ningun archivo")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no debe dejar revisar si no se ha Cargado ningun archivo")
    @Story("Validar que no debe dejar revisar si no se ha Cargado ningun archivo")
    @TmsLink("XRPRJ-1")
    public void ERevisarCreacion () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
			 .RevisarFSC().ERevisarFSC1().SalirFSC() .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=3, description="Validar que no permita cargar otro formato que pdf en el carge FMI")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge FMI")
    @Story("Validar que no permita cargar otro formato que pdf en el carge FMI")
    @TmsLink("XRPRJ-1")
    public void ECargeFMI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
		 .CargaFMI(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf").SalirFSC()
		 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=4, description="Validar que no permita cargar otro formato que pdf en el carge CCM")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge CCM")
    @Story("Validar que no permita cargar otro formato que pdf en el carge CCM")
    @TmsLink("XRPRJ-1")
    public void ECargeCCM () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
		 .CargaCCM(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf").SalirFSC()
		 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=5, description="Validar que no permita cargar otro formato que pdf en el carge CIP")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge CIP")
    @Story("Validar que no permita cargar otro formato que pdf en el carge CIP")
    @TmsLink("XRPRJ-1")
    public void ECargeCIP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
		 .CargaCIP(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf").SalirFSC()
		 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=6, description="Validar que no permita cargar otro formato que pdf en el carge Incumplimiento")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que no permita cargar otro formato que pdf en el carge Incumplimiento")
    @Story("Validar que no permita cargar otro formato que pdf en el carge Incumplimiento")
    @TmsLink("XRPRJ-1")
    public void ECargeIncumplimiento () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
		 .CargaIncumplimiento(getProperties().getProperty("EXC"), "Solo se pueden cargar archivos con formato .pdf").SalirFSC()
		 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=7, description="Validar que si no hay DIM salga el aviso (No se encontraron registros para los parámetros de búsqueda.)")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que si no hay DIM salga el aviso (No se encontraron registros para los parámetros de búsqueda.)")
    @Story("Validar que si no hay DIM salga el aviso (No se encontraron registros para los parámetros de búsqueda.)")
    @TmsLink("XRPRJ-1")
    public void EConsultaDMI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().EConsultarFSC().CrearFSC().ConsultarDMI().AlertaDMI("No se encontraron registros para los parámetros de búsqueda.");
        
    }

}