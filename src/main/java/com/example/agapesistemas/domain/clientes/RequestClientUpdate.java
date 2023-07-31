package com.example.agapesistemas.domain.clientes;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.io.Serial;

public record RequestClientUpdate(
        String id,

        Integer codigo_cliente,
        String name,
        String cpf
) {
}
