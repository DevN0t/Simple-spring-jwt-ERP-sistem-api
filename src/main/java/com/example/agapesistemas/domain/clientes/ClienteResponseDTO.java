package com.example.agapesistemas.domain.clientes;

import com.example.agapesistemas.domain.product.Product;
import jakarta.validation.constraints.NotBlank;

import java.sql.Date;

public record ClienteResponseDTO (
        String id,
        @NotBlank

        String cliente_name,
        @NotBlank

        String cpf,
        @NotBlank
        String rg,


        Date borndate,
        @NotBlank
        String logradouro,
        String complemento,
        @NotBlank

        String bairro,
        @NotBlank

        String cep,
        @NotBlank
        String cidade,
        @NotBlank

        String uf,

        String telefone,
        @NotBlank
        String celular,
        String observacao
) {
}