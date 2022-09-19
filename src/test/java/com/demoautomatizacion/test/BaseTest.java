
package com.demoautomatizacion.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PagObject_AdministracionFiniquitos.ConsultaFCPPage;
import PagObject_AdministracionFiniquitos.FormularioFCPPage;
import PagObject_AdministracionSolicitudesNuevas.BloqueantesPage;
import PagObject_AdministracionSolicitudesNuevas.CreacionSolicitudPage;
import PagObject_AdministracionUsuariosNuevos.BloqueantePage;
import PagObject_AdministracionUsuariosNuevos.CrearSolicitudPage;
import PagObject_ConsultaDCD.BorrarDCDPage;
import PagObject_ConsultaDCD.CargaMasivaDCDPage;
import PagObject_ConsultaDCD.ConsultaDCDPage;
import PagObject_ConsultaDCD.Consulta_DCDPage;
import PagObject_ConsultaDCD.CrearDCDPage;
import PagObject_ConsultaDCD.EditarDCDPage;
import PagObject_ConsultaDCD.Editar_DCDPage;
import PagObject_ConsultaDCD.ExepcionCMDCDPage;
import PagObject_ConsultaDCD.ExepcionConsultaDCDPage;
import PagObject_ConsultaDCD.ExepcionesCrearDCDPage;
import PagObject_ConsultaDCD.ExepcionesGenerarDCDPage;
import PagObject_ConsultaDCD.FiltrosDCDPage;
import PagObject_ConsultaDCD.GenerarDCDPage;
import PagObject_ConsultaDCD.HistorialDCDPage;
import PagObject_ConsultaDCD.ObservarDCDPage;
import PagObject_ConsultaDCD.RellenarDCDPage;
import PagObject_ConsultaDCD.RevisarDCDPage;
import PagObject_FormularioFDC.BorrarFDCPage;
import PagObject_FormularioFDC.CargaMasivaDEX2Page;
import PagObject_FormularioFDC.CargaMasivaDEXPage;
import PagObject_FormularioFDC.CargaMasivaFMM2Page;
import PagObject_FormularioFDC.CargaMasivaFMMPage;
import PagObject_FormularioFDC.CargarDEXPage;
import PagObject_FormularioFDC.Cargar_DEXPage;
import PagObject_FormularioFDC.CrearFDCPage;
import PagObject_FormularioFDC.DEXEsFDCPage;
import PagObject_FormularioFDC.DEXFDCPage;
import PagObject_FormularioFDC.EditarFDCPage;
import PagObject_FormularioFDC.Editar_FDCPage;
import PagObject_FormularioFDC.ExepcionCrearFDCPage;
import PagObject_FormularioFDC.FMMEsFDCPage;
import PagObject_FormularioFDC.FMMFDCPage;
import PagObject_FormularioFDC.FiltrosFDCPage;
import PagObject_FormularioFDC.FormularioFDCPage;
import PagObject_FormularioFDC.Formulario_FDCPage;
import PagObject_FormularioFDC.HistorialFDCPage;
import PagObject_FormularioFDC.IncumplimientoEsFDCPage;
import PagObject_FormularioFDC.IncumplimientoFDCPage;
import PagObject_FormularioFDC.ObserverFDCPage;
import PagObject_FormularioFDC.PolizaEsFDCPage;
import PagObject_FormularioFDC.PolizaFDCPage;
import PagObject_FormularioFDC.RadicarDEXPage;
import PagObject_FormularioFDC.RechazarDCDPage;
import PagObject_FormularioFDC.RevisarFDCPage;
import PagObject_FormularioFSC.ExepcionCrearFSCPage;
import PagObject_FormularioFSC.FormularioFSCPage;
import PagObject_FormularioNuevoFFP.BorrarFFPPage;
import PagObject_FormularioNuevoFFP.ConsultaFFPPage;
import PagObject_FormularioNuevoFFP.Consulta_FFPPage;
import PagObject_FormularioNuevoFFP.ConsultarFFPPage;
import PagObject_FormularioNuevoFFP.CorregirFFPPage;
import PagObject_FormularioNuevoFFP.DeclararFFPPage;
import PagObject_FormularioNuevoFFP.EditarFFPPage;
import PagObject_FormularioNuevoFFP.FiltrarFFPPage;
import PagObject_FormularioNuevoFFP.FirmaGerentePage;
import PagObject_FormularioNuevoFFP.InventariosCorreccionPage;
import PagObject_FormularioNuevoFFP.InventariosEdicionPage;
import PagObject_FormularioNuevoFFP.InventariosPage;
import PagObject_FormularioNuevoFFP.MiraFFPPage;
import PagObject_FormularioNuevoFFP.NuevaDeclaracionEPage;
import PagObject_FormularioNuevoFFP.NuevaDeclaracionPage;
import PagObject_ReporteCCertificados.ReporteCCertificadoPage;
import PagObject_ReporteCCuotas.ReporteCCuotasPage;
import PagObject_ReporteUDD.ConsultaReporteUDDPage;
import PagObject_RevisionesRYP.DiasEnProcesoRYPPage;
import PagObject_RevisionesRYP.FiltrosDiasEnProcesoPage;
import PagObject_RevisionesRYP.FiltrosRYPPage;
import PagObject_RevisionesRYP.IniciacionRYPPage;
import PagObject_RevisionesRYP.ObservarRevicionesPage;
import PagObject_RevisionesRYP.RevicionesRYPPage;
import PagObject_RevisionesRYP.ValidacionesFiltrosPage;
import PagObject_RevisionesRYP.ValidacionesRYPPage;
import PagObject_SecretariaTecnica.DiasEnProcesoSTPage;
import PagObject_SecretariaTecnica.FiltrosSecretariaTPage;
import PagObject_SecretariaTecnica.IniciacionSTPage;
import PagObject_SecretariaTecnica.ObservarSTecnicaPage;
import PagObject_SecretariaTecnica.RevicionSTecnicaPage;
import PagObject_SecretariaTecnica.ValidacionesSTPage;
import PagObject_Trazabilidad.AprobadasTrazabilidadPage;
import PagObject_Trazabilidad.DiasEnProcesosTrazabilidadPage;
import PagObject_Trazabilidad.ExcepcionTrazabilidadPage;
import PagObject_Trazabilidad.FiltrosTrazabilidadPage;
import PagObject_Trazabilidad.IniciacionTrazabilidadPage;
import PagObject_Trazabilidad.ObservarTrazabilidadPage;
import PagObject_Trazabilidad.TramitesTrazabilidadPage;
import PagObject_Trazabilidad.TrazabilidadPage;
import PagObject_demoautomatizacion.BasePage;
import PagObject_demoautomatizacion.HomePage;
import PagObject_demoautomatizacion.LoginPage;
import PagObject_demoautomatizacion.Login_Page;


