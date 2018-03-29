package edu.bheklilr.bookie.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Book {

	@Id
	@Type(type = "uuid-char")
	private UUID id;

	private String title;
	private List<Author> authors;
	private int yearPublished;
	
	public Book() {
		this.title = "";
		this.authors = new ArrayList<Author>();
		this.yearPublished = 0;
	}
	
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.authors = new ArrayList<Author>();
		this.addAuthor(author);
		this.yearPublished = yearPublished;
	}
	
	public Book(String title, Author author, int yearPublished) {
		this.title = title;
		this.authors = new ArrayList<Author>();
		this.addAuthor(author);
		this.yearPublished = yearPublished;
	}
	
	public Book(String title, List<Author> authors, int yearPublished) {
		this.title = title;
		this.authors = new ArrayList<Author>(authors);
		this.yearPublished = yearPublished;
	}
	
	public void addAuthor(String author) {
		this.authors.add(new Author(author));
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
}
