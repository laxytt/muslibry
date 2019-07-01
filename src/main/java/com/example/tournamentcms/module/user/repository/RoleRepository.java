package com.example.tournamentcms.module.user.repository;

import com.example.tournamentcms.module.user.model.Permission;
import com.example.tournamentcms.module.user.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT r FROM Role r LEFT JOIN FETCH r.permissions p where r.id=:id")
    Role findRoleAndAndPermissionByRoleId(@Param("id") Integer id);

    @Query("SELECT p FROM Permission p")
    List<Permission> findAllByPermissions();

    @Query("SELECT  p FROM Permission p where id=1")
    Permission getTestPermission();

    Role findByName(String name);
}

