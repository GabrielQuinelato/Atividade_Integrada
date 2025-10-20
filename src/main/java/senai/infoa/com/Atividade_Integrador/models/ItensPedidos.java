package main.java.senai.infoa.com.Atividade_Integrador.models;

import main.java.senai.infoa.com.Atividade_Integradora.models.Column;
import main.java.senai.infoa.com.Atividade_Integradora.models.Entity;
import main.java.senai.infoa.com.Atividade_Integradora.models.GeneratedValue;
import main.java.senai.infoa.com.Atividade_Integradora.models.Id;
import main.java.senai.infoa.com.Atividade_Integradora.models.Table;

@Entity
@Table(name="itens_pedidos")
public class ItensPedidos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="id_pedido")
    private Integer idPedido;

    @Column(name="id_produto")
    private Integer idProduto;

    @Column(name="quantidade")
    private String quantidade;

    @Column(name="preco_unitario")
    private double precoUnitario;

    public ItensPedidos() {}
    
    public ItensPedidos(Integer id, Integer idPedido, Integer idProduto, String quantidade, double precoUnitario) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    

}