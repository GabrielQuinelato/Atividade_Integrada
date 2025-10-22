package senai.infoa.com.Atividade_Integrador.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import senai.infoa.com.Atividade_Integrador.services.ClienteServices;
import org.springframework.web.bind.annotation.GetMapping;
import senai.infoa.com.Atividade_Integrador.models.Cliente;

@RestController
public class ClienteController {
   @Autowired
   private ClienteServices cs;
   
   @PostMapping("/cadastrar/{id}")
   public String salvar(@RequestBody Integer id) {
    boolean salvou = cs.salvar(id);
    if(salvou) {
        return "Usuário Cadastrado!";

    }
       return "Falha ao Cadastrar usuário!";
   }
   @GetMapping
   public List<Cliente> listarTodos(){
    return cs.ListarTodos();
   }
    @PostMapping("/login")
    public String login(@RequestParam String nome, @RequestParam Integer senha) {
        return cs.login(nome,senha);
    }
   


}
