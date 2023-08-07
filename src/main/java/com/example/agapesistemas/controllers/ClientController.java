package com.example.agapesistemas.controllers;

import com.example.agapesistemas.domain.clientes.Clientes;
import com.example.agapesistemas.domain.clientes.ClientesRepository;
import com.example.agapesistemas.domain.clientes.RequestClient;
import com.example.agapesistemas.domain.clientes.RequestClientUpdate;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("client")


public class ClientController {
    @Autowired
    private ClientesRepository repository;

    //@CrossOrigin(maxAge = 10)
    @GetMapping("/visualize")
    public ResponseEntity getAllClients(){
        var allClients = repository.findAll();
        return ResponseEntity.ok(allClients);
    }



    @PostMapping("/cadastro")
    public ResponseEntity registerClient(@RequestBody @Valid RequestClient data){
        Clientes newcliente = new Clientes(data);
        System.out.println(data);
        repository.save(newcliente);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/atualizar/{id}")
    @Transactional
    public ResponseEntity<Clientes> updateCliente(@PathVariable Long id, @RequestBody Clientes clienteAtualizado) {
        Clientes clienteExistente = repository.findById(id).orElse(null);
        if (clienteExistente != null) {
            clienteExistente.setCliente_name(clienteAtualizado.getCliente_name());
            clienteExistente.setCpf(clienteAtualizado.getCpf());
            Clientes clienteSalvo = repository.save(clienteExistente);

            return ResponseEntity.ok(clienteSalvo);
        }
            return ResponseEntity.notFound().build();
    }




    @DeleteMapping("/{id}")
    public ResponseEntity deleteClientes(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}