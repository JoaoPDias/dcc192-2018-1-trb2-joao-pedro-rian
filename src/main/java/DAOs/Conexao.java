package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conexao;

    public static Connection getInstance() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/AmigoOculto", "Usuario", "12345");
        }
        return conexao;
    }
}
