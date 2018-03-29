package edu.bheklilr.bookie.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Author {

	@Id
	@Type(type = "uuid-char")
	private UUID id;

	private String name;
	
	public Author(String name) {
		this.name = name;
	}
	
	public Author() {
		this.name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
