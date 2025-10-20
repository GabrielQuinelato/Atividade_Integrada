package main.java.senai.infoa.com.Atividade_Integrador.models;

import main.java.senai.infoa.com.Atividade_Integradora.models.Column;
import main.java.senai.infoa.com.Atividade_Integradora.models.Entity;
import main.java.senai.infoa.com.Atividade_Integradora.models.GeneratedValue;
import main.java.senai.infoa.com.Atividade_Integradora.models.Id;
import main.java.senai.infoa.com.Atividade_Integradora.models.Table;

@Entity
@Table(name="pedidos")
public class Pesquisa {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="busca")
    private String busca;
    
    public Pesquisa() {}

    public Pesquisa(Integer id, String busca) {
        this.id = id;
        this.busca = busca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    
}

