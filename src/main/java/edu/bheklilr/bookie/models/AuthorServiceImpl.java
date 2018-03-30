package edu.bheklilr.bookie.models;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepo authorRepo;
	
	@Override
	public List<Author> findAll() {
		return authorRepo.findAll();
	}

	@Override
	public void saveAuthor(Author author) {
		authorRepo.save(author);
	}

	@Override
	public Author findOne(UUID id) {
		return authorRepo.findAuthorById(id);
	}

	@Override
	public void delete(UUID id) {
		authorRepo.deleteById(id);
	}

	@Override
	public List<Author> findByName(String name) {
		return authorRepo.findAuthorByName(name);
	}
}
