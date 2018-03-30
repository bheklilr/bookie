package edu.bheklilr.bookie.models;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public Optional<User> findById(UUID id) {
		return userRepo.findById(id);
	}

	@Override
	public void delete(User user) {
		userRepo.delete(user);
	}

	@Override
	public void deleteById(UUID id) {
		userRepo.deleteById(id);
	}

	@Override
	public Optional<User> findOneByUsername(String username) {
		List<User> usersFound = userRepo.findUsersByUsername(username);
		if (usersFound.size() >= 1) {
			return Optional.ofNullable(usersFound.get(0));
		} else {
			return Optional.empty();
		}
	}
}
