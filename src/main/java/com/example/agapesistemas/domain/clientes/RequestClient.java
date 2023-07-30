package com.example.agapesistemas.domain.clientes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestClient(
    @NotBlank
    String name,
    @NotNull
    Integer cnpj

    ){}
