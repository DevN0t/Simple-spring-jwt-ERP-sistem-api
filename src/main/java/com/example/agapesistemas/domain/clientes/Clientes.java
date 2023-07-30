package com.example.agapesistemas.domain.clientes;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name="clientes")
@Entity(name="clientes")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer cnpj;
    public Clientes(RequestClient requestClient){
        this.name = requestClient.name();
        this.cnpj = requestClient.cnpj();
    }
}
