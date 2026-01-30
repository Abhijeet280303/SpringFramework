package com.SpringTrial5.Beans;

import java.util.Map;

public class Book {
	private String name;
	private Map<String, String> EditionAndAuthor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getEditionAndAuthor() {
		return EditionAndAuthor;
	}
	public void setEditionAndAuthor(Map<String, String> editionAndAuthor) {
		EditionAndAuthor = editionAndAuthor;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", EditionAndAuthor=" + EditionAndAuthor + "]";
	}
	
	
	
	
}
