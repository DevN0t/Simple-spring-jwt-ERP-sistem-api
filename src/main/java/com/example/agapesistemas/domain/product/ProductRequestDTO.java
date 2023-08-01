package com.example.agapesistemas.domain.product;

import jakarta.validation.constraints.NotBlank;

public record ProductRequestDTO(
        @NotBlank
        String name
) {

}
