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
@RequestMapping("/dataerp")


public class ClientController {
    @Autowired
    private ClientesRepository repository;
    @GetMapping
    public ResponseEntity getAllClients(){
        var allClients = repository.findAll();
        return ResponseEntity.ok(allClients);
    }
    @PostMapping
    public ResponseEntity registerClient(@RequestBody @Valid RequestClient data){
        Clientes newcliente = new Clientes(data);


        System.out.println(data);
        repository.save(newcliente);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    @Transactional
    public ResponseEntity updateClientes(@RequestBody @Valid RequestClientUpdate data){
        Optional<Clientes> optionalClientes = repository.findById(data.id());
        if (optionalClientes.isPresent()){
            Clientes clientes = optionalClientes.get();
            clientes.setName(data.name());
            clientes.setCnpj(data.cnpj());
            return ResponseEntity.ok(clientes);

        }else {
            throw new EntityNotFoundException();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteClientes(@PathVariable String id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
