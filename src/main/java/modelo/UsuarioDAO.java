/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Win 11 Pro
 */
public class UsuarioDAO {
    public Usuario validar(String user, String pass) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE nombre = ? AND contrasena = ?";

        try (
                Connection conn = ConexionDAO.CrearConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user);
            ps.setString(2, pass);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario();
                    usuario.setId_usuario(rs.getInt("id_usuario"));
                    usuario.setNombre(rs.getString("nombre"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en la validacion de credenciales: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.getLogger(UsuarioDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return usuario;
    }
    
   
    // creamos el metodo para registrar nueva cuenta en este caso por defecto la cuenta que va a crear es para 2: estudiante
   
     public int NuevaCuenta(Usuario user) {
        int result = 0;

        try {
            Connection conn = ConexionDAO.CrearConexion();
            String sql = "INSERT INTO usuario(nombre,contrasena) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2,user.getContraseña());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al validar usuario: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.getLogger(UsuarioDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return result;
    }
    
    
}
