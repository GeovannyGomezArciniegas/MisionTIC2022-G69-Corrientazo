package co.edu.utp.misiontic.geovanny.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "C:\\Users\\EQUIPO\\Desktop\\ProyectoCiclo2Java\\corrientazo\\src\\main\\resources\\corrientazo.db";
    
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
