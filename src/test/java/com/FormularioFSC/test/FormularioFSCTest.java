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


@Listeners({ TestListener.class })
@Epic("Formulario FSC")
@Feature("Formulario FSC")

public class FormularioFSCTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Externo)")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Externo)")
    @Story("Arrojar informacion en el usuario Externo")
    @TmsLink("XRPRJ-1")
    public void BuscarE () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
        	 getProperties().getProperty("pwd"));
        FormularioFSC.FormularioFSC().BuscarFSC();
        
    }
	
	@Test(priority=1, description="Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Interno)")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar al Formulario FSC y buscar la informacion arroge todos los Formularios en cualquier estado que se han creado (Usuario Interno)")
    @Story("Arrojar informacion en el Usuario Interno")
    @TmsLink("XRPRJ-1")
    public void BuscarI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"), getProperties().getProperty("password"));
		FormularioFSC.FormularioFSC1().BuscarFSC();     
    }
	
	@Test(priority=2, description="Validar la interfaz de creacion de un formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la interfaz de creacion de un formulario FSC")
    @Story("Validar la interfaz de creacion de un formulario FSC")
    @TmsLink("XRPRJ-1")
    public void InterfazCreacion () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC();
        
    }
	
	@Test(priority=3, description="Validar que en la tabla de DMI's se muestre los DIM existentes para adjuntarlo al formulario en creacion")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que en la tabla de DMI se muestre los DIM's existentes para adjuntarlo al formulario en creacion")
    @Story("DMI's Existentes")
    @TmsLink("XRPRJ-1")
    public void DMIExistentes () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
				 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI();
        
    }
	
	@Test(priority=4, description="Validar que al ingresar en el tipo de documento ya este seleccionado INCUMPLIMENTO POR CANTIDADES NO DEMOSTRADAS")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de docuemnto ya este seleccionado INCUMPLIMENTO POR CANTIDADES NO DEMOSTRADAS")
    @Story("Deteminado el tipo de documento INCUMPLIMENTO POR CANTIDADES NO DEMOSTRADAS")
    @TmsLink("XRPRJ-1")
    public void ICND () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().TD();
        
    }
	
	@Test(priority=5, description="Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @Story("tipo de documento CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @TmsLink("XRPRJ-1")
    public void CFMI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC1().CrearFSC().TD().CFMI();
        
    }
	
	@Test(priority=6, description="Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO INCORPORACION PROPIA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO INCORPORACION PROPIA")
    @Story("tipo de documento CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @TmsLink("XRPRJ-1")
    public void CIP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC2().CrearFSC().TD().CIP();
        
    }
	
	@Test(priority=7, description="Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO CONTRATOS DE MANDATO")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que al ingresar en el tipo de documento se pueda seleccionar CERTIFICADO CONTRATOS DE MANDATO")
    @Story("tipo de documento CERTIFICADO DE FACTURACION AL MERCADO INTERNO")
    @TmsLink("XRPRJ-1")
    public void CCM () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC3().CrearFSC().TD().CCM();
        
    }
	
	@Test(priority=8, description="Validar adicionar un DMI al formulario")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar adicionar un DMI al formulario")
    @Story("Validar adicionar un DMI al formulario")
    @TmsLink("XRPRJ-1")
    public void AdicionarDMI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.").SalirFSC()
			 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=9, description="Validar el carge de un FMI al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un FMI al formulario FSC")
    @Story("Validar el carge de un FMI al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeFMI () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
			 .CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente").SalirFSC()
			 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=10, description="Validar el carge de un CCM al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un CCM al formulario FSC")
    @Story("Validar el carge de un CCM al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeCCM () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
			 .CargaCCM(getProperties().getProperty("doc"), "Se cargo el archivo correctamente").SalirFSC()
			 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=11, description="Validar el carge de un CIP al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un CIP al formulario FSC")
    @Story("Validar el carge de un CIP al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeCIP () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
			 .CargaCIP(getProperties().getProperty("doc"), "Se cargo el archivo correctamente").SalirFSC()
			 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=12, description="Validar el carge de un Incumplimiento al formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el carge de un Incumplimiento al formulario FSC")
    @Story("Validar el carge de un Incumplimiento al formulario FSC")
    @TmsLink("XRPRJ-1")
    public void CargeIncumplimento () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
			 .CargaIncumplimiento(getProperties().getProperty("doc"), "Se cargo el archivo correctamente").SalirFSC()
			 .ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=13, description="Validar el Resumen de demostracion del formulario FSC despues de adicionar un DMI")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el Resumen de demostracion del formulario FSC despues de adicionar un DMI")
    @Story("Resumen de demostracion")
    @TmsLink("XRPRJ-1")
    public void ResumenDemostracion () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
		 	 .CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		 	 .CargaCCM(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		 	 .CargaCIP(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
			 .CargaIncumplimiento(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
			 .ResumenDemostracion().SalirFSC().ConsultarFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC().AceptarEliminarFSC();
        
    }
	
	@Test(priority=14, description="Validar el boton Salir dentro de la creacion de un Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el boton Salir dentro de la creacion de un Formulario FSC")
    @Story("Validar el boton Salir dentro de la creacion de un Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void SalirFSC () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().SalirFSC();
        
    }
	
	@Test(priority=15, description="Validar la revicion del formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la revicion del formulario FSC")
    @Story("Validar la revicion del formulario FSC")
    @TmsLink("XRPRJ-1")
    public void RevisarFSC () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().ConsultarFSC().CrearFSC().ConsultarDMI().SeleccionarDMI().AdicionarDMI("El formulario se guardo correctamente.")
		 	 .CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		 	 .CargaCCM(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
		 	 .CargaCIP(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
			 .CargaIncumplimiento(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
			 .RevisarFSC().SalirFSC();
        
    }
	
	@Test(priority=16, description="Validar el Historial de Formulario")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el Historial de Formulario")
    @Story("Validar el Historial de Formulario")
    @TmsLink("XRPRJ-1")
    public void VerHistorial () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
		     getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().BuscarFSC().Historial().CerrarHistorial();     
    }
	
	@Test(priority=17, description="Validar el Exportar a Excel del Historial")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar el Exportar a Excel del Historial")
    @Story("Validar el Exportar a Excel del Historial")
    @TmsLink("XRPRJ-1")
    public void ExportarHistorial () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().BuscarFSC().Historial().ExportarHistorial().CerrarHistorial();     
    }
	
	@Test(priority=18, description="Validar que la lupa muestre el formulario FSC creado")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar que la lupa muestre el formulario FSC creado")
    @Story("Validar que la lupa muestre el formulario FSC creado")
    @TmsLink("XRPRJ-1")
    public void VerFSC () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().BuscarFSC().VerFSC();     
    }
	
	@Test(priority=19, description="Validar la interfaz de Editar Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la interfaz de Editar Formulario FSC")
    @Story("Validar la interfaz de Editar Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void VerEdicionFSC () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().BuscarFSC().EditarFSC().SalirFSC1();     
    }
	
	@Test(priority=20, description="Validar la Edicion del Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la Edicion del Formulario FSC")
    @Story("Validar la Edicion del Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void EdicionFSC () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().BuscarFSC().EditarFSC().CargaFMI(getProperties().getProperty("doc"), "Se cargo el archivo correctamente")
			 .SalirFSC1();     
    }
	
	@Test(priority=21, description="Validar la Eliminacion de un Formulario FSC")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar la Eliminacion de un Formulario FSC")
    @Story("Validar la Eliminacion de un Formulario FSC")
    @TmsLink("XRPRJ-1")
    public void EliminarFSC () throws Exception {
		home.irPortal(getProperties().getProperty("url"));
		Login.ingresarCredencialesConNit(getProperties().getProperty("nit"), getProperties().getProperty("usr1"),
			 getProperties().getProperty("pwd"));
		FormularioFSC.FormularioFSC().BuscarFSC().EliminarFSC().AceptarEliminarFSC();     
    }
}