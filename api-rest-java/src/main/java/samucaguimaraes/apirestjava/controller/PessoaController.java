package samucaguimaraes.apirestjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samucaguimaraes.apirestjava.model.PessoaModel;
import samucaguimaraes.apirestjava.repository.PessoaRepository;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping(path = "/api/pessoa/{id}")
    public ResponseEntity obterPorId(@PathVariable("id") Long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/pessoa/salvar")
    public PessoaModel salvar(@RequestBody PessoaModel pessoa){
        return repository.save(pessoa);
    }
}
