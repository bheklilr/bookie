package edu.bheklilr.bookie.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AuthorRepo extends JpaRepository<Author, UUID> {
    Author findAuthorById(UUID id);
    List<Author> findAuthorByName(String name);
}
