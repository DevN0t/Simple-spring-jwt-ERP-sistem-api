package com.example.agapesistemas.domain.clientes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.io.Serial;
import java.util.Date;

public record RequestClient(
        String id,
    Integer codigo_cliente,

    @NotBlank
        String name,
    @NotNull
        String cpf,
        @NotBlank String  rg,


        String borndate,

        @NotBlank
        String  logradouro,

        @NotBlank
        String  complemento,

        @NotBlank
        String  bairro,

        @NotBlank
        String  cep,

        @NotBlank
        String  cidade,

        @NotBlank
        String uf ,
        @NotBlank
        String  telefone,

        @NotBlank
        String  celular,

        @NotBlank
        String  obervacao




    ){}
