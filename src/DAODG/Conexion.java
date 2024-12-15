/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAODG;
import java.sql.*;
/**
 *
 * @author darwi
 */
public class Conexion {
    Connection c;
    
    public Conexion(String dbName){
        
        try {
            /* Driver */
            String driver = "com.mysql.cj.jdbc.Driver";
            System.out.println( "=> Cargando el Driver:" );
            Class.forName( driver );
            System.out.println("Driver OK");
            /* Definiendo Base de Datos */
            String url = "jdbc:mysql://localhost:3306/"+dbName;
            String user = "root";
            String pass = "";
            /* Conectando */
            System.out.println( "=> conectando a la BD:" );
            c = DriverManager.getConnection( url , user , pass );
            System.out.println("Base de Datos OK");
            }
        catch( Exception x ) {
            System.out.println("Error al tratar de conectar a la BD!");
            x.printStackTrace();
        } 
    }

    public Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public Connection getConexion(){
        return c;
     }

    public Connection getConexion(String exameniiipacial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}