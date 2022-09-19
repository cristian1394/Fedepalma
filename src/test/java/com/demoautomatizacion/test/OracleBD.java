package com.demoautomatizacion.test;

import java.sql.*;


public class OracleBD {
	
	private Connection conexion;
	
	public Connection getConexion() {
        return conexion;
    }    
	
	public void setConexion(Connection conexion) {
        this.conexion = conexion;
	}
	
	public OracleBD conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@192.168.100.92:1521:SIFFDES";
            
            conexion = DriverManager.getConnection(BaseDeDatos, "fondosweb","S1FFD3S2021");            
            
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
            conexion.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }        return this;
    }
	
	public ResultSet consultar(String sql) {
        ResultSet resultado = null;
        try {
            Statement sentencia;
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
            getConexion().commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        return resultado;
    }
	
	public void cerrarConexion() throws SQLException{
		conexion.close();
		}
}
