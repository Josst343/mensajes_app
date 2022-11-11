package com.josst;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class Conexion {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8888/mensajes_app","root","");
            if (connection != null)
                System.out.println("conexion exitosa");
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
