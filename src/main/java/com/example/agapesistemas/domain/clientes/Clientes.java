package com.example.agapesistemas.domain.clientes;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Table(name="clientes")
@Entity(name="clientes")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Component

public class Clientes {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String cpf;
    private String rg;


    private Date borndate;

    private String logradouro;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String telefone;
    private String celular;
    private String observacao;






    public Clientes() {

    }


    public Clientes(RequestClient requestClient) {
        this.name = requestClient.name();
        this.cpf = requestClient.cpf();
        this.rg = requestClient.rg();
        this.borndate = requestClient.borndate();
        this.logradouro = requestClient.logradouro();
        this.complemento = requestClient.complemento();
        this.bairro = requestClient.bairro();
        this.cep = requestClient.cep();
        this.cidade = requestClient.cidade();
        this.uf = requestClient.uf();
        this.telefone = requestClient.telefone();
        this.celular = requestClient.celular();
        this.observacao = requestClient.observacao();

    }

}