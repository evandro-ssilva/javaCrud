package projeto_curso;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CriarTabelaProdutos {
    public static void main(String [] args){

        try (Connection con = ConexaoBD.conectar();
    Statement stmt = con.createStatement()) {

        //query sql tabela produtos
        String sql = "create table produtos(" +
        "id_produto integer primary key," +
        "nome text not null," +
        "quantidade integer," +
        "preco real," +
        "status text)";

        //executando a query
        stmt.execute(sql);
        System.out.println("tabela produtos criada com sucesso");

            
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela produtos " + e.getMessage());

        }

    }
    
}
