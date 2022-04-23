package com.fikrat.bookstore.repository;

import com.fikrat.bookstore.model.Role;
import com.fikrat.bookstore.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
    Boolean existsByName(ERole name);
}
