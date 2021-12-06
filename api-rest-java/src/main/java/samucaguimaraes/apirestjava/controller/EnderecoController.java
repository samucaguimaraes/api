package samucaguimaraes.apirestjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import samucaguimaraes.apirestjava.model.EnderecoModel;
import samucaguimaraes.apirestjava.repository.EnderecoRepository;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @PostMapping(path = "api/endereco/salvar")
    public EnderecoModel salvar(@RequestBody EnderecoModel endereco){
        return repository.save(endereco);
    }
}
