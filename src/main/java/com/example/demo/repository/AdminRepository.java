package com.example.demo.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin;

/**
 * The AdminRepository interface provides CRUD operations for the Admin entity.
 * It extends JpaRepository to leverage Spring Data JPA's functionalities.
 */
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    /**
     * Finds an admin by their username.
     *
     * @param username the username of the admin to find.
     * @return an Optional containing the found admin, or an empty Optional if no admin is found with the given username.
     */
    Optional<Admin> findByUsername(String username);
}
