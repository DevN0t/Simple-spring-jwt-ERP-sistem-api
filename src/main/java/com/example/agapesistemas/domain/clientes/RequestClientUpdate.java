package com.example.agapesistemas.domain.clientes;

public record RequestClientUpdate(
        String id,
        String name,
        Integer cnpj
) {
}
