package senai.infoa.com.Atividade_Integrador.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="id_cliente")
    private Integer idCliente;

    @Column(name="pagamento")
    private String pagamento;
    
    public Pagamento() {}

    public Pagamento(Integer id, Integer idCliente, String pagamento) {
        this.id = id;
        this.idCliente = idCliente;
        this.pagamento = pagamento;
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

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    
}

