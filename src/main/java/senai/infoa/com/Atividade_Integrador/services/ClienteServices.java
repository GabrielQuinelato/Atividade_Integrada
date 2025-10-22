package senai.infoa.com.Atividade_Integrador.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.infoa.com.Atividade_Integrador.models.Cliente;
import senai.infoa.com.Atividade_Integrador.repositories.ClienteRepository;




@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository cr;

    public boolean salvar(Integer id) {

        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }   
    public List<Cliente> ListarTodos() {
        return cr.findAll();
    }


    public String login(String nome, Integer senha){
        Cliente cliente = cr.findBynome(nome);
        if(nome != null && senha.equals(cliente.getSenha())){
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }
}
