package com.example.tournamentcms.module.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT r FROM Role r LEFT JOIN FETCH r.permissions p where r.id=:id")
}

