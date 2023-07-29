package com.example.agapesistemas.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, String> {
    List<Users> findAllByActiveTrue();
}
