package tienda.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo { //No necesito aclarar que esto debe ser modificado a conveniencia de cada uno.
    private String bd = "tienda";
    private String user = "root";
    private String pass = "";
    private String conexion = "jdbc:mysql://localhost:3306/" + bd;

    public ResultSet consultarUsuarios() throws SQLException {
        Connection connection = DriverManager.getConnection(conexion, user, pass);
        Statement statement = connection.createStatement();
        String selectSql = "SELECT id, nombre, apellido, telefono FROM usuarios";
        return statement.executeQuery(selectSql);
    }
}

