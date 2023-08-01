package com.example.agapesistemas.domain.clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
