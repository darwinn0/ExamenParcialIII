/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAODG;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDG 
{

    private Connection c;

    // Constructor para inicializar la conexión con la base de datos
    public ConexionDG(String dbName) {
        try {
            // Cargar el driver
            String driver = "com.mysql.cj.jdbc.Driver";
            System.out.println("=> Cargando el Driver:");
            Class.forName(driver);
            System.out.println("Driver OK");

            // Definir la URL de la base de datos
            String url = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root";
            String pass = "";

            // Conectar a la base de datos
            System.out.println("=> Conectando a la BD:");
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de Datos OK");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al tratar de conectar a la BD!");
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return c;
    }

    // Constructor por defecto no soportado
    public ConexionDG() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}



