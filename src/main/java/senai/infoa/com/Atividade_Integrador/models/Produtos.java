package senai.infoa.com.Atividade_Integrador.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="categoria_perifericos")
    private String categoriaPerifericos;

    public Produtos() {} 

    public Produtos(Integer id, String nome, String categoriaPerifericos) {
        this.id = id;
        this.nome = nome;
        this.categoriaPerifericos = categoriaPerifericos;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoriaPerifericos() {
        return categoriaPerifericos;
    }
    public void setCategoriaPerifericos(String categoriaPerifericos) {
        this.categoriaPerifericos = categoriaPerifericos;
    }
    

}