public class BaseTest {

    public WebDriver driver;
    
    
    public BasePage base;
    
    public HomePage home;
    public LoginPage login;
    public Login_Page Login;
    public Consulta_DCDPage DCD;
    public ConsultaDCDPage RDCD;
    public CrearDCDPage CrearDCD;
    public ExepcionesCrearDCDPage ECrearDCD;
    public EditarDCDPage EditarDCD;
    public CargaMasivaDCDPage CargaMasiva;
    public RevisarDCDPage Revisar;
    public GenerarDCDPage Generar;
    public Editar_DCDPage Editar;
    public RellenarDCDPage Rellenar;
    public HistorialDCDPage HistorialDCD;
    public ObservarDCDPage Observar;
    public BorrarDCDPage Borrar;
    public FormularioFDCPage FDC;
    public CrearFDCPage CrearFDC;
    public DEXFDCPage DEX;
    public FMMFDCPage FMM;
    public PolizaFDCPage Poliza;
    public DEXEsFDCPage DEXFDC;
    public FMMEsFDCPage FMMFDC;
    public PolizaEsFDCPage PolizaFDC;
    public IncumplimientoEsFDCPage Incumplimiento;
    public IncumplimientoFDCPage Incumplimiento1;
    public CargaMasivaDEXPage CargaDEX;
    public CargaMasivaDEX2Page CMDEX;
    public CargaMasivaFMMPage CargaFMM;
    public CargaMasivaFMM2Page CMFMM;
    public HistorialFDCPage HistorialFDC;
    public ObserverFDCPage VerFDC;
    public EditarFDCPage EditarFDC;
    public Editar_FDCPage Editar_FDC;
    public Formulario_FDCPage FDCB;
    public BorrarFDCPage BorrarFDC;
    public CargarDEXPage Cargas;
    public Cargar_DEXPage Carga;
    public TrazabilidadPage Trazabilidad;
    public ObservarTrazabilidadPage VerTrazabilidad;
    public RadicarDEXPage Radicar;
    public ObservarSTecnicaPage VerSTecnica;
    public RevicionSTecnicaPage STecnica;
    public ObservarRevicionesPage Reviciones;
    public RevicionesRYPPage RYP;
    public IniciacionRYPPage MenuRYP;
    public FiltrosDCDPage FiltrosDCD;
    public FiltrosFDCPage FiltrosFDC;
    public FiltrosRYPPage FiltrosRYP;
    public FiltrosSecretariaTPage FiltrosST;
    public FiltrosTrazabilidadPage FiltroTrazabilidad;
    public ValidacionesRYPPage ValidarRYP;
    public ValidacionesFiltrosPage ValidarFiltros;
    public ValidacionesSTPage ValidarST;
    public IniciacionSTPage MenuST;
    public IniciacionTrazabilidadPage MenuTrazabilidad;
    public Consulta_FFPPage Consulta_FFP;
    public InventariosPage Inventarios;
    public NuevaDeclaracionPage NuevaDeclaracion;
    public NuevaDeclaracionEPage NuevaDeclaracionE;
    public ConsultaFFPPage ConsultaFFP;
    public EditarFFPPage EditarFFP;
    public InventariosEdicionPage InventariosEdicion;
    public CorregirFFPPage CorregirFFP;
    public InventariosCorreccionPage InventariosCorreccion;
    public MiraFFPPage MirarFFP;
    public FiltrarFFPPage FiltrarFFP;
    public TramitesTrazabilidadPage EnTramite;
    public AprobadasTrazabilidadPage Aprobadas;
    public ConsultarFFPPage ConsultarFFP;
    public DeclararFFPPage DeclararFFPF;
    public FirmaGerentePage FirmaG;
    public BorrarFFPPage BorrarFFP;
    public FiltrosDiasEnProcesoPage FiltroDiasP;
    public ExepcionConsultaDCDPage EDCD;
    public ExepcionesGenerarDCDPage GDCD;
    public ExepcionCMDCDPage CMDCD;
    public ExepcionCrearFDCPage ECrearFDC;
    public RevisarFDCPage RevisarFDC;
    public DiasEnProcesoSTPage DiasPST;
    public ExcepcionTrazabilidadPage ETrazabilidad;
    public DiasEnProcesosTrazabilidadPage DiasPT;
    public DiasEnProcesoRYPPage DiasPRYP;
    public RechazarDCDPage RechazarDCD;
    public BloqueantesPage Bloqueantes;
    public CreacionSolicitudPage CrearSolicitud;
    public BloqueantePage Bloqueante;
    public CrearSolicitudPage CrearSolicitud1;
    public ExepcionCrearFSCPage ECrearFSC;
    public FormularioFSCPage FormularioFSC;
    public FormularioFCPPage FormularioFCP;
    public ConsultaFCPPage ConsultarFCP;
    public ConsultaReporteUDDPage ConsultaRUDD;
    public ReporteCCuotasPage ReporteCCuotas;
    public ReporteCCertificadoPage ReporteCCertificado;
    
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void inicializar() {
    	
    	
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
        
        base = new BasePage(driver);
       
		home = new HomePage(driver);
        login = new LoginPage(driver);
        Login = new Login_Page(driver);
        DCD = new Consulta_DCDPage(driver);
        RDCD = new ConsultaDCDPage(driver);
        CrearDCD = new CrearDCDPage(driver);
        ECrearDCD = new ExepcionesCrearDCDPage(driver);
        EditarDCD = new EditarDCDPage(driver);
        CargaMasiva = new CargaMasivaDCDPage(driver);
        Revisar = new RevisarDCDPage(driver);
        Generar = new GenerarDCDPage(driver);
        Editar = new Editar_DCDPage(driver);
        Rellenar = new RellenarDCDPage(driver);
        HistorialDCD = new HistorialDCDPage(driver);
        Observar = new ObservarDCDPage(driver);
        Borrar = new BorrarDCDPage(driver);
        FDC = new FormularioFDCPage(driver);
        CrearFDC = new CrearFDCPage(driver);
        DEX = new DEXFDCPage(driver);
        FMM = new FMMFDCPage(driver);
        Poliza = new PolizaFDCPage(driver);
        DEXFDC = new DEXEsFDCPage(driver);
        FMMFDC = new FMMEsFDCPage(driver);
        PolizaFDC = new PolizaEsFDCPage(driver);
        Incumplimiento = new IncumplimientoEsFDCPage(driver);
        Incumplimiento1 = new IncumplimientoFDCPage(driver);
        CargaDEX = new CargaMasivaDEXPage(driver);
        CMDEX = new CargaMasivaDEX2Page(driver);
        CargaFMM = new CargaMasivaFMMPage(driver);
        CMFMM = new CargaMasivaFMM2Page(driver);
        HistorialFDC = new HistorialFDCPage(driver);
        VerFDC = new ObserverFDCPage(driver);
        EditarFDC = new EditarFDCPage(driver);
        Editar_FDC = new Editar_FDCPage(driver);
        FDCB = new Formulario_FDCPage(driver);
        BorrarFDC = new BorrarFDCPage(driver);
        Cargas = new CargarDEXPage(driver);
        Carga = new Cargar_DEXPage(driver);
        Trazabilidad = new TrazabilidadPage(driver);
        VerTrazabilidad = new ObservarTrazabilidadPage(driver);
        Radicar = new RadicarDEXPage(driver);
        VerSTecnica = new ObservarSTecnicaPage(driver);
        STecnica = new RevicionSTecnicaPage(driver);
        Reviciones = new ObservarRevicionesPage(driver);
        RYP = new RevicionesRYPPage(driver);
        FiltrosDCD = new FiltrosDCDPage(driver);
        FiltrosFDC = new FiltrosFDCPage(driver);
        FiltrosRYP = new FiltrosRYPPage(driver);
        FiltrosST = new FiltrosSecretariaTPage(driver);
        FiltroTrazabilidad = new FiltrosTrazabilidadPage(driver);
        ValidarRYP = new ValidacionesRYPPage(driver);
        ValidarFiltros = new ValidacionesFiltrosPage(driver);
        ValidarST = new ValidacionesSTPage(driver);
        MenuRYP = new IniciacionRYPPage(driver);
        MenuST = new IniciacionSTPage(driver);
        MenuTrazabilidad = new IniciacionTrazabilidadPage(driver);
        Consulta_FFP = new Consulta_FFPPage(driver);
        Inventarios = new InventariosPage(driver);
        NuevaDeclaracion = new NuevaDeclaracionPage(driver);
        NuevaDeclaracionE = new NuevaDeclaracionEPage(driver);
        ConsultaFFP = new ConsultaFFPPage(driver);
        EditarFFP = new EditarFFPPage(driver);
        InventariosEdicion = new InventariosEdicionPage(driver);
        CorregirFFP = new CorregirFFPPage(driver);
        InventariosCorreccion = new InventariosCorreccionPage(driver);
        MirarFFP = new MiraFFPPage(driver);
        FiltrarFFP = new FiltrarFFPPage(driver);
        EnTramite= new TramitesTrazabilidadPage(driver);
        Aprobadas= new AprobadasTrazabilidadPage(driver);
        ConsultarFFP = new ConsultarFFPPage(driver);
        DeclararFFPF = new DeclararFFPPage(driver);
        FirmaG = new FirmaGerentePage(driver);
        BorrarFFP = new BorrarFFPPage(driver);
        FiltroDiasP = new FiltrosDiasEnProcesoPage(driver);
        EDCD = new ExepcionConsultaDCDPage(driver);
        GDCD = new ExepcionesGenerarDCDPage(driver); 
        CMDCD = new ExepcionCMDCDPage(driver); 
        ECrearFDC = new ExepcionCrearFDCPage(driver);
        RevisarFDC = new RevisarFDCPage(driver);
        DiasPST = new DiasEnProcesoSTPage(driver);
        ETrazabilidad = new ExcepcionTrazabilidadPage(driver);
        DiasPT = new DiasEnProcesosTrazabilidadPage(driver);
        DiasPRYP = new DiasEnProcesoRYPPage(driver);
        RechazarDCD = new RechazarDCDPage(driver);
        Bloqueantes = new BloqueantesPage(driver);
        CrearSolicitud = new CreacionSolicitudPage(driver);
        Bloqueante = new BloqueantePage(driver);
        CrearSolicitud1 = new CrearSolicitudPage(driver);
        ECrearFSC = new ExepcionCrearFSCPage(driver);
        FormularioFSC = new FormularioFSCPage(driver);
        FormularioFCP = new FormularioFCPPage(driver);
        ConsultarFCP = new ConsultaFCPPage(driver);
        ConsultaRUDD = new ConsultaReporteUDDPage(driver);
        ReporteCCuotas = new ReporteCCuotasPage(driver);
        ReporteCCertificado = new ReporteCCertificadoPage(driver);
        
    }
    
    public ArrayList<Object> consultaBD(String sql) {ArrayList<Object> datos = new ArrayList<Object>();try {
    	
    	OracleBD conexion = new OracleBD().conectar();if (conexion != null) {ResultSet resultado = conexion.consultar(sql);
    	ResultSetMetaData metadata = resultado.getMetaData();
    	int columnas = metadata.getColumnCount();
    	while (resultado.next()) {
    	Object dato = new Object[columnas];
    	for (int i = 1; i <= columnas; i++) {
    	dato = resultado.getObject(i);
    	//System.out.println(resultado.getString(i));
    	datos.add(dato);
    	}
    	}
    	}
    	conexion.cerrarConexion();
    	} catch (Exception e) {
    	throw new RuntimeException(e.getMessage());
    	}
    	return datos;
    	}

    @AfterMethod
    public void tearDown () {
        
    	if (driver != null) {
           driver.quit();
        } 
        
        
    }

}
