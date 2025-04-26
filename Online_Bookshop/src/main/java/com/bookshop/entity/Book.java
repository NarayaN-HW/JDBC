package com.bookshop.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_master")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

	private String title;
	private int publicationYear;
	
	@ManyToOne
	@JoinColumn(name = "book_author") // author pk authorid is foringn of book key
	private Author author;

	public Book() {
	}

	public Book(int bookId, String title, int publicationYear, Author author) {
		this.bookId = bookId;
		this.title = title;
		this.publicationYear = publicationYear;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", publicationYear=" + publicationYear + ", author="
				+ author + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

}
