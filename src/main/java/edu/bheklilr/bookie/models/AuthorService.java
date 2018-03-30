package edu.bheklilr.bookie.models;

import java.util.List;
import java.util.UUID;

public interface AuthorService {
	public List<Author> findAll();
	public void saveAuthor(Author author);
	public Author findOne(UUID id);
	public void delete(UUID id);
	public List<Author> findByName(String name);
}
