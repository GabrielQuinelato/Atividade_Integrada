package senai.infoa.com.Atividade_Integrador.models;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="id_cliente")
    private Integer idCliente;

    @Column(name="data_pedido")
    private LocalDateTime dataPedido;

    @Column(name="status")
    private Boolean status;

    public Pedidos() {}
    
    public Pedidos(Integer id, Integer idCliente, LocalDateTime dataPedido, Boolean status) {
        this.id = id;
        this.idCliente = idCliente;
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    
}
