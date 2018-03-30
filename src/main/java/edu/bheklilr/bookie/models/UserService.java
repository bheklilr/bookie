package edu.bheklilr.bookie.models;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
	List<User> findAll();
	Optional<User> findById(UUID id);
	void delete(User user);
	void deleteById(UUID id);
	Optional<User> findOneByUsername(String username);
}
