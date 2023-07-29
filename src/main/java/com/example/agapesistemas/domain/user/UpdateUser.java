package com.example.agapesistemas.domain.user;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record UpdateUser(
        @NotBlank String id,
        @NotBlank String userpass) {

}
