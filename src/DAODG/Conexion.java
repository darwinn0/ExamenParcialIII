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
import java.sql.Connection;


public class Conexion {
    private Connection c;

    public Conexion(String dbName) {
        try {
            // Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            System.out.println("=> Cargando el Driver:");
            Class.forName(driver);
            System.out.println("Driver OK");

            // Definiendo Base de Datos
            String url = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root";
            String pass = "";

            // Conectando
            System.out.println("=> Conectando a la BD:");
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de Datos OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al tratar de conectar a la BD!");
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return c;
    }

    public void closeConexion() {
        try {
            if (c != null && !c.isClosed()) {
                c.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión!");
            e.printStackTrace();
        }
    }
}
