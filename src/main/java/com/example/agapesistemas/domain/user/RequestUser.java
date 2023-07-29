package com.example.agapesistemas.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUser(@NotNull Integer userenter, @NotBlank String userpass) {}
