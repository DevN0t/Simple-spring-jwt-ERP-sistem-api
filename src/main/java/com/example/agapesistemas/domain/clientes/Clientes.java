package com.example.agapesistemas.domain.clientes;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Var;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Table(name="clientes")
@Entity(name="clientes")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer codigo_cliente;
    private String name;
    private String cpf;
    private String rg;
    private String borndate;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String telefone;
    private String celular;
    private String observacao;
    public Clientes(RequestClient requestClient){
        this.codigo_cliente = requestClient.codigo_cliente();
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
        this.observacao = requestClient.obervacao();
    }

    public Clientes() {
    }
}
