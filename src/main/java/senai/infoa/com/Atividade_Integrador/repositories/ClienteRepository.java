package senai.infoa.com.Atividade_Integrador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import senai.infoa.com.Atividade_Integrador.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    @Query(value="select * from Cliente where nome = :nome", nativeQuery=true)
    public Cliente findBynome(String nome);
}
