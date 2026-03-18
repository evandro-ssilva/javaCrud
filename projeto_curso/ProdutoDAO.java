package projeto_curso;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO{

    public final Connection CONEXAO_DB;

    public ProdutoDAO(Connection con){
        this.CONEXAO_DB = con;
    }

    public void insert(Produto produto){
        String sql = "insert into produtos(nome, quantidade, preco, status) values (?, ?, ?, ?)";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getStatus());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso");
            
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar o produto " + e.getMessage()gg);
        }
    }

    public void apagarRegistros(){
        String sqlApagar = "delete from produtos";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sqlApagar)) {

            stmt.executeUpdate();
            System.out.println("todos os registros foram apagados com sucesso");
            
        } catch (SQLException e) {
            System.err.println("erro ao apagar os registros do banco");
        }
    }
}