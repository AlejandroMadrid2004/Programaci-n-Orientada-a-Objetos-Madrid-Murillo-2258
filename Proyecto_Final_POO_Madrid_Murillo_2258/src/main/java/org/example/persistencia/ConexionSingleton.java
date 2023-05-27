package org.example.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Permitimos que haya solo una instancia de tipo Singleton
public class ConexionSingleton {

    private String baseDatos;
    public static ConexionSingleton _instance;
    private Connection connection;

    //Constructor privado
    private ConexionSingleton(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Metodo estatico que regresa un objeto de tipo ConexionSingleton
    public static ConexionSingleton getInstance(String baseDatos) {
        //Preguntamos si es nulo
        if(_instance == null){
            //Si es nulo, llamamos al constructor y llamamos a la base de datos
            _instance = new ConexionSingleton(baseDatos);
        }else{
            //Ya no se crea otra conexion, si ya fue creada
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }

    //Metodo de acceso para conexion de bases de datos que se hace con los otros dos metodos
    public Connection getConnection() {
        return connection;
    }


}
