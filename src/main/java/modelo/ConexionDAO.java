/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Win 11 Pro
 */
public class ConexionDAO {
    //  declaramos variables
    private static final String url="jdbc:mysql://gateway01.ap-northeast-1.prod.aws.tidbcloud.com:4000/mi_contador?sslMode=VERIFY_IDENTITY";
    public static final String usuario="4ZRX3B4Cz9n3f54.root";
    public static final String contraseña="hCqcJIanM6EeR2z3";
            
    // función para conectarnos a la base de datos
    public static Connection CrearConexion() throws ClassNotFoundException {
        Connection conn = null;
       try {
            // Cargar el driver de SQL Server
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Intentar la conexión
            conn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a TIDB  Database");
        } catch (ClassNotFoundException e) {
            System.out.println(" No se encontró el driver JDBC de SQL Server: " + e.getMessage());
    
        } catch (SQLException e) {
            System.out.println(" Error al conectar a la base de datos: " + e.getMessage());
        }
        // retornamos conn que es conexion para poder acceder al metodo conexión
        return conn;
    }
    public static void main(String[] args){
       try {
           Connection test;
           test = ConexionDAO.CrearConexion();
           if(test!=null){
               System.out.println("Conexión probada correctamente desde main.");
           }else{
               System.out.println("No se pudo establecer la conexión.");
           }
       } catch (ClassNotFoundException ex) {
           System.getLogger(ConexionDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
       }
}
    

