package projeto_curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL_BANCO_SQLITE = "jdbc:sqlite:projeto_produto.bd";

    //metodo que realiza a conexão

    public static Connection conectar(){
        try {
            System.out.println("conexão estabelecida com sucesso");
            return DriverManager.getConnection(URL_BANCO_SQLITE);
        } catch (SQLException e) {
            System.err.println("Erro de conexão com o banco " + e.getMessage());
            return null;
        }
    }
    
}
