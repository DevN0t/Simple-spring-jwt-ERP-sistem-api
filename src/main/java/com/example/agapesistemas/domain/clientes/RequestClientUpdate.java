package com.example.agapesistemas.domain.clientes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.io.Serial;
import java.sql.Date;

public record RequestClientUpdate(
        Long id,

        @NotBlank
        String cliente_name,
        @NotNull
        String cpf,
        @NotBlank String  rg,


        Date borndate,

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

        String  telefone,

        @NotBlank
        String  celular,

        String  observacao

) {
}
