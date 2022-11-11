package com.josst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje){

        try (Connection connection = Conexion.getConnection()){
            PreparedStatement ps =null;
            try{
               String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?,?);";
               ps = connection.prepareStatement(query);
               ps.setString(1,mensaje.getMensjae());
               ps.setString(2,mensaje.getAutor_mensaje());
               ps.executeUpdate();
                System.out.println("Mensaje creado");
            }catch (SQLException ex){
                System.out.println(ex);
            }
       }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajesDB(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection connection = Conexion.getConnection()) {
            String query = "SELECT * FROM mensajes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id_mesnaje"));
                System.out.println("Mensaje: " +rs.getString("mensaje"));
                System.out.println("Author: "+ rs.getString("autor_mensaje"));
                System.out.println("Fecha: " +rs.getString("fecha_mensaje"));
                System.out.println("\n");
            }
        }catch (SQLException e){
            System.out.println("No se pudieron recuperar los mensaje ");
            System.out.println(e);
        }


    }
    public static void borrarMensajeDB(int id_mensaje){
        try(Connection connection = Conexion.getConnection()){
            PreparedStatement  preparedStatement = null;

            try{
                String query = "DELETE FROM `mensajes` WHERE `mensajes`.`id_mesnaje` = ? ";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1,id_mensaje);
                preparedStatement.executeUpdate();
                System.out.println("Mensaje eliminado");
            }catch (SQLException e){
                System.out.println("No se logro borrar mensaje");
                System.out.println(e);
            }

        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    public static void actualizarMensajeDB(Mensajes mensaje){

    }
}
