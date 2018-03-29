package edu.bheklilr.bookie.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface BookRepo extends JpaRepository<Book, UUID> {
    Book findBookById(UUID id);
    List<Book> findBookByTitle(String title);
    List<Book> findBookByYearPublished(int yearPublished);
}
