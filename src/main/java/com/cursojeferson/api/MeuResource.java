package com.cursojeferson.api;

import com.cursojeferson.api.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes") // substutuir e simplificar direto
public class MeuResource {

//    @RequestMapping(value = "/api/clientes/{id}", method = RequestMethod.GET)
    //Simpliciar
//    @GetMapping("/api/clientes/{id}")

    public Cliente obterDadosCliente(@PathVariable Long id){
        System.out.println(String.format("Id recebido via url: %d", id));
        Cliente cliente = new Cliente("Fulano", "000.000.000-00");
        return cliente;
    }

//    @PostMapping("/api/clientes")
    @PostMapping // pronto cima linha 8
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        //service.save(cliente)
        return cliente;
    }

//    @DeleteMapping("/api/clientes/{id}")
    @DeleteMapping("{id}") // simplifica linha 8
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        //service.buscarPorId(cliente)
        //service.delete(cliente)
    }

//    @PutMapping("/api/clientes/{id}")
    @PutMapping("{id}") // simplifica linha 8
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        //service.buscarPorId(cliente)
        return cliente;
    }
}
