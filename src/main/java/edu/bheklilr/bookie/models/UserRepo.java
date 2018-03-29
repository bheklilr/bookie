package edu.bheklilr.bookie.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserRepo extends JpaRepository<User, UUID> {
    User findUserById(UUID id);
    List<User> findUsersByUsername(String username);
    List<User> findUsersByBook(Book book);
}
