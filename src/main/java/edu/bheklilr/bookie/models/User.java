package edu.bheklilr.bookie.models;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Entity
public class User {
	@Id
	@Type(type = "uuid-char")
	private UUID id;

	private String username;
	private String passwordHash;
	private List<Book> books;
	
	public User() {
		this.username = "";
		this.passwordHash = "";
		this.books = new ArrayList<>();
	}
	
	public User(String username, String passwordHash) {
		this.username = username;
		this.passwordHash = passwordHash;
		this.books = new ArrayList<>();
	}
	
	public User(String username, String passwordHash, Book... books) {
		this.username = username;
		this.passwordHash = passwordHash;
		this.books = new new ArrayList<>(Arrays.asList(books));
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}