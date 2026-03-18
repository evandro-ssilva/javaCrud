package projeto_curso;

public class Produto {
    private int id_produto;
    private String nome;
    private int quantidade;
    private double preco;
    private String status;

    public Produto(int idInit, String nomeInit, int quantidadeInit, double precoInit, String satusInit){
        this.id_produto = idInit;
        this.nome = nomeInit;
        this.quantidade = quantidadeInit;
        this.preco = precoInit;
        this.status = satusInit;
    }
    //geter and seter 

    public int getId(){
        return id_produto;
    }
    public void setId(int id){
        id_produto = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nomeProduto){
        nome = nomeProduto;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidadeProduto){
        quantidade = quantidadeProduto;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double precoProduto){
        preco = precoProduto;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String statusProduto){
        status = statusProduto;
    }
}
